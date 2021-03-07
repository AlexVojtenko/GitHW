package Lesson_branch_8;

import java.io.BufferedReader;
import java.io.FileReader;


public class UserService implements Service {

    public boolean checkUser(Person person) throws Exception {
        boolean result = false;
        BufferedReader reader = new BufferedReader(new FileReader("emails.txt"));
        String line = reader.readLine();
        while (line != null) {
            line = reader.readLine();
            if (line.equals(person.getEmail())) {
                result = true;
                break;
            }
        }
        return result;
    }

    public void writeData(Person person) {
        System.out.println("invalid operation");
    }
}

