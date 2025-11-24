package mx.uam.cua.labtem.ventaDeBoletosDeAutobus.mapper;

import mx.uam.cua.labtem.ventaDeBoletosDeAutobus.dto.AutobusDTO;
import mx.uam.cua.labtem.ventaDeBoletosDeAutobus.entity.Autobus;
import org.mapstruct.InjectionStrategy;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring", injectionStrategy = InjectionStrategy.CONSTRUCTOR)
public interface AutobusMapper {

    AutobusDTO toDTO(Autobus autobus);

    Autobus toEntity(AutobusDTO autobusDTO);

}
