package com.soumya.main.service;

import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.soumya.main.dto.ProductDTO;
import com.soumya.main.entity.Product;
import com.soumya.main.repository.ProductRepository;

@Service
public class ProductService {
	
	private ProductRepository productRepository;

	public ProductService(ProductRepository productRepository) {
		this.productRepository = productRepository;
		
	}
	
	@Transactional
	public ProductDTO addProduct(ProductDTO productDto) {
		
		Product product = Product.
						  builder().
						  productId(UUID.randomUUID().toString()).
						  productName(productDto.getProduct_name()).
						  productPrice(productDto.getProduct_price()).
						  productStocks(productDto.getProduct_stocks()).
						  build();
		
		this.productRepository.save(product);
		
		return productDto;
		
	}
	
	@Transactional
	public ProductDTO updateProduct(ProductDTO productDto,String id) {
		
		Product myProduct = this.productRepository.findById(id).get();
		
		myProduct.setProductName(productDto.getProduct_name());
		myProduct.setProductPrice(productDto.getProduct_price());
		myProduct.setProductStocks(productDto.getProduct_stocks());
		
		return productDto;
	}
	
	public List<ProductDTO> getAllProducts(){
		
		return this.productRepository.
					findAll().
					stream().
					map(	product -> ProductDTO.
			            		       builder().
			            		       product_name(product.getProductName()).
			            		       product_price(product.getProductPrice()).
			            		       product_stocks(product.getProductStocks()).
			            		       build()
            		 
            		 
            		 ).
					collect(Collectors.toList());

	}
	
	
}
