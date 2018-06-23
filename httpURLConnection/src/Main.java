import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class Main {
    public static void main(String[] args) {
        // Successful website content capture
        try {
            // This line sets the website URL which the class will request
            URL url = new URL("http://iamawesome.com/");
            // The connection is opened
            HttpURLConnection myConnection = (HttpURLConnection) url.openConnection();
            // The GET method will be used, which is proper
            myConnection.setRequestMethod("GET");
            // This line tells the class which web browser to use for the request
            myConnection.setRequestProperty("User-Agent", "Safari");
            // The timeout for this operation is 5 seconds
            myConnection.setReadTimeout(5000);
            System.out.println(url);
            // The HTTP response code is captured
            int responseCode = myConnection.getResponseCode();
            System.out.println("HTTP Response Code: " + responseCode);

            // If the HTTP response code is not 200, a message will be printed
            if(responseCode != 200) {
                System.out.println("HTTP Response Code Error");
                return;
            }

            // The content of the requested website is read
            BufferedReader input = new BufferedReader(
                    new InputStreamReader(myConnection.getInputStream()));

            // Empty variable in which the website content will be stored.
            String content;
            // The content is stored in the 'content' variable and printed while it is not null
            while((content = input.readLine()) != null) {
                System.out.println(content);
            }
            // The Reader is closed
            input.close();

        } catch(MalformedURLException e) {
            System.out.println("Malformed URL: " + e.getMessage());
        } catch(IOException e) {
            System.out.println("IOException: " + e.getMessage());
        }

        // Malformed URL
        try {
            URL url2 = new URL("iam awesome.com");
            HttpURLConnection myConnection2 = (HttpURLConnection) url2.openConnection();
            myConnection2.setRequestMethod("GET");
            myConnection2.setRequestProperty("User-Agent", "Safari");
            myConnection2.setReadTimeout(5000);
            System.out.println(url2);
            int responseCode2 = myConnection2.getResponseCode();
            System.out.println("HTTP Response Code: " + responseCode2);
            if(responseCode2 != 200) {
                System.out.println("HTTP Response Code Error");
                return;
            }
            BufferedReader input2 = new BufferedReader(new InputStreamReader(myConnection2.getInputStream()));
            String content2;
            while((content2 = input2.readLine()) != null) {
                System.out.println(content2);
            }
            input2.close();
        } catch(MalformedURLException e) {
            System.out.println("Malformed URL: " + e.getMessage());
        } catch(IOException e) {
            System.out.println("IOException: " + e.getMessage());
        }
    }
}
