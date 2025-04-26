package edu.iphone.musica;

public class AppleMusic implements ReprodutorMusical {
    public void SelecionarMusica(){
        System.out.println("Selecionando música no Apple music!");
    }
    public  void tocar(){
        System.out.println("Tocando música no Apple music!");
    }
    public  void pausar(){
        System.out.println("Música Pausada no Apple music!");
    }
    public void parar(){
        System.out.println("Parando música no Apple music!");
    }
}
