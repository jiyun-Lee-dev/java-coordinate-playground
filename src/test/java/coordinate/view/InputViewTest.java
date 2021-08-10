package coordinate.view;

import coordinate.model.Figure;
import coordinate.model.FigureFactory;
import coordinate.model.Point;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class InputViewTest {
    @Test
    void 문자열로_Line_잘_만들어지는지() {
        Figure figure = InputView.getFigure("(1, 1)-(2,2)");
        List<Point> points = Arrays.asList(new Point(1, 1), new Point(2, 2));
        assertThat(figure).isEqualTo(FigureFactory.create(points));
    }

    @Test
    void 문자열로_Triangle_잘_만들어지는지() {
        Figure figure = InputView.getFigure("(1, 1)-(2,2) - (3, 1)");
        List<Point> points = Arrays.asList(new Point(1, 1), new Point(2, 2), new Point(3, 1));
        assertThat(figure).isEqualTo(FigureFactory.create(points));
    }

    @Test
    void 문자열로_Rectangle_잘_만들어지는지() {
        Figure figure = InputView.getFigure("(1, 1)-(1,2) - (3, 2) - (3, 1)");
        List<Point> points = Arrays.asList(new Point(1, 1), new Point(1, 2), new Point(3, 2), new Point(3, 1));
        assertThat(figure).isEqualTo(FigureFactory.create(points));
    }
}
