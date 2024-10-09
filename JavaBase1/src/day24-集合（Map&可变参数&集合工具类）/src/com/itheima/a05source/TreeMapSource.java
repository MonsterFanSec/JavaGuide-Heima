package com.itheima.a05source;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public class TreeMapSource {
	// 1.TreeMap中每一个节点的内部属性
	K key;                      // 键
	V value;                    //ֵ 值
	Entry<K, V> left;           // 左子节点
	Entry<K, V> right;          // 右子节点
	Entry<K, V> parent;         // 父节点
	boolean color;              // 节点的颜色


	// 2.TreeMap类中要知道的一些成员变量
	public class TreeMap<K, V> {
		// 比较器对象
		private final Comparator<? super K> comparator;

		// 根节点
		private transient Entry<K, V> root;

		// 集合的长度
		private transient int size = 0;

		// 3.空参构造就是没有传递比较器对象
		public TreeMap() {
			comparator = null;
		}

		// 4.带参构造就是传递了比较器对象
		public TreeMap(Comparator<? super K> comparator) {
			this.comparator = comparator;
		}

		// 5.添加元素
		public V put(K key, V value) {
			return put(key, value, true);
		}

		/*
		 * 添加元素
		 * @param key				键
		 * @param value				值
		 * @param replaceOld		当键重复的时候，是否需要覆盖值
		 * 								true：覆盖
		 * 								false：不覆盖
		 */
		private V put(K key, V value, boolean replaceOld) {
			// 获取根节点的地址值，赋值给局部变量t
			Entry<K, V> t = root;

			/*
			 * 判断根节点是否为null
			 * 如果为null，表示当前是第一次添加，会把当前要添加的元素，当作根节点
			 * 如果不为null，表示当前不是第一次添加，跳过这个判断继续执行下面的代码
			 */
			if (t == null) {
				// addEntryToEmptyMap方法的底层，会创建一个Entry对象，把它当作根节点
				addEntryToEmptyMap(key, value);
				// 表示此时没有覆盖任何元素
				return null;
			}

			/*
			 * 表示两个元素的键比较之后的结果
			 * 正数：表示添加的元素是大的，要添加在已有元素的右边；
			 * 负数：表示添加的元素是小的，要添加在已有元素的左边；
			 * 零
			 */
			int cmp;

			// 表示当前要添加节点的父节点
			Entry<K, V> parent;

			/*
			 * 当前的比较规则
			 * 如果我们采取默认的自然排序，那么此时comparator记录的是null，cpr记录的也是null
			 * 如果我们采取比较器排序，那么此时comparator记录的就是比较器
			 */
			Comparator<? super K> cpr = comparator;

			/*
			 * 表示判断当前是否有比较器对象
			 * 如果传递了比较器对象，就执行if里面的代码，此时以比较器的规则为准
			 * 如果没有传递比较器对象，就执行else里面的代码，此时以自然排序的规则为准
			 */
			if (cpr != null) {
				do {
					parent = t;
					cmp = cpr.compare(key, t.key);
					if (cmp < 0)
						t = t.left;
					else if (cmp > 0)
						t = t.right;
					else {
						V oldValue = t.value;
						if (replaceOld || oldValue == null) {
							t.value = value;
						}
						return oldValue;
					}
				} while (t != null);
			} else {
				/*
				 * k表示当前元素的键
				 * 把键进行强转，强转成Comparable类型的
				 * 要求：
				 * 		键必须要实现Comparable接口，如果没有实现这个接口
				 * 		此时在强转的时候，就会报错
				 */
				Comparable<? super K> k = (Comparable<? super K>) key;
				do {
					// t记录的是根节点，把根节点当作当前节点的父节点
					parent = t;
					// 调用compareTo方法，比较根节点和当前要添加节点的大小关系
					cmp = k.compareTo(t.key);

					if (cmp < 0)
						t = t.left;
					else if (cmp > 0)
						t = t.right;
					else {
						V oldValue = t.value;
						if (replaceOld || oldValue == null) {
							t.value = value;
						}
						return oldValue;
					}
				} while (t != null);
			}
			// 就会把当前节点按照指定的规则进行添加
			addEntry(key, value, parent, cmp < 0);
			return null;
		}


		private void addEntry(K key, V value, Entry<K, V> parent, boolean addToLeft) {
			Entry<K, V> e = new Entry<>(key, value, parent);
			if (addToLeft)
				parent.left = e;
			else
				parent.right = e;
			// 添加完毕之后，需要按照红黑树的规则进行调整
			fixAfterInsertion(e);
			size++;
			modCount++;
		}


		private void fixAfterInsertion(Entry<K, V> x) {
			// 因为红黑树的节点默认就是红色的
			x.color = RED;

			/*
			 * 按照红黑规则进行调整
			 * x：表示当前的节点
			 * parentOf(x)：表示获取当前节点父节点
			 * parentOf(parentOf(x))：表示获取当前节点的爷爷节点
			 * leftOf：表示获取左子节点
			 */
			while (x != null && x != root && x.parent.color == RED) {
				/*
				 * 判断当前节点的父节点是爷爷节点的左子节点还是右子节点
				 * 目的：为了获取当前节点的叔叔节点
				 */
				if (parentOf(x) == leftOf(parentOf(parentOf(x)))) {
					/*
					 * 表示当前节点的父节点是爷爷节点的左子节点
					 * 那么下面就可以用rightOf获取当前节点的叔叔节点
					 * y：表示叔叔节点
					 */
					Entry<K, V> y = rightOf(parentOf(parentOf(x)));
					if (colorOf(y) == RED) {	// 叔叔节点为红色，则执行红黑规则
						// 1.把父节点设置为黑色
						setColor(parentOf(x), BLACK);
						// 2.把叔叔节点设置为黑色
						setColor(y, BLACK);
						// 3.把爷爷节点设置为红色
						setColor(parentOf(parentOf(x)), RED);
						// 4.把爷爷节点设置为当前节点再来判断
						x = parentOf(parentOf(x));
					} else {	// 叔叔节点为黑色，则执行红黑规则
						// 1.判断当前节点是否为父节点的右子节点
						if (x == rightOf(parentOf(x))) {	// 2.表示当前节点是父节点的右子节点
							// 3.把父作为当前节点
							x = parentOf(x);
							// 4.左旋，再进行判断
							rotateLeft(x);
						}
						// 5.将父节点设为黑色
						setColor(parentOf(x), BLACK);
						// 6.将爷爷节点变为红色
						setColor(parentOf(parentOf(x)), RED);
						// 7.以爷爷节点作为支点进行右旋
						rotateRight(parentOf(parentOf(x)));
					}
				} else {
					/*
					 * 表示当前节点的父节点是爷爷节点的右子节点
					 * 那么下面就可以用leftOf获取当前节点的叔叔节点
					 * y：表示叔叔节点
					 */
					Entry<K, V> y = leftOf(parentOf(parentOf(x)));
					if (colorOf(y) == RED) {
						setColor(parentOf(x), BLACK);
						setColor(y, BLACK);
						setColor(parentOf(parentOf(x)), RED);
						x = parentOf(parentOf(x));
					} else {
						if (x == leftOf(parentOf(x))) {
							x = parentOf(x);
							rotateRight(x);
						}
						setColor(parentOf(x), BLACK);
						setColor(parentOf(parentOf(x)), RED);
						rotateLeft(parentOf(parentOf(x)));
					}
				}
			}

			// 把根节点设置为黑色
			root.color = BLACK;
		}
	}
}