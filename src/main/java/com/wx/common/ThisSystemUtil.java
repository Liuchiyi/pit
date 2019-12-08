package com.wx.common;
//工具类

import java.util.UUID;

public class ThisSystemUtil {
    public static String uuid(){
        String uuid= UUID.randomUUID().toString();
        char[] cs=new char[32];
        char c=0;
        for(int i=uuid.length(),j=0;i-->0;){
            if((c=uuid.charAt(i))!='-'){
                cs[j++]=c;
            }
        }
        return new String(cs);
    }
    public static void main(String[] args) {
        for(int i=10;i-->0;){
            String u=uuid();
            System.out.println(u);
        }
    }
}
