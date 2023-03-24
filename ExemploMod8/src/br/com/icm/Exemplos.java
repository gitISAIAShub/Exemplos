package br.com.icm;

public class Exemplos {

    private int codigo = 1;
    private long codigoMaior = 204050;
    private float valorDecimal = 10.1f;
    private double valorDecimal1=10.1;
    private boolean status=false;
    private String texto="qualquer texto";
    private short shor;
    private byte bi;

    public Exemplos(int val){

    }

    public String retornarTexto(){
        this.codigo = 0;
        return "qualuqer texto";
    }
    public int retonarInteiro(){
        int val = 10;
        return val;
    }
    public long retornarLong(long num){
        return num;
    }

}
