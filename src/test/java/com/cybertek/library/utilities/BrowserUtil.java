package com.cybertek.library.utilities;

public class BrowserUtil {
    public static void sleep(int second) throws InterruptedException {

        second*=1000;

        try{
            Thread.sleep(second);

        } catch(InterruptedException e){
            e.printStackTrace();
        }
    }
}
