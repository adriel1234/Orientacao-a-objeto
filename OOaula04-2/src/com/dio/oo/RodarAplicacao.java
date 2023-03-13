package com.dio.oo;

public class RodarAplicacao {
    public static void main(String[] args) {

        Funcionario funcionario = new Funcionario();

        // upcast
        Funcionario gerente = new Gerente();
        Funcionario vendendor = new Vendendor();
        Funcionario faxineiro = new Faxineiro();

        //downCast
        Vendendor vendendor_ = (Vendendor) new Funcionario();

    }
}
