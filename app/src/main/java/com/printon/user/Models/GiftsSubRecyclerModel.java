package com.printon.user.Models;

public class GiftsSubRecyclerModel {
    private int sub_cat_image;
    private String sub_cat_name, price, number;

    public GiftsSubRecyclerModel(int sub_cat_image, String sub_cat_name, String price, String number) {
        this.sub_cat_image = sub_cat_image;
        this.sub_cat_name = sub_cat_name;
        this.price = price;
        this.number = number;
    }

    public int getSub_cat_image() {
        return sub_cat_image;
    }

    public void setSub_cat_image(int sub_cat_image) {
        this.sub_cat_image = sub_cat_image;
    }

    public String getSub_cat_name() {
        return sub_cat_name;
    }

    public void setSub_cat_name(String sub_cat_name) {
        this.sub_cat_name = sub_cat_name;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }
}
