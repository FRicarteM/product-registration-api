package br.com.fabtec.mapper;

import br.com.fabtec.data.vo.ProductsVo;
import br.com.fabtec.modal.Products;

public final class ProductsVoMapper {

	public static Products convertVoToProducts(ProductsVo productsVo) {
		
		Products products = Products.builder()
				.id(productsVo.getId())
				.productName(productsVo.getProductName())
				.category(productsVo.getCategory())
				.brand(productsVo.getBrand())
				.type(productsVo.getType())
				.cost(productsVo.getCost())
				.inventory(productsVo.getInventory())
				.registrationResponsible(productsVo.getRegistrationResponsible())
				.updateResponsible(productsVo.getUpdateResponsible())
				.registrationDate(productsVo.getRegistrationDate())
				.updateDate(productsVo.getUpdateDate())
				.build();
		return products;
	}
	
	public static ProductsVo convertProductsToVo(Products products) {
		
		ProductsVo productsVo = ProductsVo.builder()
				.id(products.getId())
				.productName(products.getProductName())
				.category(products.getCategory())
				.brand(products.getBrand())
				.type(products.getType())
				.cost(products.getCost())
				.inventory(products.getInventory())
				.registrationResponsible(products.getRegistrationResponsible())
				.updateResponsible(products.getUpdateResponsible())
				.registrationDate(products.getRegistrationDate())
				.updateDate(products.getUpdateDate())
				.build();
		return productsVo;
	}
	
}
