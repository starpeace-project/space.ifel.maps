package space.ifel.maps.json.classes.maps;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class Map {
    @JsonProperty("compressionlevel")
    public int getCompressionlevel() {
        return this.compressionlevel;
    }

    public void setCompressionlevel(int compressionlevel) {
        this.compressionlevel = compressionlevel;
    }

    int compressionlevel;

    @JsonProperty("height")
    public int getHeight() {
        return this.height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    int height;

    @JsonProperty("infinite")
    public boolean getInfinite() {
        return this.infinite;
    }

    public void setInfinite(boolean infinite) {
        this.infinite = infinite;
    }

    boolean infinite;

    @JsonProperty("layers")
    public List<Layer> getLayers() {
        return this.layers;
    }

    public void setLayers(List<Layer> layers) {
        this.layers = layers;
    }

    List<Layer> layers;

    @JsonProperty("nextlayerid")
    public int getNextlayerid() {
        return this.nextlayerid;
    }

    public void setNextlayerid(int nextlayerid) {
        this.nextlayerid = nextlayerid;
    }

    int nextlayerid;

    @JsonProperty("nextobjectid")
    public int getNextobjectid() {
        return this.nextobjectid;
    }

    public void setNextobjectid(int nextobjectid) {
        this.nextobjectid = nextobjectid;
    }

    int nextobjectid;

    @JsonProperty("orientation")
    public String getOrientation() {
        return this.orientation;
    }

    public void setOrientation(String orientation) {
        this.orientation = orientation;
    }

    String orientation;

    @JsonProperty("renderorder")
    public String getRenderorder() {
        return this.renderorder;
    }

    public void setRenderorder(String renderorder) {
        this.renderorder = renderorder;
    }

    String renderorder;

    @JsonProperty("tiledversion")
    public String getTiledversion() {
        return this.tiledversion;
    }

    public void setTiledversion(String tiledversion) {
        this.tiledversion = tiledversion;
    }

    String tiledversion;

    @JsonProperty("tileheight")
    public int getTileheight() {
        return this.tileheight;
    }

    public void setTileheight(int tileheight) {
        this.tileheight = tileheight;
    }

    int tileheight;

    @JsonProperty("tilesets")
    public List<Tileset> getTilesets() {
        return this.tilesets;
    }

    public void setTilesets(List<Tileset> tilesets) {
        this.tilesets = tilesets;
    }

    List<Tileset> tilesets;

    @JsonProperty("tilewidth")
    public int getTilewidth() {
        return this.tilewidth;
    }

    public void setTilewidth(int tilewidth) {
        this.tilewidth = tilewidth;
    }

    int tilewidth;

    @JsonProperty("type")
    public String getType() {
        return this.type;
    }

    public void setType(String type) {
        this.type = type;
    }

    String type;

    @JsonProperty("version")
    public double getVersion() {
        return this.version;
    }

    public void setVersion(double version) {
        this.version = version;
    }

    double version;

    @JsonProperty("width")
    public int getWidth() {
        return this.width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    int width;
}

