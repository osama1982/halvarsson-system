package com.halvarsson.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
//@Table(name="items")
public class Items {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	//@Column(name="itemId")
	private int id;
	
	@NotNull
	@Size(min = 3, max= 30, message = "Must be 3 characters at least")
	//@Column(name="itemName")
	private String name;
	
	//@Column(name="itemDesc")
	private String desc;
	
	
	@NotNull
	@Min(value = 0, message = "Price cannont be lower than zero")
	//@Column(name="itemPrice")
	private double price;
	
	
	//@Column(name="category_id") 
	/*org.springframework.beans.factory.BeanCreationException: 
	Error creating bean with name 'entityManagerFactory' 
	defined in class path resource 
	[org/springframework/boot/autoconfigure/orm/jpa/HibernateJpaAutoConfiguration.class]: 
	Invocation of init method failed; nested exception is org.hibernate.AnnotationException: 
	@Column(s) not allowed on a @ManyToOne property: com.halvarsson.models.Items.category*/
	@ManyToOne
	private Categories category;
	
	public Items() {}
	
	public Items(String name, String desc, ItemSizes itemSize, double price,Categories category) {
		this.name = name;
		this.desc = desc;
		this.price = price;
		this.category = category;
		//this.itemSize = itemSize;
	}
	
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
	public Categories getCategory() {
		return category;
	}

	public void setCategory(Categories category) {
		this.category = category;
	}
	
	public String toString() {
		return String.format("Item: [id=%d, Name='%s', Description='%s' , Price='%d']", 
				id, name, desc, price);
		
	}
	
//	@Column(name="mc_itemSize")
//	private ItemSizes itemSize;
//	
//	public ItemSizes getItemSize() {
//		return itemSize;
//	}
//
//	public void setItemSize(ItemSizes itemSize) {
//		this.itemSize = itemSize;
//	}

}
