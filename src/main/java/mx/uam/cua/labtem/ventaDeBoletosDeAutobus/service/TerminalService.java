package mx.uam.cua.labtem.ventaDeBoletosDeAutobus.service;

import mx.uam.cua.labtem.ventaDeBoletosDeAutobus.dto.TerminalDTO;

import java.util.List;

public interface TerminalService {

    List<TerminalDTO> getTerminals();
}
