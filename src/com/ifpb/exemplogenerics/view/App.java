package com.ifpb.exemplogenerics.view;

import com.ifpb.exemplogenerics.control.CadastroGenerico;
import com.ifpb.exemplogenerics.model.Aluno;

public class App {

    public static void main(String[] args) {

        CadastroGenerico<? super Aluno> cadastro = new CadastroGenerico<>();

        CadastroGenerico<Aluno> cadastroAluno = new CadastroGenerico<>();

        CadastroGenerico<Object> cadastroPessoa = new CadastroGenerico<>();

        cadastro = cadastroPessoa;



    }

}
