import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Autor autor1 = new Autor("George Orwell", "Inglaterra");
        Livro livro1 = new Livro("1984", 1949, autor1);

        Autor autor2 = new Autor("Gabriel Garcia Marquez", "Colômbia");
        Livro livro2 = new Livro("Cem Anos de Solidão", 1967, autor2);

        Cliente cliente1 = new Cliente("João", 25);
        Cliente cliente2 = new Cliente("Maria", 30);

        Date dataEmprestimo = new Date();
        Emprestimo emprestimo1 = new Emprestimo(livro1, cliente1, dataEmprestimo);
        Emprestimo emprestimo2 = new Emprestimo(livro2, cliente2, dataEmprestimo);

        List<Livro> acervoBiblioteca = new ArrayList<>();
        acervoBiblioteca.add(livro1);
        acervoBiblioteca.add(livro2);

        Biblioteca biblioteca = new Biblioteca("Biblioteca Central", acervoBiblioteca);

        System.out.println(autor1);
        System.out.println(livro1);
        System.out.println(cliente1);
        System.out.println(emprestimo1);
        System.out.println(biblioteca);

        autor1.setNacionalidade("Reino Unido");
        livro1.setAnoPublicacao(1950);
        cliente1.setIdade(26);

        System.out.println(autor1);
        System.out.println(livro1);
        System.out.println(cliente1);
        System.out.println(emprestimo1);
        System.out.println(biblioteca);
    }
}
