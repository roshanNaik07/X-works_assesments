package com.xworkz.park.Map.internal;

import java.util.Objects;

public class JewelleryDTO {

    private String type ;
    private int price ;
    private String materialQuntity;
    private String storeName;
    private int digitalValue;

    public JewelleryDTO(String type, int price, String materialQuntity, String storeName, int digitalValue) {
        this.type = type;
        this.price = price;
        this.materialQuntity = materialQuntity;
        this.storeName = storeName;
        this.digitalValue = digitalValue;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getMaterialQuntity() {
        return materialQuntity;
    }

    public void setMaterialQuntity(String materialQuntity) {
        this.materialQuntity = materialQuntity;
    }

    public String getStoreName() {
        return storeName;
    }

    public void setStoreName(String storeName) {
        this.storeName = storeName;
    }

    public int getDigitalValue() {
        return digitalValue;
    }

    public void setDigitalValue(int digitalValue) {
        this.digitalValue = digitalValue;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof JewelleryDTO)) return false;
        JewelleryDTO that = (JewelleryDTO) o;
        return price == that.price && digitalValue == that.digitalValue && Objects.equals(type, that.type) && Objects.equals(materialQuntity, that.materialQuntity) && Objects.equals(storeName, that.storeName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, price, materialQuntity, storeName, digitalValue);
    }

    @Override
    public String toString() {
        return "JewelleryDTO{" +
                "type='" + type + '\'' +
                ", price=" + price +
                ", materialQuntity='" + materialQuntity + '\'' +
                ", storeName='" + storeName + '\'' +
                ", digitalValue=" + digitalValue +
                '}';
    }
}
