public class HistoryLover extends User {
    public HistoryLover(String pesel) {
        super(pesel);
    }

    public void displayHistoryOf(Channel channel, int historyDepth) {
        if (!channelList.contains(channel)) {
            System.out.println("Not following this channel.");
        } else {
            int size = channel.getHistory().size();
            int limit = (size < historyDepth) ? size : historyDepth;
            for (int i = 0; i < limit; i++) {
                System.out.println(channel + " " + channel.getHistory().get(i));
            }
        }
    }
}
