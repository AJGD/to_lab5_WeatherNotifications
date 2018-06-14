public class Main {
    public static void main(String[] args) {

        // Tworzenie instytucji z kanałami
        Institution gov = new Institution("Małopolska", "Wielkopolska", "Mazowsze", "Lubelskie");
        // Tworzenie kilku typowych użytkowników
        User user1 = new User("123412345");
        User user2 = new User("234567899");

        System.out.println("Dodawanie kanałów do nasłuchiwania");
        user1.addChannel(gov.getChannel("Małopolska"));
        user2.addChannel(gov.getChannel("Wielkopolska"));

        System.out.println("Test wysyłania powiadomienia");
        gov.sendNotification("Burza będzie", new Date(12,6,2018,12,34), "Małopolska", "Wielkopolska", "Mazowsze");

        System.out.println("Użytkownik specjalny - z możliwością przeglądania historii powiadomień poszczególnych kanałów");
        HistoryLover user3 = new HistoryLover("345678912");
        user3.addChannel(gov.getChannel("Mazowsze"));

        System.out.println("Wysłanie kolejnych powiadomień");
        gov.sendNotification("Burza będzie z gradem", new Date(13,6,2018,12,34), "Małopolska", "Wielkopolska");
        gov.sendNotification("Trąby powietrzne", new Date(13,6,2018,12,34),  "Mazowsze");

        System.out.println("Wyświetlenie historii");
        user3.displayHistoryOf(gov.getChannel("Małopolska"),10);
        user3.displayHistoryOf(gov.getChannel("Mazowsze"),10);

    }
}
