package com.haichao.day7.AdaptorAndFacade;

import java.util.Enumeration;
import java.util.Iterator;

public class EnumerationIterator implements Iterator {

  Enumeration enumeration;

  public EnumerationIterator(Enumeration enumeration){
    this.enumeration = enumeration;
  }

  @Override
  public boolean hasNext() {
    return this.enumeration.hasMoreElements();
  }

  @Override
  public Object next() {
    return this.enumeration.nextElement();
  }

  /**
   * Enumeration不支持删除，抛出异常即可
   */
  @Override
  public void remove() {
    throw new UnsupportedOperationException();
  }
}
