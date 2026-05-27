// SINGLETON PATTERN
// Ensures only one instance of a class exists throughout the application

public class SingletonPattern {
    private static SingletonPattern instance = null;
    private String config;

    // Private constructor prevents instantiation
    private SingletonPattern() {
        this.config = "Default Configuration";
    }

    // Thread-safe method to get singleton instance
    public static synchronized SingletonPattern getInstance() {
        if (instance == null) {
            instance = new SingletonPattern();
        }
        return instance;
    }

    public void setConfig(String config) {
        this.config = config;
    }

    public String getConfig() {
        return config;
    }

    public void displayInfo() {
        System.out.println("Singleton Config: " + config);
    }

    // Demo
    public static void main(String[] args) {
        SingletonPattern s1 = SingletonPattern.getInstance();
        s1.setConfig("Custom Config 1");

        SingletonPattern s2 = SingletonPattern.getInstance();
        System.out.println("S1 and S2 are same instance: " + (s1 == s2));
        System.out.println("S2 Config: " + s2.getConfig());
    }
}
