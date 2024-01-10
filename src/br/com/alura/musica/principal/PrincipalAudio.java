package br.com.alura.musica.principal;

import br.com.alura.musica.modelos.MinhasPreferidas;
import br.com.alura.musica.modelos.Musica;
import br.com.alura.musica.modelos.Podcast;

public class PrincipalAudio {
    public static void main(String[] args) {
        Musica mymusic = new Musica();
        mymusic.setTitulo("Segura o Tchan!");
        mymusic.setHost("É o Tchan");

        for (int i = 0; i < 100; i++){
            mymusic.reproduz();

        }
        for (int i = 0; i < 50; i++){
            mymusic.curte();
        }

        Podcast mypodcast = new Podcast();
        mypodcast.setTitulo("Como quitar suas dividas");
        mypodcast.setApresentador("Eduardo x");
        mypodcast.setCanal("Primo pobre");

        for (int i = 0; i < 50; i++){
            mypodcast.reproduz();

        }
        for (int i = 0; i < 15; i++){
            mypodcast.curte();
        }
        MinhasPreferidas preferidas = new MinhasPreferidas();
        preferidas.inclui(mymusic);
        preferidas.inclui(mypodcast);
    }
}
