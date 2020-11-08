package study.base;

import java.util.Arrays;

public class ArrayStudy {

    public static void main(String[] args) {
        //数组初始化
        //静态初始化（有长度，也有元素）
        int[] array2 = new int[] {10,20,30,40,50};
        int[] array3 = {10,20,30,40,50};
        int[] array4;
        array4 = new int[] {60,70,80};
        //动态初始化（有长度，没有元素）但有默认值
        //整数默认值-0 浮点默认值-0.0 字符默认值-0 布尔默认值-false
        int[] array5 = new int[10];
        int[] array6 = array3;

        //数组的访问
        System.out.println(array2[0]);
        //ArrayIndexOutOfBoundsException，运行时异常
        //System.out.println(array2[5]);
        //正常的for循环
        for(int i = 0; i < array3.length; i++) {
            System.out.println(array3[i]);
        }
        //增强for循环，只能取值，不能存值
        for(int i : array4) {
            System.out.println(i);
        }
        for(int j : array5) {
            System.out.println(j);
        }
        System.out.println(array3[0]);
        array6[0] = 100;
        System.out.println(array3[0]);

        //二维数组
        int[][] array = new int[][]{{1,2},{3,4,5},{5,6}};
        System.out.println(array[0][1]);
        for(int[] arr : array) {
            System.out.println(Arrays.toString(arr));
        }

        int[][] array7 = new int[3][];
        array7[0] = new int[2];

    }
}
