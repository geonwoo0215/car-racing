package racingcar.domain;

import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class Cars {

    private final List<Car> cars = new LinkedList<>();

    public List<Car> getCars() {
        return cars;
    }

    public Cars(String[] carNames) {
        for (String carName : carNames) {
            cars.add(new Car(new CarName(carName)));
        }
    }

    public void race() {
        for (Car car : cars) {
            car.moveForward();
        }
    }

    public List<String> winner() {
        int max = cars.stream().mapToInt(Car::getPosition).max()
                .orElseThrow(()->new IllegalArgumentException("에러"));
        return cars.stream().filter(a -> a.getPosition() == max).map(a-> a.getName().getCarName()).collect(Collectors.toList());
    }

}
