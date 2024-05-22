package com.example.vurdersample.vurdersample.dto;

import lombok.Data;

@Data
public class OrderDto {
    private String email;
    private String status;
    private Double price;
}
