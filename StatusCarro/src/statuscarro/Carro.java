package statuscarro;
public class Carro {
    
    private String placa, marca, color;
    private int modelo, kilometraje;
    
    public Carro(String placa, String marca, String color, int modelo, int kilometraje){
        this.placa = placa;
        this.marca = marca;
        this.color = color;
        this.modelo = modelo;
        this.kilometraje = kilometraje;
    }
    
    public String mostrar(){
        String resultado ="";
        resultado = placa + " " + marca + " " + color + " " + Integer.toHexString(modelo) + " " + Integer.toHexString(kilometraje);
        return resultado;
    }
    
    public void setkilometraje(int kilometraje){
        this.kilometraje = kilometraje;
        System.out.println("cambio de kilometraje realizado");
    }
    
}
