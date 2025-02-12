package POO.exercicios.ARRAYS.Carro;

public class Carro {

    private String marca;
    private String modelo;
    private int ano;

    public Carro(){
        this.marca="indefinido";
        this.modelo="indefinido";
        this.ano=0;
    }

    public void setMarca(String marca){
        this.marca=marca;
    }
    public String getMarca(){
        return marca.toUpperCase();
    }
    public void setModelo(String modelo){
        this.modelo=modelo;
    }
    public String getModelo(){
        return modelo.toUpperCase();
    }
    public void setAno(int ano){
        this.ano=ano;
    }
    public int getAno(){
        return ano;
    }
    public void exibirInfo(){
        System.out.println("-------------informações do carro---------------");
        System.out.println("marca: "+getMarca());
        System.out.println("modelo: "+getModelo());
        System.out.println("Ano: "+getAno());
        System.out.println("--------------------------------------------------------");

    }
}
