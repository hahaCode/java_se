package com.fan.myDate;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateDemo {
    public static void main(String[] args) throws ParseException {
        Date date = new Date();
        System.out.println(date.getTime()+" "+System.currentTimeMillis());


        //日期格式化(Date --> String)和解析(String --> Date)

        //格式化
        SimpleDateFormat sdf = new SimpleDateFormat();
        System.out.println(sdf.format(date));

        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");
        System.out.println(simpleDateFormat.format(date));

        System.out.println("------------------");
        //解析
        String s = "2052-05-20 11:11:11";
        SimpleDateFormat simpleDateFormat1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss"); //注意给的模式也要和字符串匹配上
        Date parseDate = simpleDateFormat1.parse(s);
        System.out.println(parseDate);

        //将以上封装为一个工具类
        System.out.println("------------DateUtils------------");
        System.out.println(DateUtils.dateToString(date, "yyyy年MM月dd日 HH:mm:ss"));;
        System.out.println(DateUtils.stringToDate(s, "yyyy-MM-dd HH:mm:ss"));;
    }
}

//https://www.bilibili.com/video/BV1Ei4y137HJ?p=210&spm_id_from=pageDriver
