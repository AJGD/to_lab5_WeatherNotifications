import java.util.ArrayList;

public class Channel {
    private ArrayList<Notification> history;
    private String name;
    private ArrayList<User> userList;

    public Channel(String name) {
        this.name = name;
        history = new ArrayList<>();
        userList = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void sendNotification(Notification notification) {
        for (User u : userList) {
            u.notify(notification);
        }
        history.add(notification);
    }

    public void addUser(User user) {
        userList.add(user);
    }

    public void removeUser(User user) {
        userList.add(user);
    }

    public ArrayList<Notification> getHistory() {
        return history;
    }

    @Override
    public String toString() {
        return "<" + this.getName() + ">";
    }
}
