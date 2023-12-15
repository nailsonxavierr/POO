public class Emprestimo {
    private Livro livro;
    private Cliente cliente;
    private Date dataEmprestimo;

    public Emprestimo(Livro livro, Cliente cliente, Date dataEmprestimo) {
        this.livro = livro;
        this.cliente = cliente;
        this.dataEmprestimo = dataEmprestimo;
    }

    public Livro getLivro() {
        return livro;
    }

    public void setLivro(Livro livro) {
        this.livro = livro;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Date getDataEmprestimo() {
        return dataEmprestimo;
    }

    public void setDataEmprestimo(Date dataEmprestimo) {
        this.dataEmprestimo = dataEmprestimo;
    }

    @Override
    public String toString() {
        return "Empréstimo de " + livro + " para " + cliente + ", Data de Empréstimo: " + dataEmprestimo;
    }
}
