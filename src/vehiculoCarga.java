//clase vehiculocarga
public class vehiculoCarga extends vehiculo {
    private int capacidadCarga;

    //constructor 
    public vehiculoCarga(String marca, String modelo, int año, int kilometraje, int capacidadCarga) {
        super(marca, modelo, año, kilometraje);
        this.capacidadCarga = capacidadCarga;

    }

    //Getter y Setter para capacidad carga 
    public int getCapacidadCarga() {
        return capacidadCarga;
    }

    public void setCapacidadCarga(int capacidadCarga) {
        this.capacidadCarga = capacidadCarga;
    }

    //sobreescribir el metodo mostrarInfo()
    @Override
    public void mostrarInfo() {
        super.mostrarInfo();
        System.out.println("capacidad de carga: " + capacidadCarga + "kg" );
    }



}
