package nLayeredDemo;

import nLayeredDemo.business.abstracts.ProductService;
import nLayeredDemo.business.concretes.ProductManager;
import nLayeredDemo.core.LoggerManager;
import nLayeredDemo.dataAccess.concretes.HibernateProductDao;
import nLayeredDemo.dataAccess.concretes.TestProductDao;
import nLayeredDemo.entities.concretes.Product;

public class Main {

	public static void main(String[] args) {
		
		ProductService productService = new ProductManager(new HibernateProductDao() , new LoggerManager());
		ProductService productServiceTest = new ProductManager(new TestProductDao(),new LoggerManager());
		Product elma = new Product(1,2,"Elma",12,50);
		Product test = new Product(1,2,"Test",13,60);
		productService.add(elma);
		productServiceTest.add(test);
		

	}

}
