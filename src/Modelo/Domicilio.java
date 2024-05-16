package Modelo;

public class Domicilio {
    private Integer id;
    private String calle;
    private  Integer numero;
    private String localidad;
    private String provincia;

    public Domicilio(String provincia, String localidad, Integer numero, String calle, Integer id) {
        this.provincia = provincia;
        this.localidad = localidad;
        this.numero = numero;
        this.calle = calle;
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public String getCalle() {
        return calle;
    }

    public Integer getNumero() {
        return numero;
    }

    public String getLocalidad() {
        return localidad;
    }

    public String getProvincia() {
        return provincia;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}
