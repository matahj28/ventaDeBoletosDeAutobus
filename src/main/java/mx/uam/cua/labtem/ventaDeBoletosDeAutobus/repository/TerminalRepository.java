package mx.uam.cua.labtem.ventaDeBoletosDeAutobus.repository;

import mx.uam.cua.labtem.ventaDeBoletosDeAutobus.entity.Terminal;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TerminalRepository extends JpaRepository<Terminal, Long> {
}
