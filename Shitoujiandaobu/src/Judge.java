/*
裁判类
 */
public  class Judge {
    //判断输赢的方法，方法需要两个角色，这个角色就是方法的参数
    public static  void judge_winner(MyPlayer player,MyComputer computer){
        //可以用减差来判断胜负
        int sub_player=player.getChoice_name()-computer.getChoice_name();
        //通过减值得到结果是 sub_player是1  0 2  -1 -2
        // 0 1   　考虑数组的角标，０值永远都是平局，０数组中的第一个元素，1就是数组中的赢
        //值是2   　对应数组中的输
        //-1 arrs[-1] 0 -1　-2  应用到电脑中没有问题
        String[] arrs= {"平局","赢","输"};
        try{
            System.out.println("玩家"+arrs[sub_player]);
        }catch(Exception e){
            //电脑应用Math.abs绝对值函数，
            System.out.println("电脑"+arrs[Math.abs(sub_player)]);
        }
        System.out.println("双方出牌情况");
        String[] player_choices={"剪刀","石头","布"};
        System.out.println("玩家出拳:"+player_choices[player.getChoice_name()-1]);
        System.out.println("电脑出拳："+player_choices[computer.getChoice_name()-1]);

    }
}
