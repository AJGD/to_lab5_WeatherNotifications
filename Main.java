import java.util.Calendar;

public class Main {
    public static void main(String[] args) {
        Institution gov = new Institution("Małopolska", "Wielkopolska", "Mazowsze", "Lubelskie");
        User user1 = new User("123412345");
        user1.addChannel(gov.getChannel("Małopolska"));

        gov.sendNotification("Burza będzie", new Date(12,6,2018,12,34), "Małopolska", "Wielkopolska");
        User user2 = new User("234567899");
        user2.addChannel(gov.getChannel("Małopolska"));
        gov.sendNotification("Burza będzie z gradem", new Date(13,6,2018,12,34), "Małopolska", "Wielkopolska");
    }
}
