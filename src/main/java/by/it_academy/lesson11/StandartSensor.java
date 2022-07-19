package by.it_academy.lesson11;

public class StandartSensor implements Sensor {
    private int sensorStatus;

    public StandartSensor(int sensorStatus) {
        this.sensorStatus = sensorStatus;
    }

    @Override
    public boolean isOn() {
        return true;
    }

    @Override
    public void setOn() {

    }

    @Override
    public void setOff() {

    }

    @Override
    public int read() {
        return sensorStatus;
    }
}
