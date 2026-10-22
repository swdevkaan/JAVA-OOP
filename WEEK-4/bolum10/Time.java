 package bolum10;
public class Time {
  private int hour;
  private int minute;
  private int second;

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public int getMinute() {
        return minute;
    }

    public void setMinute(int minute) {
        this.minute = minute;
    }

    public int getSecond() {
        return second;
    }

    public void setSecond(int second) {
        this.second = second;
    }
   

public void setTime(long elapseTime){
    long totalSeconds = elapseTime/1000;
    this.second = (int)(totalSeconds%60);
    long totalMinutes = (int)totalSeconds/60;
    this.minute = (int)(totalMinutes % 60);
    long totalHours = totalMinutes / 60;
    this.hour = (int)(totalHours % 24);
    
    
}

public Time(){
    setTime(System.currentTimeMillis());
    
}

public Time(long elapseTime){
    setTime(elapseTime);
}
public Time (int hour,int minute,int second){
    this.hour=hour;
    this.minute=minute;
    this.second=second;
}










}











