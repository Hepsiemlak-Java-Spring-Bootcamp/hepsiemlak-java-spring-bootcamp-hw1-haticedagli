package emlakOOP.model;

import emlakOOP.enums.AdvertType;

import java.util.UUID;

public class Category {
    private String id;
    private AdvertType advertType;
    private String name;

    public Category(
            AdvertType advertType,
            String name
    ){
        this.id = UUID.randomUUID().toString();
        this.advertType = advertType;
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public AdvertType getAdvertType() {
        return advertType;
    }

    public void setAdvertType(AdvertType advertType) {
        this.advertType = advertType;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Category{" +
                "id='" + id + '\'' +
                ", advertType=" + advertType +
                ", name='" + name + '\'' +
                '}';
    }
}
