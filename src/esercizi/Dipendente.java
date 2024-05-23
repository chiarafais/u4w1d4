package esercizi;

import enums.Dipartimenti;

import java.util.Random;

public class Dipendente {


    protected int matricola;
    protected int  stipendio;
    protected Dipartimenti dipartimento;


    public Dipendente(Dipartimenti dipartimento) {
        Random rndm = new Random();
        this.matricola = rndm.nextInt(1000, 5000);
        this.stipendio = 1000;
        this.dipartimento = dipartimento;

    }


    public void setDipartimento(Dipartimenti dipartimento) {
        this.dipartimento = dipartimento;
    }

    public int getStipendio() {
        return stipendio;
    }

    public Dipartimenti getDipartimento() {
        return dipartimento;
    }

    public int getMatricola() {
        return matricola;
    }
}
