import java.util.ArrayList;
import java.util.stream.Collectors;

public class Main {
  public static void main(String[] args) {
    var numbers = new ArrayList<Integer>();
    numbers.add(5);
    numbers.add(18);
    numbers.add(10);
    numbers.add(3);
    numbers.add(53);
    numbers.add(72);
    numbers.add(101);
    numbers.add(202);
    numbers.add(333);

    var filteredNumbers = numbers
        .stream()
        .skip(5)
        .collect(Collectors.toList());

    System.out.println(filteredNumbers);
  }
}
