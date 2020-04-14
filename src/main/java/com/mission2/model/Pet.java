package com.mission2.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Pet {
    private Long id;
    private String name;
    private String description;
    private boolean isExotic;
    private double price;
}
