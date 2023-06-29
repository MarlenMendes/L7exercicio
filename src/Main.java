public class Main {

    public static void main(String[] args) {
        Pais brasil = new Pais("BRA", "Brasil", 8515767.049);
        Pais argentina = new Pais("ARG", "Argentina", 2780400);
        Pais uruguai = new Pais("URY", "Uruguai", 176215);

        brasil.setPopulacao(193946886);
        brasil.adicionarVizinho(argentina);
        brasil.adicionarVizinho(uruguai);

        argentina.adicionarVizinho(brasil);
        argentina.adicionarVizinho(uruguai);

        uruguai.adicionarVizinho(brasil);
        uruguai.adicionarVizinho(argentina);

        System.out.println("Vizinhos comuns entre Brasil e Argentina:");
        for (Pais pais : brasil.getVizinhosComuns(argentina)) {
            System.out.println(pais.getNome());
        }

        System.out.println("Densidade populacional do Brasil: " + brasil.calcularDensidadePopulacional() + " hab/km^2");
    }
}