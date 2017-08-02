package decorator;

/**
 * Created by yyj on 17/8/2.
 *
 * 实际使用类，使用装饰过程
 */
public class GoldMember {
    public static void main(String[] args) {
        Member goldMember = new Member();

        //先初始化装饰起始类，并将被装饰类设置
        //具体装饰类，将装饰起始类设置
        //再具体装饰类，将上一个装饰类设置
        //调用功能方法，则基础方法，依次装饰的方法也会执行
        Right goldRight = new Right();
        goldRight.setMember(goldMember);
        AdvanceWatchRight advanceWatchRight = new AdvanceWatchRight();
        advanceWatchRight.setMember(goldRight);
        SkipAdRight skipAdRight = new SkipAdRight();
        skipAdRight.setMember(advanceWatchRight);
        skipAdRight.setRight();
    }
}
