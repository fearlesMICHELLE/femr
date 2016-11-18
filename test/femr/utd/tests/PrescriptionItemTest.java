package femr.utd.tests;

import femr.common.models.PrescriptionItem;
import femr.util.attributes.Name;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

/**
 * Unit Tests for dateUtilsTest
 * Created by jonesm on 11/16/16.
 */
public class PrescriptionItemTest extends BaseTest{


    @Test
    public void testCreatePrescriptionItem() throws Exception{
        PrescriptionItem test = new PrescriptionItem();
        assertTrue(test.getId() == 0);

    }

    @Test
    public void testSetPrescriberItemId() throws Exception{
        PrescriptionItem test = new PrescriptionItem();
        test.setId(5);
        assertTrue(test.getId() == 5);

    }

    @Test
    public void testSetNamePrescriberItem() throws Exception{
        PrescriptionItem test = new PrescriptionItem();
        Name n = new Name("TEST", "NAME");
        test.setPrescriberName(n);
        assertTrue(test.getName().equals(n));

    }
}
