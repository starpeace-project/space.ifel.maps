module map {
    requires com.fasterxml.jackson.annotation;
    requires com.fasterxml.jackson.databind;
    requires java.desktop;
    requires org.lwjgl;
    requires org.lwjgl.opengl;
    requires org.lwjgl.glfw;

    exports space.ifel.maps.json.classes.tilesets;
    exports space.ifel.maps.json.classes.maps;
    exports space.ifel.maps.json;
}