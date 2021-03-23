package pe.seller.log.api.controller;

import com.fasterxml.jackson.databind.JsonNode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pe.seller.log.domain.models.dto.LogDTO;
import pe.seller.log.domain.service.ILogService;

@RestController
@RequestMapping(path = "/logs/v1")
public class LogController {

    @Autowired
    ILogService service;

    @PostMapping(path = "")
    public LogDTO create(@RequestBody JsonNode data) {
        return service.create(data);
    }
}
