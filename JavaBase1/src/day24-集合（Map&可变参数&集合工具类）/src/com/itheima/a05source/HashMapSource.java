import javax.swing.tree.TreeNode;
import java.util.HashMap;

public class HashMapSource {
	// 1.看源码之前需要了解的一些内容

	Node<K, V>[] table;                     // 哈希表结构中数组的名字
	DEFAULT_INITIAL_CAPACITY;               // 数组默认长度16
	DEFAULT_LOAD_FACTOR;                    // 默认加载因子0.75

	// HashMap里面每一个对象包含以下内容:
	// 1.1	链表中的键值对对象（包含）:
	int hash;                               // 键的哈希值
	final K key;                            // 键
	V value;          			ֵ            // 值
	Node<K, V> next;                        // 下一个节点的地址值

	// 1.2 红黑树中的键值对对象（包含）：
	int hash;                               // 键的哈希值
	final K key;                            // 键
	V value;                                // 值
	TreeNode<K, V> parent;                  // 父节点的地址值
	TreeNode<K, V> left;                    // 左子节点的地址值
	TreeNode<K, V> right;                   // 右子节点的地址值
	boolean red;                            // 节点的颜色


	// 2.添加元素
	HashMap<String, Integer> hm = new HashMap<>();
	hm.put("aaa",111);
	hm.put("bbb",222);
	hm.put("ccc",333);
	hm.put("ddd",444);
	hm.put("eee",555);

	/*
	 * 添加元素的时候至少考虑三种情况：
	 * 2.1 数组位置为null；
	 * 2.2 数组位置不为null，键重复，元素覆盖
	 * 2.3 数组位置不为null，键不重复，挂在下面形成链表或者红黑树
	 */


	/**
	 * @param key   键
	 * @param value 值
	 * @return 被覆盖元素的值，如果没有覆盖，返回null
	 */
	public V put(K key, V value) {
		return putVal(hash(key), key, value, false, true);
	}


	/*
	 * 利用键计算出对应的哈希值，再把哈希值进行一些额外的处理
	 * 简单理解：返回值就是返回键的哈希值
	 */
	static final int hash(Object key) {
		int h;
		return (key == null) ? 0 : (h = key.hashCode()) ^ (h >>> 16);
	}

	/*
	 *
	 * @param hash				键的哈希值
	 * @param key				键
	 * @param value				值
	 * @param onlyIfAbsent		如果键重复了是否保留
	 *                          	true，表示老元素的值保留，不会覆盖
	 *                          	false，表示老元素的值不保留，会进行覆盖
	 * @param evict				（暂不涉及）
	 */
	final V putVal(int hash, K key, V value, boolean onlyIfAbsent, boolean evict) {
		// 定义一个局部变量，用来记录哈希表中数组的地址值
		Node<K, V>[] tab;

		// 临时的第三方变量，用来记录键值对对象的地址值
		Node<K, V> p;

		// 表示当前数组的长度
		int n;

		// 表示索引
		int i;

		// 把哈希表中数组的地址值，赋值给局部变量tab
		tab = table;

		/*
		 * 1.如果当前是第一次添加数据，底层会创建一个默认长度为16，加载因子为0.75的值
		 * 2.如果不是第一次添加数据，会看数组中的元素是否达到了扩容的条件
		 * 		如果没有达到扩容条件，底层不会做任何操作
		 * 		如果达到了扩容条件，底层会把数组扩容为原先的两倍，并把数据全部转移到新的哈希表中
		 */
		if (tab == null || (n = tab.length) == 0) {
			tab = resize();
			// 把当亲啊数组的长度赋值给n
			n = tab.length;
		}

		// 拿着数组的长度跟键的哈希值进行计算，计算出当前键值对对象，在数组中应存入的位置
		i = (n - 1) & hash;
		// 获取数组中对应元素的数据
		p = tab[i];


		if (p == null) {
			// 底层会创建一个键值对对象，直接放到数组当中
			tab[i] = newNode(hash, key, value, null);
		} else {
			Node<K, V> e;
			K k;
			boolean b1 = p.hash == hash;

			if (b1 && ((k = p.key) == key || (key != null && key.equals(k)))) {
				e = p;
			} else if (p instanceof TreeNode) {
				e = ((TreeNode<K, V>) p).putTreeVal(this, tab, hash, key, value);
			} else {
				for (int binCount = 0; ; ++binCount) {
					if ((e = p.next) == null) {
						p.next = newNode(hash, key, value, null);
						if (binCount >= TREEIFY_THRESHOLD - 1) treeifyBin(tab, hash);
						break;
					}

					if (e.hash == hash && ((k = e.key) == key || (key != null && key.equals(k)))) {
						break;
					}

					p = e;
				}
			}

			if (e != null) {
				V oldValue = e.value;
				if (!onlyIfAbsent || oldValue == null) {
					e.value = value;
				}
				afterNodeAccess(e);
				return oldValue;
			}
		}

		/*
		 * threshold：记录的就是数组长度 * 0.75，表示哈希表的扩容时机；
		 *
		 * 第一次添加，比较 1 是否大于 16 * 0.75 = 12；
		 */
		if (++size > threshold) {
			resize();
		}

		// 表示当前没有覆盖任何元素，返回null
		return null;
	}
}
