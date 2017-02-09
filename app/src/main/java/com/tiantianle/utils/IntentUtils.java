package com.tiantianle.utils;

import android.content.Context;
import android.content.Intent;

/**
 * Created by Administrator on 2017/2/8.
 *
 * 将跳转的功能进行一个封装
 *
 */

public class IntentUtils {


    public static void goTo(Context packageContext, Class<?> cls) {
        Intent intent = new Intent(packageContext, cls);
        packageContext.startActivity(intent);
    }

    public static void goTo(Context packageContext, Class<?> cls, String ss) {
        Intent intent = new Intent(packageContext, cls);
        intent.putExtra("stringContent", ss);
        packageContext.startActivity(intent);
    }

    public static void goTo(Context packageContext, Class<?> cls, String ss, String num) {
        Intent intent = new Intent(packageContext, cls);
        intent.putExtra("stringContent", ss);
        intent.putExtra("stringNum", num);
        packageContext.startActivity(intent);
    }

    public static void goTo(Context packageContext, Class<?> cls, String ss, String num, String three) {
        Intent intent = new Intent(packageContext, cls);
        intent.putExtra("stringContent", ss);
        intent.putExtra("stringNum", num);
        intent.putExtra("three", three);
        packageContext.startActivity(intent);
    }

//    public static void goTo(Context packageContext, Class<?> cls, int ss, String num, String three) {
//        Intent intent = new Intent(packageContext, cls);
//        intent.putExtra("stringContent", ss);
//        intent.putExtra("stringNum", num);
//        intent.putExtra("three", three);
//        packageContext.startActivity(intent);
//    }
}

