package study.base;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class ArrayTest {

    public static void main(String[] args) {
        //给定两个数组，将数组内的元素位置互换
        int[] a = {1,2,3,4};
        int[] b = {5,6,7,8,9};
        //方式一，长度需要相等
        for(int i = 0; i < a.length; i++) {
            int tmp = a[i];
            a[i] = b[i];
            b[i] = tmp;
        }
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(b));
        //方式二 直接交换变量a和b中数组引用地址
        int[] x = a;
        a = b;
        b = x;
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(b));

        //给定一个数组将数组中的元素头尾互换
        int[] c = {1,2,3,4,5,6,7};
        for(int i = 0; i < c.length/2; i++) {
            int tmp = c[i];
            c[i] = c[c.length-1-i];
            c[c.length-1-i] = tmp;
        }
        System.out.println(Arrays.toString(c));

        //给定一个数组，寻找数组中的最大值和最小值
        int[] d = {10,3,1,8,99,2,0,12,-10};
        int min = d[0];
        int max = d[0];
        for (int tmp : d) {
            if(min > tmp) {
                min = tmp;
            }
            if(max < tmp) {
                max = tmp;
            }
        }
        System.out.println("最小值"+min);
        System.out.println("最大值"+max);

        //给定两个数组，合并两个数组
        int[] e = {1,2,3};
        int[] f = {4,5};
        int[] g = new int[e.length+f.length];
        for(int i = 0; i < e.length; i++) {
            g[i] = e[i];
        }
        for (int i = 0; i < f.length; i++) {
            g[i+e.length] = f[i];
        }
        System.out.println(Arrays.toString(g));

        //创建一个数组，存储2-100之间的素数
        int primeCount = 0;
        for(int num = 2; num <= 100; num++) {
            boolean tag = false;
            for(int i = 2; i <= num/2; i++) {
                if(num % i == 0) {
                    tag = true;
                    break;
                }
            }
            if(!tag) {
                primeCount++;
            }
        }
        int[] primeNum = new int[primeCount];
        int index = 0;
        for(int num = 2; num <= 100; num++) {
            boolean tag = false;
            for(int i = 2; i <= num/2; i++) {
                if(num % i == 0) {
                    tag = true;
                    break;
                }
            }
            if(!tag) {
                primeNum[index++] = num;
            }
        }
        System.out.println(Arrays.toString(primeNum));

        //数组元素的排序（冒泡排序）冒出最大位置
        int[] array = {5,2,3,1,4};
        for(int i = 1; i < array.length; i++) {
            for (int j = 0; j < array.length - i; j++) {
                if (array[j] > array[j + 1]) {
                    int tmp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = tmp;
                }
            }
        }
        System.out.println(Arrays.toString(array));

        //数组元素的排序（选择排序）选择固定位置
        int[] array2 = {5,2,3,1,4};
        for(int i = 0; i < array2.length; i++) {
            for(int j = i + 1; j < array2.length; j++ ) {
                if(array2[i] > array2[j]) {
                    int tmp = array2[i];
                    array2[i] = array2[j];
                    array2[j] = tmp;
                }
            }
        }
        System.out.println(Arrays.toString(array2));

        //用户登录认证
        String[] userBox = {"admin","manager","normal"};
        int[] pwdBox = {123,666,888};
        String[][] userBox2 = {{"admin","123"},{"manager","666"},{"normal","888"}};
        Scanner input = new Scanner(System.in);
        System.out.println("请输入账号");
        String user = input.nextLine();
        System.out.println("请输入密码");
        int pwd = input.nextInt();
        boolean loginFlag = false;
        for (int i = 0; i < userBox.length; i++) {
            if(userBox[i].equals(user)) {
                loginFlag = true;
                if(pwd == pwdBox[i]) {
                    System.out.println("登录成功！");
                } else {
                    System.out.println("密码错误！");
                }
                break;
            }
        }
        if(!loginFlag) {
            System.out.println("账号或者密码错误");
        }

    }
}
