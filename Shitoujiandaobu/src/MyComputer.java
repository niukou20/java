import java.util.Scanner;

public class MyComputer extends Player {
    @Override
    public void choice() {
        //电脑随机1,2,3
        this.setChoice_name((int)(Math.random()*3+1));
    }
    //还有一个方法没有重写，参与用户一直是匿名用户
    //防止用户参与是匿名用户
    @Override
    public void name_settings() {
        super.name_settings();
        String[] computer_names={"蜡笔小新","大头儿子"};
        System.out.println("****************");
        System.out.println("1----蜡笔小新");
        System.out.println("2----大头儿子");
        System.out.println("****************");
        System.out.println("请选择对阵的英雄编号");
        Scanner scanner = new Scanner(System.in);
        System.out.println("注意：必须输入内容,然后再回车，不能是空格加回车，否则程序执行不下去");
        try{
            //把scanner的nextInt先接收一下
            int tmp=scanner.nextInt();
            this.setName(computer_names[tmp-1]);
        }catch(Exception e ) {

        }
    }
}
