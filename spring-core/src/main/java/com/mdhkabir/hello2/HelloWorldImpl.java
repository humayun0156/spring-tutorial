package com.mdhkabir.hello2;

/**
 * @author humayun
 */
public class HelloWorldImpl implements HelloWorld {

    @Override
    public void printHelloWorld(String msg) {

        System.out.println("Hello : " + msg);
    }

}