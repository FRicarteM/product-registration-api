package br.com.fabtec.vo.v1;

import java.io.Serializable;
import java.time.ZonedDateTime;
import java.util.Objects;

import br.com.fabtec.enums.ProductCategory;
import br.com.fabtec.enums.ProductType;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Positive;
import jakarta.validation.constraints.PositiveOrZero;
import jakarta.validation.constraints.Size;

public class ProductsVo implements Serializable {

	private static final long serialVersionUID = -897842491746305414L;

	private Long id;
	
	@Size(min = 0, max = 80,
			message = "Name out of size limit")
	@NotBlank(message = "The field must be filled")
	private String productName;
	
	@Size(min = 0, max = 15,
			message = "Number out of size limit")
	@Positive(message = "Number not be negative")
	@NotBlank(message = "The field must be filled")
	private Integer category;
	
	@Size(min = 0, max = 20,
			message = "Name out of size limit")
	@PositiveOrZero(message = "Number not be negative or zero")
	@NotBlank(message = "The field must be filled")
	private String brand;
	
	@Size(min = 0, max = 17,
			message = "Number out of size limit")
	@Positive(message = "Number not be negative")
	@NotBlank(message = "The field must be filled")
	private Integer type;
	
	@Size(min = 0, max = 6,
			message = "Number out of size limit")
	@PositiveOrZero(message = "Number not be negative or zero")
	@NotBlank(message = "The field must be filled")
	private double cost;
	
	@Size(min = 0, max = 6,
			message = "Number out of size limit")
	@NotBlank(message = "The field must be filled")
	private double inventory;
	
	@Size(min = 0, max = 80,
			message = "Name out of size limit")
	@NotBlank(message = "The field must be filled")
	private String registrationResponsible;
	
	@Size(min = 0, max = 80,
			message = "Name out of size limit")
	@NotBlank(message = "The field must be filled")
	private String updateResponsible;
	
	private ZonedDateTime registrationDate;
	
	private ZonedDateTime updateDate;
	
	public ProductsVo() {
	}
	public ProductsVo(Long id, String productName, ProductCategory category, String brand, ProductType type, double cost,
			double inventory, String registrationResponsible, String updateResponsible, ZonedDateTime registrationDate,
			ZonedDateTime updateDate) {
		this.id = id;
		this.productName = productName;
		setCategory(category);;
		this.brand = brand;
		setType(type);;
		this.cost = cost;
		this.inventory = inventory;
		this.registrationResponsible = registrationResponsible;
		this.updateResponsible = updateResponsible;
		this.registrationDate = registrationDate;
		this.updateDate = updateDate;
	}

	public Long getId() {
		return id;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public ProductCategory getCategory() {
		return ProductCategory.valueOf(category);
	}
	public void setCategory(ProductCategory category) {
		this.category = category.getCategoryCode();
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public ProductType getType() {
		return ProductType.valueOf(type);
	}
	public void setType(ProductType type) {
		this.type = type.getTypeCode();
	}
	public double getCost() {
		return cost;
	}
	public void setCost(double cost) {
		this.cost = cost;
	}
	public double getInventory() {
		return inventory;
	}
	public void setInventory(double inventory) {
		this.inventory = inventory;
	}
	public String getRegistrationResponsible() {
		return registrationResponsible;
	}
	public void setRegistrationResponsible(String registrationResponsible) {
		this.registrationResponsible = registrationResponsible;
	}
	public String getUpdateResponsible() {
		return updateResponsible;
	}
	public void setUpdateResponsible(String updateResponsible) {
		this.updateResponsible = updateResponsible;
	}
	public ZonedDateTime getRegistrationDate() {
		return registrationDate;
	}
	public void setRegistrationDate(ZonedDateTime registrationDate) {
		this.registrationDate = registrationDate;
	}
	public ZonedDateTime getUpdateDate() {
		return updateDate;
	}
	public void setUpdateDate(ZonedDateTime updateDate) {
		this.updateDate = updateDate;
	}

	
	
	@Override
	public int hashCode() {
		return Objects.hash(brand, category, id, inventory, productName, registrationDate, registrationResponsible,
				type, updateDate, updateResponsible, cost);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ProductsVo other = (ProductsVo) obj;
		return Objects.equals(brand, other.brand) && Objects.equals(category, other.category)
				&& Objects.equals(id, other.id)
				&& Double.doubleToLongBits(inventory) == Double.doubleToLongBits(other.inventory)
				&& Objects.equals(productName, other.productName)
				&& Objects.equals(registrationDate, other.registrationDate)
				&& Objects.equals(registrationResponsible, other.registrationResponsible)
				&& Objects.equals(type, other.type) && Objects.equals(updateDate, other.updateDate)
				&& Objects.equals(updateResponsible, other.updateResponsible)
				&& Double.doubleToLongBits(cost) == Double.doubleToLongBits(other.cost);
	}

	
	public static ProductsVoBuilder builder() {
		return new ProductsVoBuilder();
	}
	
	public static class ProductsVoBuilder {
		
		private Long id;
		private String productName;
		private ProductCategory category;
		private String brand;
		private ProductType type;
		private double cost;
		private double inventory;
		private String registrationResponsible;
		private String updateResponsible;
		private ZonedDateTime registrationDate;
		private ZonedDateTime updateDate;
		
		public ProductsVoBuilder() {
		}
		
		public ProductsVoBuilder id(Long id) {
			this.id = id;
			return this;
		}
		
		public ProductsVoBuilder productName(String productName) {
			this.productName = productName;
			return this;
		}
		
		public ProductsVoBuilder category(ProductCategory category) {
			this.category = category;
			return this;
		}
		
		public ProductsVoBuilder brand(String brand) {
			this.brand = brand;
			return this;
		}
		
		public ProductsVoBuilder type(ProductType type) {
			this.type = type;
			return this;
		}
		
		public ProductsVoBuilder cost(double cost) {
			this.cost = cost;
			return this;
		}
		
		public ProductsVoBuilder inventory(double inventory) {
			this.inventory = inventory;
			return this;
		}
		
		public ProductsVoBuilder registrationResponsible(String registrationResponsible) {
			this.registrationResponsible = registrationResponsible;
			return this;
		}
		
		public ProductsVoBuilder updateResponsible(String updateResponsible) {
			this.updateResponsible = updateResponsible;
			return this;
		}
		
		public ProductsVoBuilder registrationDate(ZonedDateTime registrationDate) {
			this.registrationDate = registrationDate;
			return this;
		}
		
		public ProductsVoBuilder updateDate(ZonedDateTime updateDate) {
			this.updateDate = updateDate;
			return this;
		}
		
		public ProductsVo build() {
			return new ProductsVo(id, 
								productName, 
								category, 
								brand, 
								type, 
								cost, 
								inventory, 
								registrationResponsible, 
								updateResponsible, 
								registrationDate, 
								updateDate);
		}
		
		
	}

	
}
