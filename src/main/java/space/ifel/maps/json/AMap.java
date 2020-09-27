package space.ifel.maps.json;

import space.ifel.maps.json.classes.maps.Map;
import space.ifel.maps.json.classes.maps.Tileset;
import space.ifel.maps.json.classes.tilesets.TileSet;

import java.util.ArrayList;
import java.util.List;

public class AMap {
    protected int height;
    protected int width;

    protected int tileHeight;
    protected int tileWidth;

    protected int currentTileSet = 0;

    protected List<TileSet> tileSets;

    protected void initialise(String jsonMapFile) {
        Map map = Loader.loadMap(jsonMapFile);

        if (map != null) {
            setWidth(map.getWidth());
            setHeight(map.getHeight());
            setTileWidth(map.getTilewidth());
            setTileHeight(map.getTileheight());

            List<Tileset> tilesets = map.getTilesets();
            tileSets = new ArrayList<>();

            for (int i = 0; i < tilesets.size(); i++) {
                TileSet tileSet = Loader.loadTileSet(tilesets.get(i).getSource());

                if (tileSet != null) {
                    tileSets.add(tileSet);
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

    public space.ifel.maps.json.classes.tilesets.TileSet getCurrentTileSet() {
        return tileSets.get(currentTileSet);
    }

    public void setCurrentTileSet(int currentTileSet) {
        this.currentTileSet = currentTileSet;
    }

    public List<TileSet> getTileSets() {
        return this.tileSets;
    }
}
