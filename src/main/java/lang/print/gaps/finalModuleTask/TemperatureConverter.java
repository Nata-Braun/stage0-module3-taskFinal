package lang.print.gaps.finalModuleTask;

public class TemperatureConverter {
    public void toFahrenheit(int temperatureCelsius){

        float temperatureFarengeit = (float) ((temperatureCelsius * 1.8) + 32);
        System.out.println(temperatureFarengeit);
    }
}
