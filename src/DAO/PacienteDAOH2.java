package DAO;

import Modelo.Paciente;
import org.apache.log4j.Logger;
import org.h2.util.json.JSONTarget;

import java.sql.*;
import java.util.List;

public class PacienteDAOH2 implements iDao<Paciente> {
    private static final Logger logger= Logger.getLogger(PacienteDAOH2.class);
    private static final String SQL_INSERT = "INSERT INTO PACIENTES (NOMBRE, APELLIDO, DNI, FECHA_INGRESO, DOMICILIO_ID) VALUES(?,?,?,?,?)";

    @Override
    public Paciente guardar(Paciente paciente) {
        logger.info("iniciar operacion de guardar");
        Connection conexion = null;
        try {

            conexion = BaseDatos.getConnection();
            PreparedStatement psInsert = conexion.prepareStatement(SQL_INSERT, Statement.RETURN_GENERATED_KEYS);

            psInsert.setString(1, paciente.getNombre());
            psInsert.setString(2, paciente.getApellido());
            psInsert.setInt(3, paciente.getDNI());
            psInsert.setDate(4, Date.valueOf(paciente.getFechaIngreso()));
            psInsert.setInt(5, paciente.getDomicilio().getId());
            //ids se crean al executar el statement
            psInsert.execute();
            ResultSet rs = psInsert.getGeneratedKeys();
            while (rs.next()){
                paciente.setId(rs.findColumn(String.valueOf(1)));
            }


        } catch (Exception e){
            logger.warn(e.getMessage());
        }
        return null;
    }

    @Override
    public Paciente buscarID(Integer id) {
        return null;
    }

    @Override
    public void actualizar(Paciente paciente) {

    }

    @Override
    public void eliminar(Integer id) {

    }

    @Override
    public List<Paciente> buscarTodos() {
        return List.of();
    }
}
