package emlakOOP.model;

import emlakOOP.enums.Status;
import emlakOOP.model.advert.Advert;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.UUID;

public class Estate {

    private String id;
    private String title;
    private String description;
    private Status status;
    private Advert advert;
    private User owner;
    private Price price;
    boolean boost;
    private Date createdDate;
    private Date updatedDate;

    //relations
    private List<Message> messages = new ArrayList<>();
    private List<User> favoriteBy = new ArrayList<>();

    public Estate(
            String title,
            String description,
            Advert advert,
            User owner,
            Price price,
            boolean boost
    ){
        this.id = UUID.randomUUID().toString();
        this.status = Status.PENDING;
        this.title = title;
        this.description = description;
        this.advert = advert;
        this.owner = owner;
        this.price = price;
        this.boost = boost;
        owner.getEstates().add(this);
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public Advert getAdvert() {
        return advert;
    }

    public void setAdvert(Advert advert) {
        this.advert = advert;
    }

    public User getOwner() {
        return owner;
    }

    public void setOwner(User owner) {
        this.owner = owner;
    }

    public Price getPrice() {
        return price;
    }

    public void setPrice(Price price) {
        this.price = price;
    }

    public boolean isBoost() {
        return boost;
    }

    public void setBoost(boolean boost) {
        this.boost = boost;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    public Date getUpdatedDate() {
        return updatedDate;
    }

    public void setUpdatedDate(Date updatedDate) {
        this.updatedDate = updatedDate;
    }

    public List<Message> getMessages() {
        return messages;
    }

    public void setMessages(List<Message> messages) {
        this.messages = messages;
    }

    public List<User> getFavoriteBy() {
        return favoriteBy;
    }

    public void setFavoriteBy(List<User> favoriteBy) {
        this.favoriteBy = favoriteBy;
    }

    @Override
    public String toString() {
        return "Estate{" +
                "id='" + id + '\'' +
                ", title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", status=" + status +
                ", advert=" + advert +
                ", owner=" + owner +
                ", price=" + price +
                ", boost=" + boost +
                ", createdDate=" + createdDate +
                ", updatedDate=" + updatedDate +
                ", messages=" + messages +
                ", favoriteBy=" + favoriteBy +
                '}';
    }
}
