package Classes;

import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author alunov
 */
public class ControleFinanceiro {

    /**
     * @return the codMatricula
     */
    public int getCodMatricula() {
        return codMatricula;
    }

    /**
     * @param codMatricula the codMatricula to set
     */
    public void setCodMatricula(int codMatricula) {
        this.codMatricula = codMatricula;
    }
    private String planoMensalidade;
    private float valorMensalidade;     
    private String dataVencimento;
    private String avisoPendencia;
    private String formaPagamento;
    private String situacaoPagamento;
    public String dataPagamento;
    private float valorPago;
    private int codMatricula;
    public String getPlanoMensalidade() {
        return planoMensalidade;
    }

    public void setPlanoMensalidade(String planoMensalidade) {
        this.planoMensalidade = planoMensalidade;
    }

    public float getValorMensalidade() {
        return valorMensalidade;
    }

    public void setValorMensalidade(float valorMensalidade) {
        this.valorMensalidade = valorMensalidade;
    }

    public String getDataVencimento() {
        return dataVencimento;
    }

    public void setDataVencimento(String dataVencimento) {
        this.dataVencimento = dataVencimento;
    }

    public String getAvisoPendencia() {
        return avisoPendencia;
    }

    public void setAvisoPendencia(String avisoPendencia) {
        this.avisoPendencia = avisoPendencia;
    }

    public String getFormaPagamento() {
        return formaPagamento;
    }

    public void setFormaPagamento(String formaPagamento) {
        this.formaPagamento = formaPagamento;
    }

    public String getSituacaoPagamento() {
        return situacaoPagamento;
    }

    public void setSituacaoPagamento(String situacaoPagamento) {
        this.situacaoPagamento = situacaoPagamento;
    }

    public String getDataPagamento() {
        return dataPagamento;
    }

    public void setDataPagamento(String dataPagamento) {
        this.dataPagamento = dataPagamento;
    }

    public float getValorPago() {
        return valorPago;
    }

    public void setValorPago(float valorPago) {
        this.valorPago = valorPago;
    }
    public void inserir()throws ClassNotFoundException, SQLException{
          ConexaoBD bd = new ConexaoBD();
          bd.conectar();
          bd.manipula("insert into ControleFinanceiro(planoMensalidade,valorMensalidade,dataVencimento,avisoPendencia,formaPagamento,situacaoPagamento,dataPagamento,codMatricula,"
         + "valorPago) "+
          "values('"+this.planoMensalidade+"','"+this.valorMensalidade+"','"+
this.dataVencimento+"','"+this.avisoPendencia+"','"+this.formaPagamento+"','"+this.situacaoPagamento+"','"+this.dataPagamento+"',"+this.getCodMatricula()+",'"+this.valorPago+"');");
          bd.desconectar();
    }
          public void alterar(String aux)throws ClassNotFoundException, SQLException{
          ConexaoBD bd = new ConexaoBD();
          bd.conectar();
          bd.manipula("UPDATE controleFinanceiro SET planoMensalidade ='"+this.planoMensalidade+"',valorMensalidade='"+
this.valorMensalidade+"',dataVencimento='"+this.dataVencimento+"',avisoPendencia='"+this.avisoPendencia+"',formaPagamento='"+this.formaPagamento+"',situacaoPagamento='"+this.situacaoPagamento+"',dataPagamento='"+this.dataPagamento+"',valorPago='"+this.valorPago+"' WHERE dataPagamento='"+aux+"';");
          bd.desconectar();
    }
     public ResultSet buscar() throws ClassNotFoundException, 
        SQLException{
        ConexaoBD bd = new ConexaoBD();
        bd.conectar();
        ResultSet rs = bd.executar("SELECT * FROM controleFinanceiro;");
        return rs;
    }
      public ResultSet buscarControle(String aux) throws
        ClassNotFoundException, SQLException{
        ConexaoBD bd = new ConexaoBD();
        bd.conectar();
        ResultSet rs = bd.executar("SELECT * FROM controleFinanceiro"
                + " WHERE codMatricula="+aux+";");
        return rs;
    }
    
      public void excluir(String aux)throws ClassNotFoundException, SQLException{
          ConexaoBD bd = new ConexaoBD();
          bd.conectar();
          bd.manipula("delete from  controleFinanceiro where codMatricula="+aux+";");
          bd.desconectar();
    }
    public void excluirCF(String aux, String aux2) throws ClassNotFoundException, SQLException {
        ConexaoBD bd = new ConexaoBD();
        bd.conectar();
        bd.manipula("delete from  controleFinanceiro where codMatricula=" + aux + " and  dataPagamento='" + aux2 + "';");
        bd.desconectar();
    }
      public ResultSet selecionarData(String aux) throws
            ClassNotFoundException, SQLException{
        ConexaoBD bd = new ConexaoBD();
        bd.conectar();
        ResultSet rs = bd.executar("SELECT * FROM controleFinanceiro" 
                + " WHERE dataPagamento='"+aux+"';");
        return rs;
    }

}
