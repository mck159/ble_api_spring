package pl.edu.agh.srokawegrzyn.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pl.edu.agh.srokawegrzyn.ConnectedPeripheralsContainer;
import pl.edu.agh.srokawegrzyn.dto.ConnectedPeripheralDTO;
import pl.edu.agh.srokawegrzyn.dto.HistoricalPeripheralDTO;
import pl.edu.agh.srokawegrzyn.dto.ImeiDTO;
import pl.edu.agh.srokawegrzyn.dto.PeripheralDTO;
import pl.edu.agh.srokawegrzyn.service.PeripheralsService;

import java.util.Collection;

/**
 * Created by maciek on 04.06.16.
 */
@RestController
@RequestMapping("peripheralData")
public class AppController {
    @Autowired
    ConnectedPeripheralsContainer connectedPeripheralsContainer;

    @Autowired
    PeripheralsService peripheralsService;

    @RequestMapping(value = "connected", method = RequestMethod.POST)
    public void postConnectedPeripheralData(@RequestBody PeripheralDTO peripheralDTO) {
        peripheralsService.addConnected(peripheralDTO);
    }

    @RequestMapping(value = "disconnected", method = RequestMethod.POST)
    public void postDisonnectedPeripheralData(@RequestBody ImeiDTO imeiDTO) {
        peripheralsService.saveDisconnected(imeiDTO);


    }

    @RequestMapping(value = "connected", method = RequestMethod.GET)
    public Collection<ConnectedPeripheralDTO> getConnectedPeripherals() {
        return peripheralsService.getConnectedPeripherals();
    }

    @RequestMapping(value = "historical", method = RequestMethod.GET)
    public Collection<HistoricalPeripheralDTO> getHistoricalPeripherials() {
        return peripheralsService.getAllHistorical();

    }

}
