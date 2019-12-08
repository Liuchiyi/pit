package com.wx.common;

public class AssertThrowUtil {

    public  static String assertNotBlank(String message, String target){
        if (target==null||(target=target.trim()).length()==0){
            throw  new ThisSystemException(message);
        }
        return target;
    }
    public  static String $(String message,String target){

        return assertNotBlank(message,target);
    }
    public static void assertNotNull(String message,Object o){
        if (o==null){
            throw  new ThisSystemException(message);
        }
    }
    public static void assertNull(String message,Object o){
        if (o!=null){
            throw  new ThisSystemException(message);
        }
    }
    public static void assertEquals(String message,Object a,Object b){
        if (a==null?a!=b:!a.equals(b)){
            throw  new ThisSystemException(message);
        }
    }
    public static void assertNotEquals(String message,Object a,Object b){
        if (a==null?a==b:a.equals(b)){
            throw  new ThisSystemException(message);
        }
    }
}
