public class Biblioteca {
    private String nome;
    private List<Livro> acervo;

    public Biblioteca(String nome, List<Livro> acervo) {
        this.nome = nome;
        this.acervo = acervo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Livro> getAcervo() {
        return acervo;
    }

    public void setAcervo(List<Livro> acervo) {
        this.acervo = acervo;
    }

    @Override
    public String toString() {
        return "Biblioteca: " + nome + ", Acervo: " + acervo;
    }
}