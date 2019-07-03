


import java.util.Scanner;

public class Orientobjest {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        String marca, modelo, procesador, board;
        double ram, hdd;
        Computador pc1;
        System.out.println("ingrese la marca");
        marca = leer.next();
        System.out.println("ingrese el modelo");
        modelo = leer.next();
        System.out.println("ingrese el procesador");
        procesador = leer.next();
        System.out.println("ingrese la board");
        board = leer.next();
        System.out.println("ingrese la ram");
        ram = leer.nextDouble();
        System.out.println("ingrese capacidad del hdd");
        hdd = leer.nextDouble();
        pc1 = new Computador(marca, modelo, procesador, board, ram, hdd);
        
        System.out.println(pc1.mostrar());
        
        
    }
    
}
