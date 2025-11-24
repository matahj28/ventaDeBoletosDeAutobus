package mx.uam.cua.labtem.ventaDeBoletosDeAutobus.service.impl;

import mx.uam.cua.labtem.ventaDeBoletosDeAutobus.dto.TerminalDTO;
import mx.uam.cua.labtem.ventaDeBoletosDeAutobus.entity.Terminal;
import mx.uam.cua.labtem.ventaDeBoletosDeAutobus.mapper.TerminalMapper;
import mx.uam.cua.labtem.ventaDeBoletosDeAutobus.repository.TerminalRepository;
import mx.uam.cua.labtem.ventaDeBoletosDeAutobus.service.TerminalService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TerminalServiceImpl implements TerminalService {

    private final TerminalRepository terminalRepository;
    private final TerminalMapper terminalMapper;

    public TerminalServiceImpl(TerminalRepository terminalRepository, TerminalMapper terminalMapper) {
        this.terminalRepository = terminalRepository;
        this.terminalMapper = terminalMapper;
    }

    @Override
    public List<TerminalDTO> getTerminals() {

        List<Terminal>  terminals = terminalRepository.findAll();

        List<TerminalDTO> terminalDTOS = new ArrayList<>();

        for(Terminal terminal: terminals){
            terminalDTOS.add(terminalMapper.toTerminalDTO(terminal));
        }

        return terminalDTOS;
    }
}
