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
    private String phone;
    private int age;

    public Passenger(String title, String name, String ID, String phone, int age)
    {
        setTitle(title);
        setName(name);
        setID(ID);
        setPhoneNumber(phone);
        setAge(age);
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        if((title == "Mr") || (title == "Mrs") || (title == "Ms")){
            this.title = title;

        }else{
            throw new IllegalArgumentException("Invalid Title");
        }
    }

    public String getName() {
        this.name = name;
        return name;
    }

    public void setName(String name) {
        if(name.length() >= 3){
            this.name = name;
        }else{
            throw new IllegalArgumentException("Invalid Name");
        }
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        if(ID.length() >= 10){
            this.ID = ID;
        }else{
            throw new IllegalArgumentException("Invalid ID");
        }
    }

    public String getPhoneNumber() {
        return phone;
    }

    public void setPhoneNumber(String phone) {
        if(phone.length() >= 10){
            this.phone = phone;
        }else{
            throw new IllegalArgumentException("Invalid Phone Number");
        }
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age >= 16){
            this.age = age;
        }else{
            throw new IllegalArgumentException("Invalid Age");
        }
    }
}
