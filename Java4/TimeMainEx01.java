class Time {
    //public int hour;
    //public int minute;
    //public int second;

    private int hour;
    private int minute;
    private int second;

    //생성자(멤버필드 초기화)
    public Time(int hour, int minute, int second) {
        //this.hour = hour;
        //this.minute = minute;
        //this.second = second;

        this.setHour(20);
        this.setMinute(20);
        this.setSecond(20);
    }

    // setter / getter
    // 룰이지 문법은 아님, 잘못 썼다고 에러가 나진 않음
    public void setHour(int hour) {
        //this.hour = hour;

        if( hour < 0 || hour >= 24 ) {
            hour = 0;
        }
        this.hour = hour;
        
    }

    public void setMinute(int minute) {
        //this.minute = minute;
        if( minute < 0 || minute >= 60 ) {
            minute = 0;
        }
        this.minute = minute;
    }

    public void setSecond(int second) {
        //this.second = second;
        if( second < 0 || second >= 60 ) {
            second = 0;
        }
        this.second = second;

        
    }

    public int getHour() {
        return hour;
    }

    public int getMinute() {
        return minute;
    }

    public int getSecond() {
        return second;
    }


}

public class TimeMainEx01 {
    public static void main(String[] args) {
        //Time t = new Time();
        Time t = new Time(10, 10, 10);

        // 잘못된 데이터입력됨
        /* 
        t.hour = 25;
        t.minute = 70;
        t.second = 100;

        System.out.println( t.hour);
        System.out.println( t.minute);
        System.out.println( t.second);
        */

        //t.setHour(27);
        //t.setMinute(79);
        //t.setSecond(-19);

        System.out.println(t.getHour());
        System.out.println(t.getMinute());
        System.out.println(t.getSecond());
    }
}
