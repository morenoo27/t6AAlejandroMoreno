/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea;

import java.util.ArrayList;

/**
 *
 * @author aleja
 */
public class Prueba {

    public static void main(String[] args) {

        Liga l1 = new Liga();
        Liga l2 = new Liga();

        l1.setNombre("Liga Española");
        l2.setNombre("Liga Inglesa");

        l1.setPaisPertenece("Esàña");
        l2.setPaisPertenece("Inglaterra");

        Equipo madrid = new Equipo();
        Equipo barcelona = new Equipo();
        Equipo chealsea = new Equipo();
        Equipo liverpool = new Equipo();

        madrid.setNombreClub("Real Madrid C.F");
        madrid.setNombre("liga Española");
        madrid.setPaisPertenece("España");

        barcelona.setNombreClub("Barcelona F.C");
        barcelona.setNombre("liga Española");
        barcelona.setPaisPertenece("España");

        chealsea.setNombreClub("Chelsea F.C");
        chealsea.setNombre("Liga Inglesa");
        chealsea.setPaisPertenece("Inglaterra");

        liverpool.setNombreClub("Liverpool F.C");
        liverpool.setNombre("Liga Inglesa");
        liverpool.setPaisPertenece("Inglaterra");

        Jugadores j1 = new Jugadores();
        Jugadores j2 = new Jugadores();
        Jugadores j3 = new Jugadores();
        Jugadores j4 = new Jugadores();

        j1.setNombreClub("Real Madrid C.F");
        j1.setNombre("liga Española");
        j1.setPaisPertenece("España");
        j1.setNacionalidad("Española");
        j1.setNumDorsal(4);
        j1.setPosicion(4);
        j1.setSalario(10);
        j1.setSuplente(false);

        j2.setNombreClub("Barcelona C.F");
        j2.setNombre("liga Española");
        j2.setPaisPertenece("España");
        j2.setNacionalidad("Argentino");
        j2.setNumDorsal(10);
        j2.setPosicion(8);
        j2.setSalario(20);
        j2.setSuplente(false);

        j3.setNombreClub("Liverpool F.C");
        j3.setNombre("Liga Inglesa");
        j3.setPaisPertenece("Inglaterra");
        j3.setNacionalidad("Egipcio");
        j3.setNumDorsal(10);
        j3.setPosicion(8);
        j3.setSalario(20);
        j3.setSuplente(false);

        j4.setNombreClub("Chelsea F.C");
        j4.setNombre("Liga Inglesa");
        j4.setPaisPertenece("Inglaterra");
        j4.setNacionalidad("Brasileño");
        j4.setNumDorsal(19);
        j4.setPosicion(6);
        j4.setSalario(20);
        j4.setSuplente(false);

        Entrenadores e1 = new Entrenadores();
        Entrenadores e2 = new Entrenadores();

        e1.setNombreClub("Chelsea F.C");
        e1.setNombre("Liga Inglesa");
        e1.setPaisPertenece("Inglaterra");
        e1.setNacionalidad("Brasileño");
        e1.setSalario(20);
        e1.setSuplente(false);

        e2.setNombreClub("Liverpool F.C");
        e2.setNombre("Liga Inglesa");
        e2.setPaisPertenece("Inglaterra");
        e2.setNacionalidad("Egipcio");
        e2.setSalario(20);
        e2.setSuplente(false);

        ArrayList<Liga> array = new ArrayList<>();

        array.add(l1);
        array.add(l2);
        array.add((Equipo) madrid);
        array.add((Equipo) barcelona);
        array.add((Equipo) chealsea);
        array.add((Equipo) liverpool);
        array.add((Jugadores) j1);
        array.add((Jugadores) j2);
        array.add((Jugadores) j3);
        array.add((Jugadores) j4);
        array.add((Entrenadores) e1);
        array.add((Entrenadores) e2);

        for (int i = 0; i < array.size(); i++) {

            System.out.println("Es de españita? ");
            array.get(i).esEspañola();
            
        }
    }
}

    
