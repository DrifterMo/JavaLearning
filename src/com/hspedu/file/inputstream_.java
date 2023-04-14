package com.hspedu.file;

import org.junit.Test;

import java.io.FileInputStream;
import java.io.IOException;

/**
 * @date 2023/4/14
 * 演示 FileInputStream 的使用(字节输入流 文件--> 程序)
 */
public class inputstream_ {
    public static void main(String[] args) {

    }

    /**
     * 演示读取文件...
     * 单个字节的读取，效率比较低
     * -> 使用 read(byte[] b)
     */
    @Test
    public void readFile01(){
        String filePath = "D:\\hello.txt";
        int readData = 0;
        FileInputStream fileInputStream = null;
        try {
            //创建 FileInputStream 对象，用于读取 文件
            fileInputStream = new FileInputStream(filePath);
            //从该输入流读取一个字节的数据。如果没有输入可用，此方法将阻止。
            //如果返回 -1, 表示读取完毕
            while ((readData = fileInputStream.read()) != -1) {
                System.out.println((char) readData); //转成 char 显示
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            //关闭文件流，释放资源
            try {
                fileInputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }


    /**
     * 使用 read(byte[] b) 读取文件，提高效率
     */
    public void readFile02(){
        String filePath = "D:\\hello.txt";
        //字节数组
        byte[] buf = new byte[8];   //一次读取8个字节
        int readLen = 0;
        FileInputStream fileInputStream = null;
        //创建 FileInputStream 对象，用于读取文件
    }

}

