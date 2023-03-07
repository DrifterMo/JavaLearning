package com.hspedu.codeblock_;

/**
 * @date 2023/3/7 13:06
 */
public class CodeBlock01 {
    public static void main(String[] args) {
        Movie movie  = new Movie("你好，李焕英");
        System.out.println("============");
        Movie movie2 = new Movie("唐探3", 100, "陈思诚");
    }
}

class Movie{
    private String name;
    private double price;
    private String director;

    /*
    3 个构造器-》重载
    (1) 下面的三个构造器都有相同的语句
    (2) 这样代码看起来比较冗余
    (3) 这时我们可以把相同的语句，放入到一个代码块中，即可
    (4) 这样当我们不管调用哪个构造器，创建对象，都会先调用代码块的内容
    (5) 代码块调用的顺序优先于构造器..
     */
    {
        System.out.println("电视屏幕打开....");
        System.out.println("广告开始....");
        System.out.println("电影正式开始");
    }

    public Movie(String name){
        System.out.println("Movie(String name) 被调用....");
        this.name = name;
    }

    public Movie(String name,double price){
        System.out.println("Movie(String anme,double price) 被调用.....");
        this.name = name;
        this.price = price;
    }

    public Movie(String name,double price, String director){
        System.out.println("Movie(String anme,double price,String director) 被调用.....");
        this.name = name;
        this.price = price;
        this.director = director;
    }
}