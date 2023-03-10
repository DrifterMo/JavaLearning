package com.hspedu.enum_;

/**
 * @date 2023/3/10 18:50
 */
public class EnumExercise02 {
    public static void main(String[] args) {
        //获取所有的枚举对象，即数组
        Week[] weeks = Week.values();
        //遍历，使用增强 for
        for (Week week:weeks){
            System.out.println(week);
        }
    }
}

enum Week{
    MONDAY("星期一"),TUESDAY("星期二"),WEDNESDAY("星期三"),
    THURSDAY("星期四"),FRIDAY("星期五"),SATURDAY("星期六"),
    SUNDAY("星期日");
    private String name;
    private Week(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString(){
        return name;
    }

}