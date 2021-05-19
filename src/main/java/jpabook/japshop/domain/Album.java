package jpabook.japshop.domain;

import javax.persistence.Entity;

@Entity
public class Album extends Item {

    private String artist;
    private String src;


    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public String getSrc() {
        return src;
    }

    public void setSrc(String src) {
        this.src = src;
    }
}
