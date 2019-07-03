
package statuscarro;

import java.util.*;

public class StatusCarro {


    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        String placa, marca, color;
        int modelo, kilometraje;
        
        Carro model1;
        System.out.println("ingrese placa del carro");
        placa = leer.next();
        System.out.println("ingrese la marca del carro");
        marca = leer.next();
        System.out.println("ingrese el color del carro");
        color = leer.next();
        System.out.println("ingrese el modelo");
        modelo = leer.nextInt();
        System.out.println("ingrese el kilometraje");
        kilometraje = leer.nextInt();
        model1 = new Carro(placa, marca, color, modelo, kilometraje);
        
        System.out.println(model1.mostrar());
        
    }
    
}
