/*
 * 集合体系结构：(大写字母表示接口，小写字母表示实现类)
 * 		A、Collection
 * 			单列集合（添加数据的时候，每次只能单个数据）
 * 			AA.List
 * 				a.ArrayList
 * 				b.LinkedList
 * 				c.Vector(已淘汰)
 * 			BB.Set
 * 				a.HashSet
 * 					aa:LinkedHashSet
 * 				b.TreeSet
 * 		B、Map
 * 			双列结合（添加数据的时候，每次添加一对数据）
 *
 *
 * List系列集合：添加的元素是有序、可重复、有索引
 * 		有序：存的时候和取的时候顺序一致。
 * 			 如，存的时候为“张三”、“李四”、“王五”，则取的时候也为“张三”、“李四”、“王五”
 * Set系列集合：添加的元素是无序、不重复、无索引
 *
 *
 * Collection：
 * 		Collection是单列集合的祖宗接口，它的功能是全部单列集合都可以继承使用的。
 *
 * 总结：
 * 		1.Collection是单列集合的顶层接口，所有方法被List和Set系列集合共享。
 *		2.常见成员方法：
 * 			add、clear、remove、contains、isEmpty、size
 * 		3.三种通用的遍历方式：
 * 			- 迭代器：在遍历的过程中需要删除元素，请使用迭代器。
 * 			- 增强for、Lambda：
 * 				仅仅想遍历，那么使用增强for或Lambda表达式。
 *
 * 	五种遍历方式对比：
 * 		1.迭代器遍历：
 * 			在遍历的过程中需要删除元素，请使用迭代器。
 * 		2.列表迭代器：
 * 			在遍历的过程中需要添加元素，请使用列表迭代器。
 * 		3/4.增强for遍历/Lambda表达式：
 * 			仅仅想遍历，那么使用增强for或Lambda表达式。
 * 		5.普通for:
 * 			如果遍历的时候想操作索引，可以用普通for。
 *
 *
 * 		LinedHashMap
 * 		Map
 * 		Collection
 * 		TreeMap
 * 		HashMap
 * 		List
 *
 * Collection集合
 *
 * List集合
 *
 * ArrayList集合
 *
 * LinkedList集合
 */
public class Test {
}
