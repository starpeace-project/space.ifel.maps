package space.ifel.maps.json;

import java.awt.image.BufferedImage;
import java.nio.ByteBuffer;

import org.lwjgl.BufferUtils;

import static org.lwjgl.opengl.GL11.*;

public class TileTexture {
    private int id;
    private int width;
    private int height;

    public int getId() {
        return id;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public TileTexture(String tileSetName, String fileName) {
        BufferedImage tile = Loader.loadTileImage(tileSetName, fileName);

        if (tile != null) {
            width = tile.getWidth();
            height = tile.getHeight();

            int[] pixels_raw = tile.getRGB(0, 0, width, height, null, 0, width);

            ByteBuffer pixels = BufferUtils.createByteBuffer(width * height * 4);

            for (int i = 0; i < width; i++) {
                for (int j = 0; j < height; j++) {
                    int pixel = pixels_raw[i * width + j];
                    pixels.put((byte) ((pixel >> 16) & 0xFF));
                    pixels.put((byte) ((pixel >> 8) & 0xFF));
                    pixels.put((byte) ((pixel) & 0xFF));
                    pixels.put((byte) ((pixel >> 24) & 0xFF));
                }
            }

            pixels.flip();

            try {
                id = glGenTextures();
                glBindTexture(GL_TEXTURE_2D, id);

                glTexParameterf(GL_TEXTURE_2D, GL_TEXTURE_MIN_FILTER, GL_NEAREST);
                glTexParameterf(GL_TEXTURE_2D, GL_TEXTURE_MAG_FILTER, GL_NEAREST);

                glTexImage2D(GL_TEXTURE_2D, 0, GL_RGBA, width, height, 0, GL_RGBA, GL_BYTE, pixels);
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }

    public void bind() {
        glBindTexture(GL_TEXTURE_2D, id);
    }
}
