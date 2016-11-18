package femr.utd.tests;

import femr.common.models.PatientItem;
import femr.util.attributes.Name;
import org.junit.Test;


import static org.junit.Assert.assertTrue;

/**
 * Unit Tests for dateUtilsTest
 * Created by jonesm on 11/16/16.
 */
public class PatientItemTest extends BaseTest{


    @Test
    public void testCreatePatientItem() throws Exception{
        PatientItem test = new PatientItem();
        assertTrue(test.getId() == 0);

    }

    @Test
    public void testSetPatientItemId() throws Exception{
        PatientItem test = new PatientItem();
        test.setId(5);
        assertTrue(test.getId() == 5);

    }

    @Test
    public void testSetNamePatientItem() throws Exception{
        PatientItem test = new PatientItem();
        Name n = new Name("TEST", "NAME");
        test.setName(n);
        assertTrue(test.getName().equals(n));

    }
}
