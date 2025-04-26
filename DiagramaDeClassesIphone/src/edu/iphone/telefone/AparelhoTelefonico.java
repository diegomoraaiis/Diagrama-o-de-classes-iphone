package edu.iphone.telefone;

import java.util.Scanner;

import edu.iphone.internet.Chrome;
import edu.iphone.internet.NavegadorDeInternet;
import edu.iphone.internet.Safari;
import edu.iphone.musica.AppleMusic;
import edu.iphone.musica.ReprodutorMusical;
import edu.iphone.musica.Spotify;

public class  AparelhoTelefonico {
    static Scanner scanner = new Scanner (System.in);
    final String  numero = "4399867574";
    final String nome = "Dono";
    public static void main(String[] args) {
        NavegadorDeInternet navegadorChrome = new Chrome();
        NavegadorDeInternet navegadorSafari = new Safari();
        AppleMusic musicA = new AppleMusic();
        Spotify musicS = new Spotify();


        //Funções da internet
        navegadorChrome.adicionarNovaAba();
        //navegadorChrome.atualizarPagina();
        //navegadorChrome.exibirPagina();
        navegadorSafari.adicionarNovaAba();
        //navegadorSafari.atualizarPagina();
        //navegadorSafari.exibirPagina();

        //Funções da música
        musicA.SelecionarMusica();
        //musicA.tocar();
        //musicA.pausar();;
        //musicA.parar();
        musicS.SelecionarMusica();
        //musicS.tocar();
        //musicS.pausar();;
        //musicS.parar();


        //Funções do aparelho telefonico
        ligar();
        //atender();
        //iniciarCorreioDeVoz();

    }


    public static void ligar(){
        System.out.println("Digite o número que deseja ligar");
        String num = scanner.next();
        System.out.println("Ligando para o número..:"+num);
    }

    public static void atender(){
        System.out.println("Atendendo ligação.");
    }

    public static void iniciarCorreioDeVoz(){
        System.out.println("Iniciando correio de voz.");
    } 


}
