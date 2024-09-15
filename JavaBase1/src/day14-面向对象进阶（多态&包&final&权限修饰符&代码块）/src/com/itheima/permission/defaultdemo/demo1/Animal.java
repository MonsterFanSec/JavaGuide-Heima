package com.itheima.permission.defaultdemo.demo1;

public class Animal {
   // 默认情况下，前面没有加权限修饰符
   String name;

   public void show(){
      System.out.println(name);
   }

   public String getName() {
      return name;
   }
}
