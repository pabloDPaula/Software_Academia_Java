package Classes;

import java.sql.*;
public class ConexaoBD {

    // declaração de variavel
    private String url;
    private Connection conexao;
    private Statement stm;
    private String usuario;
    private String senha;

    // método que traz o endereco do banco de dado
    public ConexaoBD() throws ClassNotFoundException{
       Class.forName( "com.mysql.cj.jdbc.Driver");
        this.url = "jdbc:mysql://localhost:3306/academia";
        this.usuario="root";
        this.senha="root";
        this.conexao = null;
    }

    // método que se conectar com o banco de dado
    public void conectar() throws SQLException{
        this.conexao = DriverManager.getConnection(url,usuario,senha);
    }

    //Executa uma consulta
    public ResultSet executar(String sql) throws SQLException{
        this.stm = conexao.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,
                                           ResultSet.CONCUR_UPDATABLE);
        return stm.executeQuery(sql);
    }

    //executa uma insercao ou exclusao ou modificacao
    public void manipula(String sql) throws SQLException{
        this.stm = conexao.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,
                                           ResultSet.CONCUR_UPDATABLE);
        this.stm.executeUpdate(sql);
    }

    // desconectar o banco de dado
    public void desconectar() throws SQLException{
        this.stm.close();
        this.conexao.close();
    }
}