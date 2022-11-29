
import com.stark.cooporation.FarenheitSensor;

public class AdapterCalcCelsius implements InterfaceTemperatureCelsius{
    @Override
    public double getMeasureTemperature() 
    {
    	FarenheitSensor farenheitSensor = new FarenheitSensor();
		double firenheitTemperature = farenheitSensor.getTemperaturaFarenheit();
        double celsiusTemperature = ((firenheitTemperature-32)*5/9);
        return celsiusTemperature;
    }
    
}
