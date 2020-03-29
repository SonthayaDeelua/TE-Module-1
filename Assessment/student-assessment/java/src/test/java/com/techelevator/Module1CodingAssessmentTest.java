package com.techelevator;

import static org.junit.Assert.*;

import org.junit.Test;

public class Module1CodingAssessmentTest {

	FlowerShopOrder myNewOrder = new FlowerShopOrder("bouquet", 5);

	@Test
	public void test_subTotal_if_basic_bouguet_no_add_flower_return_19_99() {
		FlowerShopOrder newOrder = new FlowerShopOrder("basic", 0);
		double total = 0;
		total = total + newOrder.getSubtotal();
		double expected = 19.99;
		assertEquals(expected, total, .00001);
	}
	
	@Test
	public void test_subTotal_if_Elite_bouguet_add_12_flower_return_55_87() {
		FlowerShopOrder newOrder = new FlowerShopOrder("Elite",12);
		double total = 0;
		total = total + newOrder.getSubtotal();
		double expected = 55.87;
		assertEquals(expected, total, .00001);
	}
	
	@Test
	public void test_subTotal_if_Elegant_bouguet_add_24_flower_return_91_75() {
		FlowerShopOrder newOrder = new FlowerShopOrder("Elegant",24);
		double total = 0;
		total = total + newOrder.getSubtotal();
		double expected = 91.75;
		assertEquals(expected, total, .00001);
	}
	
	@Test
	public void test_subTotal_if_Apology_bouguet_add_48_flower_return_163_51() {
		FlowerShopOrder newOrder = new FlowerShopOrder("Apology",48);
		double total = 0;
		total = total + newOrder.getSubtotal();
		double expected = 163.51;
		assertEquals(expected, total, .00001);
	}
	
	@Test
	public void test_subTotal_if_Nuptial_bouguet_add_18_flower_return_73_81() {
		FlowerShopOrder newOrder = new FlowerShopOrder("Nuptial",18);
		double total = 0;
		total = total + newOrder.getSubtotal();
		double expected = 73.81;
		assertEquals(expected, total, .00001); 
	}
	
	@Test
	public void test_subTotal_if_Bereavement_bouguet_add_18_flower_return_55_87() {
		FlowerShopOrder newOrder = new FlowerShopOrder("Bereavement",12);
		double total = 0;
		total = total + newOrder.getSubtotal();
		double expected = 55.87;
		assertEquals(expected, total, .00001);
	}
}
