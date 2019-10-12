package com.printon.user.Models;

public class ShiftCatmodel {
    private int image;
    private String cat;

    public ShiftCatmodel(int image, String cat) {
        this.image = image;
        this.cat = cat;
    }

    public String getCat() {
        return cat;
    }

    public void setCat(String cat) {
        this.cat = cat;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }
}
