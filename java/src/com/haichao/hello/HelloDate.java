package com.haichao.hello;

// :object/HelloDate.java

import java.util.Date;

/**
 * @author haichao
 * @version 1.0
 */
public class HelloDate {

    public static void main(String[] args) {
        System.out.println("Hello it's");
        System.out.println(new Date());
        System.out.println(new DataOnly().b);
    }
}

class DataOnly{
    int i;
    double d;
    boolean b;
}