package coordinate;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.offset;

public class FigureCreatorTest {
    private List<Points> pointsList;

    @Test
    public void 선길이_좌표계산기_제대로_된_결과값이_나오는지_확인() throws Exception {
        pointsList = Arrays.asList(new Points(10, 10), new Points(14, 15));
        FigureFactory figureFactory = new FigureFactory();
        Figure line = figureFactory.create(pointsList);
        assertThat(line.measure()).isEqualTo(6.4031, offset(0.00099));
    }

    @Test
    public void 사각형면적_좌표계산기_제대로_된_결과값이_나오는지_확인() throws Exception {
        pointsList = Arrays.asList(new Points(10, 10),
                new Points(22, 10), new Points(22, 18), new Points(10,18));
        FigureFactory figureFactory = new FigureFactory();
        Figure square = figureFactory.create(pointsList);
        assertThat(square.measure()).isEqualTo(96);
    }

    @Test
    public void 삼각형면적_좌표계산기_제대로_된_결과값이_나오는지_확인() throws Exception {
        pointsList = Arrays.asList(new Points(10, 10),
                new Points(14, 15), new Points(20, 8));
        FigureFactory figureFactory = new FigureFactory();
        Figure triangle = figureFactory.create(pointsList);
        assertThat(triangle.measure()).isEqualTo(29.0, offset(0.00099));
    }

}
