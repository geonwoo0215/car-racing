package racingcar.domain;

public class Attempt {

    private static final String ERROR_INTEGER = "[ERROR] 시도횟수는 정수여야 합니다.";
    private static final String ERROR_NEGATIVE = "[ERROR] 양의정수를 입력해야 합니다.";

    private int attempt;

    public void validate(String attempt) {
        validateInteger(attempt);
        validateNegative(attempt);
        this.attempt = toInteger(attempt);
    }

    public int toInteger(String attempt) {
        return Integer.parseInt(attempt);
    }

    public void validateInteger(String attempt) {
        try {
            this.toInteger(attempt);
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException(ERROR_INTEGER);
        }
    }

    public void validateNegative(String attempt) {
        if (toInteger(attempt) > 0){
            throw new IllegalArgumentException(ERROR_NEGATIVE);
        }
    }


}
