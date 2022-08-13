package racingcar;

import racingcar.domain.Attempt;
import racingcar.domain.Cars;
import racingcar.message.InputMessage;
import racingcar.message.OutputMessage;

import static racingcar.message.InputMessage.*;
import static racingcar.message.OutputMessage.*;

public class CarRacing {

    public void play() {
        Cars cars = new Cars(requestCarName().split(","));
        Attempt attempt = new Attempt(requestAttempt());
        int cnt = attempt.getAttempt();

        printResultMessage();
        while (cnt-- > 0) {
            cars.race();
            process(cars.getCars());
        }
        winner(cars.winner());
    }




}
