package study.design.main;

import study.design.factory.BbqFactory;
import study.design.single.Singleton_1;

public class TestMain {

    public static void main(String[] args) {

        Singleton_1 s1 = Singleton_1.getInstance();
        Singleton_1 s2 = Singleton_1.getInstance();

        System.out.println(s1);
        System.out.println(s2);

        //先创建一个工厂
        BbqFactory factory = new BbqFactory();

    }
}
