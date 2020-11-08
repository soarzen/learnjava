package study.base;

import java.util.Scanner;

public class BaseStudy {

    /**
     * 主函数
     * @param args
     */
    public static void main(String[] args) {
        //输出
        System.out.println("hello world java");

        //变量数据类型
        byte a = 1;
        short b = 2;
        int c = 3;
        long d = 2147483648L;
        float e = 3.4F;
        double f = 3.4;
        char g = 'a';
        boolean h = true;
        String st =  "abc";


        //数据类型转换
        byte ab = 1;
        int bc = ab;
        int cd = 10000;
        byte ef = (byte) cd;
        System.out.println(ef);
        int a2 = 1;
        float b2 = a2;

        char x1 = '自';
        int i1 = x1;
        System.out.println(i1);
        char x2 = '信';
        int i2 = x2;
        System.out.println(i2);
        char x3 = '积';
        int i3 = x3;
        System.out.println(i3);
        char x4 = '极';
        int i4 = x4;
        System.out.println(i4);
        char x5 = '乐';
        int i5 = x5;
        System.out.println(i5);
        char x6 = '观';
        int i6 = x6;
        System.out.println(i6);


        int a3 = 10;
        int b3 = 9;
        a3 = a3^b3;
        b3 = a3^b3;
        a3 = a3^b3;
        System.out.println(a3);
        System.out.println(b3);

        Scanner input = new Scanner(System.in);
        int day = input.nextInt();
        System.out.println(day);


    }




}
