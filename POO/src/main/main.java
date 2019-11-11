package main;
import controller.PersonController;

import java.util.ArrayList;
import models.Person;

import javax.swing.*;

public class main {


    public static void main(String[] args) {
        ArrayList listPersons = new ArrayList();
        Person persona1 = new models.Person();
        Person persona2 = new models.Person();


        persona1.setNombre("Yirleison");
        persona1.setApellidos("Palomeque");
        persona1.setEdad(31);
        persona1.setEstatura(180);
        persona1.setPeso(72);
        persona1.setColorPiel("Negro");
        persona1.setTipoIdentificaicon("CC");
        persona1.setIdentificacion("1017159835");

        persona2.setNombre("Yarleison");
        persona2.setApellidos("Palomeque");
        persona2.setEdad(26);
        persona2.setEstatura(183);
        persona2.setPeso(80);
        persona2.setColorPiel("Negro");
        persona2.setTipoIdentificaicon("CC");
        persona2.setIdentificacion("1017159834");

        Person persona3 = new Person("Nevis","Paloemque",25,172,72,"Negro","cc","1017186978");


        listPersons.add(persona1);
        listPersons.add(persona2);
        listPersons.add(persona3);

        System.out.println("Termino");

    }
}
