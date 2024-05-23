public class Palestrante {
    private String CPF;
    private String nome;
    private String areaEspecializacao;

    public Palestrante(String CPF, String nome, String areaEspecializacao) {
        this.CPF = CPF;
        this.nome = nome;
        this.areaEspecializacao = areaEspecializacao;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getAreaEspecializacao() {
        return areaEspecializacao;
    }

    public void setAreaEspecializacao(String areaEspecializacao) {
        this.areaEspecializacao = areaEspecializacao;
    }
}
