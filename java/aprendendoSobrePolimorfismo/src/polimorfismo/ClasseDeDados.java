package polimorfismo;

public class ClasseDeDados {
    public int ard;
    public byte ord;
    public long ddn;
    public String variaveis;

    public String getVariaveis() {
        return variaveis;
    }

    public void setVariaveis(String variaveis){ 
       //polimorfismo é isso um metodo que pode ter varios metodos dentro dele
        if(variaveis.isEmpty()||variaveis==null||variaveis.length()<0){
           this.variaveis="sem dados";
        }else{
          this.variaveis = variaveis; 
        }
    }
    
    public int getArd() {
        return ard;
    }

    public void setArd(int ard) {
        if(ard<=0){
            throw new RuntimeException("a variavel não pode ser menor ou igual a 0");
        }
        this.ard = ard;
    }

    public byte getOrd() {
        return ord;
    }

    public void setOrd(byte ord) {
        this.ord = ord;
    }

    public long getDdn() {
        return ddn;
    }

    public void setDdn(long ddn) {
        this.ddn = ddn;
    }
    
}
