package br.com.fabtec.modal;

import java.io.Serializable;
import java.time.ZonedDateTime;

import jakarta.persistence.Table;

@Table(name = "products")
public class Products implements Serializable {

	private static final long serialVersionUID = -8499493484763414150L;
	
	private Long id;
	private String productName;
	private String category;
	private String brand;
	private String type;
	private double value;
	private double inventory;
	private String registrationResponsible;
	private String updateResponsible;
	private ZonedDateTime registrationDate;
	private ZonedDateTime updateDate;

}
