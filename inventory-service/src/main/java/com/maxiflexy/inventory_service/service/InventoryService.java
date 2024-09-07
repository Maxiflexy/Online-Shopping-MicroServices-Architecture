package com.maxiflexy.inventory_service.service;

import com.maxiflexy.inventory_service.dto.InventoryResponse;

import java.util.List;

public interface InventoryService {

    List<InventoryResponse> isInStock(List<String> skuCode);
}
