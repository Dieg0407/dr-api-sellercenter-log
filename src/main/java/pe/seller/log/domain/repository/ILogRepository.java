package pe.seller.log.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe.seller.log.domain.models.entity.Log;

@Repository
public interface ILogRepository extends JpaRepository<Log, Long> {
}
