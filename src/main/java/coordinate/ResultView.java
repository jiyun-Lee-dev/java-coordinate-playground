package coordinate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

public class ResultView {
    private static final HashMap<String, String> resultMessage = new HashMap<String, String>(){{
        put("선", "두 점 사이의 거리는");
        put("삼각형", "삼각형 넓이는");
        put("사각형", "사각형 넓이는");
    }};

    public void printMeasure(String figureName, double answer) {
        System.out.println(resultMessage.get(figureName) + " " + answer);
    }

    public void printCoordinate(List<Points> pointsList) {
        
    }
}
