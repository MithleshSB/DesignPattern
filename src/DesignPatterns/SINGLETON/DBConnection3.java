package DesignPatterns.SINGLETON;
/*
    Double Locking - Mnemonic: "Check once outside, check again inside synchronized"
    One-liner Explanation (Interview):
            “Double-checked locking prevents multiple threads from creating multiple instances in
            lazy singleton by checking the instance twice — before and after acquiring the lock.”

 */
public class DBConnection3 {

    private static DBConnection3 conObj; // null at class loading
//  private static volatile Singleton instance; // `volatile` ensures visibility,
//  Ensures all threads see the updated object.
    private DBConnection3() {
    }

    /* This is Synchronized way - method lock expensive.
    Synchronized public static DBConnection2 getInstance() {
        if (conObj == null) {
            conObj = new DBConnection2();
        }
        return conObj;
    }
     */

    //this is for double lock check
    public static DBConnection3 getInstance() {
        if (conObj == null) { // first check no locking
            synchronized (DBConnection3.class) {
                if (conObj == null) { //2nd check with lock
                    conObj = new DBConnection3();
                }
            }
        }
        return conObj;
    }
}
