// FACADE PATTERN
// Provides unified interface to a set of subsystems

class DatabaseConnection {
    public void connect() {
        System.out.println("Connecting to database...");
    }
}

class AuthenticationService {
    public void authenticate(String user, String password) {
        System.out.println("Authenticating user: " + user);
    }
}

class ReportGenerator {
    public void generateReport() {
        System.out.println("Generating report...");
    }
}

class EmailService {
    public void sendEmail(String recipient, String message) {
        System.out.println("Sending email to " + recipient + ": " + message);
    }
}

// Facade class that simplifies the complex subsystem
public class FacadePattern {
    private DatabaseConnection database;
    private AuthenticationService auth;
    private ReportGenerator reportGen;
    private EmailService emailService;

    public FacadePattern() {
        this.database = new DatabaseConnection();
        this.auth = new AuthenticationService();
        this.reportGen = new ReportGenerator();
        this.emailService = new EmailService();
    }

    public void generateAndSendReport(String user, String password, String recipient) {
        database.connect();
        auth.authenticate(user, password);
        reportGen.generateReport();
        emailService.sendEmail(recipient, "Your report is ready");
        System.out.println("Report generated and sent successfully!");
    }

    public static void main(String[] args) {
        FacadePattern facade = new FacadePattern();
        facade.generateAndSendReport("admin", "password123", "user@example.com");
    }
}
