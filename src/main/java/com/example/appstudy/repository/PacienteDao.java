package com.example.appstudy.repository;

import com.example.appstudy.domain.Paciente;

import java.util.ArrayList;
import java.util.List;

public class PacienteDao {

    private static List<Paciente> pacientes = new ArrayList<Paciente>();

    //incluir paciente
    public  static  void incluir(Paciente paciente){
        pacientes.add(paciente);
    }


    //obterlista de paciente
    public static List<Paciente> obterLista(){
        return pacientes;
    }

    public static Paciente validar(String email, String senha) {

        if(email.equals(senha)){

            return new Paciente("Naruto Uzumaki", email);

        }
        return null;

    }

}
