public abstract class Player implements Joiner{
    private String name;
    private int choice_name;
    //2、做无参和有参构造
    public Player() {
    }
    public Player(String name, int choice_name) {
        this.name = name;
        this.choice_name = choice_name;
    }
    //被abstract修饰的方法不需要实现
    @Override
    public abstract void choice();
    //抽象方法完成了name的初始化
    @Override
    public void name_settings() {
        this.setName("匿名用户");
    }
    //1、做setter和getter方法

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getChoice_name() {
        return choice_name;
    }

    public void setChoice_name(int choice_name) {
        this.choice_name = choice_name;
    }
    //3、重写类打印出内容的toString方法

    @Override
    public String toString() {
        return "Player{" +
                "name='" + name + '\'' +
                ", choice_name=" + choice_name +
                '}';
    }
}
