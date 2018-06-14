public class Notification {
    private String content;

    public String getContent() {
        return content;
    }

    private Date date;

    public Notification(String content, Date date) {
        this.content = content;
        this.date = date;
    }

    public String getDate() {
        return date.toString();
    }

    @Override
    public String toString() {
        return this.getDate() + " -> " + this.getContent();
    }
}
