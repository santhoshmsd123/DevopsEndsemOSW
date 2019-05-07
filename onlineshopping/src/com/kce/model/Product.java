package com.kce.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="products")
public class Product {
		@Id
		@GeneratedValue(strategy=GenerationType.IDENTITY)
		@Column(name="id")
		private int id;
		@Column(name="laptop")
		private String laptop;
		@Column(name="mobile")
		private String mobile;
		@Column(name="books")
		private String books;
		public String getLaptop() {
			return laptop;
		}
		public void setLaptop(String laptop) {
			this.laptop = laptop;
		}
		public String getMobile() {
			return mobile;
		}
		public void setMobile(String mobile) {
			this.mobile = mobile;
		}
		public String getBooks() {
			return books;
		}
		public void setBooks(String books) {
			this.books = books;
		}
		public Product(String laptop,String mobile,String books)
		{
			this.laptop=laptop;
			this.mobile=mobile;
		this.books=books;
		}
		
		public Product()
		{
			
		}
		
}
	
