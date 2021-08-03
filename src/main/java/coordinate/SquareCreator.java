package coordinate;

import java.util.List;

public class SquareCreator implements FigureCreator {

    @Override
    public Figure create(List<Points> pointsList) throws Exception {
        return new Square(pointsList);
    }
}
