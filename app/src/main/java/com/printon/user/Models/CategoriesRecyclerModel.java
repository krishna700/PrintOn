package com.printon.user.Models;

public class CategoriesRecyclerModel {

    private int cat_image;
    private String cat_name;

    public CategoriesRecyclerModel(int cat_image, String cat_name) {
        this.cat_image = cat_image;
        this.cat_name = cat_name;
    }

    public int getCat_image() {
        return cat_image;
    }

    public void setCat_image(int cat_image) {
        this.cat_image = cat_image;
    }

    public String getCat_name() {
        return cat_name;
    }

    public void setCat_name(String cat_name) {
        this.cat_name = cat_name;
    }
}
