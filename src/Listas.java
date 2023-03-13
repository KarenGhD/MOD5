import java.util.HashMap;

public class Listas {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();
        map.put("B", "BARCO");
        map.put("I","IATE");
        map.put("L","LANCHA");

        System.out.println(map.get("B"));
    }
    }

