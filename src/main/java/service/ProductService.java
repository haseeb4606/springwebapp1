package service;
import dto.*;

public class ProductService {
	
	public ProductDto giveDimoProduct() {
		
		ProductDto p = new ProductDto();
		
		p.setName("Samsung");
		p.setModel("S 10 plus");
		p.setVersion("10.0");
		p.setDescriptions("Samsung S10 with dual sim");
		
		return p;
		
	}
	
	
	
	

}
