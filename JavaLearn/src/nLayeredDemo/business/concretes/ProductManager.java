package nLayeredDemo.business.concretes;

import java.util.List;

import nLayeredDemo.business.abstracts.ProductService;
import nLayeredDemo.core.LoggerManager;
import nLayeredDemo.dataAccess.abstracts.ProductDao;
import nLayeredDemo.entities.concretes.Product;

public class ProductManager implements ProductService{
	//
	private ProductDao productDao;
	private LoggerManager loggerManager;

	public ProductManager(ProductDao productDao , LoggerManager loggerManager) {
		super();
		this.productDao = productDao;
		this.loggerManager = loggerManager;
	}

	@Override
	public void add(Product product) {
		//Ýþ kodlarý yazýlacak
		if(product.getCatagoryId() == 1) {
			System.out.println("Bu katagori ürün kabul etmiyor");
			return;//ifi terk ediyoruz.
		}
		this.productDao.add(product);
		this.loggerManager.logToSystem("eklendi");
		
	}

	@Override
	public List<Product> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
