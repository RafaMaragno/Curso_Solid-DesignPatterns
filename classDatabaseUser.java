// SOLID - Dependency Inversion Principle (DIP)
abstract class Database {
    void saveUser(User user);
}

class MySQLDatabase implements Database {
    @Override
    void saveUser(User user) {
        print('Saving ${user.name} to MySQL Database');
    }
}

class PostgreSQLDatabase implements Database {
    @Override
    void saveUser(User user) {
        print('Saving ${user.name} to Postgre Database');
    }    
}

class UserService {
    Database database;

    UserService(this.database);

    void saveUser(User user) {
        database.saveUser(user);
    }
}