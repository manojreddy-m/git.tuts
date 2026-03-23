public class App {
    public static void main(String[] args) {
        System.out.println("🚀 Java App Deployed Successfully via Jenkins!");

        // Simulate some logic
        int a = 10;
        int b = 20;
        int sum = a + b;

        System.out.println("Sum of " + a + " and " + b + " is: " + sum);

        // Simulate environment info
        String env = System.getenv("ENV");
        if (env == null) {
            env = "DEV";
        }

        System.out.println("Running in environment: " + env);
    }
}