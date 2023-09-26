public class DesafioTemperatura {
    public static void main(String[] args) {
        double temperaturaCelcius = 24;
        int temperaturaFahrenheit = (int) ((temperaturaCelcius * 1.8) + 32);

        System.out.println("A temperatura em Celsius de: " + temperaturaCelcius +
                " equivale a temperatura de " + temperaturaFahrenheit + " Fahrenheit em valor inteiro.");
    }
}

//Neste desafio, era para criar um programa que convertesse Celsius para Fahrenheit.
//O resultado da conversão deveria ser um número inteiro, por isso utilizei o método casting.
