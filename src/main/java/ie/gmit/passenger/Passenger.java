/* Name: Sean O'Shaughnessy
 * Email: G00358883@gmit.ie
 * Student ID: G00358883
 * Date: 24/02/2021
 * Purpose: Passenger Class to store passenger information
 */

package ie.gmit.passenger;

public class Passenger {

    private String title;
    private String name;
    private String ID;
    private String phoneNumber;
    private int age;

    // A Default Constructor
    public Passenger()
    {
        title = "";
        name = "";
        ID = "";
        phoneNumber = "";
        age = 0;
    }

    public String getTitle() {
        return title;
    }

    public String setTitle(String title) {
        this.title = title;
        return title;
    }

    public String getName() {
        return name;
    }

    public String setName(String name) {
        this.name = name;
        return name;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

}
