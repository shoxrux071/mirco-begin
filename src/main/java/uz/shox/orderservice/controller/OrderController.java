package uz.shox.orderservice.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import uz.shox.orderservice.dtos.OrderCreateDto;
import uz.shox.orderservice.service.OrderService;

/**
 * @author "Berdimurodov Shoxrux"
 * @since 02/12/22 00:33 (Friday)
 * order-service/IntelliJ IDEA
 */
@RestController
@RequestMapping("/api/order")
@RequiredArgsConstructor
public class OrderController {
    private final OrderService orderService;
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public String placeOrder(@RequestBody OrderCreateDto dto){
        orderService.placeOrder(dto);
        return "order place successfully";
    }
    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public String getAll(){
        return "dfg";
    }
}
