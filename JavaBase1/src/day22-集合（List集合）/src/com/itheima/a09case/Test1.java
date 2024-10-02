package com.itheima.a09case;

import java.util.ArrayList;

/*
 *           需求：
 *               定义一个继承结构：
 *                                   动物
 *                        |                           |
 *                        猫                          狗
 *                     |      |                    |      |
 *                  波斯猫   狸花猫                泰迪   哈士奇
 *
 *
 *               属性：名字，年龄
 *               行为：吃东西
 *                     波斯猫方法体打印：一只叫做XXX的，X岁的波斯猫，正在吃小饼干
 *                     狸花猫方法体打印：一只叫做XXX的，X岁的狸花猫，正在吃鱼
 *                     泰迪方法体打印：一只叫做XXX的，X岁的泰迪，正在吃骨头，边吃边蹭
 *                     哈士奇方法体打印：一只叫做XXX的，X岁的哈士奇，正在吃骨头，边吃边拆家
 *
 *
 *          测试类中定义一个方法用于饲养动物:
 *              public static void keepPet(ArrayList<???> list){
 *                  // 遍历集合，调用动物的eat方法
 *              }
 *
 *           要求1：该方法能养所有品种的猫，但是不能养狗
 *           要求2：该方法能养所有品种的狗，但是不能养猫
 *           要求3：该方法能养所有的动物，但是不能传递其他类型
 */

/*
 *	总结：
 * 		1.什么是泛型？
 * 			JDK5引入的特性，可以在编译阶段约束操作的数据类型，并进行检查
 * 		2.泛型的好处？
 * 			- 统一数据类型
 * 			- 把运行时期的问题提前到了编译时期，避免了强制类型转换可能出现的异常，因为在编译阶段类型就能确定下来。
 * 		3.泛型的细节？
 * 			- 泛型中不能写基本数据类型
 * 			- 指定泛型的具体类型后，传递数据时，可以传入该类型和他的子类类型
 * 			- 如果不写泛型，类型默认是Object
 * 		4.哪里定义泛型？
 * 			- 泛型类：在类名后面定义泛型，创建该类对象的时候，确定类型
 * 			- 泛型方法：在修饰符后面定义方法，调用该方法的时候，确定类型
 * 			- 泛型接口：在接口名后面定义泛型，实现类确定类型，实现类延续泛型
 * 		5.泛型的继承和通配符
 * 			- 泛型不具备继承性，但是数据具备继承性
 * 			- 泛型的通配符：?
 * 				? extend E
 * 				? super E
 * 		6.使用场景
 * 			- 定义类、方法、接口的时候，如果类型不确定，就可以定义泛型
 * 			- 如果类型不确定，但是能知道时哪个继承体系中的，可以使用泛型的通配符
 */
public class Test1 {
	public static void main(String[] args) {
		ArrayList<PersianCat> list1 = new ArrayList<>();
		ArrayList<LiHuaCat> list2 = new ArrayList<>();
		ArrayList<TeddyDog> list3 = new ArrayList<>();
		ArrayList<HuskyDog> list4 = new ArrayList<>();

		// keepPet(list1);
		// keepPet(list2);
		keepPet(list3);
		keepPet(list4);
	}

	/*// 该方法能养所有的动物，但是不能传递其他类型
	public static void keepPet(ArrayList<? extends Animal> list) {
		// 遍历集合，调用动物的eat方法
	}*/


	//  要求2：该方法能养所有品种的狗，但是不能养猫
	public static void keepPet(ArrayList<? extends Dog> list) {
		// 遍历集合，调用动物的eat方法
	}


    /*//要求1：该方法能养所有品种的猫，但是不能养狗
    public static void keepPet(ArrayList<? extends Cat> list){
        //遍历集合，调用动物的eat方法
    }*/
}
