package exemplo.personcrud.app;

import exemplo.personcrud.dao.DatabasePessoaDAO;
import exemplo.personcrud.dao.PessoaDAO;
import exemplo.personcrud.model.Pessoa;

import java.util.Date;

public class TesteDatabase {

    public static void main(String[] args) throws Exception {
        String cpf = "0101010101";
        Pessoa pessoa = new Pessoa("Joao", new Date(), cpf);

        DatabasePessoaDAO dao = new DatabasePessoaDAO();
        System.out.println("Inserindo Pessoa");
        dao.inserirPessoa(pessoa);
        System.out.println("Pessoa inserida com sucesso");

        System.out.println("Buscando a pessoa inserida no banco de dados");
        Pessoa pessoaBD = dao.buscarPessoas(cpf);
        System.out.println("Pessoa buscada com sucesso: ");
        System.out.println(pessoaBD);

    }

}
