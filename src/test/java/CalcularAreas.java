public class CalcularAreas {

    public static float Quadrado(float num1){
        float resultado = num1 * num1;
        return resultado;
    }

    public static float Retangulo(float num1, float num2){
        float resultado = num1 * num2;
        return resultado;
    }

    public static float Circulo(float raio){
        float resultado = Math.round(Math.PI * Math.pow(raio,2));
        return resultado;
    }

    public static float Triangulo(float num1, float num2){
        float resultado = (num1 * num2)/2;
        return resultado;
    }
    
}
