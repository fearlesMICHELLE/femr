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
package femr.common.models;

import java.util.Date;

import femr.util.attributes.Measurements;
import femr.util.attributes.Name;
import femr.util.attributes.Address;


public class PatientItem {
    private int Id;
    private Name name;
    private Address address;
    private String age;//this is a string representing an integer and "YO"(adult) or "MO"(infant)
    private String isApproximateAge; //String representing whether the age is approximate (YES), guessed (NO), or NULL
    private Integer yearsOld;//the age of the patient as an integer. 0 if the patient is less than a year old
    private Integer monthsOld;
    private Date birth;
    private String friendlyDateOfBirth;
    private String sex;
    private Integer photoId;
    private String pathToPhoto;
    private int userId;
    private Integer weeksPregnant;
    private Measurements measurements;



    public PatientItem(){
        //default empty values
        this.Id = 0;
        this.pathToPhoto = "";
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public Name getName() {
        return name;
    }
    public String getFirstName(){return this.name.getFirstName();}
    public String getLastName(){return this.name.getLastName();}

    public void setName(Name name) {
        this.name = name;
    }

    public void setName(String firstName, String lastName) {

        this.name.setFirstName(firstName);
        this.name.setLastName(lastName);
    }

    public Address getAddress() {
        return address;
    }
    public void setAddress(Address address) {
        this.address = address;
    }
    public void setAddressCity(String city){this.address.setCity(city);}
    public void setAddressAddress(String address){this.address.setAddress(address);}
    public void setAddress(String city, String address){
        this.address.setCity(city);
        this.address.setAddress(address);
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public void setIsApproximateAge(String isApproximateAge){this.isApproximateAge = isApproximateAge;}

    public String getIsApproximateAge(){return this.isApproximateAge;}

    public Date getBirth() {
        return birth;
    }

    public void setBirth(Date birth) {
        this.birth = birth;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public Integer getPhotoId() {
        return photoId;
    }

    public void setPhotoId(Integer photoId) {
        this.photoId = photoId;
    }

    public String getPathToPhoto() {
        return pathToPhoto;
    }

    public void setPathToPhoto(String pathToPhoto) {
        this.pathToPhoto = pathToPhoto;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public Integer getWeeksPregnant() {
        return weeksPregnant;
    }

    public void setWeeksPregnant(Integer weeksPregnant) {
        this.weeksPregnant = weeksPregnant;
    }

    public Integer getHeightFeet() {
        return this.measurements.getHeightFeet();
    }

    public void setHeightFeet(Integer heightFeet) {
        this.measurements.setHeightFeet(heightFeet);
    }

    public Integer getHeightInches() {
        return this.measurements.getHeightInches();
    }

    public void setHeightInches(Integer heightInches) {
        this.measurements.setHeightInches(heightInches);
    }


    public Integer getHeightMeters() {
        return this.measurements.getHeightMeters();
    }

    public void setHeightMeters(Integer heightMeters) {
        this.measurements.setHeightMeters(heightMeters);
    }

    public Integer getHeightCentimeters() {
        return this.measurements.getHeightCentimeters();
    }

    public void setHeightCentimeters(Integer heightCentimeters) {
        this.measurements.setHeightCentimeters(heightCentimeters);
    }


    public Float getWeightLbs() {
        return this.measurements.getWeightLbs();
    }

    public void setWeightLbs(Float weightLbs) {
        this.measurements.setWeightLbs(weightLbs);
    }

    public Float getWeightMetric() {
        return this.measurements.getWeightKgs();
    }

    public void setWeightKgs(Float weightKgs) {
        this.measurements.setWeightKgs(weightKgs);
    }

    public String getFriendlyDateOfBirth() {
        return friendlyDateOfBirth;
    }

    public void setFriendlyDateOfBirth(String friendlyDateOfBirth) {
        this.friendlyDateOfBirth = friendlyDateOfBirth;
    }

    public Integer getYearsOld() {
        return yearsOld;
    }

    public void setYearsOld(Integer yearsOld) {
        this.yearsOld = yearsOld;
    }

    public Integer getMonthsOld() {
        return monthsOld;
    }

    public void setMonthsOld(Integer monthsOld) {
        this.monthsOld = monthsOld;
    }
}
