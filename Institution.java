import java.util.ArrayList;

public class Institution {
    private ArrayList<Channel> channelList;

    public void addChannel(String name) {
        channelList.add(new Channel(name));
    }

    public Channel getChannel(String name) {
        for (Channel ch : channelList) {
            if (ch.getName().equals(name)) return ch;
        }
        throw new RuntimeException();
    }

    public void sendNotification(String content, Date date, String... channelNames) {
        Notification notification = new Notification(content, date);
        for (String name : channelNames) {
            try {
                this.getChannel(name).sendNotification(notification);
            }
            catch(RuntimeException e)
            {}
        }
    }

    public Institution(String... channelNames) {
        channelList = new ArrayList<>();
        for (String name : channelNames) {
            channelList.add(new Channel(name));
        }
    }
}
