package BL.DataClasses;
/**
 *
 *
 */
public class Product {
	public int id_product;
	private String nameProduct;
	private double price;
	private double discount;
	private int quantity;
	private Member member;
	public String subcategory_name;
	public String description;
	public Product(int id_product, String nameProduct, double price, double discount, int quantity, Member member, String subcategory_name, String description) {
		this.id_product = id_product;
		this.nameProduct = nameProduct;
		this.price = price;
		this.discount = discount;
		this.quantity = quantity;
		this.member = member;
		this.subcategory_name = subcategory_name;
		this.description = description;
	}
	public int getID() {
		return this.id_product;
	}
	public String getName() {
		return this.nameProduct;
	}
	public Double getPrice() {
		return this.price;
	}
	public Double getDiscount() {
		return this.discount;
	}
	public int getQuantity() {
		return this.quantity;
	}
	public Member getMember() {
		return this.member;
	}
	public String getSubcategory() {
		return this.subcategory_name;
	}
	public String getDescription() {
		return this.description;
	}
}
