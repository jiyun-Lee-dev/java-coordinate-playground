package coordinate;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.assertj.core.api.Assertions.assertThat;

public class PointsGeneratorTest {
    private PointsGenerator pointsGenerator;

    @Test
    public void 좌표_리스트_잘_만들어지는지_확인() throws Exception {
        pointsGenerator = new PointsGenerator("(10,10)-(14,15)");
        List<Points> expected = Arrays.asList(new Points(10, 10), new Points(14, 15));
        List<Points> actual = pointsGenerator.getPointsList();
        int index = 0;
        for (Points points : actual) {
            assertThat(points.equals(expected.get(index))).isTrue();
            index++;
        }
    }

    @Test
    public void 좌표_1개_이하면_에러발생하는지_확인() {
        Exception exception = assertThrows(Exception.class, () -> {
            pointsGenerator = new PointsGenerator("(10,10)");
        });
        String expectedMessage = "좌표는 1개 이상이어야 합니다.";
        String actualMessage = exception.getMessage();
        assertThat(actualMessage).isEqualTo(expectedMessage);
    }

    @Test
    public void 좌표의_값이_하나라도_0_이하거나_24를_넘으면_에러발생하는지_확인() {
        Exception exception = assertThrows(Exception.class, () -> {
            pointsGenerator = new PointsGenerator("(10,25)");
        });
        String expectedMessage = "좌표의 위치값은 0이상 24이하만 가능합니다.";
        String actualMessage = exception.getMessage();
        assertThat(actualMessage).isEqualTo(expectedMessage);
    }

}
