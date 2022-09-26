package br.com.fabtec.mapper;

import br.com.fabtec.data.vo.ProductVo;
import br.com.fabtec.modal.Product;

public final class ProductVoMapper {

	public static Product convertVoToProducts(ProductVo productVo) {
		
		Product product = Product.builder()
				.id(productVo.getId())
				.productName(productVo.getProductName())
				.category(productVo.getCategory())
				.brand(productVo.getBrand())
				.type(productVo.getType())
				.cost(productVo.getCost())
				.inventory(productVo.getInventory())
				.registrationResponsible(productVo.getRegistrationResponsible())
				.updateResponsible(productVo.getUpdateResponsible())
				.registrationDate(productVo.getRegistrationDate())
				.updateDate(productVo.getUpdateDate())
				.build();
		return product;
	}
	
	public static ProductVo convertProductsToVo(Product product) {
		
		ProductVo productVo = ProductVo.builder()
				.id(product.getId())
				.productName(product.getProductName())
				.category(product.getCategory())
				.brand(product.getBrand())
				.type(product.getType())
				.cost(product.getCost())
				.inventory(product.getInventory())
				.registrationResponsible(product.getRegistrationResponsible())
				.updateResponsible(product.getUpdateResponsible())
				.registrationDate(product.getRegistrationDate())
				.updateDate(product.getUpdateDate())
				.build();
		return productVo;
	}
	
}
