package animales;

public class Animal {
    //caracteristicas de un animal
    String nombre;
    String color;
    double peso;
    double tamano;

    //definimos metodos constructores
    public Animal(){}

    public Animal(String nombre, String color, double peso, double tamano) {
        this.nombre = nombre;
        this.color = color;
        this.peso = peso;
        this.tamano = tamano;
    }

    //metodos Getters y Setters
    public String getNombre(){
        return nombre;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getTamano() {
        return tamano;
    }

    public void setTamano(double tamano) {
        this.tamano = tamano;
    }

    //comportamientos de un animal

    //comer
    //dormir
    //moverse
    public String moverse() {
        return"El animal se está moviendo";
    }

}
