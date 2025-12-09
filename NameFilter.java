import java.util.ArrayList;
import java.util.List;

public class NameFilter {
    public static void main(String[] args) {

        List<String> names = new ArrayList<>();

        names.add("Siddhi");
        names.add("Bhakti");
        names.add("Sneha");
        names.add("Samiksha");
        names.add("Apurva");

        System.out.println("Names starting with 'S':");
        for (String name : names) {
            if (name.toLowerCase().startsWith("s")) {
                System.out.println(name);
            }
        }
    }
}
