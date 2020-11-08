package study.design.single;

//饿汉式单例模式
public class Singleton_1 {
    //2. 使用静态变量保存当前实例，保证全局唯一，使用private保证外部不能更改
    //如果整个系统执行过程中，不使用，一直占用内存，浪费内存空间
    private static Singleton_1 instance = new Singleton_1();

    //1. 构造方法私有化,保证外部不能够new
    private Singleton_1() {}

    //3. 设计一个方法提供对外访问
    public static Singleton_1 getInstance() {
        return instance;
    }

}
