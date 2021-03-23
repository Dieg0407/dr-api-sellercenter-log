package pe.seller.log.domain.service;

import com.fasterxml.jackson.databind.JsonNode;
import pe.seller.log.domain.models.dto.LogDTO;

public interface ILogService {
    LogDTO create(JsonNode data);
}
