package mx.uam.cua.labtem.ventaDeBoletosDeAutobus.controller;

import mx.uam.cua.labtem.ventaDeBoletosDeAutobus.dto.AutobusDTO;
import mx.uam.cua.labtem.ventaDeBoletosDeAutobus.repository.AutobusRepository;
import mx.uam.cua.labtem.ventaDeBoletosDeAutobus.service.AutobusService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/v1")
public class AutobusController {

    private final AutobusService autobusService;

    public AutobusController(AutobusService autobusService) {
        this.autobusService = autobusService;
    }

    @GetMapping("/autobus")
    public List<AutobusDTO> getAutobusDTOS(){

        return autobusService.getAutobuses();

    }
}
