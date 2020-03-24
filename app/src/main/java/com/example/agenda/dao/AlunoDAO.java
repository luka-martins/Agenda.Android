package com.example.agenda.dao;

import com.example.agenda.model.Aluno;

import java.util.ArrayList;
import java.util.List;

public class AlunoDAO {

    private final List<Aluno> alunos = new ArrayList();
    public List<Aluno> todos(){
        return new ArrayList<>(alunos);
    }

    public void salva(Aluno aluno) {
        alunos.add(aluno);
    }

}
