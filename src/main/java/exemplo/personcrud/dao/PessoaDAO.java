package exemplo.personcrud.dao;

import exemplo.personcrud.model.Pessoa;

/**
 * Interface que define as operações de acesso aos dados de pessoas usando o padrão DAO (data access object).
 */
public interface PessoaDAO {

    /***
     * Insere uma pessoa no banco de dados
     * @param pessoa - Pessoa a ser inserida no banco de dados
     */
    void inserirPessoa(Pessoa pessoa) throws Exception;

    /**
     * Busca uma pessoa pelo seu CPF.
     *
     * @param cpf - cpf da pessoa a ser buscada
     */
    Pessoa buscarPessoas(String cpf) throws Exception;

}
