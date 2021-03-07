package Lesson_branch_8;

public class Person {

    private String firstName;
    private String secondName;
    private int age;
    private String email;
    private String password;

    public Person(String firstName, String secondName, int age, String email, String password) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.age = age;
        this.email = email;
        this.password = password;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public int getAge() {
        return age;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }
}