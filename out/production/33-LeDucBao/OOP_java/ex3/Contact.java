package OOP_java.ex3;

public interface Contact {
//    public String  getName();
    public default String Call(){
        return null;
    }

    public default String getPhoneNumber(){
        return null;
    }
    public String  displayContactInfo();
}
