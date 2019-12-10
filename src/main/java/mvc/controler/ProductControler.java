package mvc.controler;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import dto.ProductDto;
import service.ProductService;

@Controller
public class ProductControler {
	private ProductService productService;

	@RequestMapping(value = "product", method = RequestMethod.GET)
	public ModelAndView showPage() {

		System.out.println("I am inside product api");

		ProductDto p = productService.giveDimoProduct();
		System.out.println(p.toString());

		ModelAndView mv = new ModelAndView("product");
		mv.addObject("pt", p);
		mv.addObject("username", "Hasib");
		return mv;

	}

	public ProductService getProductService() {
		return productService;
	}

	public void setProductService(ProductService productService) {
		this.productService = productService;
	}

}
