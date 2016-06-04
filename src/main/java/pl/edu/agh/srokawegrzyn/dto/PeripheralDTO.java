package pl.edu.agh.srokawegrzyn.dto;

import java.time.LocalDateTime;

/**
 * Created by maciek on 04.06.16.
 */
public class PeripheralDTO {
    String peripheralManufacturer;
    String peripheralModel;
    String peripheralIMEI;


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
}
