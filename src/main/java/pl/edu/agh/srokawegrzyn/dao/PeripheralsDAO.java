package pl.edu.agh.srokawegrzyn.dao;

import org.hibernate.Session;
import org.springframework.stereotype.Repository;
import pl.edu.agh.srokawegrzyn.dto.HistoricalPeripheralDTO;
import pl.edu.agh.srokawegrzyn.entity.Peripheral;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

@Repository
public class PeripheralsDAO {
    @PersistenceContext
    EntityManager em;

    public Session getCurrentSession() {
        return em.unwrap(Session.class);
    }

    public void save(Peripheral peripheral) {
        Session currentSession = getCurrentSession();
        currentSession.save(peripheral);
        currentSession.flush();
    }

    public Collection<HistoricalPeripheralDTO> findAll() {
        List<Peripheral> resultPeripherals = getCurrentSession().createCriteria(Peripheral.class).list();
        List<HistoricalPeripheralDTO> historicalPeripheralDTOs = new LinkedList<>();
        for(Peripheral resultPeripheral : resultPeripherals) {
            HistoricalPeripheralDTO historicalPeripheralDTO = new HistoricalPeripheralDTO();
            historicalPeripheralDTO.setDisconnectTime(resultPeripheral.getDisconnectTime());
            historicalPeripheralDTO.setPeripheralManufacturer(resultPeripheral.getPeripheralManufacturer());
            historicalPeripheralDTO.setPeripheralModel(resultPeripheral.getPeripheralModel());
            historicalPeripheralDTO.setConnectTime(resultPeripheral.getConnectTime());
            historicalPeripheralDTO.setPeripheralIMEI(resultPeripheral.getPeripheralIMEI());
            historicalPeripheralDTOs.add(historicalPeripheralDTO);
        }
        return historicalPeripheralDTOs;
    }
}
