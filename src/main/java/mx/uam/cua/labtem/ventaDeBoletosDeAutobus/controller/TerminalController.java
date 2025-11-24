package mx.uam.cua.labtem.ventaDeBoletosDeAutobus.controller;

import mx.uam.cua.labtem.ventaDeBoletosDeAutobus.dto.TerminalDTO;
import mx.uam.cua.labtem.ventaDeBoletosDeAutobus.entity.Terminal;
import mx.uam.cua.labtem.ventaDeBoletosDeAutobus.service.TerminalService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/v1")
public class TerminalController {

    private final TerminalService terminalService;

    public TerminalController(TerminalService terminalService) {
        this.terminalService = terminalService;
    }

    @GetMapping("/terminal")
    public List<TerminalDTO> terminal(){
        return terminalService.getTerminals();
    }

}
