package main;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class App {
    public static void main(String[] args) throws Exception {
      LogicaClasificacion logica = new LogicaClasificacion();
            Queue <String> ColaNombre = new LinkedList();
            ColaNombre.add("maria");
            ColaNombre.add("pedro");
            ColaNombre.add("victoria");
            ColaNombre.add("juan");
            ColaNombre.add("Daniel");
            System.out.println("entrada:"+ColaNombre);
        Queue<String> resultado = logica.invertirColaNombres(ColaNombre);
        System.out.println("salida esperada: " +resultado);



    
      }
}
