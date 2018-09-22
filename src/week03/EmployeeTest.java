package week03;

import org.junit.Test;
import test.AbstractJUnitBase;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

   public class EmployeeTest extends AbstractJUnitBase {


        @Test
        public void testEmployee() {
            // simple user creation
            Employee empl = new Employee();
            trace("Testing default constructor generates identical objects");

            Employee empl2 = new Employee();

            // expect to be same
            String msg = String.format("Employees are not the same\n%s\n%s", empl, empl2);
            assertTrue(msg, empl.equals(empl2));


            trace("Testing setter methods to change one object");
            Employee newEmpl = new Employee("Manny", "Cruz", 60000.00);
            empl2.setFirstName(newEmpl.getFirstName());
            empl2.setLastName(newEmpl.getLastName());
            empl2.setSalary(newEmpl.getSalary());

            msg = String.format("Employee should not be equal\n%s\n%s", empl, empl2);
            assertFalse(msg, empl.equals(empl2));

            trace("Testing parameterized constructor with data from existing object");
            Employee empl3 = new Employee("Joshua", "Jamison", 40000.00);
            String toString = empl3.toString();
            trace("Testing toString for new employee: " + empl3.toString());
            boolean invalidFormat = toString.contains("Salary@");
            trace("toString test " + invalidFormat);
            assertFalse("Employee doesn't properly override toString\n" + toString, invalidFormat);

            empl3.getFormattedSalary();

            Employee empl4 = new Employee("John", "Johnson");



        }

    }


