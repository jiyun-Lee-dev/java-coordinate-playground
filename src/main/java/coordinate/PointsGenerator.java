package coordinate;

import java.util.*;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class PointsGenerator {
    public List<Points> generate(String inputForFigure) {
        List<String[]> posList = getPosList(inputForFigure);
        List<Points> points = new ArrayList<>();
        for (String[] pos : posList) {
            points.add(new Points(Integer.parseInt(pos[0]), Integer.parseInt(pos[1])));
        }
        return points;
    }

    private List<String[]> getPosList(String inputForFigure) {
        List<String[]> result = Pattern.compile("-")
                .splitAsStream(inputForFigure.trim())
                .map(points -> points.replace("(", "").replace(")", "").split(",", 2))
                .collect(Collectors.toList());
        return result;
    }

}
