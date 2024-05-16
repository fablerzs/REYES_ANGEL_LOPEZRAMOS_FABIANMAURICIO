import DAO.BaseDatos;
import DAO.OdontologoDAOH2;
import Modelo.Odontologo;
import Service.OdontologoService;
import org.apache.log4j.Logger;


import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class OdontologoTest {
    private static final Logger logger= Logger.getLogger(OdontologoTest.class);

    @Test
    public void prueba() {


        BaseDatos.crearTablas();
        Odontologo odontologo1 = new Odontologo("Juan", "Perez");
        Odontologo odontologo2 = new Odontologo("Roberto", "Juarez");
        Odontologo odontologo3 = new Odontologo("Adriana", "Ramirez");

        OdontologoService odontologoService = new OdontologoService();



        odontologoService.agregarOdontologo(odontologo1);
        odontologoService.agregarOdontologo(odontologo2);
        odontologoService.agregarOdontologo(odontologo3);
        logger.info("Odontologs agregados con exito");

        List<Odontologo> listaOdontologos = odontologoService.mostrarOdontologos();

        System.out.println(Arrays.toString(listaOdontologos.toArray()));

        Assertions.assertNotNull(odontologoService.mostrarOdontologos());
    }



}
