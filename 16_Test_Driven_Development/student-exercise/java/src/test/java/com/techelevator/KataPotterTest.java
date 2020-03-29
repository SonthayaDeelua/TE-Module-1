package com.techelevator;

import org.junit.*;
import org.junit.runners.MethodSorters;
import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class KataPotterTest {
	
	
	    KataPotter basket = new KataPotter();   

	    @Test
	    public void test_if_no_book_in_basket_return_0() {
	        int[] bookArray = null;
	        Assert.assertEquals(0, basket.getCost(bookArray), 0);
	    }

	    @Test       
	    public void test_if_only_one_firstBook_in_bastket_return_cost_8() {
	        int[] bookArray = {0};
	        Assert.assertEquals(8, basket.getCost(bookArray), 0);

	    }

	    @Test       
	    public void test_if_only_one_2ndBook_in_basket_return_cost_8() {
	        int[] bookArray = {1};
	        Assert.assertEquals(8, basket.getCost(bookArray), 0);

	    }

	    @Test       
	    public void test_if_only_one_3rdBook_in_basket_return_cost_8() {
	        int[] bookArray = {2};
	        Assert.assertEquals(8, basket.getCost(bookArray), 0);

	    }

	     @Test       
	    public void test_if_only_one_4thBook_in_basket_return_cost_8() {
	        int[] bookArray = {3};
	        Assert.assertEquals(8, basket.getCost(bookArray), 0);

	    }

	    @Test       
	    public void test_if_only_one_5thBook_in_basket_return_cost_8() {
	        int[] bookArray = {4};
	        Assert.assertEquals(8, basket.getCost(bookArray), 0);

	    }

	    @Test       
	    public void test_if_buy_two_of_same_Book__cost_16() {
	        int[] bookArray = {0,0};
	        Assert.assertEquals(8 * 2, basket.getCost(bookArray), 0);

	    }

	    @Test       
	    public void test_if_buy_three_of_same_Book__cost_24() {
	        int[] bookArray = {1,1,1};
	        Assert.assertEquals(8 * 3, basket.getCost(bookArray), 0);

	    }

	    @Test       
	    public void test_if_buy_two_differenc_book_get_5percent_discount() {
	        int[] bookArray = {0,1};
	        Assert.assertEquals(8 * 2 * 0.95, basket.getCost(bookArray), 0);

	    }

	    @Test       
	    public void test_if_buy_three_diffence_book_get_10percent_discount() {
	        int[] bookArray = {0,2,4};
	        Assert.assertEquals(8 * 3 * 0.9, basket.getCost(bookArray), 0);

	    }

	    @Test       
	    public void test_if_buy_four_diffence_book_get_20percent_discount() {
	        int[] bookArray = {0, 1, 2, 4};
	        Assert.assertEquals(8 * 4 * 0.8, basket.getCost(bookArray), 0);  
	    }

	    @Test       
	    public void test_if_buy_five_diffence_book_get_25percent_discount() {   
	        int[] bookArray = {0, 1, 2, 3, 4};
	        Assert.assertEquals(8 * 5 * 0.75, basket.getCost(bookArray), 0);  
	    }

	    @Test       
	    public void test_if_buy_3books_but_2book_are_the_same() { 
	        int[] bookArray = {0, 0, 1};
	        Assert.assertEquals(8 + (8 * 2 * 0.95), basket.getCost(bookArray), 0);  
	    }

	     @Test       
	    public void test_if_buy_4books_2each_get_5percent_discount_each() { 
	        int[] bookArray = {0, 0, 1, 1};
	        Assert.assertEquals(2 * (8 * 2 * 0.95), basket.getCost(bookArray), 0);  
	    }

	    @Test       
	    public void test_buy_6books_4difference_and_2difference_condition() { 
	        int[] bookArray = {0, 0, 1, 2, 2, 3};
	        Assert.assertEquals((8 * 4 * 0.8) + (8 * 2 * 0.95), basket.getCost(bookArray), 0);  
	    }

	    @Test       
	    public void test_buy_6books_5difference_and_1_condition() { 
	        int[] bookArray = {0, 1, 1, 2, 3, 4};
	        Assert.assertEquals(8 + (8 * 5 * 0.75), basket.getCost(bookArray), 0);  
	    }

	    @Test       
	    public void test_buy_8books_with_2set_of_4diffence_condition() { 
	    	int[] bookArray = {0, 0, 1, 1, 2, 2, 3, 4};
	        Assert.assertEquals(2 * (8 * 4 * 0.8), basket.getCost(bookArray), 0);  
	    }

	    @Test       
	    public void test_complex1_buy_23books_with_3of5difference_and_2of4difference_condition() {        
	        int[] bookArray =                             {0, 0, 0, 0, 0, 
	                                                       1, 1, 1, 1, 1, 
	                                                       2, 2, 2, 2, 
	                                                       3, 3, 3, 3, 3, 
	                                                       4, 4, 4, 4};
	        Assert.assertEquals(3 * (8 * 5 * 0.75) + 2 * (8 * 4 * 0.8), basket.getCost(bookArray), 0);  
	    }

	    @Test       
	    public void test_complex2_buy_11books_with_2of4difference_and_1of3difference_condition() { 
	        int[] bookArray = {0, 0, 0, 1, 1, 1, 2, 2, 2, 3, 4};
	        Assert.assertEquals(2 * (8 * 4 * 0.8) + (8 * 3 * 0.9), basket.getCost(bookArray), 0);  
	    }
	}


