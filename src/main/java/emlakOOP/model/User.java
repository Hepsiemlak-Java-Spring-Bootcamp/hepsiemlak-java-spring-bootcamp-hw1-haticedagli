package emlakOOP.model;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class User {

    private String id;
    private String name;
    private String surname;
    private String email;
    private Address address;
    private String phone;
    private boolean campaignMessageActive;

    //relations
    private List<Estate> estates = new ArrayList<>();
    private List<Estate> favoriteEstates = new ArrayList<>();
    private List<Search> savedSearches = new ArrayList<>();
    private List<Message> messages = new ArrayList<>();

    public User(
            String name,
            String surname,
            String email,
            Address address,
            String phone,
            boolean campaignMessageActive
    ){
        this.id = UUID.randomUUID().toString();
        this.name = name;
        this.surname = surname;
        this.email = email;
        this.address = address;
        this.phone = phone;
        this.campaignMessageActive = campaignMessageActive;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public boolean isCampaignMessageActive() {
        return campaignMessageActive;
    }

    public void setCampaignMessageActive(boolean campaignMessageActive) {
        this.campaignMessageActive = campaignMessageActive;
    }

    public List<Estate> getEstates() {
        return estates;
    }

    public void setEstates(List<Estate> estates) {
        this.estates = estates;
    }

    public List<Estate> getFavoriteEstates() {
        return favoriteEstates;
    }

    public void setFavoriteEstates(List<Estate> favoriteEstates) {
        this.favoriteEstates = favoriteEstates;
    }

    public List<Search> getSavedSearches() {
        return savedSearches;
    }

    public void setSavedSearches(List<Search> savedSearches) {
        this.savedSearches = savedSearches;
    }

    public List<Message> getMessages() {
        return messages;
    }

    public void setMessages(List<Message> messages) {
        this.messages = messages;
    }
}
