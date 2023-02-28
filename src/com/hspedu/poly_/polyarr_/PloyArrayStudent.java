package com.hspedu.poly_.polyarr_;

/**
 * @Author
 * @date 2023/2/28 13:22
 */
public class PloyArrayStudent extends PloyArrayPerson{
        private double score;

        public PloyArrayStudent(String name, int age, double score){
                super(name, age);
                this.score = score;
        }

        public double getScore(){
                return score;
        }

        public void setScore(double score){
                this.score = score;
        }

        //重写父类 say
        @Override
        public String say(){
                return "学生 " + super.say() + "score = " + score;
        }

        public void study(){
                System.out.println("学生 " + getName() + "正在学 java....");
        }

}