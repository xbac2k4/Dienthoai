package com.example.dienthoai.Model;

public class Phone {
    String id, name, image, description, storageCapacity, ram, chipset, display, price, discountPrice, manufacturer;
    Boolean specialProduct;
    public Phone() {
    }
    public Phone(String id, String name, String image, String description, String storageCapacity, String ram, String chipset, String display, String price, String discountPrice, String manufacturer, Boolean specialProduct) {
        this.id = id;
        this.name = name;
        this.image = image;
        this.description = description;
        this.storageCapacity = storageCapacity;
        this.ram = ram;
        this.chipset = chipset;
        this.display = display;
        this.price = price;
        this.discountPrice = discountPrice;
        this.manufacturer = manufacturer;
        this.specialProduct = specialProduct;
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

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getStorageCapacity() {
        return storageCapacity;
    }

    public void setStorageCapacity(String storageCapacity) {
        this.storageCapacity = storageCapacity;
    }

    public String getRam() {
        return ram;
    }

    public void setRam(String ram) {
        this.ram = ram;
    }

    public String getChipset() {
        return chipset;
    }

    public void setChipset(String chipset) {
        this.chipset = chipset;
    }

    public String getDisplay() {
        return display;
    }

    public void setDisplay(String display) {
        this.display = display;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getDiscountPrice() {
        return discountPrice;
    }

    public void setDiscountPrice(String discountPrice) {
        this.discountPrice = discountPrice;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public Boolean getSpecialProduct() {
        return specialProduct;
    }

    public void setSpecialProduct(Boolean specialProduct) {
        this.specialProduct = specialProduct;
    }
}
