package Lesson_branch_11.Service;

import Lesson_branch_11.Entity.Client;
import Lesson_branch_11.Util.Helper;

public class TransactionService {

    public void moneyTransfer(Client client, String accountId) {
        Helper helper = new Helper();
        helper.checkAccounts(client.getAccountId(), accountId);
        System.out.println("Money is successfully transferred.");
    }
}