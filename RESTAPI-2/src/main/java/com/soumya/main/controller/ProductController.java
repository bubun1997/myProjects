package com.soumya.main.controller;

import java.util.List;

import org.springframework.context.annotation.Scope;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.soumya.main.dto.ProductDTO;
import com.soumya.main.service.ProductService;

@RestController
@RequestMapping("/products")
@Scope(scopeName = "request")
public class ProductController {
	
	private ProductService productService;

	public ProductController(ProductService productService) {
		this.productService = productService;
	}
	
	@PostMapping
	public ResponseEntity<ProductDTO> addProduct(@RequestBody ProductDTO productDTO){
		
		return ResponseEntity.status(HttpStatus.CREATED).body(this.productService.addProduct(productDTO));
	}
	
	@PutMapping("/{id}")
	public ResponseEntity<ProductDTO> updateProductById(@RequestBody ProductDTO productDto, @PathVariable String id){
		
		return ResponseEntity.status(HttpStatus.CREATED).body(this.productService.updateProduct(productDto, id));
	}
	
	@GetMapping
	public ResponseEntity<List<ProductDTO>> getAllProducts(){
		
		return ResponseEntity.ok(this.productService.getAllProducts());
	}
	

}
