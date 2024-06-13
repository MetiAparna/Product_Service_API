package com.ass.product_api.service.imp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ass.product_api.entity.ProductEntity;
import com.ass.product_api.repository.imp.ProductRepositoryImp;
import com.ass.product_api.service.ProductService;

@Service
public class ProductServiceImp  implements ProductService {

	@Autowired
	private ProductRepositoryImp productRepositoryImp;
	
	@Override
	public void saveProduct(ProductEntity entity) {
		
		  productRepositoryImp.saveProduct(entity);
	}

	@Override
	public List<ProductEntity> findProductById(Long id) {
		return productRepositoryImp.findProductById(id);
	}

	@Override
	public List<ProductEntity> findAllProduct() {
		return productRepositoryImp.findAllProduct();
	}

	@Override
	public List findProductQuantityById(Long id) {
		return productRepositoryImp.findProductQuantityById(id);
	}

	@Override
	public void deleteProductById(Long id) {
		 productRepositoryImp.deleteProductById(id);
	}

	@Override
	public List<ProductEntity> findAllProductSortedByName() {
		return productRepositoryImp.findAllProductSortedByName();
	}
	@Override
	public void update(ProductEntity productEntity)
	{
		productRepositoryImp.update(productEntity);
	}

	@Override
	public List<ProductEntity> getProductByName(String name) {
		return productRepositoryImp.getProducrByName(name);
	}

	@Override
	public List<ProductEntity> getProductInRange(double lowerprice, double higherprice) {
		return productRepositoryImp.getProductInRange(lowerprice, higherprice);
	}

	@Override
	public Double findProductPriceById(Long id) {
		return productRepositoryImp.findProductPriceById(id);
		// TODO Auto-generated method stub
		
	}

}
