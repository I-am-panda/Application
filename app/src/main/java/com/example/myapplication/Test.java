package com.example.myapplication;


import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Test {
    public static void main(String arg[]) throws ParseException {
        String str="202009222245";
        SimpleDateFormat sf1 = new SimpleDateFormat("yyyyMMddHHmm");
        SimpleDateFormat sf2 =new SimpleDateFormat("yyyy-MM-dd HH:mm");
        String sfstr = "";
            sfstr = sf2.format(sf1.parse(str));
        System.out.println(sfstr);
    }
}
