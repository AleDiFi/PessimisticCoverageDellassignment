import com.example.pessimisticcoveragedellassignment.TriangleArea;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestTriangleArea {

    @Test
    public void TestAreaCalculator(){
        TriangleArea TestArea = new TriangleArea();
        double output = TestArea.AreaCalculator(0.0,0.0);
        assertEquals(Double.NaN, output);
    }
}
