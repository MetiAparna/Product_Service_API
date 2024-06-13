package com.ass.product_api.repository.imp;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


import com.ass.product_api.entity.ProductEntity;
import com.ass.product_api.repository.ProductRepository;

@Repository
public class ProductRepositoryImp implements ProductRepository{

	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	public void saveProduct(ProductEntity entity) {
		
		try {
			Session session = sessionFactory.openSession();
			Transaction transaction = session.beginTransaction();
			session.save(entity);
			transaction.commit();
		
		}catch (Exception e) {
		
		
		}
	}

	@Override
	public List<ProductEntity> findProductById(Long id) {
		try {
			String hqlqry="from ProductEntity where id=:n";
			Session session = sessionFactory.openSession();
			Query query = session.createQuery(hqlqry);
			query.setParameter("n", id);
			return query.getResultList();
						
		}catch (Exception e) {
			// TODO: handle exception
		}
		
		return null;
	}

	@Override
	public List<ProductEntity> findAllProduct() {
		try {
			String hqlqry="from ProductEntity";
			Session session = sessionFactory.openSession();
			Query query = session.createQuery(hqlqry);
			return query.getResultList();
		}catch (Exception e) {
			// TODO: handle exception
		}
		return null;
	}

	@Override
	public List findProductQuantityById(Long id) {
		try {
			String hqlqry="select quantity from ProductEntity where id=:n";
			Session session = sessionFactory.openSession();
			Query query = session.createQuery(hqlqry);
			query.setParameter("n", id);
			return query.getResultList();
			
		}catch (Exception e) {
			// TODO: handle exception
		}
		return null;
	}

	@Override
	public void deleteProductById(Long id) {
		try {
			String hqlqry="delete from ProductEntity where id=:n";
			Session session = sessionFactory.openSession();
			Transaction transaction = session.beginTransaction();
			Query query = session.createQuery(hqlqry);
			query.setParameter("n", id);
			query.executeUpdate();
			transaction.commit();
			
		}catch (Exception e) {
			// TODO: handle exception
		}
	}

	@Override
	public List<ProductEntity> findAllProductSortedByName() {
		try {
			String hqlqry="from ProductEntity order by name asc";//desc
			Session session = sessionFactory.openSession();
			Query query = session.createQuery(hqlqry);
			return query.getResultList();
		}catch (Exception e) {
			// TODO: handle exception
		}
		
		return null;
	}

	@Override
	public void update(ProductEntity productEntity)
	{

	}

	@Override
	public List<ProductEntity> getProducrByName(String name) {
		try {
			String hqlqry="from ProductEntity where name =:n";
			Session session = sessionFactory.openSession();
			Query query = session.createQuery(hqlqry);
			query.setParameter("n",name);
			//query.executeUpdate();
			return query.getResultList();
		}catch (Exception e) {
			// TODO: handle exception
			return null;
		}
	}

	@Override
	public List<ProductEntity> getProductInRange(double lowerprice, double higherprice) {
		try {
			String hqlqry="from ProductEntity where  price between :n and :m";
			Session session = sessionFactory.openSession();
			Query query = session.createQuery(hqlqry);
			query.setParameter("n",lowerprice);
			query.setParameter("m",higherprice);

          	return query.getResultList();
		}catch (Exception e) {
			// TODO: handle exception
			return null;
		}
		
	}

	@Override
	public Double findProductPriceById(Long id) {
		
		try {
			String hqlqry="select price from ProductEntity where id=:n";
			Session session = sessionFactory.openSession();
			Query query = session.createQuery(hqlqry);
			query.setParameter("n",id);
			return (Double) query.getSingleResult();
			
		}catch (Exception e) {
			// TODO: handle exception
			return  null;

		}
	
		
	}
	
	
}
