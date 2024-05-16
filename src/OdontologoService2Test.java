import DAO.ColeccionJava;
import DAO.PacienteDAOH2;
import Modelo.Odontologo;
import Service.OdontologoService2;
import org.apache.log4j.Logger;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

public class OdontologoService2Test {
    private static final Logger logger= Logger.getLogger(OdontologoService2Test.class);
    @Test
    public void crearOdontologoEnColeccion(){

        ColeccionJava.generarLista();
        OdontologoService2 service2 = new OdontologoService2();
        Odontologo nuevoOdontologo = new Odontologo(1, "Angel", "Reyes");
        Odontologo odontologo = service2.guardarOdontologo(nuevoOdontologo);

        logger.info("[ODONTOLOGO CREADO: " + odontologo.toString() + "]");

        Assertions.assertTrue(
                (nuevoOdontologo.getNombre() + " " + nuevoOdontologo.getApellido())
                        .equals(odontologo.getNombre() + " " + odontologo.getApellido()));
    }

    @Test
    public void listarColeccionOdontologo(){
        ColeccionJava.generarLista();

        OdontologoService2 service2 = new OdontologoService2();
        List<Odontologo> listaOdontologos = service2.buscarTodosOdontologos();

        for(Odontologo odontologo : listaOdontologos ){
            logger.info(odontologo.toString());

        }
        Assertions.assertTrue(listaOdontologos.size()==3);

    }
}
