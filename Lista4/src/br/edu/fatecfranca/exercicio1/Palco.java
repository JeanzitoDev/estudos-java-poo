package br.edu.fatecfranca.exercicio1;

public class Palco {
    private Ator ator = new AtorFeliz();

    public void altera(){
        if (ator instanceof AtorFeliz){
            ator = new AtorTriste();
        }
        else{
            ator = new AtorFeliz();
        }
    }

    public void atuar(){
        this.ator.ato();
    }
}
