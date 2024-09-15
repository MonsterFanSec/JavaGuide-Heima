package com.itheima.permission.protecteddemo.demo1;

public class Animal {
   // 加权限修饰符protected
   protected String name;

   public void show(){
      System.out.println(name);
   }

   public String getName() {
      return name;
   }
}
