package pl.edu.agh.srokawegrzyn;

import java.util.Date;

/**
 * Created by maciek on 04.06.16.
 */
public class ConnectedPeripheral {
    String deviceName;
    String peripheralManufacturer;
    String peripheralModel;
    String peripheralIMEI;
    Date connectionTime;

    public String getDeviceName() {
        return deviceName;
    }

    public void setDeviceName(String deviceName) {
        this.deviceName = deviceName;
    }

    public String getPeripheralManufacturer() {
        return peripheralManufacturer;
    }

    public void setPeripheralManufacturer(String peripheralManufacturer) {
        this.peripheralManufacturer = peripheralManufacturer;
    }

    public String getPeripheralModel() {
        return peripheralModel;
    }

    public void setPeripheralModel(String peripheralModel) {
        this.peripheralModel = peripheralModel;
    }

    public String getPeripheralIMEI() {
        return peripheralIMEI;
    }

    public void setPeripheralIMEI(String peripheralIMEI) {
        this.peripheralIMEI = peripheralIMEI;
    }

    public Date getConnectionTime() {
        return connectionTime;
    }

    public void setConnectionTime(Date connectionTime) {
        this.connectionTime = connectionTime;
    }
}
