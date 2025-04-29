package DesignPatterns.SINGLETON;

public class DBConnection1 {

    //EAGER - static because it is now related to class and will load single time on class loading and will
    //get initialized once only.

    private static DBConnection1 conObj = new DBConnection1();

    private DBConnection1() {
    }

    public static DBConnection1 getInstance() {
        return conObj;
    }
}
