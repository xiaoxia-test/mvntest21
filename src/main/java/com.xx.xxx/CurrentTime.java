package com.xx.xxx;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by 16946_veh1icf on 2018/3/15.
 */
public class CurrentTime {
    public static void main(String[] args){
        SimpleDateFormat sdf=new SimpleDateFormat();
        sdf.applyPattern("yyyy-MM-dd HH:mm:ss a ");
        Date dt=new Date();
        System.out.println("现在时间是："+sdf.format(dt));
    }
}
