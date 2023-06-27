package OOP_java.Access_Modifier;


    public class ChildClass extends Parent {
        public void childMethod(){
            System.out.println("This is child method");
            System.out.println("Accessing protected vari from parent class"+ protectedVariable);
            setProtectedMethod();
        }
    }

