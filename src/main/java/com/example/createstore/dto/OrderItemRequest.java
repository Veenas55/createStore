package com.example.createstore.dto;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class OrderItemRequest {
    @NotNull(message = "product id is reuired")
    private Long productId;
    @NotNull(message = "quantity is reuired")
    @Min(value = 1, message = "quantity is must be atleast 1")
    private Integer quantity;

}
