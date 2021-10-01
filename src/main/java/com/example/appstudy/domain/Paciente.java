package com.example.appstudy.domain;

public class Paciente {
    private String nome ;
    private String email;
    private String altura;
    private String peso;
    private String idade;
    private String cidade;
    private String[] exames;

    public Paciente(String nome, String email) {
        this.nome = nome;
        this.email = email;
        this.altura = altura;
        this.peso = peso;
        this.idade = idade;
        this.cidade = cidade;
        this.exames = exames;
    }

    //public void impressao(){
    //    System.out.println(this);

    //    System.out.println("exames");
    //    for(String disc : exames){
    //        System.out.println("- " + disc);
    //    }
   // }

   // @Override
  //  public String toString(){
   //     return String.format("Paciente [%s] do email %s cuja a idade é  %s  da cidade deseja marcar o exame %d exames\n",
   //             nome, email, idade, exames.length
   //     );


  //  }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAltura() {
        return altura;
    }

    public void setAltura(String altura) {
        this.altura = altura;
    }

    public String getPeso() {
        return peso;
    }

    public void setPeso(String peso) {
        this.peso = peso;
    }

    public String getIdade() {
        return idade;
    }

    public void setIdade(String idade) {
        this.idade = idade;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String[] getExames() {
        return exames;
    }

    public void setExames(String[] exames) {
        this.exames = exames;
    }
}
