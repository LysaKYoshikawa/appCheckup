package com.example.appstudy.test;

import com.example.appstudy.domain.Paciente;

import java.util.ArrayList;
import java.util.List;

public class pacienteTeste {
    public static void main(String[] args){

        //caso1
        List<Paciente> pacientes = new ArrayList<Paciente>();
        //caso 2
        Paciente p1 = new Paciente("Hinata", "hinattinha123@gmail.com");
        Paciente p2 = new Paciente("Naruto", "narutinho@gmail.com");

        pacientes.add(p1);
        pacientes.add(p2);

        //caso3
        System.out.println("Nome do Paciente" + pacientes.get(0).getEmail());


        //caso4
        System.out.println(("Quantidade: " + pacientes.size()));
        for(Paciente paciente : pacientes){
            System.out.println("Paciente: " + paciente.getNome());
        }


    }
}
