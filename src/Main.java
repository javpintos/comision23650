import animales.Delfin;
import animales.Gato;

public class Main {
    public static void main(String[] args) {
        /*
        String nombre = "Cristian";
        int edad = 26;
        final double ALTURA = 1.76;
        //System.out.println("Hola. Mi nombre es " + nombre + ", tengo " + edad + " años, y mido " + ALTURA + " mts.");
        String dias[] = new String[7];
        dias[0] = "Domingo";
        dias[1] = "Lunes";
        dias[2] = "Martes";
        dias[3] = "Miercoles";
        dias[4] = "Jueves";
        dias[5] = "Viernes";
        dias[6] = "Sabado";

        //mostrar unicamente los dias con indice impar con for
        for (int i = 0; i < dias.length; i++) {
            if(i % 2 == 1) System.out.println(dias[i]);
        }

        System.out.println("");

        //mostrar unicamente los dias con indice par con while
        int i = 0;
        while (i < dias.length){
            if(i % 2 == 0) System.out.println(dias[i]);
            i++;
        }
    */

        //CREACION DE ANIMALES
        Gato gatito = new Gato("Cleo", "negro", 2.0, 0.75, true);
        Delfin delfi = new Delfin();
        System.out.println("Mi gato se llama " + gatito.getNombre());
        System.out.println(gatito.moverse());
        System.out.println(delfi.moverse());
    }
}