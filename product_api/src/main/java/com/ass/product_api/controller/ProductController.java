package com.ass.product_api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ass.product_api.entity.ProductEntity;
import com.ass.product_api.service.imp.ProductServiceImp;

@RestController//combintion of response body (java to json)  and controller & create object of controlleris used to create requestBody(json to java)
public class ProductController {
	
	@Autowired
	private ProductServiceImp productServiceImp;
	
	
	    @PostMapping(value="/saveProduct")
	    public  void  saveProduct(@RequestBody  ProductEntity  entity) {
		 
		productServiceImp.saveProduct(entity);
	    }//c
		
	    @GetMapping(value="/findProductById/{alt_key}")
		public   List<ProductEntity>  findProductById(@PathVariable("alt_key") Long id) {
			return productServiceImp.findProductById(id);
		}//c
		
	    @GetMapping(value="/findAllProduct")
		public List<ProductEntity> findAllProduct() {
			
			return productServiceImp.findAllProduct();
		}//c
		
	    @GetMapping(value="/findProductQuantityById/{alt_key}")
		public List findProductQuantityById(@PathVariable("alt_key")  Long id) {
			return productServiceImp.findProductQuantityById(id);
		}//c
	    
		@DeleteMapping(value="/deleteProductById/{alt_key}")
		public  void deleteProductById(@PathVariable("alt_key")  Long id) {
			 productServiceImp.deleteProductById(id);
		}//c
		
		@GetMapping(value="findAllProductSortedByName")
		public List<ProductEntity> findAllProductSortedByName() {
			return productServiceImp.findAllProductSortedByName();
		}
		
		@PostMapping(value="/upadate")
		public void update(ProductEntity productEntity)
		{
			productServiceImp.update(productEntity);
			
		}

		//@RequestParameter ->is used to fetch the data from the parameter request
		@GetMapping(value="/getProductByName")
		public List<ProductEntity> getProductByName(@RequestParam("name")  String name)//@pathVariable("name")
		{
			return productServiceImp.getProductByName(name);
			
		}
		
		  @GetMapping(value="/getProductInRange")
		  public List<ProductEntity> getProductInRange(@RequestParam("lowerprice")   double lowerprice, @RequestParam("higherprice") double higherprice) {
			return productServiceImp.getProductInRange(lowerprice, higherprice);
		}
		  
		  @GetMapping(value="/findProductPriceById/{alt_key}")
		  public Double findProductPriceById(@PathVariable("alt_key")  Long id) {
			  System.out.println("productPriceid = "+id);
			return  productServiceImp.findProductPriceById(id);
			  
		}



}
