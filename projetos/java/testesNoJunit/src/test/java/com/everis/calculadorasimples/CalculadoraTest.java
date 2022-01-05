package com.everis.calculadorasimples;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.fail;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.BeforeAll;                         //importando classes do junit para fazer os testes no caso importando os @ que definem a etapa em que o teste está e o que faz para depois serem executadas no cucumber
import org.junit.jupiter.api.Disabled;                          //importando classes do junit para fazer os testes no caso importando os @ que definem a etapa em que o teste está e o que faz para depois serem executadas no cucumber
import org.junit.jupiter.api.DisplayName;                       //importando classes do junit para fazer os testes no caso importando os @ que definem a etapa em que o teste está e o que faz para depois serem executadas no cucumber
import org.junit.jupiter.params.*;                              //importando classes do junit para fazer os testes no caso importando os @ que definem a etapa em que o teste está e o que faz para depois serem executadas no cucumber
import org.junit.jupiter.params.provider.CsvFileSource;         //importando classes do junit para fazer os testes no caso importando os @ que definem a etapa em que o teste está e o que faz para depois serem executadas no cucumber
import org.junit.jupiter.params.provider.CsvSource;             //importando classes do junit para fazer os testes no caso importando os @ que definem a etapa em que o teste está e o que faz para depois serem executadas no cucumber

public class CalculadoraTest {
    static Calculadora calculadora;     //instanciando a classe calculadora
    /*@Disabled                         desabilita o teste*/
    @Test                               //executa o teste
    public void testaSomaMenosIngenuo() {
        Calculadora myCalc = new Calculadora(); //instanciando a classe calculadora

        boolean temErro = false;                
        if (myCalc.soma(2, 2) != 4) {           //verifica o resultado do retorno do metodo myCalc
            temErro = true;
        }
        if (myCalc.soma(2, -2) != 0) {          //verifica o resultado do retorno do metodo myCalc
            temErro = true;
        }
        if (myCalc.soma(-2, 2) != 0) {          //verifica o resultado do retorno do metodo myCalc
            temErro = true;
        }
        if (myCalc.soma(-2, -2) != -4){          //verifica o resultado do retorno do metodo myCalc
            temErro = true;
        }
        if (myCalc.soma(0, 0) != 0) {          //verifica o resultado do retorno do metodo myCalc
            temErro = true;
        }
        if (temErro) {                          //verifica se a variavel temErro continual false se estiver true executa a linha fail
            fail("Houve um erro na validação da soma.");        //envia mensagem de erro
        }
    }

    @Test                               //executa o teste
    public void deveResultarQuatroAoSomarDoisEDois() {
        // Calculadora calculadora = new Calculadora();
        assertEquals(4.0, calculadora.soma(2, 2));//verifica se o resultado atual é igual o resultado esperado
                    //esperado//atual
    }

    @Test                               //executa o teste
    public void deveResultarZeroAoSomarDoisEMenosDois() {
        // Calculadora calculadora = new Calculadora();
        assertEquals(0.0, calculadora.soma(2, -2));//verifica se o resultado atual é igual o resultado esperado
                     //esperado//atual
    }

    @BeforeAll                               //faz isso antes de tudo
    public static void setup() {
        calculadora = new Calculadora();    //instanciando o metodo da classe Calculadora em sua instancia
    }
    // Outros: @BeforeEach, @AfterEach, @AfterAll

    @DisplayName("Valida múltiplas somas com informações em CSV")//diz qual a função do teste a seguir
    @ParameterizedTest                                          //significa que o método a seguir utiliza parametros
    @CsvSource({ "1.0, 1.0, 2.0", "2.0, 3.0, 6.0" })            //diz o parametro a ser passado no metodo//você insere o valor para executar o teste
    void validaMultiplasSomasCSV(double parcela1, double parcela2, double resultadoEsperado) {
        assertEquals(resultadoEsperado, calculadora.soma(parcela1, parcela2));//verifica se o resultado atual é igual o resultado esperado
                    //esperado//atual
    }

    @DisplayName("Valida múltiplas somas com informações em arquivo CSV")                                           //diz qual a função do teste a seguir
    @ParameterizedTest                                                                                             //significa que o método a seguir utiliza parametros
    @CsvFileSource(resources = "/data.csv"/*verifica o que esta no arquivo data.csv*/, numLinesToSkip = 1)         //diz o parametro a ser passado no metodo//você insere o valor para executar o teste
    void validaMultiplasSomasArqCSV(double parcela1, double parcela2, double resultadoEsperado) {
        assertEquals(resultadoEsperado, calculadora.soma(parcela1, parcela2));//verifica se o resultado atual é igual o resultado esperado
                            //esperado//atual
    }

    @Test                               //executa o teste
    public void divisaoPorZeroGeraExcecao() {
            assertThrows(ArithmeticException.class, () -> {
            //testando varias exceções
            int resultado = calculadora.restoDivisaoInteira(4, 0);
            System.out.println(resultado);
        });
    }

}
