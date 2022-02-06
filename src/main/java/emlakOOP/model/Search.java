package emlakOOP.model;

import java.util.UUID;

public class Search {
    private String id;
    private String filter;
    private boolean sendEmail;

    //relations
    private User user;

    public Search(
            User user,
            String filter,
            boolean sendEmail
    ){
        this.id = UUID.randomUUID().toString();
        this.user = user;
        this.filter = filter;
        this.sendEmail = sendEmail;
        user.getSavedSearches().add(this);
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFilter() {
        return filter;
    }

    public void setFilter(String filter) {
        this.filter = filter;
    }

    public boolean isSendEmail() {
        return sendEmail;
    }

    public void setSendEmail(boolean sendEmail) {
        this.sendEmail = sendEmail;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
