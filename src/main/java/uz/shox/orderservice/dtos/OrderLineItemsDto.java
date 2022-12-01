package uz.shox.orderservice.dtos;

import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import uz.shox.orderservice.domain.Order;

import java.math.BigDecimal;

/**
 * @author "Berdimurodov Shoxrux"
 * @since 02/12/22 00:35 (Friday)
 * order-service/IntelliJ IDEA
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class OrderLineItemsDto {
    private Long id;
    private String skuCode;
    private BigDecimal price;
    private Integer quantity;

}
