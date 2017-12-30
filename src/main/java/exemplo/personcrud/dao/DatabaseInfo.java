package exemplo.personcrud.dao;

public class DatabaseInfo {

    // Ip da máquina do banco de dados
    public static final String HOSTNAME = "192.168.99.100";

    // Porta do banco de dados
    public static final int PORT = 32770;

    // Usuario de acesso ao banco de dados
    public static final String USER = "root";

    public static final String SCHEMA = "db_teste";

    // URL de conexão com o banco de dados
    public static final String JDBC_URL = "jdbc:mysql://" + HOSTNAME + ":" + PORT + "/" + SCHEMA;
}
