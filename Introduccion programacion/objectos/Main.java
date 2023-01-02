
public class Main {
    public static void main(String[] args) {
        Persona miPersona = new Persona("Homero,");
        miPersona.setAge(39);
        miPersona.setPhone(123456789);
        System.out.println("My name is " + miPersona.getName());
        System.out.println("I am " + miPersona.getAge() + " years old,");
        System.out.println("and this is my number phone: " + miPersona.getPhone());
    }
}

class Persona {
    private String name;
    private int age;
    private int phone;

    public Persona(String newName) {
        name = newName; 
    }

    public int getAge() {
        return age;
    }

    public void setAge(int newAge) {
        age = newAge;
    }

    public String getName() {
        return name;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int newPhone) {
        phone = newPhone;
    }
}