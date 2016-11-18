package femr.utd.tests;

import femr.util.calculations.dateUtils;
import org.junit.Test;

import java.text.SimpleDateFormat;
import java.util.Date;
import static org.junit.Assert.*;

/**
 * Unit Tests for dateUtilsTest
 * Created by jonesm on 11/16/16.
 */
public class dateUtilsTest extends BaseTest{

    @Test
    public void testcalculateYears() throws Exception{
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        Date test = sdf.parse("21/11/2000");
        Integer tmp = dateUtils.calculateYears(test);
        assertTrue( tmp >= 15);

    }
}
