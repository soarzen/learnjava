package study.design.factory;

/**
 * 这是一个工厂
 */
public class BbqFactory {

    public Bbq getBbq() {
        return new Muwu();
    }
}
