import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class MyRelative {
    public static void main(String[] args) {
        String jsonString = "{\"name\":\"Oliver Pinkney Miles\",\"birth\":\"7 Jun 1878\",\"death\":\"15 Mar 1939\",\"relationship\":\"2nd Great-Grandfather\"}";

        GsonBuilder builder = new GsonBuilder();
        builder.setPrettyPrinting();

        Gson gson = builder.create();

        // From JSON to String
        Relative relative = gson.fromJson(jsonString, Relative.class);
        System.out.println(relative);

        // From String to JSON
        jsonString = gson.toJson(relative);
        System.out.println(jsonString);
    }
}