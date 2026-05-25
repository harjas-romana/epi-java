// BUILDER PATTERN
// Constructs complex objects step by step

public class BuilderPattern {

    public static class User {
        private String firstName;
        private String lastName;
        private String email;
        private String phone;
        private String address;
        private int age;

        private User(UserBuilder builder) {
            this.firstName = builder.firstName;
            this.lastName = builder.lastName;
            this.email = builder.email;
            this.phone = builder.phone;
            this.address = builder.address;
            this.age = builder.age;
        }

        public void displayInfo() {
            System.out.println("User: " + firstName + " " + lastName);
            if (email != null)
                System.out.println("Email: " + email);
            if (phone != null)
                System.out.println("Phone: " + phone);
            if (address != null)
                System.out.println("Address: " + address);
            if (age > 0)
                System.out.println("Age: " + age);
        }
    }

    public static class UserBuilder {
        private String firstName;
        private String lastName;
        private String email;
        private String phone;
        private String address;
        private int age;

        public UserBuilder(String firstName, String lastName) {
            this.firstName = firstName;
            this.lastName = lastName;
        }

        public UserBuilder email(String email) {
            this.email = email;
            return this;
        }

        public UserBuilder phone(String phone) {
            this.phone = phone;
            return this;
        }

        public UserBuilder address(String address) {
            this.address = address;
            return this;
        }

        public UserBuilder age(int age) {
            this.age = age;
            return this;
        }

        public User build() {
            return new User(this);
        }
    }

    public static void main(String[] args) {
        User user1 = new UserBuilder("John", "Doe")
                .email("john@example.com")
                .phone("1234567890")
                .address("123 Main St")
                .age(30)
                .build();
        user1.displayInfo();

        System.out.println();

        User user2 = new UserBuilder("Jane", "Smith")
                .email("jane@example.com")
                .age(25)
                .build();
        user2.displayInfo();
    }
}
