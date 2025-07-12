package com.xworkz.park.Set;

import java.util.Objects;

public class ShoeDTO {

    private String brandName;
    private int price;
    private int size;

    public ShoeDTO(String brandName, int price, int size) {
        this.brandName = brandName;
        this.price = price;
        this.size = size;
    }

    public String getBrandName() {
        return brandName;
    }

    public int getPrice() {
        return price;
    }

    public int getSize() {
        return size;
    }

    @Override
    public String toString() {
        return "ShoeDTO{" +
                "brandName='" + brandName + '\'' +
                ", price=" + price +
                ", size=" + size +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ShoeDTO)) return false;
        ShoeDTO shoeDTO = (ShoeDTO) o;
        return price == shoeDTO.price && size == shoeDTO.size && Objects.equals(brandName, shoeDTO.brandName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(brandName, price, size);
    }
}
