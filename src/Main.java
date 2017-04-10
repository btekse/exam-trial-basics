/**
 * Created by Balázs on 2017. 04. 10..
 */
public class Main {
  public static void main(String[] args) {
    Cuboid cuboid = new Cuboid(2, 3,4);

    System.out.println("surface: " + cuboid.getSurface());
    System.out.println("volume: " + cuboid.getVolume());

  }
}
