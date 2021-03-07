package Lesson_branch_11.Entity;

public class Client {
    private String id;
    private String surname;
    private String accountId;
    private double amount;

    public Client(String accountId){
        this.accountId = accountId;
    }

    public String getAccountId() {
        return accountId;
    }

}