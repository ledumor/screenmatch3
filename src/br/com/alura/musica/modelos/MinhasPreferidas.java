package br.com.alura.musica.modelos;

public class MinhasPreferidas {

    public void inclui(Audio audio) {
    if (audio.getClassificacao() >= 9 ){
        System.out.println(audio.getTitulo() + " é nota 10");
    }else {
        System.out.println(audio.getTitulo() + "não é nota 10");
    }
    }
}
