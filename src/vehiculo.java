//clase vehiculo
public class vehiculo {

    private String marca;
    private String modelo;
    private int año;
    private int kilometraje;

    //constructor
    public vehiculo(String marca, String modelo, int año, int kilometraje) {
        this.marca = marca;
        this.modelo = modelo;
        this.año = año;
        this.kilometraje = kilometraje;    

   }
      // getters y setters
      public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
     }
     public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public int getAño() {
        return año;
    }
    public void setAño(int año) {
        this.año = año;
    }
    public int getKilometraje() {
        return kilometraje;
    }
    public void setKilometraje(int kilometraje) {
        this.kilometraje = kilometraje;
    }

    //metodo para mostrar la informacion del vehiculo
    public void mostrarInfo() {
        System.out.println("marca: " + marca);
        System.out.println("modelo: " + modelo);
        System.out.println("año: " + año);
        System.out.println("kilometraje: "+ kilometraje);
        System.out.println();
    }

    //mantemiento basico del vehiculo
    public void RealizarMatenimiento() {
        System.out.println("que mantemiento desea en su vehiculo: ");
        System.out.println("limpieza de filtros");
        System.out.println("cambio de aceite");
        System.out.println("probar frenos");
        System.out.println("cambio de aceite");
    }
}
