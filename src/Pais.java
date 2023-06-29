import java.util.*;

public class Pais {

    private String codigoIso; // ISO 3166-1
    private String nome;
    private long populacao;
    private double dimensao; // em Km^2
    private List<Pais> vizinhos; // lista de países vizinhos

    // Construtor
    public Pais(String codigoIso, String nome, double dimensao) {
        this.codigoIso = codigoIso;
        this.nome = nome;
        this.dimensao = dimensao;
        this.vizinhos = new ArrayList<>(); // inicializa a lista de vizinhos
    }

    // Getters e setters
    public String getCodigoIso() {
        return codigoIso;
    }

    public void setCodigoIso(String codigoIso) {
        this.codigoIso = codigoIso;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public long getPopulacao() {
        return populacao;
    }

    public void setPopulacao(long populacao) {
        this.populacao = populacao;
    }

    public double getDimensao() {
        return dimensao;
    }

    public void setDimensao(double dimensao) {
        this.dimensao = dimensao;
    }

    public List<Pais> getVizinhos() {
        return vizinhos;
    }

    // Método para adicionar um país vizinho à lista
    public void adicionarVizinho(Pais pais) {
        if (!this.vizinhos.contains(pais)) {
            this.vizinhos.add(pais);
        }
    }

    // Método para verificar se um país é vizinho
    public boolean isVizinho(Pais pais) {
        return this.vizinhos.contains(pais);
    }

    // Método para calcular a densidade populacional
    public double calcularDensidadePopulacional() {
        if (this.dimensao == 0) {
            return 0; // Evita divisão por zero
        }
        return this.populacao / this.dimensao;
    }

    // Método que retorna a lista de vizinhos comuns entre este país e outro
    public List<Pais> getVizinhosComuns(Pais outroPais) {
        List<Pais> vizinhosComuns = new ArrayList<>();
        for (Pais vizinho : this.vizinhos) {
            if (outroPais.isVizinho(vizinho)) {
                vizinhosComuns.add(vizinho);
            }
        }
        return vizinhosComuns;
    }
}