package com.haichao.day5.Singleton;

// 延迟初始化实例，在多线程进入该方法时会造成问题，会有多个实例
public class Singleton {
  private static Singleton uniqueInstance;
  private  Singleton(){

  }
  public static Singleton getInstance(){
    if(uniqueInstance == null){
      uniqueInstance = new Singleton();
    }
    return  uniqueInstance;
  }
}
