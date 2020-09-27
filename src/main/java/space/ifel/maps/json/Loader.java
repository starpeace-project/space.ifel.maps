package space.ifel.maps.json;

import com.fasterxml.jackson.databind.ObjectMapper;
import space.ifel.maps.json.classes.maps.Map;
import space.ifel.maps.json.classes.tilesets.TileSet;

import java.io.File;

public class Loader {
    private static final String resourcePath = "src/main/resources/";
    private static final String mapResourcePath = resourcePath + "maps/";
    private static final String tileSetResourcePath = resourcePath + "tilesets/";

    public static Map loadMap(String fileName) {
        try {
            ObjectMapper objectMapper = new ObjectMapper();
            Map map = objectMapper.readValue(new File(mapResourcePath + fileName), Map.class);
            System.out.println("Map loaded successfully.");
            return map;
        } catch (Exception e) {
            System.out.println("Error loading map file [" + fileName + "]");
        }

        return null;
    }

    public static space.ifel.maps.json.classes.tilesets.TileSet loadTileSet(String fileName) {
        try {
            ObjectMapper objectMapper = new ObjectMapper();
            TileSet tileSet = objectMapper.readValue(new File(tileSetResourcePath + fileName), TileSet.class);
            System.out.println("Tile set loaded successfully.");
            return tileSet;
        } catch (Exception e) {
            System.out.println(tileSetResourcePath + fileName);
            System.out.println("Error loading tile set file [" + fileName + "]");
            System.out.println(e.getMessage());
        }

        return null;
    }
}
