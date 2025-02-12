package POO.exercicios.ARRAYS.Carro;

import java.util.Scanner;

public class Main {

    public static void main(String[]args){

        Scanner scanner=new Scanner(System.in);
        Carro[] carros=new Carro[4];
        for(int i=0;i< carros.length;i++){
            Carro car=new Carro();
            System.out.println("------------CARRO:"+(i+1)+"--------------");
            System.out.println("digite a marca do carro:");
            car.setMarca(scanner.nextLine());
            System.out.println("digite o modelo:");
            car.setModelo(scanner.nextLine());
            System.out.println("agora digite o ano:");
            while(!scanner.hasNextInt()){
                System.out.println("por favor digite um ano valido");
                 scanner.next();
            }
            car.setAno(scanner.nextInt());
            scanner.nextLine();
            carros[i]=car;
        }
        for(int i=0;i<carros.length;i++){
            carros[i].exibirInfo();
        }



    }
}
