package com.hspedu.outputstream_;

import org.junit.Test;

import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @author Mo
 * @date 2023/4/15
 */
public class FileOutputStream01 {
    public static void main(String[] args) {

    }

    /**
     * 演示使用 FileOutputStream 将数据写到文件中。
     * 如果该文件不存在，则创建该文件
     */
    @Test
    public void writeFile() {
        //创建 FileOutputStream 对象
        String filePath = "D:\\a.txt";
        FileOutputStream fileOutputStream = null;
        try {
            //得到 FileOutputStream 对象 对象
            //1.new FileOutputStream(filePath) 创建方式，当写入内容是，会覆盖原来的内容
            //2.new FileOutputStream(filePath, true) 创建方式，当写入内容时，追加到文件后面
            fileOutputStream = new FileOutputStream(filePath, true);
            //写入一个字节
            //fileOutputStream.write('H');//
            //写入字符串
            String str = "hsp.world!";
            //fileOutputStream.write(str.getBytes());
            /*
            write(byte[] b,int off,int len) 将 len 字节从位于偏移量 off 的制定字节数组写入此文件输出流
             */
            fileOutputStream.write(str.getBytes(), 0, 3);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                fileOutputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

}
