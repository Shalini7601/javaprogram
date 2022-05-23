import java.util.ArrayList;
import java.util.List;

public class foreachEx {
public static void main(String args[]) {
List<String> flower = new ArrayList<String>();
flower.add("Rose");
flower.add("Jasmine");
flower.add("Sunflower");
flower.add("Marigold");
flower.add("Lilly");

//flower.forEach(show ->System.out.println(show));
flower.forEach(System.out::println);
}
}