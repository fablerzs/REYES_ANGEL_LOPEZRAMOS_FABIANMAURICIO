package Modelo;

import java.time.LocalDate;

public class Paciente {
    private Integer id;
    private String nombre;
    private String apellido;
    private Integer DNI;
    private LocalDate fechaIngreso;
    private Domicilio domicilio;

    public Paciente(Domicilio domicilio, LocalDate fechaIngreso, Integer DNI, String apellido, String nombre) {
        this.domicilio = domicilio;
        this.fechaIngreso = fechaIngreso;
        this.DNI = DNI;
        this.apellido = apellido;
        this.nombre = nombre;
    }

    public Domicilio getDomicilio() {
        return domicilio;
    }

    public LocalDate getFechaIngreso() {
        return fechaIngreso;
    }

    public Integer getDNI() {
        return DNI;
    }

    public String getApellido() {
        return apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}
