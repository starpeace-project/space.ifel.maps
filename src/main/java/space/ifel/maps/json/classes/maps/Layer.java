package space.ifel.maps.json.classes.maps;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class Layer {
    @JsonProperty("data")
    public List<Long> getData() {
        return this.data;
    }

    public void setData(List<Long> data) {
        this.data = data;
    }

    List<Long> data;

    @JsonProperty("height")
    public int getHeight() {
        return this.height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    int height;

    @JsonProperty("id")
    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    int id;

    @JsonProperty("name")
    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    String name;

    @JsonProperty("opacity")
    public int getOpacity() {
        return this.opacity;
    }

    public void setOpacity(int opacity) {
        this.opacity = opacity;
    }

    int opacity;

    @JsonProperty("type")
    public String getType() {
        return this.type;
    }

    public void setType(String type) {
        this.type = type;
    }

    String type;

    @JsonProperty("visible")
    public boolean getVisible() {
        return this.visible;
    }

    public void setVisible(boolean visible) {
        this.visible = visible;
    }

    boolean visible;

    @JsonProperty("width")
    public int getWidth() {
        return this.width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    int width;

    @JsonProperty("x")
    public int getX() {
        return this.x;
    }

    public void setX(int x) {
        this.x = x;
    }

    int x;

    @JsonProperty("y")
    public int getY() {
        return this.y;
    }

    public void setY(int y) {
        this.y = y;
    }

    int y;

    @JsonProperty("draworder")
    public String getDraworder() {
        return this.draworder;
    }

    public void setDraworder(String draworder) {
        this.draworder = draworder;
    }

    String draworder;

    @JsonProperty("objects")
    public List<Object> getObjects() {
        return this.objects;
    }

    public void setObjects(List<Object> objects) {
        this.objects = objects;
    }

    List<Object> objects;
}
