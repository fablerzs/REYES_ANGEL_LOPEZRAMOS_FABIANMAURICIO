package DAO;

import org.apache.log4j.Logger;

import javax.swing.plaf.nimbus.State;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class BaseDatos {
    private static final Logger logger= Logger.getLogger(BaseDatos.class);

    private static final String SQL_DROP_CREATE_PX= " DROP TABLE IF EXISTS; " +
            "CREATE TABLE PACIENTES (ID INT AUTO_INCREMENT PRIMARY KEY, NOMBRE VARCHAR(100) NOT NULL, APELLIDO VARCHAR(100), CEDULA VARCHAR(50) NOT NULL, FECHA_INGRESO DATE NOT NULL, DOMICILIO_ID INT NOT NULL);";

    private static final String SQL_DROP_CREATE_DOM= " DROP TABLE IF EXISTS; " +
            "CREATE TABLE DOMICILIO (ID INT AUTO_INCREMENT PRIMARY KEY, CALLE VARCHAR(100) NOT NULL, NUMERO INT NOT NULL, LOCALIDAD VARCHAR(100) NOT NULL, PROVINCIA VARCHAR(100) NOT NULL";

    public static void crearTablas(){
        Connection conexion = null;
        try {
            conexion = getConnection();
            Statement statement = conexion.createStatement();
            statement.execute(SQL_DROP_CREATE_DOM);
            statement.execute(SQL_DROP_CREATE_PX);
            logger.info("tablas creadas con exito");
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public static Connection getConnection() throws Exception {
        return DriverManager.getConnection("jdbc:h2:/practicaExamen", "sa", "sa");
    }
}
