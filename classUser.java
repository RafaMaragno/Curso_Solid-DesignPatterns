class User {
    String name;
    String email;

    User(this.name, this.email);

    void saveUserToDatabase() {
        // save user to the database
    }

    void showWelcomeMessage() {
        print('Welcome, $name!');
    }
}