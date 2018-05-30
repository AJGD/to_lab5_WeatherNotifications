public class Date {
    int day;
    int month;
    int year;
    int hour;
    int minute;
    public Date(int day, int month, int year, int hour, int minute){
        this.day = day;
        this. month= month;
        this.year = year;
        this.hour = hour;
        this.minute =minute;
    }

    @Override
    public String toString() {
        return day + "." + month + "." +year + "    " + hour + ":" + minute;
    }
}
