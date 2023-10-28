package racingcar;

import camp.nextstep.edu.missionutils.Randoms;

import java.util.ArrayList;
import java.util.LinkedHashMap;

public class RacingGame {

    ArrayList<Car> Cars = new ArrayList<Car>();

    public void createCars(String[] carNames) {
        for (int carNumber = 0; carNumber < carNames.length; carNumber++)
        {
            String carName = carNames[carNumber];
            Cars.add(new Car(carName));
        }
    }

    int makeRandomNumber() {
        int randomNumber = Randoms.pickNumberInRange(0,9);
        return (randomNumber);
    }

    void moveCars() {
        for (Car car : Cars) {
            if (makeRandomNumber() >= 4) {
                car.moveForward();
            }
        }
    }

     LinkedHashMap<String, Integer> getCurrentStatus() {
         LinkedHashMap<String, Integer> currStatus = new LinkedHashMap<String, Integer>();
         for (Car car : Cars) {
             currStatus.put(car.getName(), car.getLocation());
         }
         return currStatus;
     }
}
