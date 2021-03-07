package Lesson_branch_13.exceptions;

public class EmptyStringException extends Exception {
    private String exceptionInfo;

    public EmptyStringException() {
        this.exceptionInfo = "Empty String";
    }

    public String getExceptionInfo() {
        return exceptionInfo;
    }
}