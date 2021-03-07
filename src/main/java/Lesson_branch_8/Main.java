package Lesson_branch_8;

public class Main {

    public static void main(String[] args) throws Exception {
        Person user = new User("Firstname", "SecondName", 18,
                "firstNameSecondname18@email.com", "password");
        Person admin = new Admin("Firstname", "SecondName", 24,
                "firstNameSecondname24@email.com", "password");

        Service userserv = new UserService();
        Service adminserv = new AdminService();

        userserv.writeData(user);
        userserv.writeData(admin);

        adminserv.writeData(user);
        adminserv.writeData(admin);

        System.out.println(userserv.checkUser(admin));
        System.out.println(adminserv.checkUser(user));


    }
}
