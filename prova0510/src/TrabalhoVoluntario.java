public class TrabalhoVoluntario {
    private String nomeProjeto;
    private String descricao;
    private String dataInicio;
    private String dataFim;
    private String tipoTrabalho;
    private int duracaoTrabalho;

    public TrabalhoVoluntario(String nomeProjeto, String descricao, String dataInicio, String dataFim, String tipoTrabalho, int duracaoTrabalho) {
        this.nomeProjeto = nomeProjeto;
        this.descricao = descricao;
        this.dataInicio = dataInicio;
        this.dataFim = dataFim;
        this.tipoTrabalho = tipoTrabalho;
        this.duracaoTrabalho = duracaoTrabalho;
    }

    // Getters e Setters
    // ...

    public boolean validaProjeto(String nomeProjeto) {
        return this.nomeProjeto.equals(nomeProjeto) && this.duracaoTrabalho > 2;
    }

    public String imprimeProjeto() {
        return "Nome do Projeto: " + nomeProjeto +
                "\nDescrição: " + descricao +
                "\nData de Início: " + dataInicio +
                "\nData de Fim: " + dataFim +
                "\nTipo de Trabalho: " + tipoTrabalho +
                "\nDuração do Trabalho (em horas): " + duracaoTrabalho;
    }

    public String getNomeProjeto() {
        return null;
    }
}
