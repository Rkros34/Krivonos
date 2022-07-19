package by.it_academy.lesson11;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class TemperatureSensor implements Sensor {
    private boolean currentStatus = false;

    @Override
    public boolean isOn() {
        return currentStatus;
    }

    @Override
    public void setOn() {
        currentStatus = true;
    }

    @Override
    public void setOff() {
        currentStatus = false;
    }

    @Override
    public int read() {
        int sensorStatus = 0;
        if (currentStatus == true) {
            Random random = ThreadLocalRandom.current();
            sensorStatus = random.nextInt(61) - 30;
            return sensorStatus;
        }else  {
            throw new IllegalStateException("Sensor is switched off! Please, turn on!");
        }
    }
}
