package decorator;

/**
 * Created by yyj on 17/8/2.
 *
 * 装饰起始类 extends 被装饰类
 *
 */
public class Right extends Member {
    private Member member;

    //有被装饰类的属性，并含有设置方法
    public void setMember(Member member) {
        this.member = member;
    }

    //装饰功能方式
    @Override
    public void setRight() {
        member.setRight();
    }
}
