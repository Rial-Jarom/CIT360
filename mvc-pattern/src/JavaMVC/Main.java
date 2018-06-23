package JavaMVC;

import JavaMVCControllers.*;

public class Main {
    public static void main(String[] args) {
        // TODO code application logic here
        HelloWorldController controller = new HelloWorldController();
        // Start the application
        controller.startApplication();
    }
}
