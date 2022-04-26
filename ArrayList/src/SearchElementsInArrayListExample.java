
import java.util.ArrayList;
import java.util.List;
public class SearchElementsInArrayListExample {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("John");
        names.add("Alice");
        names.add("Bob");
        names.add("Steve");
        names.add("John");
        names.add("Steve");
        names.add("Maria");

        // Check if an ArrayList contains a given element
        // Kiểm tra xem ArrayList có chứa một phần tử đã cho hay không
        System.out.println("indexOf\"Steve\": "  + names.indexOf("Steve"));
        System.out.println("indexOf \"Mark\": " + names.indexOf("Mark"));

        // Find the index of the last occurrence of an element in an ArrayList
        System.out.println("lastIndexOf \"John\" : " + names.lastIndexOf("John"));
        System.out.println("lastIndexOf \"Bill\" : " + names.lastIndexOf("Bill"));
    }
}
