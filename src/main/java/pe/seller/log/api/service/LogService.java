package pe.seller.log.api.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.seller.log.domain.models.dto.LogDTO;
import pe.seller.log.domain.models.parser.LogParser;
import pe.seller.log.domain.repository.ILogRepository;
import pe.seller.log.domain.service.ILogService;

@Service
public class LogService implements ILogService {
    @Autowired ILogRepository repository;

    @Override
    public LogDTO create(LogDTO data) {
        final var entity = repository.save(LogParser.fromDTO(data));

        return LogParser.fromEntity(entity);
    }
}
