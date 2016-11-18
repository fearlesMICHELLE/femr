/*
     fEMR - fast Electronic Medical Records
     Copyright (C) 2014  Team fEMR

     fEMR is free software: you can redistribute it and/or modify
     it under the terms of the GNU General Public License as published by
     the Free Software Foundation, either version 3 of the License, or
     (at your option) any later version.

     fEMR is distributed in the hope that it will be useful,
     but WITHOUT ANY WARRANTY; without even the implied warranty of
     MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
     GNU General Public License for more details.

     You should have received a copy of the GNU General Public License
     along with fEMR.  If not, see <http://www.gnu.org/licenses/>. If
     you have any questions, contact <info@teamfemr.org>.
*/
package femr.util.calculations;

import org.joda.time.*;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;
import play.Logger;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * This class contains utilities for manipulating dates. If you add something here, please clearly document the
 * format of both the input and output.
 */
public class dateUtils {

    public static int calculateYears(Date age) {
        return Years.yearsBetween(new LocalDate(age), new LocalDate()).getYears();
    }

    public static String getCurrentDateTimeString(){
        DateTimeFormatter dateFormat = DateTimeFormat.forPattern("yyyy/mm/dd HH:mm:ss");
        LocalDateTime localDateTime = new LocalDateTime();
        dateFormat.print(localDateTime);
        return localDateTime.toString();
    }

    public static DateTime getCurrentDateTime(){
        return new DateTime();
    }

    /**
     * Gets the integer age of a patient, then appends "YO" or "MO"
     * depending on if the patient age is in years(adult) or months(baby)
     *
     * If the patient is 2 or younger, result returned in months
     *
     * @param born the birthdate of the patient
     * @return a string with the patient's age
     */
    public static String getAge(Date born) {
        int monthsInt = Months.monthsBetween(new LocalDate(born), new LocalDate()).getMonths();
        if (monthsInt < 24)
            return Integer.toString(monthsInt) + " MO";
        else
            return Integer.toString(monthsInt/12) + " YO";
    }

    /**
     * Gets the patient's age in years. If the patient is an infant with less than 12 years of life,
     * 0 will be returned.
     *
     * @param born the birthdate of the patient
     * @return an Integer that represents the number of years the patient has been alive. Returns null
     * if an error occured OR if the patient does not have an age (just an age classification).
     */
    public static Integer getYearsInteger(Date born) {
        if (born == null)
            return null;

        Integer age = 0;
        int monthsInt =Months.monthsBetween(new LocalDate(born), new LocalDate()).getMonths();
        if (monthsInt >= 12) {
            double temp = Math.floor(monthsInt / 12);
            try {
                age = (int) Math.round(temp);
            } catch (Exception ex) {
                age = null;
                Logger.error("a patient's age could not be handled as an int");
            }
        }
        return age;
    }

    /**
     * Gets the patient's age in months.
     *
     * @param born the birthdate of the patient
     * @return an Integer that represents the number of months the patient has been alive. Returns null
     * if an error occured OR if the patient does not have an age (just an age classification).
     */
    public static Integer getMonthsInteger(Date born) {
        if (born == null){return null;}
        return Months.monthsBetween(new LocalDate(born), new LocalDate()).getMonths();
    }

    public static float getAgeAsOfDateFloat(Date born, DateTime asOfDate) {
        float monthsInt = (float) Months.monthsBetween(new LocalDate(born), new LocalDate(asOfDate)).getMonths();
        return monthsInt/12;
    }

    /**
     * Converts a DateTime object to a string
     *
     * @param dateTime the DateTime object to convert, not null
     * @return A string in the format "mm yyyy" or null if dateTime is null
     */
    public static String getFriendlyDateMonthYear(DateTime dateTime){

        if (dateTime == null)
            return null;
        return dateTime.toString(DateTimeFormat.forPattern("MM/yyyy"));
    }

    public static String getFriendlyDate(DateTime dateTime){
        if (dateTime == null)
            return null;
        return dateTime.toString(DateTimeFormat.forPattern("MMMM d, yyyy - HH:mm:ss"));
    }

    /**
     * Takes a date object and formats it into a user friendly string
     *
     * Format: (MM/dd/yyyy)
     * Format: (08/02/1989)
     *
     * @param date the date you would like to format, not null
     * @return the sexy looking date string or null if errors
     */
    public static String getFriendlyDate(Date date){
        if (date == null)
            return null;
        return new SimpleDateFormat("MM/dd/yyyy").format(date);
    }

    /**
     * Takes a date object and formats it into a user friendly string of which
     * can be recognized internationally
     *
     * Format: (dd/MMMM/yyyy)
     * Format: 02-Aug-1989
     *
     * @param date the date you would like to format, not null
     * @return the sexy looking date string or null if errors
     */
    public static String getFriendlyInternationalDate(Date date){
        if (date == null)
            return null;
        return new SimpleDateFormat("dd/MMMM/yyyy").format(date);
    }
}