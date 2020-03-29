package com.techelevator;

public class FlowerShopOrder {

	private String bouquetType;
	private int numberOfRoses;
	private double subtotal;

	public FlowerShopOrder(String bouquetType, int numberOfRoses) {

		this.bouquetType = bouquetType;
		this.numberOfRoses = numberOfRoses;
		this.subtotal = 19.99 + (numberOfRoses * 2.99);
	}

	public double getSubtotal() {
		return this.subtotal;
	}

	public double deliveryTotal(boolean sameDayDelivery, String zipcode) {

		int intZipcode = Integer.parseInt(zipcode); 
		
		if (sameDayDelivery) {
			if (intZipcode >= 10000 && intZipcode < 20000) {
				return 0.00;
			} else if (intZipcode >= 20000 && intZipcode < 30000) {
				double sameDayDeliveryCharge = 5.99;
				double deliveryCharge = 2.99;
				double totalCharge = sameDayDeliveryCharge + deliveryCharge;
				return totalCharge;
			} else if (intZipcode >= 30000 && intZipcode < 40000) {
				double sameDayDeliveryCharge = 5.99;
				double deliveryCharge = 6.99;
				double totalCharge = sameDayDeliveryCharge + deliveryCharge;
				return totalCharge;
			}
			
		} else if (!sameDayDelivery) {
			if (intZipcode >= 10000 && intZipcode < 20000) {
				return 0.00;
			} else if (intZipcode >= 20000 && intZipcode < 30000) {
				return 3.99;
			} else if (intZipcode >= 30000 && intZipcode < 40000) {
				return 6.99;
			}
		}
		return 19.99;
	}
	
	@Override
	public String toString() {
		return "ORDER - " + bouquetType + " - " + numberOfRoses + " - " + subtotal;
	}

}
