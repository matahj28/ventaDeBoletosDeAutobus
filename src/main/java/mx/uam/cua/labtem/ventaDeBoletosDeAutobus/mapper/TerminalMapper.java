package mx.uam.cua.labtem.ventaDeBoletosDeAutobus.mapper;

import mx.uam.cua.labtem.ventaDeBoletosDeAutobus.dto.TerminalDTO;
import mx.uam.cua.labtem.ventaDeBoletosDeAutobus.entity.Terminal;
import org.mapstruct.InjectionStrategy;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring", injectionStrategy = InjectionStrategy.CONSTRUCTOR)
public interface TerminalMapper {

    Terminal toTerminal(TerminalDTO terminalDTO);

    TerminalDTO toTerminalDTO(Terminal terminal);

}
