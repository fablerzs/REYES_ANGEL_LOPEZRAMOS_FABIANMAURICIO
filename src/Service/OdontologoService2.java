package Service;

import DAO.OdontologoDAOColeccion;
import Modelo.Odontologo;
import DAO.iDao;

import java.util.List;

public class OdontologoService2 {

    private iDao<Odontologo> odontologoiDao;

    public OdontologoService2(){
        odontologoiDao = new OdontologoDAOColeccion();
    }

    public Odontologo guardarOdontologo(Odontologo odontologo){
        return odontologoiDao.guardar(odontologo);
    }

    public List<Odontologo> buscarTodosOdontologos(){
        return  odontologoiDao.buscarTodos();
    }
}
