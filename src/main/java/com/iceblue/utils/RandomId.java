package com.iceblue.utils;

import org.junit.Test;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

public  class RandomId {


    public static String getUniqueId(){
        Date currentDate=new Date();
        SimpleDateFormat dateFormat=new SimpleDateFormat("MMddHHmmssSSS");
        String dataStr=dateFormat.format(currentDate);

//        String numStr="";
//        for (int i=0;i<1;i++){
//            numStr+=(10*(Math.random()));
//        }

        Random random=new Random();
        String idStr=dataStr+random.nextInt(10000);

        //long id=Long.valueOf(idStr);
        //System.out.println(id);

        return  idStr;
    }
}
