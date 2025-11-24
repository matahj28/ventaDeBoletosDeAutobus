package mx.uam.cua.labtem.ventaDeBoletosDeAutobus.service.impl;

import mx.uam.cua.labtem.ventaDeBoletosDeAutobus.dto.AutobusDTO;
import mx.uam.cua.labtem.ventaDeBoletosDeAutobus.entity.Autobus;
import mx.uam.cua.labtem.ventaDeBoletosDeAutobus.mapper.AutobusMapper;
import mx.uam.cua.labtem.ventaDeBoletosDeAutobus.repository.AutobusRepository;
import mx.uam.cua.labtem.ventaDeBoletosDeAutobus.service.AutobusService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class AutobusServiceImpl implements AutobusService {

    private final AutobusRepository autobusRepository;
    private final AutobusMapper autobusMapper;

    public AutobusServiceImpl(AutobusRepository autobusRepository, AutobusMapper autobusMapper) {
        this.autobusRepository = autobusRepository;
        this.autobusMapper = autobusMapper;
    }

    @Override
    public List<AutobusDTO> getAutobuses() {

        List<Autobus> autobuses = autobusRepository.findAll();
        List<AutobusDTO> autobusDTOS = new ArrayList<>();

        for(Autobus autobus : autobuses){
            autobusDTOS.add(autobusMapper.toDTO(autobus));
        }

        return autobusDTOS;
    }
}
