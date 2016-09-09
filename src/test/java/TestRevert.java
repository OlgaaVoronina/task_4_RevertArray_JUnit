import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import ua.epam.RevertArr;

/**
 * Created by Olia on 07.09.2016.
 */
public class TestRevert {
    private RevertArr rev;
    int[] arr = {1, 2, 3, 4, 5};
    int[] arr1 = {5, 4, 3, 2, 1};

    @Before
    public void runRevert(){
        rev = new RevertArr(); //inicialization
    }


    @Test
    public void testRevertArr() {
        rev.Revert(arr);
        Assert.assertArrayEquals( arr, arr1);
    }

    @Test
    public void testNotNULL() {
        rev.Revert(arr);
        Assert.assertNotNull(rev);
    }

    @Test
    public void testRevert() {
        int[] arr2 = {1,2,5};
        int[] arrI = rev.Revert(arr2);
        Assert.assertArrayEquals(arr2, arrI);
    }


}
