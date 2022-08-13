package racingcar.message;

import racingcar.domain.Car;

import java.util.List;

public class OutputMessage {

    private static final String RESULT = "실행 결과";
    private static final String WINNER = "최종 우승자";
    private static StringBuilder sb;
    private static final String COLON = " : ";
    private static final String BAR = "-";
    private static final String Comma = ", ";

    public static void printResultMessage() {
        System.out.println(RESULT);
    }

    public static void process(List<Car> cars) {
        sb = new StringBuilder();
        for (Car car : cars) {
            sb.append(car.getName().getCarName()).append(COLON);
            barGenerator(car);
            sb.append("\n");
        }
        System.out.println(sb);
    }

    public static void barGenerator(Car car) {
        sb.append(BAR.repeat(Math.max(0, car.getPosition())));
    }

    public static void winner(List<String> winners) {
        sb = new StringBuilder();
        sb.append(WINNER).append(COLON);
        for (String winner : winners) {
            sb.append(winner).append(Comma);
        }
        System.out.println(sb);
    }


}
