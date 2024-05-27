//clase auto
public class Auto extends vehiculoPasajeros {
    private String tipoCombustible;

    //constructor
    public Auto(String marca, String modelo, int año, int kilometraje, int numPasajeros, String tipoCombustible) {
        super(marca, modelo, año, kilometraje, numPasajeros);
        this.tipoCombustible = tipoCombustible;
    }

    //Getter y Setter para tipo de combustible
    public String getTipoCombustible() {
        return tipoCombustible;
    }

    public void setTipoCombustible(String tipoCombustible) {
        this.tipoCombustible = tipoCombustible;
    }

    //sobreescribir el metodo mostrarInfo()
    @Override
    public void mostrarInfo() {
        super.mostrarInfo();
        System.out.println("tipo de combustible: " + tipoCombustible);
    }
    //agregar mantemiento al metodo
    @Override
    public void RealizarMatenimiento() {
        super.RealizarMatenimiento();
        System.out.println("para el mantenimiento de este auto se necesita: ");
        System.out.println("llenar tanque de combustible");
        System.out.println("darle limpieza al auto");
    }

    public void calcularCostoMantenimiento(double kmrecorrido, double costoporkm) {
        double costoMantemiento = kmrecorrido * costoporkm;
        System.out.println(costoMantemiento+"$");
    }

}
