package aprendendoPoo;
import java.util.ArrayList;
import Model.ArquivoModel;

public class Inicio {

	public static void main(String[] args) {
		var chamadaDaClasseArquivoModel=new ArquivoModel(); 
		
		if(chamadaDaClasseArquivoModel.ListaQueGuardaDadosComoSeFosseUmVetor==null) {
		   //verifica se a chamada.arrays é nula
			chamadaDaClasseArquivoModel.ListaQueGuardaDadosComoSeFosseUmVetor=new ArrayList<>();
																				//cria um novo array para a ListaQueGuardaDadosComoSeFosseUmVetor
		}
		
		//o try vai tentar realizar todo o codigo
		try {
			chamadaDaClasseArquivoModel.ListaQueGuardaDadosComoSeFosseUmVetor.add(null);
			
	   //caso o try não consiga realizar as linha então vai ser executado o catch
		}catch(Exception erro) {
			throw new RuntimeException("erro ao cadastrar dados na lista",erro);
		}
		System.out.print("ola");
	}

}
