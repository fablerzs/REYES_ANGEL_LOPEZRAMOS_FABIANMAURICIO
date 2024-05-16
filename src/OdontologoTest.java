import DAO.BaseDatos;
import Modelo.Odontologo;
import Service.OdontologoService;
import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class OdontologoTest {

    @Test
    public void prueba() {

        BaseDatos.crearTablas();
        Odontologo odontologo1 = new Odontologo("Juan", "Perez");

        OdontologoService odontologoService = new OdontologoService();

        List<Odontologo> listaOdontologos = odontologoService.mostrarOdontologos();
        odontologoService.agregarOdontologo(odontologo1);
        for (int i = 0; i < listaOdontologos.size()  ; i++) {

            System.out.println(listaOdontologos.get(i).toString());

        }
        Assert.assertNotNull(odontologoService.mostrarOdontologos());
    }



}
