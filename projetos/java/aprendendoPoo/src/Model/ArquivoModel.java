package Model;

import java.util.List;
import aprendendoPoo.Inicio;
public class ArquivoModel {
     public final String nome="ola";
     private static int idade;
     protected Boolean validacaoDeCpf;
     
     public enum enumEComoSeFosseUmaClasseSoPraGuardarDados{
    	 telefone,
    	 cpf;
     }
     
     public List<Inicio> ListaQueGuardaDadosComoSeFosseUmVetor;
              //diz que essa lista vai receber dados vindo da classe inicio

	public static int getIdade() {
		return idade;
	}

	public static void setIdade(int idade) {
		ArquivoModel.idade = idade;
	}

	public Boolean getValidacaoDeCpf() {
		return validacaoDeCpf;
	}

	public void setValidacaoDeCpf(Boolean validacaoDeCpf) {
		this.validacaoDeCpf = validacaoDeCpf;
	}

	public List<Inicio> getListaQueGuardaDadosComoSeFosseUmVetor() {
		   //retorna todos os dados da lista
		return ListaQueGuardaDadosComoSeFosseUmVetor;
	}

	public void setListaQueGuardaDadosComoSeFosseUmVetor(List<Inicio> listaQueGuardaDadosComoSeFosseUmVetor) {
		ListaQueGuardaDadosComoSeFosseUmVetor = listaQueGuardaDadosComoSeFosseUmVetor;
	}

	public String getNome() {
		if(nome==null) {
			System.out.print("o codigo if verificou se a string é nula");
		}else {
			System.out.print("ola mundo");
		}
		
		return nome;
	}
    public void chamada(Inicio nomeacaoChamadaQueRecebeDadosDaClasseInicio){
    	
    }
}
