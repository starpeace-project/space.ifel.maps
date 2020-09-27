package space.ifel.maps.json;

import space.ifel.maps.json.classes.tilesets.Tile;

import java.util.HashMap;

public class TileSet {
    HashMap<Integer, TileTexture> tiles;

    public TileSet(space.ifel.maps.json.classes.tilesets.TileSet tileSet) {
        for (Tile tile: tileSet.getTiles()) {
            tiles.put(tile.getId(), new TileTexture(tileSet.getName(), tile.getImage()));
        }
    }
}
