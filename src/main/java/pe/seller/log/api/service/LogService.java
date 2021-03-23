package pe.seller.log.api.service;

import com.fasterxml.jackson.databind.JsonNode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.seller.log.domain.models.dto.LogDTO;
import pe.seller.log.domain.models.entity.Log;
import pe.seller.log.domain.models.parser.LogParser;
import pe.seller.log.domain.repository.ILogRepository;
import pe.seller.log.domain.service.ILogService;

@Service
public class LogService implements ILogService {
    @Autowired ILogRepository repository;

    @Override
    public LogDTO create(JsonNode data) {
        final var log = new Log();
        log.setJson(data);
        log.setSellerName(data.get("accountName").textValue());
        log.setStatus("Registrado");

        final var entity = repository.save(log);

        return LogParser.fromEntity(entity);
    }
}
