
public class Computador {

    private String marca, modelo, procesador, board;
    private double ram, hdd;
    
    public Computador(String marca, String modelo, String procesador, String board, double ram, double hdd){
        this.marca =marca;
        this.modelo = modelo;
        this.procesador = procesador;
        this.board = board;
        this.ram = ram;
        this.hdd = hdd;
        
    }
    
    public String mostrar(){
        String resultado ="";
        resultado = marca+ " " + modelo + " " + procesador + " " + board + " " + Double.toHexString(ram) + " " + Double.toHexString(hdd);
        return resultado;
    }
    
    public void setprocesador(String Procesador){
        procesador = Procesador;
        System.out.println("cambio de procesador realizado");
    }
    
    public void setRam(double ram){
        this.ram = ram;
        System.out.println("cambio de Ram realizado");
    }
    
    public void setHDD(double hdd){
        this.hdd = hdd;
        System.out.println("cambio de HDD realizado");
    }
    
} 
