package pe.seller.log.domain.models.parser;

import pe.seller.log.domain.models.dto.LogDTO;
import pe.seller.log.domain.models.entity.Log;

public abstract class LogParser {
    public static Log fromDTO(LogDTO log) {
        return new Log(
                0,
                log.getSellerName(),
                log.getJson(),
                "Registrado"
        );
    }
    public static LogDTO fromEntity(Log entity) {
        return new LogDTO(
                entity.getId(),
                entity.getSellerName(),
                entity.getJson()
        );
    }
}
