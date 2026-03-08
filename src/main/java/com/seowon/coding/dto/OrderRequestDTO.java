package com.seowon.coding.dto;


import lombok.Getter;
import lombok.RequiredArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Getter
@RequiredArgsConstructor
public class OrderRequestDTO {

    private String customerName;
    private String customerEmail;
    private List<Long> productIds = new ArrayList<>();
    private List<Integer> quantities = new ArrayList<>();
}
