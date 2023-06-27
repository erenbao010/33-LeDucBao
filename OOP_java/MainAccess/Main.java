package OOP_java.MainAccess;

import OOP_java.Access_Modifier.ChildClass;

public class Main {
    public static void main(String[] args){
        ChildClass childObject = new ChildClass();
        // accessing Protected member from child class
        childObject.childMethod();
    }
}
