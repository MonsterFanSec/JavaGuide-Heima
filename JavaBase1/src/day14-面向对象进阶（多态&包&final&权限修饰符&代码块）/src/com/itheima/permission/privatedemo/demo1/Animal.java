package com.itheima.permission.privatedemo.demo1;

public class Animal {
   // 加权限修饰符private
   private String name;

   public void show(){
      System.out.println(name);
   }

   public String getName() {
      return name;
   }
}
