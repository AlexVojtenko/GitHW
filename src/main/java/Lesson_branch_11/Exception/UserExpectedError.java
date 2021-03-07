package Lesson_branch_11.Exception;

public class UserExpectedError extends RuntimeException {
    private String description;

    public UserExpectedError() {
        description = "Error!!! Owner account id and recipient account id are not the same.";
    }

    public String getDescription() {
        return description;
    }
}