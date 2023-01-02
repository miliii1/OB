package com.funciones;

public class Main {
    public static void main(String[] args) {
        suma(10, 20, 30);

        Car myCar = new Car();

        myCar.sumarTapuer();
        myCar.sumarTapuer();
        System.out.println("The number of tapuer is: " + myCar.numbertapuer);

    }

    public static void suma(int a, int b, int c) {
        int resultado;
        resultado = a + b + c;
        System.out.println(resultado);
    }

}

class Car {
    public int numbertapuer = 4;

    public void sumarTapuer() {

        this.numbertapuer++;
    }

}