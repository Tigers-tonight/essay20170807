package com.xzh.test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
/**
 * 复制文件内容
 * CopyBytes
 * 
 * @author xzh
 * @date 2017年7月31日
 */
public class CopyBytes {
    public static void main(String[] args) {
        String s = "";
        File file = new File("D:\\001.sql");
        File file2 = new File("D:\\002.sql");
        
        try {
            FileInputStream in = new FileInputStream(file);
            FileOutputStream out = new FileOutputStream(file2);
            byte[] bt = new byte[1024];
            try {
                while(in.read(bt)!=-1){
                    s+=new String(bt);
                    out.write(bt);
                }
                System.out.println("sssssssssssss");
                System.out.println(s);
            } catch (IOException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
