package com.maxiflexy.order_service.service;

import com.maxiflexy.order_service.dto.OrderRequest;

public interface OrderService {

    void placeOrder(OrderRequest orderRequest);
}
