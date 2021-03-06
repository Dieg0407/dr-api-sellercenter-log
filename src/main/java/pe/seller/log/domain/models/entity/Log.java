package pe.seller.log.domain.models.entity;

import com.fasterxml.jackson.databind.JsonNode;
import com.vladmihalcea.hibernate.type.json.JsonBinaryType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.TypeDef;

import javax.persistence.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "tb_order_delivery", schema = "private")
@TypeDef(typeClass = JsonBinaryType.class, defaultForType = JsonNode.class)
public class Log {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "delivery_order_id")
    private Integer id;

    @Column(name = "Sellername")
    private String sellerName;

    @Column(columnDefinition = "json", name = "json_vtex")
    private JsonNode json;

    @Column(name = "status")
    private String status;
}
