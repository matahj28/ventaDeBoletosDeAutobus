package mx.uam.cua.labtem.ventaDeBoletosDeAutobus.repository;

import mx.uam.cua.labtem.ventaDeBoletosDeAutobus.entity.Autobus;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AutobusRepository extends JpaRepository<Autobus, Long> {
}
