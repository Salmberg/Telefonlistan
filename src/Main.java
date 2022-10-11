import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Map<String, String> encryptions = new HashMap<>();

        // Create operations
        encryptions.put("Greta", "543 3431 1533");
        encryptions.put("Karin", " 634 2341 2344");
        encryptions.put("Kevin", "324 5430 1222");


        while (true) {

            System.out.println("Vems nummer vill du veta? (Greta, Karin eller Kevin):");

            Scanner chooseName = new Scanner(System.in);

            String input = chooseName.nextLine();

            if (input.equals("Greta")) {
                System.out.println(encryptions.get("Greta"));
            } else if (input.equals("Karin")) {
                System.out.println(encryptions.get("Karin"));
            } else if (input.equals("Kevin")) {
                System.out.println(encryptions.get("Kevin"));
            } else {
                System.out.println("Välj mellan Greta, Karin eller Kevin");
            }
        }
    }
}

