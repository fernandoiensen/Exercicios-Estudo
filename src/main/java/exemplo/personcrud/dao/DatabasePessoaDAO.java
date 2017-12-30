package exemplo.personcrud.dao;

import exemplo.personcrud.model.Pessoa;

import java.sql.*;

/**
 * Implementação da interface {@link PessoaDAO}, realizando o acesso ao dados de pessoas de um banco de dados.
 */
public class DatabasePessoaDAO implements PessoaDAO {


    private Connection getConnection() throws SQLException {
        String url = DatabaseInfo.JDBC_URL;
        return DriverManager.getConnection(url, DatabaseInfo.USER, "");
    }

    @Override
    public void inserirPessoa(Pessoa pessoa) throws Exception {
        // Insert SQL que será executado no banco de dados
        String insertSQL = "INSERT INTO PESSOAS (nome, data_nascimento, cpf) VALUES (?, ?, ?)";

        Connection connection = null;
        PreparedStatement preparedStatement = null;
        try {
            // convertendo o tipo de data de nascimento (java.util.Date) para o tipo de data do banco de dados (java.sql.Date)
            Date dataNascimento = new Date(pessoa.getDataNascimento().getTime());
            // iniciando a conexão com o banco de dados
            connection = getConnection();
            // preparando o objeto que executará a inserção no banco de dados
            preparedStatement = connection.prepareStatement(insertSQL);
            // Substituindo o '?' no insertSQL pelos parâmetros do objeto da pessoa a ser inserido
            preparedStatement.setString(1, pessoa.getNome());
            preparedStatement.setDate(2, dataNascimento);
            preparedStatement.setString(3, pessoa.getCpf());
            // executa a inserção no banco de dados
            preparedStatement.execute();
        } finally {
            // encerrando a conexão com o banco de dados
            if (connection != null) {
                connection.close();
            }
            if (preparedStatement != null) {
                preparedStatement.close();
            }
        }
    }

    @Override
    public Pessoa buscarPessoas(String cpf) throws Exception {
        // Consulta sql que busca os dados de uma pessoa pelo seu CPF
        String querySQL = "SELECT nome, data_nascimento, cpf FROM PESSOAS WHERE cpf = ?";

        Connection connection = null;
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;
        try {
            // iniciando a conexão com o banco de dados
            connection = getConnection();
            // preparando o objeto que executará a busca no banco de dados
            preparedStatement = connection.prepareStatement(querySQL);
            // Substituindo o '?' no querySQL pelo cpf recebido
            preparedStatement.setString(1, cpf);
            // executa a consulta no banco de dados
            resultSet = preparedStatement.executeQuery();

            // Pegando o resultado da consulta para montar a pessoa resultada
            if (resultSet.next()) {
                // Coletando os dados pelas colunas do resultado
                String nome = resultSet.getString("nome");
                Date dataNascimento = resultSet.getDate("data_nascimento");

                Pessoa pessoa = new Pessoa(nome, dataNascimento, cpf);
                return pessoa;
            }

        } finally {
            // encerrando a conexão com o banco de dados
            if (connection != null) {
                connection.close();
            }
            if (resultSet != null) {
                resultSet.close();
            }
            if (preparedStatement != null) {
                preparedStatement.close();
            }
        }

        // Retorna nulo caso não encontre nada
        return null;
    }
}
