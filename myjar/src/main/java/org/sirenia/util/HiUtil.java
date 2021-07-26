package org.sirenia.util;

/**
 * 模拟jar包冲突
 * 先改版本号为1.0.1-SNAPSHOT。打开v1方法的注释，并且注释掉v2方法。然后install。
 * 再改版本号为1.0.2-SNAPSHOT。打开v2方法的注释，并且注释掉v1方法。然后install。
 * @author sirenia
 * @description
 * @date 2021/07/25
 */
public abstract class HiUtil {
//    public static String v1(){
//        return "v1";
//    }
    public static String v2(){
        return "v2";
    }
}
