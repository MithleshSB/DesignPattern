package DesignPatterns.SINGLETON;

public class DBConnection2 {
/*
    LAZY - assigning with null at class loading time and initializing it in get instance method
     but first checking if object is null then create object and if it's not then return the already created one.

    In Lazy Singleton, instance is initialized on the first call to getInstance(),
    not at class loading time — saves memory and improves performance if the object is never used."

 */
    private static DBConnection2 conObj; // null at class loading
    private DBConnection2() {
    }
    public static DBConnection2 getInstance() {
        if (conObj == null) {
            conObj = new DBConnection2();
        }
        return conObj;
    }
}
