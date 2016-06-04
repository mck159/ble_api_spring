package pl.edu.agh.srokawegrzyn.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Table(name = "peripherals_history")
@Entity
public class Peripheral {
    @Id
    int id;
    String peripheralManufacturer;
    String peripheralModel;
    String peripheralIMEI;
    Date connectTime;
    Date disconnectTime;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Peripheral that = (Peripheral) o;

        if (id != that.id) return false;
        if (peripheralManufacturer != null ? !peripheralManufacturer.equals(that.peripheralManufacturer) : that.peripheralManufacturer != null)
            return false;
        if (peripheralModel != null ? !peripheralModel.equals(that.peripheralModel) : that.peripheralModel != null)
            return false;
        if (peripheralIMEI != null ? !peripheralIMEI.equals(that.peripheralIMEI) : that.peripheralIMEI != null)
            return false;
        if (connectTime != null ? !connectTime.equals(that.connectTime) : that.connectTime != null) return false;
        return disconnectTime != null ? disconnectTime.equals(that.disconnectTime) : that.disconnectTime == null;

    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (peripheralManufacturer != null ? peripheralManufacturer.hashCode() : 0);
        result = 31 * result + (peripheralModel != null ? peripheralModel.hashCode() : 0);
        result = 31 * result + (peripheralIMEI != null ? peripheralIMEI.hashCode() : 0);
        result = 31 * result + (connectTime != null ? connectTime.hashCode() : 0);
        result = 31 * result + (disconnectTime != null ? disconnectTime.hashCode() : 0);
        return result;
    }
}
