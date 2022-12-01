package uz.shox.orderservice.domain;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;

/**
 * @author "Berdimurodov Shoxrux"
 * @since 02/12/22 00:23 (Friday)
 * order-service/IntelliJ IDEA
 */
@Entity
@Table(name = "t_order_line_items")
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class OrderLineItem {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String skuCode;
    private BigDecimal price;
    private Integer quantity;
}
