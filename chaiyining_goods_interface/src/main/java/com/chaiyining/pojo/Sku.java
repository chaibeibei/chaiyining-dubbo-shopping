package com.chaiyining.pojo;

import java.io.Serializable;
import java.util.Date;

import org.elasticsearch.search.DocValueFormat.Decimal;

public class Sku implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 798128209869982616L;

	private Integer id;
	private String title;
	private String sell_point;
	private String price;
	private Integer stock_count;
	private String barcode;
	private String image;
	private String status;
	private Date create_time;
	private Date update_time;
	private Decimal cost_price;
	private String market_price;
	private Integer spu_id;
	private String cart_thumbnail;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getSell_point() {
		return sell_point;
	}

	public void setSell_point(String sell_point) {
		this.sell_point = sell_point;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	public Integer getStock_count() {
		return stock_count;
	}

	public void setStock_count(Integer stock_count) {
		this.stock_count = stock_count;
	}

	public String getBarcode() {
		return barcode;
	}

	public void setBarcode(String barcode) {
		this.barcode = barcode;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Date getCreate_time() {
		return create_time;
	}

	public void setCreate_time(Date create_time) {
		this.create_time = create_time;
	}

	public Date getUpdate_time() {
		return update_time;
	}

	public void setUpdate_time(Date update_time) {
		this.update_time = update_time;
	}

	public Decimal getCost_price() {
		return cost_price;
	}

	public void setCost_price(Decimal cost_price) {
		this.cost_price = cost_price;
	}

	public String getMarket_price() {
		return market_price;
	}

	public void setMarket_price(String market_price) {
		this.market_price = market_price;
	}

	public Integer getSpu_id() {
		return spu_id;
	}

	public void setSpu_id(Integer spu_id) {
		this.spu_id = spu_id;
	}

	public String getCart_thumbnail() {
		return cart_thumbnail;
	}

	public void setCart_thumbnail(String cart_thumbnail) {
		this.cart_thumbnail = cart_thumbnail;
	}

	public Sku(Integer id, String title, String sell_point, String price, Integer stock_count, String barcode,
			String image, String status, Date create_time, Date update_time, Decimal cost_price, String market_price,
			Integer spu_id, String cart_thumbnail) {
		super();
		this.id = id;
		this.title = title;
		this.sell_point = sell_point;
		this.price = price;
		this.stock_count = stock_count;
		this.barcode = barcode;
		this.image = image;
		this.status = status;
		this.create_time = create_time;
		this.update_time = update_time;
		this.cost_price = cost_price;
		this.market_price = market_price;
		this.spu_id = spu_id;
		this.cart_thumbnail = cart_thumbnail;
	}

	public Sku() {
		super();
	}

	@Override
	public String toString() {
		return "Sku [id=" + id + ", title=" + title + ", sell_point=" + sell_point + ", price=" + price
				+ ", stock_count=" + stock_count + ", barcode=" + barcode + ", image=" + image + ", status=" + status
				+ ", create_time=" + create_time + ", update_time=" + update_time + ", cost_price=" + cost_price
				+ ", market_price=" + market_price + ", spu_id=" + spu_id + ", cart_thumbnail=" + cart_thumbnail + "]";
	}

}
