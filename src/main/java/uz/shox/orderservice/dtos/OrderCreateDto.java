package uz.shox.orderservice.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

/**
 * @author "Berdimurodov Shoxrux"
 * @since 02/12/22 00:34 (Friday)
 * order-service/IntelliJ IDEA
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class OrderCreateDto {
    private List<OrderLineItemsDto> items = new ArrayList<>();

}
