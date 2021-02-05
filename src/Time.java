public class Time{
    short year;
    byte month,date,hour,minute,second;
    public Time(int date,int month,int year,int hour,int minute,int second){
        this.year=(short)year;
        this.month=(byte)month;
        this.date=(byte)date;
        this.hour=(byte)hour;
        this.minute=(byte)minute;
        this.second=(byte)second;
    }
    public String toString(){
        String fullDate=fNum(date,2)+"/"+fNum(month,2)+"/"+fNum(year,4);
        String fullTimeOfDay=fNum(hour,2)+":"+fNum(minute,2)+":"+fNum(second,2);
        return fullDate+" "+fullTimeOfDay;
    }
    private String fNum(int num,int length){
        String numF=""+num;
        while(numF.length()<length)
            numF="0"+numF;
        return numF;
    }
}
