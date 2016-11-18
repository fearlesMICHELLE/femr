package femr.util.attributes;

/**
 * Created by jonesm on 11/17/16.
 */

/** Add all the things name related **/
public class Name {
    private String firstName = "";
    private String lastName = "";

    //Default constructor
    public Name(){
        //Do Nothing, code will initialize values later....
    }

    public Name(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
