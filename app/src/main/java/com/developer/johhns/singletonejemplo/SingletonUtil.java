package com.developer.johhns.singletonejemplo;

public class SingletonUtil {

    private static SingletonUtil Instancia = new SingletonUtil();

    /// atributos
    private String Cadena_1;
    private String Cadena_2;
    private int Entero_1;
    private int Entero_2;

    // constructor
    private SingletonUtil() {
        this.Cadena_1 = "Hola" ;
        this.Cadena_2 = "John" ;
        this.Entero_1 = 42 ;
        this.Entero_2 = 0  ;
    }

    public static SingletonUtil getInstancia() {
        return Instancia;
    }

    public String getCadena_1() {
        return Cadena_1;
    }

    public void setCadena_1(String cadena_1) {
        Cadena_1 = cadena_1;
    }

    public String getCadena_2() {
        return Cadena_2;
    }

    public void setCadena_2(String cadena_2) {
        Cadena_2 = cadena_2;
    }

    public int getEntero_1() {
        return Entero_1;
    }

    public void setEntero_1(int entero_1) {
        Entero_1 = entero_1;
    }

    public int getEntero_2() {
        return Entero_2;
    }

    public void setEntero_2(int entero_2) {
        Entero_2 = entero_2;
    }
}
