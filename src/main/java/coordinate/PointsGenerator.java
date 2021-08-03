package coordinate;

import java.util.*;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class PointsGenerator {
    private final List<Points> pointsList;

    public PointsGenerator(String inputForFigure) throws Exception {
        List<Points> pointsList = generate(inputForFigure);
        if (pointsList.size() <= 1) {
            throw new IllegalArgumentException("좌표는 1개 이상이어야 합니다.");
        }
        this.pointsList = pointsList;
    }

    private List<Points> generate(String inputForFigure) {
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

    public List<Points> getPointsList() {
        return this.pointsList;
    }

}
