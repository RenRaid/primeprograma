public class Main {
    public static void main(String[] args)
    {
        double celsius = -32.0;
        double fahrenheit;
        double kelvin;
        int confahren;

        fahrenheit = (celsius*1.8)+32;
        kelvin = celsius+273.15;
        confahren = (int)fahrenheit;

        String msg = """
                %.2f° celcius corresponde a:
                %.2f° fahrenheit
                %.2f° kelvin
                %d° fahrenheit en valor entero
                """.formatted(celsius,fahrenheit,kelvin,confahren);
        System.out.println(msg);
        System.out.println();
        System.out.println(String.format("%.2f° Celcius representan %.2f° Fahrenheit y %.2f° Kelvin donde %d es el valor entero de Fahrenheit",celsius,fahrenheit,kelvin,confahren));
    }

}