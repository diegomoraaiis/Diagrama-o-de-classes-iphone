package edu.iphone.musica;

public class Spotify implements ReprodutorMusical{
    public void SelecionarMusica(){
        System.out.println("Selecionando música no spotify!");
    }
    public  void tocar(){
        System.out.println("Tocando música no spotify!");
    }
    public  void pausar(){
        System.out.println("Música Pausada no spotify!");
    }
    public void parar(){
        System.out.println("Parando música no spotify!");
    }

}
