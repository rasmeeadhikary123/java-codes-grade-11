/*

input: none
variable used:name,roll,address
code:

 */

public class Student{
    String name;
    int roll;
    String address;
    public static void main(String args[]){
       
      
            Student st1=new Student();
          
            st1.name="Rasmi Adhikari";
            st1.roll=5;
            st1.address="dhakalthok";
            System.out.println("Name of the Student:  "+ st1.name);
            System.out.println("Roll: "+st1.roll);
            System.out.println("Address:"+st1.address);

            }
    }

    /*
output:

Name of the Student:  Rasmi Adhikari
Roll: 5
Address:dhakalthok

Explanation:i have created a object of student.
then i have assigned values to all the properties of object.
theni have printed the detail of student.

*/
