package DesignPatterns.SINGLETON;

/*  Singleton Design Pattern (Creational Pattern)
     Ensures a class has only one instance and provides a global access point to it.
     Mnemonic: "One class, One object, One access"
Why Singleton?
    Restrict object creation to only one instance, have private constructor to avoid creation and
    static method to create and validate and is useful for shared resources: logger, DB connection, config manager
4 ways to achieve
    Eager, Lazy ,Synchronized method(Expensive-because of locks), double-locking(actually used in industries)
 */
public class Driver {
    public static void main(String[] args) {
//      Approach 1 ->  Eager, object created at class Loading time, either used or not
        DBConnection1 ob1 = DBConnection1.getInstance();
        DBConnection1 ob2 = DBConnection1.getInstance();
        //both will return same hashcode and toString.
        System.out.println(ob1.hashCode() + ", " + ob1.toString());
        System.out.println(ob2.hashCode() + ", " + ob2.toString());

//      Approach 2 ->  LAZY, if we don't need the object,it won't be created loading time. Only when called.
        DBConnection2 ob3 = DBConnection2.getInstance();
        DBConnection2 ob4 = DBConnection2.getInstance();
        //both will return same hashcode and toString.
        System.out.println(ob3.hashCode() + ", " + ob3.toString());
        System.out.println(ob4.hashCode() + ", " + ob4.toString());

//      Approach 2 ->  Synchronized - double locking, both diff, DL- not at method level rather two checks
        DBConnection3 ob5 = DBConnection3.getInstance();
        DBConnection3 ob6 = DBConnection3.getInstance();
        //both will return same hashcode and toString.
        System.out.println(ob5.hashCode() + ", " + ob5.toString());
        System.out.println(ob6.hashCode() + ", " + ob6.toString());
    }
}
