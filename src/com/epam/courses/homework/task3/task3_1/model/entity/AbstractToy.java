package com.epam.courses.homework.task3.task3_1.model.entity;

public abstract class AbstractToy {
    private int price;
    private int age;
    private String gender;
    private int categoryId;
    private int manufacturerId;
    private int countryId;
    private int width;
    private int height;

    private AbstractToy(int price, int age, String gender, int categoryId, int manufacturerId, int countryId, int width, int height) {
        this.price = price;
        this.age = age;
        this.gender = gender;
        this.categoryId = categoryId;
        this.manufacturerId = manufacturerId;
        this.countryId = countryId;
        this.width = width;
        this.height = height;
    }

    public AbstractToy(int price, int age, String gender) {
        this(price, age, gender,0,0,0,0,0);
    }

    public AbstractToy() {
        this(0,0,"undefined");
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(int categoryId) {
        this.categoryId = categoryId;
    }

    public int getManufacturerId() {
        return manufacturerId;
    }

    public void setManufacturerId(int manufacturerId) {
        this.manufacturerId = manufacturerId;
    }

    public int getCountryId() {
        return countryId;
    }

    public void setCountryId(int countryId) {
        this.countryId = countryId;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    @Override
    public String toString() {
        return
                "price=" + price +
                ", age='" + age +
                "', gender='" + gender+"'\n";
    }
}
