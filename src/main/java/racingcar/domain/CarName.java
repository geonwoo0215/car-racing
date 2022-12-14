package racingcar.domain;

public class CarName {

    private static final String ERROR_LENGTH = "글자수는 5자 이하여야 합니다.";
    private static final int MAX_LENGTH = 5;
    private final String carName;

    public String getCarName() {
        return carName;
    }

    public CarName(String carName) {
        validateLength(carName);
        this.carName = carName;
    }

    private void validateLength(String carName) {
        if (carName.length() > MAX_LENGTH) {
            throw new IllegalArgumentException(ERROR_LENGTH);
        }
    }

}
