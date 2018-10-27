package it.hacker.generic;

import java.util.ArrayList;
import java.util.List;

/**
 * 泛型遇上重载
 * @author wqh
 * @date 18-10-27
 */

public class GenericAndReload {
    public static void main(String[] args) {
        test(new ArrayList<String>());
        test(new ArrayList<Integer>());
    }

    /**
     * 泛型在编译之后是会擦除的，也就是说List<String>和List<Integer>都会变成List<E>
     * 而方法的返回值是不包含在方法的特征签名中,方法重载要求的是不同的特征签名,因此方法的返回值不参与重载.
     *
     * @param list list
     * @return 1
     */
    public static int test(List<String> list){
        System.out.println("String");
        return 1;
    }
    public static String test(List<Integer> list){
        System.out.println("Integer");
        return "";
    }



}
