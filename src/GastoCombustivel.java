public class GastoCombustivel {

    public static void main(String[] args) {
//      Dados de entrada
        String modeloDoCarro = "Monza";
        byte autonomiaDoVeiculo = 12;
        int distanciaDaViagem = 350;
        double precoDoCombustivel = 5.49;

//        Processamento dos dados - Calcular
        double quantidadeDeCombustivel = distanciaDaViagem/autonomiaDoVeiculo;
        double valorDaViagem = (distanciaDaViagem / autonomiaDoVeiculo) * precoDoCombustivel;

        System.out.println("-------------------------------");
        System.out.println("    CONSUMO DE COMBUSTÍVEL");
        System.out.println("-------------------------------");
        System.out.println("Modelo do carro? " + modeloDoCarro);
        System.out.println("Autonomia do carro? " + autonomiaDoVeiculo);
        System.out.println("Distância da viagem? " + distanciaDaViagem);
        System.out.println("Preço do combustível? " + precoDoCombustivel);

        System.out.println("");

        System.out.println("-------------------------------");
        System.out.println("      R E S U L T A D O");
        System.out.println("-------------------------------");
        System.out.println("Modelo do veículo: " + modeloDoCarro);
        System.out.println("Autonomia do veículo: " + autonomiaDoVeiculo + "Km/l");
        System.out.println("Distância percorrida: " + distanciaDaViagem + "Km");
        System.out.println("Valor do combustível: " + "R$" + precoDoCombustivel);

        System.out.println("");


        System.out.println("-------------------------------");
        System.out.println("Quantidade de combustível utilizado: " + quantidadeDeCombustivel + "l" );
        System.out.println("Total gasto com a viagem: R$" + valorDaViagem);



    }
}
