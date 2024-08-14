import java.util.Scanner;//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el nombre del propietario:");
        String nombre = scanner.nextLine();

        System.out.println("Ingrese la cédula del propietario:");
        String cedula = scanner.nextLine();

        System.out.println("Ingrese el email del propietario:");
        String email = scanner.nextLine();

        System.out.println("Ingrese el teléfono del propietario:");
        String telefono = scanner.nextLine();

        System.out.println("Ingrese la marca del vehículo:");
        String marca = scanner.nextLine();

        System.out.println("Ingrese el modelo del vehículo:");
        String modelo = scanner.nextLine();

        System.out.println("Ingrese la placa del vehículo:");
        String placa = scanner.nextLine();

        System.out.println("Ingrese el color del vehículo:");
        String color = scanner.nextLine();

        System.out.println("Ingrese la capacidad del vehículo de carga (en toneladas):");
        double capacidad = scanner.nextDouble();

        System.out.println("Ingrese el número de ejes del vehículo de carga:");
        int nEjes = scanner.nextInt();
        
        Propietario propietario = new Propietario(nombre, cedula, email, telefono, null);
        VehiculoCarga vehiculoCarga = new VehiculoCarga(marca, modelo, placa, color, capacidad, nEjes, propietario);

        propietario.getVehiculosAsociados().add(vehiculoCarga);
        vehiculoCarga.propietario = propietario;

        System.out.println("Propietario registrado con éxito:");
        System.out.println("Nombre: " + propietario.getNombre());
        System.out.println("Cédula: " + propietario.getCedula());
        System.out.println("Email: " + propietario.getEmail());
        System.out.println("Teléfono: " + propietario.getTelefono());

        System.out.println("\nVehículo de carga registrado con éxito:");
        System.out.println("Marca: " + vehiculoCarga.getMarca());
        System.out.println("Modelo: " + vehiculoCarga.getModelo());
        System.out.println("Placa: " + vehiculoCarga.getPlaca());
        System.out.println("Color: " + vehiculoCarga.getColor());
        System.out.println("Capacidad: " + vehiculoCarga.getCapacidad() + " toneladas");
        System.out.println("Número de ejes: " + vehiculoCarga.getnEjes());
        System.out.println("Propietario asociado: " + vehiculoCarga.propietario.getNombre());

        scanner.close();


    }
}