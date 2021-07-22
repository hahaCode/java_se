package com.fan.myDate;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 工具类的一般编写规范:
 * 1.构造方法私有
 * 2.成员方法静态
 */
public class DateUtils {

    private DateUtils() {
    }

    //把日期转换为指定格式的字符串
    public static String dateToString(Date date, String format) {
        SimpleDateFormat sdf = new SimpleDateFormat(format);
        String myDate = sdf.format(date);
        return myDate;
    }

    public static Date stringToDate(String date, String format) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat(format);
        Date myDate = sdf.parse(date);
        return myDate;
    }
}
