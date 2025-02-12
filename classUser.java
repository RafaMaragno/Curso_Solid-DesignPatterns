// SOLID - Single Responsability Principle (SRP)
class User {
    String name;
    String email;

//  User (this.name, this.email);
}

class UserRepository {
        void saveUserToDatabase(User user) {
        // save user to the database
    }
}

class UserWelcome {
    void showWelcomeMessage(User user) {
    //  print('Welcome, ${user.name}!');
    }
}