package uz.shox.orderservice.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import uz.shox.orderservice.domain.Order;

/**
 * @author "Berdimurodov Shoxrux"
 * @since 02/12/22 00:51 (Friday)
 * order-service/IntelliJ IDEA
 */
public interface OrderRepo extends JpaRepository<Order,Long> {
}
