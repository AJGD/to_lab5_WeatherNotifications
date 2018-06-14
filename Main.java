public class Main {
    public static void main(String[] args) {
        Institution gov = new Institution("Małopolska", "Wielkopolska", "Mazowsze", "Lubelskie");
        User user1 = new User("123412345");
        user1.addChannel(gov.getChannel("Małopolska"));

        gov.sendNotification("Burza będzie", new Date(12,6,2018,12,34), "Małopolska", "Wielkopolska", "Mazowsze");
        User user2 = new User("234567899");
        HistoryLover user3 = new HistoryLover("345678912");
        user2.addChannel(gov.getChannel("Małopolska"));
        user3.addChannel(gov.getChannel("Mazowsze"));
        gov.sendNotification("Burza będzie z gradem", new Date(13,6,2018,12,34), "Małopolska", "Wielkopolska");
        gov.sendNotification("Trąby powietrzne", new Date(13,6,2018,12,34), "Małopolska", "Mazowsze");
        user3.displayHistoryOf(gov.getChannel("Mazowsze"),10);
    }
}
