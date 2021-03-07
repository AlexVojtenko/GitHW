package Lesson_branch_8;

import java.io.*;

public class AdminService implements Service {

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


    public void writeData(Person person) throws Exception {

        PrintWriter writer = new PrintWriter(new BufferedWriter(new FileWriter("emails.txt", true)));
        writer.println(person.getFirstName());
        writer.println(person.getSecondName());
        writer.println(person.getAge());
        writer.println(person.getEmail());
        writer.println(person.getPassword());
        writer.flush();
        writer.close();

    }
}