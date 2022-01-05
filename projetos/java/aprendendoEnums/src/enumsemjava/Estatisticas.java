package enumsemjava;

public enum Estatisticas {
    OPEN(11,"abrir"),//isso serve pra depois usar o método construtor//pois ele passa os parametros no metodo construtor
    CLOSE(12,"fechar");//você é quem nomeia e cria quantos desses métodos você quiser é só colocar os nome(parametro) criar metodo construtor e os gets
    
    private int cod;
    private String texto;
    
    Estatisticas(final int cod,final String texto){
        this.cod=cod;
        this.texto=texto;
    }
    public String getTexto(){
        return texto;
    }
    public int getCod(){
        return cod;
    }
    
}
