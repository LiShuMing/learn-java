package com.netease.study.learnjava.lang;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.lang.Runtime;
import java.io.BufferedReader;
/**
 * Created by lishuming on 2018/3/14.
 */
public class RuntimeTest {
  public static void main(String[] args) throws Exception{
    Runtime r = Runtime.getRuntime();
    System.out.println("availableProcessors:" + r.availableProcessors());
    System.out.println("toString:" + r.toString());

    InputStream is = null;
    try {
      Process p = r.exec("ls /");
      is = p.getInputStream();
      BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(is));
      StringBuilder sb = new StringBuilder();
      String s;
      while((s = bufferedReader.readLine()) != null) {
        sb.append(s + "\t");
      }
      System.out.println(sb);
      int exitValue = p.waitFor();
      System.out.println(exitValue);
    } catch (InterruptedException e) {
      e.printStackTrace();
    } catch (IOException e) {
      e.printStackTrace();
    } finally {
      if (is != null ) {
        try {
          is.close();
        } catch (IOException e){
          e.printStackTrace();
        }
      }
    }


  }
}
