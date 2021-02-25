/* Name: Sean O'Shaughnessy
 * Email: G00358883@gmit.ie
 * Student ID: G00358883
 * Date: 24/02/2021
 * Purpose: Passenger test class to test passenger class
 */

package ie.gmit.passenger;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class PassengerTest {

    private Passenger passenger;

    @BeforeEach
    public void setup(){
         passenger = new Passenger("Mr","Sean","1234567892","1234567892",18);
    }

    @Test
    public void testTitle(){
        Exception e = assertThrows(IllegalArgumentException.class, () -> new Passenger("Sir","Gear","1234567892","1234567823",34));
        assertEquals("Invalid Title",e.getMessage());
    }

    @Test
    public void testName(){
        Exception e = assertThrows(IllegalArgumentException.class, () -> new Passenger("Mr","Jo","1234567892","1234567823",34));
        assertEquals("Invalid Name",e.getMessage());
    }

    @Test
    public void testID(){
        Exception e = assertThrows(IllegalArgumentException.class, () -> new Passenger("Mr","Joe","56792","1234567823",34));
        assertEquals("Invalid ID",e.getMessage());
    }

    @Test
    public void testPhone(){
        Exception e = assertThrows(IllegalArgumentException.class, () -> new Passenger("Mr","Joe","123456784492","356823",34));
        assertEquals("Invalid Phone Number",e.getMessage());
    }

    @Test
    public void testAge(){
        Exception e = assertThrows(IllegalArgumentException.class, () -> new Passenger("Mr","Joe","123456784492","123453367823",15));
        assertEquals("Invalid Age",e.getMessage());
    }

    @Test
    public void testTitlecorrect(){
        assertEquals("Mr",passenger.getTitle());
    }

    @Test
    public void testNamecorrect(){
        assertEquals("Sean",passenger.getName());
    }

    @Test
    public void testIDcorrect(){
        assertEquals("1234567892",passenger.getID());
    }

    @Test
    public void testPhonecorrect(){
        assertEquals("1234567892",passenger.getPhoneNumber());
    }

    @Test
    public void testAgecorrect(){
        assertEquals(18,passenger.getAge());
    }
}
