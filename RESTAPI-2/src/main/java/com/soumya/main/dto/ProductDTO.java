package com.soumya.main.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class ProductDTO {
	
	private String product_name;
	
	private Double product_price;
	
	private int product_stocks;

}
