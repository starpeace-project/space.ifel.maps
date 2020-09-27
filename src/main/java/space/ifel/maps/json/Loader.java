package space.ifel.maps.json;

import com.fasterxml.jackson.databind.ObjectMapper;
import space.ifel.maps.json.classes.maps.Map;
import space.ifel.maps.json.classes.tilesets.TileSet;

import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;
import java.io.File;
import java.io.IOException;

public class Loader {
    private static final String resourcePath = "src/main/resources/";
    private static final String mapResourcePath = resourcePath + "maps/";
    private static final String tileSetResourcePath = resourcePath + "tilesets/";
    private static final String tileSetImageResourcePath = tileSetResourcePath + "images/";

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

    public static BufferedImage loadTileImage(String tileSet, String fileName) {
        try {
            BufferedImage img = ImageIO.read(new File(tileSetImageResourcePath + tileSet + "/" + fileName));
            System.out.println("Image [" + fileName + "] loaded successfully");
            return img;
        } catch (IOException e) {
            System.out.println(tileSetImageResourcePath + fileName);
            System.out.println(e.getMessage());
            System.out.println("Unable to load image file [" + fileName + "]");
        }

        return null;
    }
}
