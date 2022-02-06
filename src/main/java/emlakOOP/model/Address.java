package emlakOOP.model;

import java.util.UUID;

public class Address {
    private String id;
    private String province;
    private String district;
    private String neighborhood;
    private String address;

    public Address(
        String province,
        String district,
        String neighborhood,
        String address
    ){
        this.id = UUID.randomUUID().toString();
        this.province = province;
        this.district = district;
        this.neighborhood = neighborhood;
        this.address = address;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public String getNeighborhood() {
        return neighborhood;
    }

    public void setNeighborhood(String neighborhood) {
        this.neighborhood = neighborhood;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Address{" +
                "id='" + id + '\'' +
                ", province='" + province + '\'' +
                ", district='" + district + '\'' +
                ", neighborhood='" + neighborhood + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
