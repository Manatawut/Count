public class Sensor implements Value{
    private int sensorID;
    private double temperature;

    public Sensor(int sensorID, double temperature) {
        this.sensorID = sensorID;
        this.temperature = temperature;
    }

    public double getTemperature() {
        return temperature;
    }

    @Override
    public double getValue() {
        return temperature;
    }
}
