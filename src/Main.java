import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<String, String> encryptions = new HashMap<>();

        // Create operations
        encryptions.put("Greta", "543 3431 1533");
        encryptions.put("Karin", " 634 2341 2344");
        encryptions.put("Kevin", "324 5430 1222");


        // Read operation
        System.out.println(encryptions.get("Greta"));

        for(String key : encryptions.keySet()) {
            System.out.println("Key: " + key);
            System.out.println("Value: " + encryptions.get(key));
        }

    }
}