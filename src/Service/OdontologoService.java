package Service;

import DAO.OdontologoDAOH2;
import DAO.iDao;
import Modelo.Odontologo;

import java.util.List;

public class OdontologoService {
    private iDao<Odontologo> odontologoiDao;

    public OdontologoService(){
        odontologoiDao = new OdontologoDAOH2();
    }

    public Odontologo agregarOdontologo(Odontologo odontologo){
        return odontologoiDao.guardar(odontologo);
    }

    public List<Odontologo> mostrarOdontologos(){
        return odontologoiDao.buscarTodos();
    }




}
