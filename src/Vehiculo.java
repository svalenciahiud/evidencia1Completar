public class Vehiculo {
    private String codigo; // Código único del vehículo
    private String marca; // Marca del vehículo
    private String tipo; // Tipo de vehículo (Auto, Camioneta, Motocicleta)
    private int modelo; // Año del modelo
    private double kilometraje; // Kilometraje del vehículo

    // Constructor de la clase Vehiculo
    public Vehiculo(String codigo, String marca, String tipo, int modelo, double kilometraje) {
        this.codigo = codigo;
        this.marca = marca;
        this.tipo = tipo;
        this.modelo = modelo;
        this.kilometraje = kilometraje;
    }

    // Métodos getter para obtener los valores de los atributos
    public String getCodigo() {
        return ***********;
    }

    public String getMarca() {
        return ***********;
    }

    public String getTipo() {
        return ***********;
    }

    public int getModelo() {
        return ***********;
    }

    public double getKilometraje() {
        return ***********;
    }

    // Método toString para representar la información del vehículo en texto
    @Override
    public String toString() {
        return "[Codigo: " + codigo + ", Marca: " + marca + ", Tipo: " + tipo + ", Modelo: " + modelo + ", Kilometraje: " + kilometraje + "]";
    }
}
// Clases derivadas de Vehiculo
class Auto extends Vehiculo {
    // Constructor de la clase Auto
    public Auto(String codigo, String marca, int modelo, double kilometraje) {
        super(codigo, marca, ******, modelo, kilometraje); // Llama al constructor de Vehiculo
    }
}

class Camioneta extends Vehiculo {
    // Constructor de la clase Camioneta
    public Camioneta(String *****, String marca, int *****, double kilometraje) {
        super(codigo, marca, "Camioneta", modelo, ***********);
    }
}

class Motocicleta extends Vehiculo {
    // Constructor de la clase Motocicleta
    public Motocicleta(String codigo, String marca, int modelo, double ********) {
        super(codigo, ********, "Motocicleta", modelo, kilometraje);
    }
}
