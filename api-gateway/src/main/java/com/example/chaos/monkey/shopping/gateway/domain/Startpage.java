package com.example.chaos.monkey.shopping.gateway.domain;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author Benjamin Wilms
 */

@NoArgsConstructor
@AllArgsConstructor
@Data
@JsonPropertyOrder({"fashionResponse", "toysResponse", "hotDealsResponse", "duration", "statusFashion", "statusToys", "statusHotDeals"})
public class Startpage {

    private long duration;
    private String statusFashion;
    private String statusToys;
    private String statusHotDeals;
    private ProductResponse fashionResponse;
    private ProductResponse toysResponse;
    private ProductResponse hotDealsResponse;
}
