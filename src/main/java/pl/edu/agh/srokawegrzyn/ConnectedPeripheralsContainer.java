package pl.edu.agh.srokawegrzyn;

import org.springframework.stereotype.Repository;
import pl.edu.agh.srokawegrzyn.dto.ConnectedPeripheralDTO;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by maciek on 04.06.16.
 */
@Repository
public class ConnectedPeripheralsContainer {
    Map<String, ConnectedPeripheralDTO> peripherals = new HashMap();

    public void addDevice(ConnectedPeripheralDTO peripheralDTO) {
        if(peripherals.containsKey(peripheralDTO.getPeripheralIMEI())) {
            throw new DeviceAlreadyExistException();
        }

        peripherals.put(peripheralDTO.getPeripheralIMEI(), peripheralDTO);
    }

    public ConnectedPeripheralDTO pullDevice(String imei) {
        if(peripherals.containsKey(imei)) {
            ConnectedPeripheralDTO device = peripherals.get(imei);
            peripherals.remove(imei);
            return device;
        } else {
            throw new DeviceDoesNotExistException();
        }
    }

    public Collection<ConnectedPeripheralDTO> getAllPeripherals() {
        return peripherals.values();
    }

    public class DeviceDoesNotExistException extends RuntimeException {
    }

    public class DeviceAlreadyExistException extends RuntimeException {
    }
}
