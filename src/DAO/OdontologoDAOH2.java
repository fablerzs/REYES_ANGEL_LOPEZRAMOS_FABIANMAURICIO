package DAO;

import Modelo.Odontologo;
import org.apache.log4j.Logger;

import javax.swing.plaf.nimbus.State;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class OdontologoDAOH2 implements iDao<Odontologo> {
    private static final Logger logger= Logger.getLogger(OdontologoDAOH2.class);


    private static final String SQL_INSERT_ODONTOLOGO = "INSERT INTO ODONTOLOGOS (NOMBRE, APELLIDO) VALUES(?,?)";
    private static final String SQL_SEARCH = "SELECT * FROM ODONTOLOGOS";

    @Override
    public Odontologo guardar(Odontologo odontologo) {
        Connection conexion = null;
        try {
            conexion = BaseDatos.getConnection();
            PreparedStatement psInsert = conexion.prepareStatement(SQL_INSERT_ODONTOLOGO,Statement.RETURN_GENERATED_KEYS);

            psInsert.setString(1,odontologo.getNombre());
            psInsert.setString(2,odontologo.getApellido());
            psInsert.execute();
            logger.info("odontologo agregado con exito");
            ResultSet rs = psInsert.getGeneratedKeys();
            while(rs.next()){
                odontologo.setMatricula(rs.getInt(1));
            }


        } catch (Exception e){
            e.printStackTrace();
        }
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
        Connection conexion = null;
        Odontologo odontologo = null;
        List<Odontologo> lista1 = new ArrayList<>();

        try {
            conexion = BaseDatos.getConnection();
            PreparedStatement psSearch = conexion.prepareStatement(SQL_SEARCH);
            psSearch.execute();
            ResultSet rs = psSearch.getResultSet();
            logger.info("mostrando lista de odontologos");
            while(rs.next()){
                odontologo = new Odontologo(rs.getInt(1),rs.getString(2),rs.getString(3));
                lista1.add(odontologo);
            }


        } catch (Exception e){
            e.printStackTrace();
        }

        return lista1;
    }
}
