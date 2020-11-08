package study.design.single;

//懒汉单例模式
public class Singleton_2 {

    //volatile防止JVM指令重排序
    private static volatile Singleton_2 instance;

    private Singleton_2(){}


    public static Singleton_2 getInstance() {
        if(instance == null) {
            synchronized (Singleton_2.class) {
                if (instance == null) {
                    instance = new Singleton_2();
                }
            }
        }
        return instance;
    }


}
