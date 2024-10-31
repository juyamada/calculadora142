import static org.junit.jupiter.api.Assertions.assertEquals;

import java.text.DecimalFormat;

import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.shadow.com.univocity.parsers.csv.CsvFormat;

import com.iterasys.Main;

public class TestAreas142 {

    // Atributos
    // Dados de entrada
    float a = 4;
    float b = 5;
    float c = 3;
    float raio = 2;

    // Funções métodos

    @Test 
    public void AreaQuadrado(){
        // Dados de saída
        float resultadoEsperado = 20;

        // Executa 
        float resultadoAtual = Main.multiplicar(a, b);

        // Valida
        assertEquals(resultadoEsperado,resultadoAtual);
    }

    @Test 
    public void AreaRetangulo(){
        // Dados de saída
        float resultadoEsperado = 15;

        // Executa
        float resultadoAtual = Main.multiplicar(b, c);

        // Valida
        assertEquals(resultadoEsperado,resultadoAtual);
    }

    @Test 
    public void AreaCirculo(){
        // Dados de saída
        double resultadoEsperado = 13;

        // Executa
        double resultadoAtual = Math.round(Math.PI * Math.pow(raio,2));

        // Valida
        assertEquals(resultadoEsperado, resultadoAtual);
    }

    @Test 
    public void AreaTriangulo(){
        // Dados de saída
        float resultadoEsperado = 10;

        // Executa
        float resultadoAtual = (a*b)/2;

        // Valida
        assertEquals(resultadoEsperado,resultadoAtual);
    }

    @ParameterizedTest 
    @CsvSource(value = {
        "3, 10, 30.0",
        "6, 15, 90.0"
    }, delimiter = ',')
    public void AreaRetanguloDDT(float num1, float num2, float resultadoEsperado){
        float resultadoAtual = Main.multiplicar(num1, num2);

        assertEquals(resultadoEsperado, resultadoAtual);
    }

    @ParameterizedTest
    @CsvFileSource(resources = "csv/dadosTriangulo.csv", numLinesToSkip = 1, delimiter = ',')
    public void AreaTrianguloDDT(float num1, float num2, float resultadoEsperado){
        
        float resultadoAtual = (num1 * num2)/2;

        assertEquals(resultadoEsperado, resultadoAtual);
    }


}

    
