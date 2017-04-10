
public class Cuboid {
  public int edgeSize;
  public int surface;
  public int volume;

  public getSurface(int edgeSize) {
    this.edgeSize = edgeSize;
    surface = ( edgeSize * 2 ) * 6;
  }

  public getVolume(int edgeSize) {
    this.edgeSize = edgeSize;
    volume = edgeSize * edgeSize * edgeSize
  }

  public int getVolume() {
    return volume;
  }System.out.println()


  // Create a class that represents a cuboid:
  // It should take its three dimensions as constructor parameters (numbers)
  // It should have a method called `getSurface` that returns the cuboid's surface
  // It should have a method called `getVolume` that returns the cuboid's volume
}
