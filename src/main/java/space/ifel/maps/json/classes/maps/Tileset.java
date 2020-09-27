package space.ifel.maps.json.classes.maps;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Tileset {
    @JsonProperty("firstgid")
    public int getFirstgid() {
        return this.firstgid;
    }

    public void setFirstgid(int firstgid) {
        this.firstgid = firstgid;
    }

    int firstgid;

    @JsonProperty("source")
    public String getSource() {
        return this.source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    String source;
}
