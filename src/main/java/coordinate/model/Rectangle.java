package coordinate.model;

import java.util.List;
import java.util.stream.Collectors;

public class Rectangle extends AbstractFigure{
    private static final String ERROR_IS_NOT_RECTANGLE = "잘못된 입력값입니다. 직사각형만 가능합니다.";

    public Rectangle(List<Point> points) {
        super(points);
        if (IsNotRectangle(points)) {
            throw new IllegalArgumentException(ERROR_IS_NOT_RECTANGLE);
        }
    }

    private boolean IsNotRectangle(List<Point> points) {
        return getDistinctXPos(points).size() != 2 || getDistinctYPos(points).size() != 2;
    }

    private List<Integer> getDistinctXPos(List<Point> points) {
        return points.stream().map(Point::getX).distinct().collect(Collectors.toList());
    }

    private List<Integer> getDistinctYPos(List<Point> points) {
        return points.stream().map(Point::getY).distinct().collect(Collectors.toList());
    }

    @Override
    public double getArea() {
        return Math.abs(getDistinctXPos(this.getPoints()).get(0) - getDistinctXPos(this.getPoints()).get(1)) *
                Math.abs(getDistinctYPos(this.getPoints()).get(0) - getDistinctYPos(this.getPoints()).get(1));
    }

    @Override
    public String getAreaInfo() {
        return null;
    }
}
