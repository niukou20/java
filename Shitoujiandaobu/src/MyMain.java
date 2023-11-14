import java.util.Scanner;

public class MyMain {
    public static void main(String[] args) {
        MyComputer mycomputer=new MyComputer();
        MyPlayer myplayer=new MyPlayer();
        //按照游戏逻辑，调用类中的方法进行串联。
        //如果调用中的相关问题，那就是类中的方法有问题
        //可以显示一个菜单
        System.out.println("*************************");
        System.out.println("　游戏：剪刀石头布");
        System.out.println("         版本：v1.0");
        System.out.println("         作者：XXXX");
        System.out.println("************************");
        //输入回车后，游戏开始
        System.out.println("输入回车后，游戏开始");
        Scanner scanner = new Scanner(System.in);
        scanner.nextLine();
        System.out.println("游戏开始.......");
        //开始逻辑
        //定义玩家名称
        myplayer.name_settings();
        //选择电脑参与作战者
        mycomputer.name_settings();
        //调用player的出拳
        myplayer.choice();
        //调用电脑computer的出拳
        mycomputer.choice();
        //调用对应的裁判类，进行裁决。这里的裁决类是一个工具类，工具类不需要,类似于Math类
        Judge.judge_winner(myplayer,mycomputer);
    }
}
