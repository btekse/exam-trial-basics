import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class CountAs {
  public static void main(String[] args) {

    List<String> fileInput = new ArrayList<>();

    try {
      Path filepath = Paths.get("cuntas/afile.txt");
      fileInput = Files.readAllLines(filepath);
      System.out.println("File reading OK.");
    } catch (IOException e) {
      System.out.println("Something wrong:" + e.getClass());
    }


    System.out.println(fileInput);
  }

}
