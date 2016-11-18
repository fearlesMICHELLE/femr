package femr.utd.tests;

import org.junit.Test;
import femr.util.calculations.LocaleUnitConverter;


import static org.junit.Assert.assertTrue;

/**
 * Unit Tests for dateUtilsTest
 * Created by jonesm on 11/16/16.
 */
public class LocalUnitConverterTest extends BaseTest{

    private static Object converter;


    @Test
    public void testcalculateMeters() throws Exception{
        Integer feet = 3;
        Integer inches = 6; //3ft 6in = 1.0668meters
        Integer meters = LocaleUnitConverter.getMeters(feet, inches);
        assertTrue( meters == 1);
    }

    @Test
    public void testcalculateCentimeters() throws Exception{
        Integer feet = 3;
        Integer inches = 6; //3ft 6in = 1.0668meters --> 7centimeters
        Integer centimeters = LocaleUnitConverter.getCentimetres(feet, inches);
        assertTrue( centimeters == 7);
    }


}
