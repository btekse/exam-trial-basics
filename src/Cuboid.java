public class Cuboid {

  public int edgeSize_a;
  public int edgeSize_b;
  public int edgeSize_c;

Cuboid(int a, int b, int c) {
  this.edgeSize_a = a;
  this.edgeSize_b = b;
  this.edgeSize_c = c;
}

int getSurface() {
  return 2 * (edgeSize_a * edgeSize_b) + 2 * (edgeSize_a * edgeSize_c) + 2 * (edgeSize_b * edgeSize_c);
}

int getVolume () {
  return edgeSize_a * edgeSize_b * edgeSize_c;
}



  // Create a class that represents a cuboid:
  // It should take its three dimensions as constructor parameters (numbers)
  // It should have a method called `getSurface` that returns the cuboid's surface
  // It should have a method called `getVolume` that returns the cuboid's volume
}
