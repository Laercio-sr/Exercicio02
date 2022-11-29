
public class TemperatureParsed {

    private InterfaceTemperatureCelsius parsed;

    public void temperatureMeasurement(InterfaceTemperatureCelsius parsed)
    {
        this.parsed = parsed;
    }

    public void temperatureMeasurement() 
    {
        System.out.println("Grau de Temperatura ºC: " + parsed.getMeasureTemperature());
    }

    public static void main(String[] args) 
    {

        TemperatureParsed temperatureParsed = new TemperatureParsed();
        temperatureParsed.temperatureMeasurement(new AdapterCalcCelsius());
        temperatureParsed.temperatureMeasurement();
    }
}