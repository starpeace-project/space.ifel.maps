package space.ifel.maps.json;

import space.ifel.maps.json.classes.maps.Map;
import space.ifel.maps.json.classes.maps.Tileset;

import java.util.HashMap;
import java.util.List;

public class AMap {
    protected int height;
    protected int width;

    protected int tileHeight;
    protected int tileWidth;

    protected int currentTileSet = 0;

    protected HashMap<Integer, TileSet> tileSets;

    protected void initialise(String jsonMapFile) {
        Map map = Loader.loadMap(jsonMapFile);

        if (map != null) {
            setWidth(map.getWidth());
            setHeight(map.getHeight());
            setTileWidth(map.getTilewidth());
            setTileHeight(map.getTileheight());

            List<Tileset> tilesets = map.getTilesets();

            for (int i = 0; i < tilesets.size(); i++) {
                Tileset tileSet = tilesets.get(i);
                System.out.println(tileSet.getSource());
                space.ifel.maps.json.classes.tilesets.TileSet loaded = Loader.loadTileSet(tileSet.getSource());

                if (loaded != null) {
                    tileSets.put(i, new TileSet(loaded));
                }
            }
        }
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getTileHeight() {
        return tileHeight;
    }

    public void setTileHeight(int tileHeight) {
        this.tileHeight = tileHeight;
    }

    public int getTileWidth() {
        return tileWidth;
    }

    public void setTileWidth(int tileWidth) {
        this.tileWidth = tileWidth;
    }

    public TileSet getCurrentTileSet() {
        return tileSets.get(currentTileSet);
    }

    public void setCurrentTileSet(int currentTileSet) {
        this.currentTileSet = currentTileSet;
    }
}
