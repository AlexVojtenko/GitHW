package Lesson_branch_11;

import Lesson_branch_11.Entity.Client;
import Lesson_branch_11.Service.TransactionService;
import Lesson_branch_11.Util.Helper;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Input please your account id : ");
        String ownerAccountId = scanner.next();
        Helper helper = new Helper();
        while (ownerAccountId.length() != 10) {
            helper.checkAccountId(ownerAccountId);
            System.out.print("Please input another one: ");
            ownerAccountId = scanner.next();
        }

        System.out.print("Input please recipient account id : ");
        String recipientAccountId = scanner.next();
        while (recipientAccountId.length() != 10) {
            helper.checkAccountId(recipientAccountId);
            System.out.print("Please input another one: ");
            recipientAccountId = scanner.next();
        }

        System.out.print("Input please money amount(not bigger than 1000,00) : ");
        String moneyAmountString = scanner.next();
        double moneyAmount = returnMoneyAmount(moneyAmountString);
        while (moneyAmount > 1000) {
            helper.checkSum(moneyAmount);
            System.out.print("Please input another sum(not bigger than 1000,00): ");
            moneyAmountString = scanner.next();
            moneyAmount = returnMoneyAmount(moneyAmountString);
        }

        Client client = new Client(ownerAccountId);
        TransactionService transaction = new TransactionService();
        transaction.moneyTransfer(client, recipientAccountId);
    }

    private static double returnMoneyAmount(String moneyAmountString) {
        double moneyAmount;
        try {
            moneyAmount = Double.parseDouble(moneyAmountString);
        } catch (NumberFormatException e) {
            moneyAmountString = moneyAmountString.replace(",", ".");
            moneyAmount = Double.parseDouble(moneyAmountString);
        }
        return moneyAmount;
    }
}