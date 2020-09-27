package space.ifel.maps.json.classes.tilesets;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Tile {
    @JsonProperty("id")
    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    int id;

    @JsonProperty("image")
    public String getImage() {
        return this.image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    String image;

    public String getKey() {
        return this.image.split(".")[0];
    }

    @JsonProperty("imageheight")
    public int getImageheight() {
        return this.imageheight;
    }

    public void setImageheight(int imageheight) {
        this.imageheight = imageheight;
    }

    int imageheight;

    @JsonProperty("imagewidth")
    public int getImagewidth() {
        return this.imagewidth;
    }

    public void setImagewidth(int imagewidth) {
        this.imagewidth = imagewidth;
    }

    int imagewidth;
}
