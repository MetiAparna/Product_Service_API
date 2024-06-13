package com.ass.product_api.repository;

import java.util.List;

import com.ass.product_api.entity.ProductEntity;


public interface ProductRepository {
	
    public  void  saveProduct(ProductEntity  entity);
	
	public   List<ProductEntity>  findProductById(Long id);
	
	public List<ProductEntity> findAllProduct();
	
	public List findProductQuantityById(Long id);
	
	public  void deleteProductById(Long id);
	
	public List<ProductEntity> findAllProductSortedByName();

  public void update(ProductEntity productEntity);
  
  public List<ProductEntity> getProducrByName(String name);
  
  public List<ProductEntity> getProductInRange(double lowerprice,double higherprice);
  
  public Double findProductPriceById(Long id);


}
