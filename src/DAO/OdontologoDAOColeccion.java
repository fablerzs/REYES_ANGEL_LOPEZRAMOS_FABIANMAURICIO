package DAO;

import Modelo.Odontologo;

import java.util.List;
import org.apache.log4j.Logger;

public class OdontologoDAOColeccion implements iDao<Odontologo>{
    private static final Logger logger = Logger.getLogger(OdontologoDAOColeccion.class);

    @Override
    public Odontologo guardar(Odontologo odontologo) {
        logger.info("[guardar en coleccion]");
        ColeccionJava.getListaOdontologos().add(odontologo);

        return odontologo;
    }

    @Override
    public Odontologo buscarID(Integer id) {
        return null;
    }

    @Override
    public void actualizar(Odontologo odontologo) {

    }

    @Override
    public void eliminar(Integer id) {

    }

    @Override
    public List<Odontologo> buscarTodos() {
        logger.info("[listar coleccion]");
        return ColeccionJava.getListaOdontologos();
    }
}
