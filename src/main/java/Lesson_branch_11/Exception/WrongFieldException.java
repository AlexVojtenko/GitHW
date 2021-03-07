package Lesson_branch_11.Exception;

public class WrongFieldException extends Exception {
    private String description;

    public WrongFieldException() {
        description = "Account id is invalid.";
    }

    public String getDescription() {
        return description;
    }
}
