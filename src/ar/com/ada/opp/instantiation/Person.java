package src.ar.com.ada.opp.instantiation;

public class Person {
    private String name;
    private String lastName;

    public Person() {
    }

    public Person(String name) {
        this.name = name;
    }

    public Person(String name, String lastName) {
        this.name = name;
        this.lastName = lastName;
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setLastName(String lastName){
        this.lastName = lastName;
    }


}
