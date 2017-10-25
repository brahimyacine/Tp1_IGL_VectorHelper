import com.sun.glass.ui.Size;
import junit.framework.TestCase;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static junit.framework.Assert.*;

/**
 * Created by SLASH on 23/10/2017.
 */
public class VectorHelperTest extends TestCase {
    @Test
    public void testsortVerctor() {
        VectorHelper vSort=new VectorHelper(
                Arrays.asList(-36.4f,0f,-5.2f,15f,-36.0f,36.4f,36f,15f)
        );
        vSort.sortVerctor();
        assertEquals(Arrays.asList(-36.4f,-36.0f,-5.2f,0f,15f,15f,36f,36.4f),vSort.getVector());
    }


    @Test
    public void testgetMax() {
        VectorHelper vMax=new VectorHelper(
                Arrays.asList(-36.4f,0f,-36.0f,36.4f,36f,15f,36.4f)
        );
        assertEquals(36.4f,vMax.getMax());
    }

    @Test
    public void testgetMin()  {
        VectorHelper vMin=new VectorHelper(
                Arrays.asList(-5.0f,-10.6f,-5.1f,-5.2f,-10.6f,0f)
        );
        assertEquals(-10.6f,vMin.getMin());
    }

    @Test(expected=SizeException.class)
    public void testaddVectors() throws SizeException {
        VectorHelper vAddVectors=new VectorHelper(
                Arrays.asList(-5.0f,-10.6f,-5.1f,-5.2f,-10.6f,0f,13f)
        );
        List<Float> vector2=Arrays.asList(-2.0f,10.6f,-2.9f,5.2f,10.6f,-6.0f,5.5f);
        assertEquals("The real result doesn't match with the expected one ",
                Arrays.asList(-7.0f,0f,-8f,0f,0f,-6f,18.5f),
                vAddVectors.addVectors(vector2));
        /*vector2=Arrays.asList(-5.0f,2.0f);
        vAddVectors.addVectors(vector2);*/
    }

    @Test
    public void testinvert() {
        VectorHelper vInverted=new VectorHelper(
                Arrays.asList(0f,-5.1f,-5.1f,-5.2f,0f,-10.6f,13f,18f)
        );
        List<Float> vectorExpected=Arrays.asList(18f,13f,-10.6f,0f,-5.2f,-5.1f,-5.1f,0f);
        vInverted.Invert();
        assertEquals(vectorExpected,vInverted.getVector());
    }

    @Test
    public void testmultiplication() {
        VectorHelper vMultiplied=new VectorHelper(
                Arrays.asList(0f,-5.1f,-5.1f,-5.2f,0f,-10.6f,13f,18f)
        );
        List<Float> vectorExpected=Arrays.asList(-0f,+5.1f,+5.1f,+5.2f,-0f,+10.6f,-13f,-18f);
        vMultiplied.Multiplication(-1);
        assertEquals(vectorExpected,vMultiplied.getVector());
    }

    @Test
    public void testparseText()  {
        VectorHelper vParse=new VectorHelper();
        vParse.parseText("1.0!2.3!3.5!5.3!0!-9!-8!-5");
        List<Float> vectorExpected=Arrays.asList(1.0f,2.3f,3.5f,5.3f,0f,-9f,-8f,-5f);
        assertEquals(vectorExpected,vParse.getVector());
    }


}