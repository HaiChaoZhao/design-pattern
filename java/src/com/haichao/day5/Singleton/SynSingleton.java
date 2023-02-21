package com.haichao.day5.Singleton;

// 加上synchronized也有问题，仅在初始化时需要使用sychronzied关键字，会影响性能，当然，也不是很大，无伤大雅；
public class SynSingleton {
  private static SynSingleton uniqueInstance;
  private volatile static SynSingleton synSingletonOptimized;
  private  SynSingleton(){

  }
  public static synchronized SynSingleton getInstance(){
    if(uniqueInstance == null){
      uniqueInstance = new SynSingleton();
    }
    return  uniqueInstance;
  }

  // 稍微优化一下，检查实例时加锁
  public static SynSingleton getInstanceOptimized(){
    if(synSingletonOptimized == null) {
      synchronized (SynSingleton.class){
        if(synSingletonOptimized == null) {
          synSingletonOptimized = new SynSingleton();
        }
      }
    }
    return synSingletonOptimized;
  }
}
