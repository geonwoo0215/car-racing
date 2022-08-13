package racingcar.domain;

import racingcar.generator.RandomNumberGenerator;

public class Car {
    private final CarName name;
    private int position = 0;

    public Car(CarName name) {
        this.name = name;
    }

    public CarName getName() {
        return name;
    }

    public int getPosition() {
        return position;
    }

    public void moveForward() {
        if (RandomNumberGenerator.generateNumber() > 3) {
            position++;
        }
    }

}