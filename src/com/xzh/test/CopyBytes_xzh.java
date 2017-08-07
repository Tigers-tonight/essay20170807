package com.xzh.test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyBytes_xzh {
    public static void main(String[] args) {
        String s = "";
        File inFile = new File("d:\\001.sql");
        File outFile = new File("d:\\002.sql");
        try {
            //被读取的文件
            FileInputStream in = new FileInputStream(inFile);
            //要写入的文件
            FileOutputStream out = new FileOutputStream(outFile);
            byte[] b = new byte[1024];
            try {
                while(in.read(b)!=-1){
                    s+=new String (b);
                    out.write(b);
                }
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
