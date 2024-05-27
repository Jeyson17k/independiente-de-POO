public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        //nombre jeyson miguel zapata davila

        // crear instancia de cada tipo de vehiculo 
        Auto auto = new Auto("toyota", "corolla", 2020, 15000, 5, "gasolina");

        Camion camion = new Camion("volvo", "FH", 2019, 75000, 20000, 4);

        //mostrar la informacion de cada vehiculo
        System.out.println("informacion del auto: ");
        auto.mostrarInfo();

        System.out.println();
        System.out.println("informacion del camion: ");
        camion.mostrarInfo();

        System.out.println();
        System.out.println("el costo total del mantemiento es: ");
        auto.calcularCostoMantenimiento(100, 50);
        
    }
}
