package coordinate;

import java.util.List;
import java.util.stream.Collectors;

public class Square implements Figure {
    private List<Points> pointsList;

    public Square(List<Points> pointsList) throws Exception {
        if (isNotRectangle(pointsList)) {
            throw new Exception("직사각형 또는 정사각형 모습의 좌표만 입력해주세요");
        }
        this.pointsList = pointsList;
    }

    private boolean isNotRectangle(List<Points> pointsList) {
        List<Integer> xPosList = pointsList.stream().map(Points::getXpos).distinct().collect(Collectors.toList());
        List<Integer> yPosList = pointsList.stream().map(Points::getYpos).distinct().collect(Collectors.toList());
        return xPosList.size() != 2 || yPosList.size() != 2;
    }

    @Override
    public double measure() {
        List<Integer> xPosList = pointsList.stream().map(Points::getXpos).distinct().collect(Collectors.toList());
        List<Integer> yPosList = pointsList.stream().map(Points::getYpos).distinct().collect(Collectors.toList());
        return Math.abs(xPosList.get(0) - xPosList.get(1)) * Math.abs(yPosList.get(0) - yPosList.get(1));
    }
}
