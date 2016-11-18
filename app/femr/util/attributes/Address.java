package femr.util.attributes;

/**
 * Created by jonesm on 11/17/16.
 */

/***
 *
 * This class can be expaned to contain all things
 *
 */
public class Address {
    private String address = "";
    private String city = "";

    //Expand out address further if you wanted to...
    //private String country = "";

    public Address(){
        //Do nothing, code will have to set values
    }

    public Address(String address, String city){
        this.setAddress(address);
        this.setCity(city);
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

}
