package emlakOOP.model;

import java.util.UUID;

public class Image {
    private String id;
    private String name;
    private String path;
    private String format;
    private Integer size;

    public Image(
        String name,
        String format,
        Integer size
    ){
        this.id = UUID.randomUUID().toString();
        this.name = name;
        this.path = "/home/images/" + this.id;
        this.format = format;
        this.size = size;
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

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public String getFormat() {
        return format;
    }

    public void setFormat(String format) {
        this.format = format;
    }

    public Integer getSize() {
        return size;
    }

    public void setSize(Integer size) {
        this.size = size;
    }
}
