package Parking;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Tester {
    public static void main(String[] args) {
        //顯示Java內建日期
        Date date = new Date();
        System.out.println("Origin: " + date);
        System.out.println("Time long: " + date.getTime());

        //自訂日期格式
        SimpleDateFormat sdf =
                new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        System.out.println("SimpleDateFormat: " + sdf.format(date));

        //把字串轉成日期格式
        String sDate = "2022/1/1 00:00:01";
        Date other = null;
        try {
            other = sdf.parse(sDate);   //經過SimpleDateFormat.parse轉換成日期物件
        } catch (ParseException e) {
            e.printStackTrace();
        }
        System.out.println("String to date: " + other);

        //計算日期
        Calendar calendar = Calendar.getInstance();
        System.out.println("Calendar origin: " + calendar.getTime());
        calendar.set(Calendar.MONTH, 2); //設定月份(0~11) = (1~12)
        System.out.println("Set 3 month: " + calendar.getTime());
        calendar.add(Calendar.DAY_OF_YEAR, 5); //增加5天日期
        System.out.println("Add 5 day: " + calendar.getTime());
    }
}
