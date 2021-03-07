package Lesson_branch_13;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CheckInfo {
    private static Pattern pattern;
    private static Matcher matcher;

    public static void checkPhone(String phone) {
        pattern = Pattern.compile("^\\+[0-9]{3}\\s\\d{2}\\s\\d{3}-\\d{2}-\\d{2}");
        matcher = pattern.matcher(phone);
        System.out.println(matcher.matches());
    }

    public static void checkEmail(String email) {
        pattern = Pattern.compile("^(.+)@(.+)$");
        matcher = pattern.matcher(email);
        System.out.println(matcher.matches());
    }

    public static void checkBirthdayDate(String birthdaydate) {
        pattern = Pattern.compile("^(1[0-9]|0[1-9]|2[0-9]|3[0-1])-(0[1-9]|10|11|12)-(19|20)[0-9]{2}$");
        matcher = pattern.matcher(birthdaydate);
        System.out.println(matcher.matches());
    }
}