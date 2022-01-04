package Parking;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;

public class Tester {
    public static void main(String[] args) {
//        simpleDate();
        java8();  //Java8的時間設定方式
    }

    private static void java8() {
        Instant instant = Instant.now();
        System.out.println("Instant: " + instant); //印出的時間為格林威治標諄時間 +0

        long time = System.currentTimeMillis();
        System.out.println("System: " + time);

        //Local -> Date日期, Time時間, DateTime日期+時間
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println("Local: " + localDateTime);

        //of設定時間
        LocalDate localDate = LocalDate.of(2022, 1, 1);
        LocalTime localTime = LocalTime.of(15, 6, 10);
        LocalDateTime local = LocalDateTime.of(2021, 12, 30, 14, 5, 20);
        System.out.println("LocalData: " + localDate);
        System.out.println("LocalTime: " + localTime);
        System.out.println("LocalDataTime: " + local);

        //自訂格式ofPattern設定
        DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        System.out.println(dateFormat.format(localDateTime)); //把現在時間套進自訂格式

        //不會動到原本個值，而是像另存新檔一樣
        LocalDateTime add5hr = localDateTime.plus(Duration.ofHours(5)); //Duration指時間區段
        System.out.println("Add 5 hr: " + add5hr);

        LocalDateTime other =
                LocalDateTime.of(2022, 3, 20, 6, 0, 0);
        System.out.println("Other time set: " + other);

        // 時間區間
        LocalDateTime formTime = LocalDateTime.of(2020, 1, 1, 12, 0, 0);
        LocalDateTime toTime = LocalDateTime.of(2022, 1, 1, 15, 0, 0);
        Duration duration = Duration.between(formTime, toTime);
        System.out.println(duration);
        System.out.println(duration.toDays());
        System.out.println(duration.getSeconds());
    }

    private static void simpleDate() {
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
