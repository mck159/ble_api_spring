package pl.edu.agh.srokawegrzyn.dto;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.Date;

/**
 * Created by maciek on 04.06.16.
 */
public class HistoricalPeripheralDTO {
    String peripheralManufacturer;
    String peripheralModel;
    String peripheralIMEI;
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    Date connectTime;
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    Date disconnectTime;

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

    public Date getConnectTime() {
        return connectTime;
    }

    public void setConnectTime(Date connectTime) {
        this.connectTime = connectTime;
    }

    public Date getDisconnectTime() {
        return disconnectTime;
    }

    public void setDisconnectTime(Date disconnectTime) {
        this.disconnectTime = disconnectTime;
    }
}
