package Lesson_branch_9;

import java.util.Random;

public class InitializationData {
    Information test = new Information();


    public Information addValues() {
        Random random = new Random();

        for (int i = 0; i < 30; i++) {
            int loginLength = random.nextInt(5) + 6;
            String login = "";
            for (int j = 0; j < loginLength; j++) {
                char symbol = (char) (random.nextInt(26) + 97);
                login = login + symbol;
            }
            String email = login + "@email.com";
            if (test.logins.contains(login)) {
                i--;
            } else {
                test.logins.add(login);
                test.emails.add(email);
                test.userInformation.put(email, login);
            }
        }

        for (int i = 0; i < 10; i++) {
            String login = "login";
            String email = "login@email.com";
            if (!test.emails.contains(email)) {
                test.logins.add(login);
                test.emails.add(email);
                test.userInformation.put(email, login);
            }
        }

        if (collectionsSize()) {
            return test;
        } else {
            System.out.println("Collection is incorrect");
            return null;
        }
    }

    private boolean collectionsSize() {

        if ((test.logins.size() == test.emails.size()) == (test.logins.size() == test.userInformation.size())) {
            return true;
        }
        return false;
    }
}