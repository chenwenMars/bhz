package com.chenwen;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * @author chenwen
 * @create 2018-09-26 23:51
 **/
public class test {
    public static void main(String[] args) {
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        //获取当前月第一天：
        Calendar c = Calendar.getInstance();
        c.add(Calendar.MONTH, 0);
        c.set(Calendar.DAY_OF_MONTH,1);//设置为1号,当前日期既为本月第一天
        Date d = c.getTime();
        String first = format.format(d);
        System.out.println("===============first:"+first);

        System.out.println("args = [" + args.length + "]");
    }



}
