package com.soumya.main.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "products")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Product {
	
	@Id
	@Column(name = "pid")
	private String productId;
	
	@Column(name = "pname")
	private String productName;
	
	@Column(name = "price")
	private Double productPrice;
	
	@Column(name = "stocks")
	private int productStocks;
	
	

}

