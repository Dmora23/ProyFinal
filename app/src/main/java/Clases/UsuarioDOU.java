package Clases;

public class UsuarioDOU {
    public double sueldo;
    public double prestamo;

    public UsuarioDOU(double sueldo, double prestamo) {
        this.sueldo = sueldo;
        this.prestamo = prestamo;
    }


    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    public double getPrestamo() {
        return prestamo;
    }

    public void setPrestamo(double prestamo) {
        this.prestamo = prestamo;
    }
}
