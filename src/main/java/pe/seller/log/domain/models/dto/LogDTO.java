package pe.seller.log.domain.models.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.JsonNode;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class LogDTO{
    @JsonProperty(access = JsonProperty.Access.READ_ONLY)
    private long id;
    private String sellerName;
    private JsonNode json;
}
