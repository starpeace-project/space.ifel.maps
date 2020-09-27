package space.ifel.maps.json.classes.tilesets;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class TileSet {
    @JsonProperty("name")
    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    String name;

    @JsonProperty("tilecount")
    public int getTilecount() {
        return this.tilecount;
    }

    public void setTilecount(int tilecount) {
        this.tilecount = tilecount;
    }

    int tilecount;

    @JsonProperty("tiles")
    public List<Tile> getTiles() {
        return this.tiles;
    }

    public void setTiles(List<Tile> tiles) {
        this.tiles = tiles;
    }

    List<Tile> tiles;
}