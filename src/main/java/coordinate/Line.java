package coordinate;

import java.time.Year;
import java.util.List;

public class Line implements Figure{
    private List<Points> pointsList;

    public Line(List<Points> pointsList) {
        this.pointsList = pointsList;
    }

    @Override
    public double measure() {
        double xPosDistance = pointsList.get(0).getXpos() - pointsList.get(1).getXpos();
        double yPosDistance = pointsList.get(0).getYpos() - pointsList.get(1).getYpos();
        return Math.sqrt(Math.pow(xPosDistance, 2) + Math.pow(yPosDistance, 2));
    }
}
