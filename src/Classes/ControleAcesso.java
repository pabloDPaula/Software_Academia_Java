package Classes;

import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;


public class ControleAcesso {
    private String entrada;
    private Date saida;

    public String getEntrada() {
        return entrada;
    }

    public void setEntrada(String entrada) {
        this.entrada = entrada;
    }

    public Date getSaida() {
        return saida;
    }

    public void setSaida(Date saida) {
        this.saida = saida;
    }
    
    public void inserir()throws ClassNotFoundException, SQLException{
          ConexaoBD bd = new ConexaoBD();
          bd.conectar();
          bd.manipula("insert into controleAcesso(entrada) "+     
          "values('"+this.entrada+"');");
          bd.desconectar();
    }
     public ResultSet buscar() throws ClassNotFoundException, 
        SQLException{
        ConexaoBD bd = new ConexaoBD();
        bd.conectar();
        ResultSet rs = bd.executar("SELECT * FROM controleAcesso;");
        return rs;
    }
    
}
