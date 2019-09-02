package com.e.recyclerview2;

public class MyModel {

    public MyModel(String maintitle,int images){
        // this.maintitle=maintitle;
        setMaintitle( maintitle );
        setImages( images );
    }

    public String getMaintitle() {
        return maintitle;
    }

    public void setMaintitle(String maintitle) {
        this.maintitle = maintitle;
    }

    private String maintitle;

    public int getImages() {
        return images;
    }

    public void setImages(int images) {
        this.images = images;
    }

    private int images;
}
