import com.sun.deploy.util.StringUtils;

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
      Path filepath = Paths.get("countas/afile.txt");
      fileInput = Files.readAllLines(filepath);
      System.out.println("File reading OK.");
    } catch (IOException e) {
      System.out.println("Something wrong:" + e.getClass());
    }
    String a = fileInput.toString();
    char ch = a.charAt(a.indexOf('a'));
    int count = 0;
    for (int i = 0; i < a.length(); i++) {
      if (a.charAt(i) == 'a') {
        count++;
      }
    }
    System.out.println("Total count of letter a: " + count);
  }

}
