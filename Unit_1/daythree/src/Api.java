import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

    public class Api {
        public static void main(String[] args) {
            String apiKey = "YOUR_API_KEY"; // Replace with your actual API key

            try {
                String word = "code"; // Replace with the word you want to look up
                URL url = new URL("https://api.api-ninjas.com/v1/dictionary?word=" + word);
                HttpURLConnection connection = (HttpURLConnection) url.openConnection();
                connection.setRequestProperty("accept", "application/json");
                connection.setRequestProperty("X-Api-Key", apiKey); // Set the API key header
                InputStream responseStream = connection.getInputStream();

                ObjectMapper mapper = new ObjectMapper();
                JsonNode root = mapper.readTree(responseStream);

                System.out.println(root.path("fact").asText());
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }


