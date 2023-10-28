package racingcar;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Output {
    private final String CAR_NAME_INPUT_REQUEST_MESSAGE = "경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분)";
    private final String TRY_NUMBER_INPUT_REQUEST_MESSAGE = "시도할 회수는 몇회인가요?";
    private final String RESULT_TITLE = "실행 결과";
    private final String WINNERS = "최종 우승자 : ";

    void printCarNameInputRequest() {
        System.out.println(CAR_NAME_INPUT_REQUEST_MESSAGE);
    }

    void printTryNumberInputRequest() {
        System.out.println(TRY_NUMBER_INPUT_REQUEST_MESSAGE);
    }

    void printResultTitle() {
        System.out.println(RESULT_TITLE);
    }

    void printRacingMap(ArrayList<Car> cars) {
        for (Car car : cars) {
            System.out.println(car.getName()+" : "+"-".repeat(car.getLocation()));
        }
    }

    boolean is_last(String winner, ArrayList<String> winners) {
        return winner.equals(winners.get(winners.size() - 1));
    }

    void printWinners(ArrayList<String> winners) {
        System.out.print(WINNERS);
        for (String winner : winners) {
            if (is_last(winner, winners)) {
                System.out.print(winner);
                continue;
            }
            System.out.print(winner+", ");
        }
    }
}
