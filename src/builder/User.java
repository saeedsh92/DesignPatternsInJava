package builder;

public class User {
    private String firstName;
    private String lastName;
    private String email;
    private String phoneNumber;

    private User(Builder builder) {
        firstName = builder.firstName;
        lastName = builder.lastName;
        email = builder.email;
        phoneNumber = builder.phoneNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmail() {
        return email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public static final class Builder {
        private String firstName;
        private String lastName;
        private String email;
        private String phoneNumber;

        public Builder(String email) {
            this.email = email;
        }

        public Builder setFirstName(String firstName) {
            this.firstName = firstName;
            return this;
        }

        public Builder setLastName(String lastName) {
            this.lastName = lastName;
            return this;
        }

        public Builder setPhoneNumber(String phoneNumber) {
            this.phoneNumber = phoneNumber;
            return this;
        }

        public User build() {
            return new User(this);
        }
    }
}
