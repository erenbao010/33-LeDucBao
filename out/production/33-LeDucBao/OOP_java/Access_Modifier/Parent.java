package OOP_java.Access_Modifier;

public class Parent {
    final void printMsg(){
        System.out.println("Final method");
    }
    final protected int protectedVariable = 10;
    protected void setProtectedMethod(){
        System.out.println("This is protected");
    }
}

