//clase camion
public class Camion extends vehiculoCarga {
    private int numEjes;

    //constructor 
    public Camion(String marca, String modelo, int año, int kilometraje, int capacidadCarga, int numEjes) {
        super(marca, modelo, año, kilometraje, capacidadCarga);
        this.numEjes = numEjes;
     }

     //Getter y setter para numEjes
     public int getNumEjes() {
        return numEjes;
    }

    public void setNumEjes(int numEjes) {
        this.numEjes = numEjes;
    }

    //sobreescribir el metodo mostrarInfo()
    @Override
    public void mostrarInfo() {
        super.mostrarInfo();
        System.out.println("numero de ejes: " + numEjes);
    }
    //agregar mantenimiento al metodo
    
    public void RealizarMatenimiento() {
        super.RealizarMatenimiento();
        System.out.println("para el mantemiento de este camion se necesita:");
        System.out.println("llenar tanque de gasolina");
        System.out.println("limpiar el espacio del conductor");
        System.out.println("chequear motor");
    }


}
