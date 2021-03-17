package pe.seller.log.domain.service;

import pe.seller.log.domain.models.dto.LogDTO;

public interface ILogService {
    LogDTO create(LogDTO data);
}
