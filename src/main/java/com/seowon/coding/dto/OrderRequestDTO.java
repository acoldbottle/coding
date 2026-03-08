package com.seowon.coding.dto;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Getter
@AllArgsConstructor
@RequiredArgsConstructor
public class OrderRequestDTO {

    private final String customerName;
    private final String customerEmail;
    private final List<Long> productIds = new ArrayList<>();
    private final List<Integer> quantities = new ArrayList<>();
}
