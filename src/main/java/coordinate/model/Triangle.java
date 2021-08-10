package coordinate.model;

import java.util.List;

public class Triangle extends AbstractFigure{
    private static final String ERROR_IS_NOT_TRIANGLE = "잘못된 입력값입니다. 삼각형을 만들 수 없습니다.";
    private static final String INFO_START_MESSAGE = "삼각형의 넓이는 ";

    public Triangle(List<Point> points) {
        super(points);
        if (isNotTriangle(points)) {
            throw new IllegalArgumentException(ERROR_IS_NOT_TRIANGLE);
        }
    }

    private boolean isNotTriangle(List<Point> points) {
        Point first = points.get(0);
        Point second = points.get(1);
        Point third = points.get(2);

        return first.getSlope(second) == first.getSlope(third);
    }

    @Override
    public double getArea() {
        Point first = this.getPoints().get(0);
        Point second = this.getPoints().get(1);
        Point third = this.getPoints().get(2);

        double firstDistance = first.calculateDistance(second);
        double secondDistance = first.calculateDistance(third);
        double thirdDistance = second.calculateDistance(third);

        double s = (firstDistance + secondDistance + thirdDistance) / 2;

        return Math.sqrt(s * (s - firstDistance) * (s - secondDistance) * (s - thirdDistance));
    }

    @Override
    public String getAreaInfo() {
        return null;
    }
}
