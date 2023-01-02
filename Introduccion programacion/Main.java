public class Main {

    public static void main(String[] args) {
        Cliente customer = new Cliente();
        customer.name = "Homero";
        customer.age = 39;
        customer.phone = 12345;
        customer.credito = 250.00;
        System.out.println("Hi! I am " + customer.name + ", I'm " + customer.age + ", my phone is this: "
                + customer.phone + " and my credit is this " + customer.credito);
        
        Trabajador employee = new Trabajador();
        employee.name = "Marge";
        employee.age = 34;
        employee.phone = 67890;
        employee.salary = 150.00;
        System.out.println("Hi! I am " + employee.name + ", I'm " + employee.age + ", my phone is this: "
        + employee.phone + " and my credit is this " + employee.salary);
    }
}

class Persona {
    int age;
    String name;
    int phone;
}

class Cliente extends Persona {
    double credito;
}

class Trabajador extends Cliente {
    double salary;
}
