import enums.Dipartimenti;
import esercizi.Dipendente;

public class Main {
    public static void main(String[] args) {

        Dipendente Mari = new Dipendente(Dipartimenti.PRODUZIONE);
        Dipendente Fra = new Dipendente(Dipartimenti.VENDITE);
        Dipendente Luca = new Dipendente(Dipartimenti.AMMINISTRAZIONE);

        Dipendente[] listaDipendenti = {Mari, Fra, Luca};


        for (int i = 0; i < listaDipendenti.length; i++) {
            Dipendente dipendente = listaDipendenti[i];
            System.out.println(dipendente.getMatricola());
        }
    }
}