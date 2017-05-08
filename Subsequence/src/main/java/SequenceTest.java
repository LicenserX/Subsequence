import org.junit.Assert;

import java.util.ArrayList;
import java.util.Arrays;

public class SequenceTest {
    private final Sequence sequence = new Sequence();

    @org.junit.Test
    public void testFind() throws Exception {
        ArrayList<Object> objects = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6));
        ArrayList<Object> objects1 = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6));
        Assert.assertTrue(sequence.find(objects,objects1));
    }
    @org.junit.Test
    public void testFind1() throws Exception {
        ArrayList<Object> objects = new ArrayList<>(Arrays.asList(1, 2, 3));
        ArrayList<Object> objects1 = new ArrayList<>(Arrays.asList(3, 2, 1));
        Assert.assertFalse(sequence.find(objects,objects1));
    }
    @org.junit.Test
    public void testFind10() throws Exception {
        ArrayList<Object> objects = new ArrayList<>(Arrays.asList(1, 2, 3));
        ArrayList<Object> objects1 = new ArrayList<>(Arrays.asList(1, 3, 2));
        Assert.assertFalse(sequence.find(objects,objects1));
    }
    @org.junit.Test
    public void testFind2_1() throws Exception {
        ArrayList<Object> objects = new ArrayList<>(Arrays.asList(1, 2, 3));
        ArrayList<Object> objects1 = new ArrayList<>(Arrays.asList(1, 2, 2, 3));
        Assert.assertTrue(sequence.find(objects,objects1));
    }
    @org.junit.Test
    public void testFind2_2() throws Exception {
        ArrayList<Object> objects = new ArrayList<>(Arrays.asList(1, 2, 2, 3));
        ArrayList<Object> objects1 = new ArrayList<>(Arrays.asList(1, 2, 3));
        Assert.assertFalse(sequence.find(objects,objects1));
    }
    @org.junit.Test
    public void testFind3_1() throws Exception {
        ArrayList<Object> objects = new ArrayList<>(Arrays.asList(1));
        ArrayList<Object> objects1 = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6));
        Assert.assertTrue(sequence.find(objects,objects1));
    }
    @org.junit.Test
    public void testFind3_2() throws Exception {
        ArrayList<Object> objects = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6));
        ArrayList<Object> objects1 = new ArrayList<>(Arrays.asList(1));
        Assert.assertFalse(sequence.find(objects,objects1));
    }
}