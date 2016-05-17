package com.davidkestering.cursojava.aula45;

import com.davidkestering.cursojava.aula42.*;

/**
 * Created by seduc on 17/05/2016.
 */
public class Teste {
    public static void main(String[] args){
        /*Aluno aluno = new Aluno();
        Pessoa pessoaAluno = aluno; //upcasting uma classe menor em um tipo de classe maior

        Pessoa aluno2 = (Pessoa) new Aluno(); //mesma coisa que upcasting

        Pessoa aluno3 = new Pessoa();
        Aluno aluno4 = (Aluno) aluno3; //downcast*/

        Pessoa pessoa = new Pessoa();
        Aluno aluno = new Aluno();
        Professor professor = new Professor();

        if(pessoa instanceof Pessoa){
            System.out.println("É do tipo Pessoa");
        }

        if(aluno instanceof Aluno){
            System.out.println("É do tipo Aluno");
        }

        if(professor instanceof Professor){
            System.out.println("É do tipo Professor");
        }


    }
}
