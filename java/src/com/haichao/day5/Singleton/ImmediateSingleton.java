package com.haichao.day5.Singleton;

// 加载时，立即初始化实例
public class ImmediateSingleton {
  private static ImmediateSingleton uniqueInstance = new ImmediateSingleton();
  private  ImmediateSingleton(){

  }
  public static ImmediateSingleton getInstance(){
    return  uniqueInstance;
  }
}
