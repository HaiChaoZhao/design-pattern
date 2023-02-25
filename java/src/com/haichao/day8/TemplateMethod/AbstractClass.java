package com.haichao.day8.TemplateMethod;

public abstract class AbstractClass {
  final void teamplateMethod(){
    primitiveOperation1();
    primitiveOperation2();
    concreteOperation();
    hook();
  }



  /**
   * 一些抽象方法，由子类实现
   */
  abstract void primitiveOperation1();
  abstract void primitiveOperation2();

  final void concreteOperation(){
    //不想被子类继承的具体实现
  }

  /**
   * 添加一些hook
   */
  void hook() {

  }
}
