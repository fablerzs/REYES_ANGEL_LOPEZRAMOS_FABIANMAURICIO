package DAO;

import Modelo.Odontologo;

import java.util.ArrayList;
import java.util.List;
import org.apache.log4j.Logger;

public class ColeccionJava {
    private static final Logger logger = Logger.getLogger(ColeccionJava.class);

    private static List<Odontologo> listaOdontologos;
    public static void generarLista(){
        logger.info("[inicializa colección]");
        listaOdontologos = new ArrayList<>();

        listaOdontologos.add(new Odontologo(23, "Mauricio", "Lopez"));
        listaOdontologos.add(new Odontologo(45, "Karina", "Aviles"));
        listaOdontologos.add(new Odontologo(84, "Monica", "Hernandez"));
    }

    public static List<Odontologo> getListaOdontologos() {
        return listaOdontologos;
    }
}
