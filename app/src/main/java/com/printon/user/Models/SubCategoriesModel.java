package com.printon.user.Models;

public class SubCategoriesModel {

    private int sub_cat_image;
    private String sub_cat_name, price;

    public SubCategoriesModel(int sub_cat_image, String sub_cat_name, String price) {
        this.sub_cat_image = sub_cat_image;
        this.sub_cat_name = sub_cat_name;
        this.price = price;
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
}
