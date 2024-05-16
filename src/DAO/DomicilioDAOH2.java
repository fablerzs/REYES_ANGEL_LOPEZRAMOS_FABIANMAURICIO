package DAO;

import Modelo.Domicilio;

import java.util.List;

public class DomicilioDAOH2 implements iDao<Domicilio> {

    @Override
    public Domicilio guardar(Domicilio domicilio) {
        return null;
    }

    @Override
    public Domicilio buscarID(Integer id) {
        return null;
    }

    @Override
    public void actualizar(Domicilio domicilio) {

    }

    @Override
    public void eliminar(Integer id) {

    }

    @Override
    public List<Domicilio> buscarTodos() {
        return List.of();
    }
}
