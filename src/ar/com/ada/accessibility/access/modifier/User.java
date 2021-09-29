package src.ar.com.ada.accessibility.access.modifier;

public class User {
    protected String nickName;
    protected String password;

    protected void showAttributeValues(){
        System.out.println( nickName + "" + password);
    }

}
