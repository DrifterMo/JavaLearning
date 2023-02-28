package com.hspedu.poly_.polyarr_;

/**
 * @Author
 * @date 2023/2/28 10:20
 */
public class PloyArrayPerson {
        private String name;
        private int age;

        public PloyArrayPerson(String name,int aag) {
            this.name = name;
            this.age = age;
        }
        public String getName(){
            return name;
        }

        public void setName(String name){
            this.name = name;
        }

        public int getAge(){
            return age;
        }

        public void setAge(int age){
            this.age = age;
        }

        public String say(){
            return name + "\t" + age;
        }
    }
}