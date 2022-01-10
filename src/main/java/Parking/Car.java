package Parking;

import java.time.Duration;
import java.time.LocalDateTime;

public class Car {
    private String id;
    private LocalDateTime enter;
    private LocalDateTime leave;

    public Car(String id, LocalDateTime enter) {
        this.id = id;
        this.enter = enter;
    }

    public void setLeaveTime(LocalDateTime leave) {
        if(leave.isAfter(enter)) {  //設定leave的時間在enter之後
            this.leave = leave;
        }
    }

    public LocalDateTime addTime(long hr, long minute) {
        LocalDateTime leaveTime = enter.plus(Duration.ofHours(hr));
        leaveTime = enter.plus(Duration.ofMinutes(minute));
        return leaveTime;
    }

    public long getDuration() {
        Duration time = Duration.between(enter, leave);
        return time.toMinutes();
    }

    public long free() {
        //浮點數後面記得要加f
        long carFree = (long)Math.ceil(getDuration()/60f) * 20;
        return carFree;
    }
}
