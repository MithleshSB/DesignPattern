package DesignPatterns.PROTOTYPE;
/*  Prototype Design Pattern (Creational Pattern)
    Used to create object copies/clones without depending on their concrete class.
    Ideal when object creation is costly or complex.     Mnemonic:"Don't build, just clone!"

“Prototype pattern allows creating new objects by cloning an existing instance,
improving performance when object creation is costly.”

In pure java way without creating custom prototype interface , we can use simple java way implementing cloneable
Example ->
            class Vehicle implements Cloneable {
                //members and methods
                @Override
                protected Vehicle clone() {
                    try {
                        return (Vehicle) super.clone();
                    } catch (CloneNotSupportedException e) {
                        return null;
                    }
                }
            }
                // Usage
                public class Main {
                    public static void main(String[] args) {
                        Vehicle car1 = new Vehicle("Car");
                        Vehicle car2 = car1.clone();  // Cloning

                        car1.showType();  // Vehicle Type: Car
                        car2.showType();  // Vehicle Type: Car
                    }
                }
*/
public class Driver {
    public static void main(String[] args) {
        Student obj = new Student("MSB", 16, "Science");
        System.out.println("1st object name " + obj.name);

//        without Prototype if I want to create object via clone, It won't access private member

        /*
        Student ob2 = new Student();
        ob2.name = obj.name;
        ob2.subject = obj.subject;
        ob2.rollnumber = obj.rollnumber; error because its private and also client's' responsibility to clone
        */

//        With the Prototype Pattern we handle the clone responsibility with the class itself rather client
//        by creating Prototype interface having clone method being implemented in respective subject classes.

        Student obj3 = (Student) obj.clone();
        System.out.println("prototype object name " + obj3.name);

    }
}
