# space.ifel.maps
Maps api for starpeace

This library is the maps api for the java starpeace rebuild.

Using json defined map files and tilesets maps can be constructed passing the map name, the api then takes responsibility
for constructing all map requirements including loading of textures.

In keeping with the current act of switching tilesets as seasons change, the library stores the tilesets indexed in a hash map
with a variable to hold current tileset, so at runtime the set can be switched as now.

The example json files within the library were created using [Tiler](https://www.mapeditor.org/)

This library will be used with the OpenGl Engine for the rebuild of the client.
