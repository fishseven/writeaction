package com.file;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtil {


    /**
     * 格式化时间
     * @param strDateFormat 定义字符串所要格式化数据的格式：yyyy-MM-dd HH:mm:ss
     * @return
     */
    public static String fromateDate(Date date ,String strDateFormat){
            //String strDateFormat = "yyyy-MM-dd HH:mm:ss";
            //创建对象sdf，将格式放入new中初始化，既sdf对象按照yyyy-MM-dd HH:mm:ss对数据进行格式化
            SimpleDateFormat sdf = new SimpleDateFormat(strDateFormat);
            //sdf对象使用format方法对数据date进行格式化，字符串类型转StringBuffer类型的数据
            return sdf.format(date);
    }
}
