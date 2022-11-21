package com.food.ordering.system.order.service.domain.dto.port.input.message.listener.restaurantapproval;

import com.food.ordering.system.order.service.domain.dto.message.RestaurantApprovalResponse;

public interface RestaurantApprovalResponseMessageListener {
    void orderApproved(RestaurantApprovalResponse restaurantApprovalResponse);

    void orderCanceled(RestaurantApprovalResponse restaurantApprovalResponse);
}
