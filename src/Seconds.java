import java.util.ArrayList;
import java.util.Arrays;

public class Seconds {
  public static void main(String[] args) {
    ArrayList<String> list = new ArrayList<String>(Arrays.asList("1", "2", "3", "4", "5", "6", "7", "8"));
    ArrayList<String> finalList = new ArrayList<String>();

    for (int i = 1; i < list.size(); i += 2) {
      finalList.add(list.get(i));
    }
    System.out.println(finalList);
  }
}