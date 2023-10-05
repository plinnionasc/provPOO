class DistribuicaoAlimento {
    private String nomeProjeto;
    private String descricao;
    private String dataInicio;
    private String dataFim;
    private String descAlimento;
    private int qtde;

    public DistribuicaoAlimento(String nomeProjeto, String descricao, String dataInicio, String dataFim, String descAlimento, int qtde) {
        this.nomeProjeto = nomeProjeto;
        this.descricao = descricao;
        this.dataInicio = dataInicio;
        this.dataFim = dataFim;
        this.descAlimento = descAlimento;
        this.qtde = qtde;
    }

    // Getters e Setters
    // ...

    public boolean validaProjeto(String nomeProjeto) {
        return this.nomeProjeto.equals(nomeProjeto) && this.dataFim.isEmpty();
    }

    public String imprimeProjeto() {
        return "Nome do Projeto: " + nomeProjeto +
                "\nDescrição: " + descricao +
                "\nData de Início: " + dataInicio +
                "\nData de Fim: " + dataFim +
                "\nDescrição do Alimento: " + descAlimento +
                "\nQuantidade: " + qtde;
    }

    public String getNomeProjeto() {
        return null;
    }
}

