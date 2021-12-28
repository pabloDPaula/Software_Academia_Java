package Classes;

import java.sql.ResultSet;
import java.sql.SQLException;

public class Alunos {
    
    private String nome;
    private String modalidade;
    private String turno;
    private String dias;
    private String horario;
    private String turma;
    private String professor;
    private String situacao;
    private String dataNascimento;
    private String dataAdmissao;
   
    public String getNome() {
        return nome;
    }
   
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getModalidade() {
        return modalidade;
    }
    
    public void setModalidade(String modalidade) {
        this.modalidade = modalidade;
    }
  
    public String getTurno() {
        return turno;
    }
    
    public void setTurno(String turno) {
        this.turno = turno;
    }
   
    public String getDias() {
        return dias;
    }
    
    public void setDias(String dias) {
        this.dias = dias;
    }

    public String getHorario() {
        return horario;
    }
    
    public void setHorario(String horario) {
        this.horario = horario;
    }
    
    public String getTurma() {
        return turma;
    }
    
    public void setTurma(String turma) {
        this.turma = turma;
    }
   
    public String getProfessor() {
        return professor;
    }
    
    public void setProfessor(String professor) {
        this.professor = professor;
    }
   
    public String getSituacao() {
        return situacao;
    }
   
    public void setSituacao(String situacao) {
        this.situacao = situacao;
    }
   
    public String getDataNascimento() {
        return dataNascimento;
    }
  
    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }
   
    public String getDataAdmissao() {
        return dataAdmissao;
    }
   
    public void setDataAdmissao(String dataAdmissao) {
        this.dataAdmissao = dataAdmissao;
    }
    
     public void inserir()throws ClassNotFoundException, SQLException{
          ConexaoBD bd = new ConexaoBD();
          bd.conectar();
          bd.manipula("insert into alunos(nome,modalidade,turno,dias,horario,turma,professor,situacao,dataNascimento,"
         + "dataAdmissao) "+
          "values('"+this.nome+"','"+this.modalidade+"','"+this.turno+"','"+
this.dias+"','"+this.horario+"','"+this.turma+"','"+this.professor+"','"+this.situacao+"','"+this.dataNascimento+"','"+this.dataAdmissao+"');");
          bd.desconectar();
    }
         //Busca no banco de dados
    public ResultSet buscar() throws ClassNotFoundException, 
        SQLException{
        ConexaoBD bd = new ConexaoBD();
        bd.conectar();
        ResultSet rs = bd.executar("SELECT * FROM alunos;");
        return rs;
    }
       //busca por nome
    public ResultSet buscarMatricula(String aux) throws
        ClassNotFoundException, SQLException{
        ConexaoBD bd = new ConexaoBD();
        bd.conectar();
        ResultSet rs = bd.executar("SELECT * FROM alunos"
                + " WHERE matricula="+aux+";");
        return rs;
    }
     public void alterar(String aux)throws ClassNotFoundException, SQLException{
          ConexaoBD bd = new ConexaoBD();
          bd.conectar();
          bd.manipula("UPDATE alunos SET nome ='"+this.nome+"',modalidade='"+
this.modalidade+"',turno ='"+this.turno+"',dias='"+this.dias+"',horario='"+this.horario+"',turma='"+this.turma+"',professor='"+this.professor+"',situacao='"+this.situacao+"',dataNascimento='"+this.dataNascimento+"',dataAdmissao='"+this.dataAdmissao+"' WHERE matricula="+aux+";");
          bd.desconectar();
    }
      public void excluir(String aux)throws ClassNotFoundException, SQLException{
          ConexaoBD bd = new ConexaoBD();
          bd.conectar();
          bd.manipula("delete from  alunos where matricula="+aux+";");
          bd.desconectar();
    }
        public ResultSet selecionarAluno() throws
            ClassNotFoundException, SQLException{
        ConexaoBD bd = new ConexaoBD();
        bd.conectar();
        ResultSet rs = bd.executar("SELECT * FROM alunos"
                + " order by matricula ASC;");
        return rs;
    }
    
}
