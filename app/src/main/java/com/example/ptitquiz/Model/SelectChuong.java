package com.example.ptitquiz.Model;

public class SelectChuong {
    private String nameChuong;
    private int flagImage;

    public SelectChuong(String nameChuong, int flagImage) {
        this.nameChuong = nameChuong;
        this.flagImage = flagImage;
    }

    public String getNameChuong() {
        return nameChuong;
    }

    public void setNameChuong(String nameChuong) {
        this.nameChuong = nameChuong;
    }

    public int getFlagImage() {
        return flagImage;
    }

    public void setFlagImage(int flagImage) {
        this.flagImage = flagImage;
    }
}
