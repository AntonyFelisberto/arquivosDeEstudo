package DAO;
import java.sql.Connection;
import java.sql.DriverManager;

public class Conexao {
    public Connection getConexao(){
        try{
           return DriverManager.getConnection("jdbc:mysql://localhost/uni_4semestre","root","");
        }catch(Exception erro){
            throw new RuntimeException("Erro Conexão: "+erro);
        }
    }
}
