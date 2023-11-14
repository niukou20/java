import java.util.Scanner;

public class MyPlayer extends Player{

    @Override
    public void choice() {
        System.out.println("*****************");
        System.out.println("1-----剪刀");
        System.out.println("2-----石头");
        System.out.println("3-----布");
        System.out.println("*****************");
        System.out.println("请选择出拳名称代表数字:");
        Scanner scanner = new Scanner(System.in);
        //这里直接接收数字,考虑nextInt可能报错
        System.out.println("注意：必须输入内容,然后再回车，不能是空格加回车，否则程序执行不下去");
        try{
            int tmp=scanner.nextInt();
            this.setChoice_name(tmp);
        }catch(Exception e){
            this.setChoice_name((int)(Math.random()*3+1));
        }
    }
    //为了防止匿名用户，还需要重写name的命名方法

    @Override
    public void name_settings() {
        super.name_settings();
        System.out.println("请输入玩家名称:");
        Scanner scanner = new Scanner(System.in);
        //这个名称允许空格,但是空格后回车，如果接受是空的，空的没有意义
        //属次调用scanner.nextLine()一直接收屏幕输入，只输入一次
        //这里只有变量接收一次
        String line=scanner.nextLine();
        if (!line.trim().equals("")) {
            this.setName(line);
        }
    }
}
