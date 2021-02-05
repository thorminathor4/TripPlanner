public class TripPlanner {
    public static void main(String[] args) {
        Trip trip1=new Trip(
            "New York City,NY,USA",
            new Time(10,2,2021,6,0,0),
            new Time(20,2,2021,6,0,0)
        );
        System.out.printf("%-16s   %-19s   %-19s%n","Location","Start Time","End Time");
        System.out.print(trip1);
    }
}
