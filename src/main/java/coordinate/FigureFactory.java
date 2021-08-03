package coordinate;

import java.util.HashMap;
import java.util.List;

public class FigureFactory {
    private static final HashMap<Integer, FigureCreator> creators = new HashMap<Integer, FigureCreator>(){{
        put(2, new LineCreator());
        put(3, new TriangleCreator());
        put(4, new SquareCreator());
    }};

    public Figure create(List<Points> pointsList) throws Exception {
        FigureCreator figureCreator = creators.get(pointsList.size());
        return figureCreator.create(pointsList);
    }
}
