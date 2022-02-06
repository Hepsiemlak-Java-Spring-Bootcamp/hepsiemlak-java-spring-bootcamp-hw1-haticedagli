package emlakOOP.model;

import java.util.Date;
import java.util.UUID;

public class Message {
    private String id;
    private Estate estate;
    private User to;
    private User from;
    private boolean seen;
    private String message;
    private Date sendDate;

    public Message(
            Estate estate,
            User to,
            User from,
            String message
    ){
        this.id = UUID.randomUUID().toString();
        this.estate = estate;
        this.to = to;
        this.from = from;
        this.seen = false;
        this.message = message;
        this.sendDate = new Date();
        to.getMessages().add(this);
        from.getMessages().add(this);
        estate.getMessages().add(this);
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Estate getEstate() {
        return estate;
    }

    public void setEstate(Estate estate) {
        this.estate = estate;
    }

    public User getTo() {
        return to;
    }

    public void setTo(User to) {
        this.to = to;
    }

    public User getFrom() {
        return from;
    }

    public void setFrom(User from) {
        this.from = from;
    }

    public boolean isSeen() {
        return seen;
    }

    public void setSeen(boolean seen) {
        this.seen = seen;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Date getSendDate() {
        return sendDate;
    }

    public void setSendDate(Date sendDate) {
        this.sendDate = sendDate;
    }

    @Override
    public String toString() {
        return String.format("From %s, to %s -> %s%n", getFrom().getName(), getTo().getName(), getMessage());
    }
}
