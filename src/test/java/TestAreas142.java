import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

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
}
    
