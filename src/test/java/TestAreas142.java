import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;


public class TestAreas142 {

    // Atributos
    // Dados de entrada
    float num1 = 4;
    float num2 = 5;
    float raio = 2;

    // Funções métodos

    @Test 
    public void TesteQuadrado(){
        // Dados de saída
        float resultadoEsperado = 16;

        // Executa 
        float resultadoAtual = CalcularAreas.Quadrado(num1);

        // Valida
        assertEquals(resultadoEsperado,resultadoAtual);
    }

    @Test 
    public void TesteRetangulo(){
        // Dados de saída
        float resultadoEsperado = 20;

        // Executa
        float resultadoAtual = CalcularAreas.Retangulo(num1, num2);

        // Valida
        assertEquals(resultadoEsperado,resultadoAtual);
    }

    @Test 
    public void TesteCirculo(){
        // Dados de saída
        float resultadoEsperado = 13;

        // Executa
        float resultadoAtual = CalcularAreas.Circulo(raio);

        // Valida
        assertEquals(resultadoEsperado, resultadoAtual);
    }

    @Test 
    public void TesteTriangulo(){
        // Dados de saída
        float resultadoEsperado = 10;

        // Executa
        float resultadoAtual = CalcularAreas.Triangulo(num1, num2);

        // Valida
        assertEquals(resultadoEsperado,resultadoAtual);
    }

    @ParameterizedTest 
    @CsvSource(value = {
        "3, 10, 30.0",
        "6, 15, 90.0"
    }, delimiter = ',')
    public void TesteRetanguloDDT(float num1, float num2, float resultadoEsperado){

        float resultadoAtual = CalcularAreas.Retangulo(num1, num2);

        assertEquals(resultadoEsperado, resultadoAtual);
    }

    @ParameterizedTest
    @CsvFileSource(resources = "csv/dadosTriangulo.csv", numLinesToSkip = 1, delimiter = ',')
    public void TesteTrianguloDDT(float num1, float num2, float resultadoEsperado){
        
        float resultadoAtual = CalcularAreas.Triangulo(num1, num2);

        assertEquals(resultadoEsperado, resultadoAtual);
    }


}

    
