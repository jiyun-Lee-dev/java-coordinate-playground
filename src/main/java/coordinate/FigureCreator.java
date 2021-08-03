package coordinate;

import java.util.List;

public interface FigureCreator {
    Figure create(List<Points> pointsList) throws Exception;
}
