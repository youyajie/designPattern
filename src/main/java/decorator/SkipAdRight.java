package decorator;

/**
 * Created by yyj on 17/8/2.
 *
 * 具体装饰类方法 extends 装饰起始类
 *
 */
public class SkipAdRight extends Right {

    /**
     * 覆盖装饰起始类的装饰方法
     * 调用父类的装饰方法，添加自己的装饰功能
     */
    @Override
    public void setRight() {
        super.setRight();
        System.out.println("set skip ad right");
    }
}
