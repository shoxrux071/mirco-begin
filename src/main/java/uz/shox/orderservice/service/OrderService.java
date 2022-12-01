package uz.shox.orderservice.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import uz.shox.orderservice.domain.Order;
import uz.shox.orderservice.domain.OrderLineItem;
import uz.shox.orderservice.dtos.OrderCreateDto;
import uz.shox.orderservice.dtos.OrderLineItemsDto;
import uz.shox.orderservice.repos.OrderRepo;

import java.util.List;
import java.util.UUID;

/**
 * @author "Berdimurodov Shoxrux"
 * @since 02/12/22 00:39 (Friday)
 * order-service/IntelliJ IDEA
 */
@Service
@RequiredArgsConstructor
public class OrderService {
    private final OrderRepo orderRepo;
    public void placeOrder(OrderCreateDto dto){
        Order order = new Order();
        order.setOrderNumber(UUID.randomUUID().toString());
        List<OrderLineItem> itemList = dto.getItems().stream().map(this::mapToDomain).toList();
        order.setItems(itemList);
        orderRepo.save(order);
    }

    private OrderLineItem mapToDomain(OrderLineItemsDto orderLineItemsDto) {
        OrderLineItem item=new OrderLineItem();
        item.setPrice(orderLineItemsDto.getPrice());
        item.setQuantity(orderLineItemsDto.getQuantity());
        item.setSkuCode(orderLineItemsDto.getSkuCode());
        return item;
    }

}
