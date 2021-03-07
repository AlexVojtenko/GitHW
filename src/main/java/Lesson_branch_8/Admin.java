package Lesson_branch_8;

public class Admin extends Person {

    private String role;

    public Admin(String firstName, String secondName, int age, String email, String password) {
        super(firstName, secondName, age, email, password);
        this.role = "ADMIN";
    }
}