package coordinate;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.assertj.core.api.Assertions.assertThat;

public class PointsGeneratorTest {
    private PointsGenerator pointsGenerator;

    @BeforeEach
    public void setUp() {
        pointsGenerator = new PointsGenerator();
    }

    @Test
    public void 좌표_리스트_잘_만들어지는지_확인() {
        String inputForLine = "(10,10)-(14,15)";
        List<Points> expected = Arrays.asList(new Points(10, 10), new Points(14, 15));
        List<Points> actual = pointsGenerator.generate(inputForLine);
        int index = 0;
        for (Points points : actual) {
            assertThat(points.equals(expected.get(index))).isTrue();
            index++;
        }
    }

}
