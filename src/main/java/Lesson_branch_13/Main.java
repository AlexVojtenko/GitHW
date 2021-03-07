package Lesson_branch_13;

import Lesson_branch_13.exceptions.EmptyStringException;
import Lesson_branch_13.utils.StringHelper;

public class Main {

    public static void main(String[] args) {
        try {
            System.out.println(StringHelper.checkString("a", new char[]{'c', 'd', 'k'}));
        } catch (NullPointerException e) {
            System.out.println("Array is null");
        } catch (EmptyStringException e) {
            System.out.println(e.getExceptionInfo());
        }

        CheckInfo.checkPhone("+380 63 170-08-15");
        CheckInfo.checkEmail("example@email.com");
        CheckInfo.checkBirthdayDate("15-02-1967");
    }
}

