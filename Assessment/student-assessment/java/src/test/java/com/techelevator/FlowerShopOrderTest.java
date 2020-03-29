package com.techelevator;

import static org.junit.Assert.*;

import org.junit.Test;

public class FlowerShopOrderTest {

	FlowerShopOrder myNewOrder = new FlowerShopOrder("bouquet", 5);

	@Test
	public void test_delivery_total_sameDayDelivery_zipCode_25000_return_8_98() {
		double deliveryTotal = myNewOrder.deliveryTotal(true, "25000");
		double expected = 8.98;
		assertEquals(expected, deliveryTotal, .00001);
	}

	@Test
	public void test_delivery_total_sameDayDelivery_zipCode_12000_return_0() {
		double deliveryTotal = myNewOrder.deliveryTotal(true, "12000");
		double expected = 0;
		assertEquals(expected, deliveryTotal, .00001);
	} 

	@Test
	public void test_delivery_total_sameDayDelivery_zipCode_31000_return_12_98() {
		double deliveryTotal = myNewOrder.deliveryTotal(true, "31000");
		double expected = 12.98;
		assertEquals(expected, deliveryTotal, .00001);
	}

	@Test
	public void test_delivery_total_not_sameDayDelivery_zipCode_11000_return_0() {
		double deliveryTotal = myNewOrder.deliveryTotal(false, "11000");
		double expected = 0;
		assertEquals(expected, deliveryTotal, .00001);
	}

	@Test
	public void test_delivery_total_not_sameDayDelivery_zipCode_21000_return_3_99() {
		double deliveryTotal = myNewOrder.deliveryTotal(false, "21000");
		double expected = 3.99;
		assertEquals(expected, deliveryTotal, .00001);
	}

	@Test
	public void test_delivery_total_not_sameDayDelivery_zipCode_31000_return_6_99() {
		double deliveryTotal = myNewOrder.deliveryTotal(false, "31000");
		double expected = 6.99;
		assertEquals(expected, deliveryTotal, .00001);
	}

	@Test
	public void test_delivery_total_not_sameDayDelivery_zipCode_41000_return_19_99() {
		double deliveryTotal = myNewOrder.deliveryTotal(false, "41000");
		double expected = 19.99;
		assertEquals(expected, deliveryTotal, .00001);
	}

}
