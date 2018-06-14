import java.util.ArrayList;

public class User {
    protected ArrayList<Channel> channelList;
    private String pesel;

    public User(String pesel) {
        this.pesel = pesel;
        channelList = new ArrayList<>();
    }

    public void addChannel(Channel channel) {
        channelList.add(channel);
        channel.addUser(this);
    }

    public void removeChannel(Channel channel) {
        channelList.remove(channel);
        channel.removeUser(this);
    }

    public void notify(Notification notification) {
        System.out.println("User " + pesel + " has received notification for " + notification.getDate() + " with content: <" + notification.getContent() + ">.");
    }
}
