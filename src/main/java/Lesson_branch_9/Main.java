package Lesson_branch_9;

import java.util.ArrayList;
import java.util.Map;

public class Main {

    public static void main(String[] args) {

        Information info = new InitializationData().addValues();
        ArrayList<Comparable> list = getList();
        redactedInformaion(list, info);

        for (Map.Entry<String, String> print : info.userInformation.entrySet()) {
            if (info.logins.contains(print.getValue()) && info.emails.contains(print.getKey())) {
                System.out.println("User with login " + print.getValue() + " has email " + print.getKey());
            }
        }
    }

    public static void redactedInformaion(ArrayList<? extends Comparable> list, Information information) {

        for (Comparable n : list) {
            if (information.emails.contains(n + "@email.com")) {
                System.out.println(n + "@email.com is already exists!!! Try please another mail address");
            } else {
                information.logins.add(n.toString());
                information.emails.add(n + "@email.com");
                information.userInformation.put(n + "@email.com", n.toString());
            }
        }
    }

    public static ArrayList<Comparable> getList() {
        ArrayList<Comparable> list = new ArrayList<Comparable>();
        Byte variableOne = 2;
        Short variableTwo = 128;
        Character variableThree = 'c';
        Integer variableFour = 64000;
        Long variableFive = 10000000L;
        Float variableSix = 0.1f;
        Double variableSeven = 0.2;
        Boolean variableEight = true;

        list.add(variableOne);
        list.add(variableTwo);
        list.add(variableThree);
        list.add(variableFour);
        list.add(variableFive);
        list.add(variableSix);
        list.add(variableSeven);
        list.add(variableEight);
        return list;
    }
}
