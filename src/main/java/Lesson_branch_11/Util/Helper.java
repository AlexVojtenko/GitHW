package Lesson_branch_11.Util;

import Lesson_branch_11.Exception.UserExpectedError;
import Lesson_branch_11.Exception.WrongFieldException;
import Lesson_branch_11.Exception.WrongSumException;

public class Helper {

    public void checkAccountId(String accountId) {
        if (accountId.length() != 10) {
            try {
                throw new WrongFieldException();
            } catch (WrongFieldException e) {
                System.out.println(e.getDescription());
            }
        }
    }

    public void checkSum(double amount) {
        if (amount > 1000) {
            try {
                throw new WrongSumException();
            } catch (WrongSumException e) {
                System.out.println(e.getDescription());
            }
        }
    }

    public void checkAccounts(String ownerAccountId, String recipientAccountId) {
        if (!ownerAccountId.equals(recipientAccountId)) {
            UserExpectedError e = new UserExpectedError();
            // Не уверен должно ли быть описание , но на всякий случай вставил
            System.out.println(e.getDescription());
            throw e;
        }
    }
}