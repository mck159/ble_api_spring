package pl.edu.agh.srokawegrzyn.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import pl.edu.agh.srokawegrzyn.ConnectedPeripheralsContainer;
import pl.edu.agh.srokawegrzyn.dao.PeripheralsDAO;
import pl.edu.agh.srokawegrzyn.dto.ConnectedPeripheralDTO;
import pl.edu.agh.srokawegrzyn.dto.HistoricalPeripheralDTO;
import pl.edu.agh.srokawegrzyn.dto.ImeiDTO;
import pl.edu.agh.srokawegrzyn.dto.PeripheralDTO;
import pl.edu.agh.srokawegrzyn.entity.Peripheral;

import java.util.Collection;
import java.util.Date;

@Service
@Transactional
public class PeripheralsService {
    @Autowired
    PeripheralsDAO peripheralsDAO;

    @Autowired
    ConnectedPeripheralsContainer connectedPeripheralsContainer;

    public void addConnected(PeripheralDTO peripheralDTO) {
        ConnectedPeripheralDTO connectedPeripheralDTO = new ConnectedPeripheralDTO();
        connectedPeripheralDTO.setPeripheralIMEI(peripheralDTO.getPeripheralIMEI());
        connectedPeripheralDTO.setPeripheralManufacturer(peripheralDTO.getPeripheralManufacturer());
        connectedPeripheralDTO.setPeripheralModel(peripheralDTO.getPeripheralModel());
        connectedPeripheralDTO.setConnectionTime(new Date());
        connectedPeripheralsContainer.addDevice(connectedPeripheralDTO);
    }

    public void saveDisconnected(ImeiDTO imeiDTO) {
        ConnectedPeripheralDTO connectedPeripheral = connectedPeripheralsContainer.pullDevice(imeiDTO.getPeripheralIMEI());
        Peripheral peripheral = new Peripheral();
        peripheral.setPeripheralIMEI(connectedPeripheral.getPeripheralIMEI());
        peripheral.setPeripheralManufacturer(connectedPeripheral.getPeripheralManufacturer());
        peripheral.setPeripheralModel(connectedPeripheral.getPeripheralModel());
        peripheral.setConnectTime(connectedPeripheral.getConnectionTime());
        peripheral.setDisconnectTime(new Date());
        peripheralsDAO.save(peripheral);
    }

    public Collection<ConnectedPeripheralDTO> getConnectedPeripherals() {
        return connectedPeripheralsContainer.getAllPeripherals();
    }

    public Collection<HistoricalPeripheralDTO> getAllHistorical() {
        return peripheralsDAO.findAll();
    }
}
