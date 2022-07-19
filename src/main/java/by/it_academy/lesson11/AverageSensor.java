package by.it_academy.lesson11;

import java.util.ArrayList;
import java.util.List;

public class AverageSensor implements Sensor {

    private List<Sensor> arrayOfSensor = new ArrayList<>();

    void addSensor(Sensor toAdd) {
        arrayOfSensor.add(toAdd);
    }

    @Override
    public boolean isOn() {
        boolean sensorStatus = false;
        for (Sensor sensor : arrayOfSensor) {
            if (sensor.isOn() == false) {
                sensorStatus = false;
            } else {
                sensorStatus = true;
            }
        }
        return sensorStatus;
    }

        @Override
        public void setOn () {
            for (Sensor sensor : arrayOfSensor) {
                sensor.setOn();
            }
        }

        @Override
        public void setOff () {
            for (Sensor sensor : arrayOfSensor) {
                sensor.setOff();
            }
        }

    }

    @Override
    public int read() {
        int sum = 0;
        int count = 0;
        for (Sensor sensor : arrayOfSensor) {
            if (sensor.isOn() == true) {
                sum += sensor.read();
                count++;
            }
        }if (count==0){
            throw new IllegalStateException();
        }
        return sum / count;
    }
}
