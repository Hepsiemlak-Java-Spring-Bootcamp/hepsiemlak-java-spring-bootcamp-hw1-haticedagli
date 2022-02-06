package emlakOOP.model;

import emlakOOP.enums.AttributeType;

public class Attribute {
    private String id;
    private AttributeType attributeType;
    private String value;

    public Attribute(
            AttributeType attributeType,
            String value
    ){
        this.attributeType = attributeType;
        this.value = value;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public AttributeType getAttributeType() {
        return attributeType;
    }

    public void setAttributeType(AttributeType attributeType) {
        this.attributeType = attributeType;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "Attribute{" +
                "id='" + id + '\'' +
                ", attributeType=" + attributeType +
                ", value='" + value + '\'' +
                '}';
    }
}
