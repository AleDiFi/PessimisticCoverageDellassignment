package testareatriangolo;


import com.example.pessimisticcoveragedellassignment.TriangleArea;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestTriangleArea {

    @Test
    public void testAreaCalculator(){
        TriangleArea testArea = new TriangleArea();
        double output = testArea.areaCalculator(0.0,0.0);
        assertEquals(Double.NaN, output);
    }
}
