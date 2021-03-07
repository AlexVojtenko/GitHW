package Lesson_branch_11.Exception;

public class WrongSumException extends Exception {
    private String description;

    public WrongSumException() {
        description = "Amount is bigger then possible.";
    }

    public String getDescription() {
        return description;
    }
}
