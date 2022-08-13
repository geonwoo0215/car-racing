package racingcar.message;

import java.util.NoSuchElementException;
import java.util.Scanner;

public class InputMessage {

    private static final String REQUEST_CAR_NAME = "경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분)";
    private static final String REQUEST_ATTEMPT = "시도할 회수는 몇회인가요?";
    private static final String ERROR_MESSAGE = "[ERROR] 공백은 입력할 수 없습니다.";
    private static final Scanner SCANNER = new Scanner(System.in);

    public static String requestCarName() {
        System.out.println(REQUEST_CAR_NAME);
        return validateEmpty();
    }

    public static String requestAttempt() {
        System.out.println(REQUEST_ATTEMPT);
        return validateEmpty();
    }

    public static String validateEmpty() {
        try {
            return SCANNER.next();
        } catch (NoSuchElementException e) {
            throw new IllegalArgumentException(ERROR_MESSAGE);
        }

    }



}
