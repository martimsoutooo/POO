package aula08.exercicio1;



public class veiculoMain {
    public static void main(String[] args) {
        EmpresaAlg espamatrincana = new EmpresaAlg("Espa Matrincana", 1234, "espamatrincana@gmail.com");
        Veiculo carrolindo = new Taxi("FE-52-00", "Toyota", "Corolla", 215, 1, 50, 191327);
        Veiculo carrolindo2 = new Ligeiro("SE-34-OO", "Porsche", "911 Turbo", 615, 2, 25);
        Veiculo carrolindo3 = new PesadoM("CD-22-CF", "Scannia", "Lion", 125, 3, 4000, 500);
        Veiculo carrolindo4 = new PesadoP("AA-00-AA", "Mercedes", "EOS", 347, 4, 4000, 120);
        VeiculoEletrico carrolindo5 = new LigeiroEle("AB-15-FR", "Tesla", "Model X", 700, 7, 500,75,50 );
        espamatrincana.addVeiculo(carrolindo);
        espamatrincana.addVeiculo(carrolindo2);
        espamatrincana.addVeiculo(carrolindo3);
        espamatrincana.addVeiculo(carrolindo4);
        System.out.println(espamatrincana);
        System.out.println(carrolindo);
        System.out.println(carrolindo2);
        System.out.println(carrolindo3);
        System.out.println(carrolindo4);
        carrolindo4.setMarca("BMW");
        carrolindo4.setModelo("M5");
        carrolindo4.setPotencia(500);
        System.out.println(carrolindo4);

        System.out.println(carrolindo4.distanciaTotal());
        System.out.println(espamatrincana.getNome());
        carrolindo.trajeto(600);
        System.out.println(carrolindo.ultimoTrajeto());
        carrolindo.trajeto(247);
        System.out.println(carrolindo.distanciaTotal());

        carrolindo5.trajeto(200);
        System.out.println(carrolindo5);

        carrolindo5.carregar(100);
        System.out.println(carrolindo5);


    }
}

