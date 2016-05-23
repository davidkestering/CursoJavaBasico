package com.davidkestering.cursojava.aula52exercicios;

/**
 * Created by seduc on 23/05/2016.
 */
public class AgendaCheiaException extends Exception {
    @Override
    public String getMessage() {
        return "Agenda já está cheia!";
    }
}
