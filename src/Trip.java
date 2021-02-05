import java.util.ArrayList;
import java.util.Random;

public class Trip {
    private static ArrayList<Short> tripIDs=new ArrayList<Short>();
    private String location;
    private short tripID;
    Time startTime,endTime;
    String mad;
    public Trip(String location,Time startTime,Time endTime){
        this.location=location;
        this.startTime=startTime;
        this.endTime=endTime;
        tripID=giveID();
    }
    private short giveID() {
        Random rng = new Random();
        short temp;
        do
            temp = (short) (rng.nextInt(9000) + 1000);
        while (tripIDs.contains(temp));
        return temp;
    }
    public String toString(){
        int locationLength=16;
        String locationF=location;
        if(location.length()>locationLength)
            locationF=location.substring(0,locationLength);
        return String.format("%s   %s   %s",locationF,startTime,endTime);
    }
}