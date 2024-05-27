//clase veiculopasajero
public class vehiculoPasajeros extends vehiculo {

    private int numPasajeros;

    //constructor
    public vehiculoPasajeros(String marca, String modelo, int año, int kilometraje, int numPasajeros) {
        super(marca, modelo, año, kilometraje);
        this.numPasajeros = numPasajeros;  

     }
     //Getter y Setter para numPasajeros
     public int getNumpasajeros() {
        return numPasajeros;
    }

    public void setNumpasajeros(int numPasajeros) {
        this.numPasajeros = numPasajeros;
    }

    //sobreescribir el metodo mostrarInfo()
    @Override
    public void mostrarInfo() {
        super.mostrarInfo();
        System.out.println("numero de pasajeros: " + numPasajeros);
    }

}
