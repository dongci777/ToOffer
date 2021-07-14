package com.dongci777;

/**
 * @Author: zxb
 * @Date : 2021/7/14 8:23 下午
 */
public class Singleton {

    // 方法1：饿汉
//    private static Singleton singleton = new Singleton();
//
//    private Singleton(){
//
//    }
//
//    public static Singleton getInstance(){
//        return singleton;
//    }

    // 方法2：懒汉（非线程安全）
//    private static Singleton singleton = null;
//
//    public Singleton() {
//    }
//
//    public static Singleton getInstance(){
//        if(singleton==null){
//            singleton = new Singleton();
//        }
//        return singleton;
//    }


    // 方法3：懒汉（线程安全，获取实例的方法加上了synchronized关键字）
//    private static Singleton singleton = null;
//
//    public Singleton() {
//
//    }
//
//    public static synchronized Singleton getInstance() {
//        if (singleton == null) {
//            singleton = new Singleton();
//        }
//        return singleton;
//    }

    // 方法4：双重校验锁
//    private static Singleton singleton = null;
//
//    public Singleton() {
//
//    }
//
//    public static Singleton getInstance() {
//        if (singleton == null) {
//            synchronized (Singleton.class) {
//                if (singleton == null) {
//                    singleton = new Singleton();
//                }
//            }
//        }
//        return singleton;
//    }

    // 方法5：静态内部类


    public Singleton() {
    }

    private static class SingletonHolder {
        private static Singleton INSTANCE = new Singleton();
    }

    private static Singleton getInstance() {
        return SingletonHolder.INSTANCE;
    }
}
