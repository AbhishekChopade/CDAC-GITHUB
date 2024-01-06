package utils;

import java.time.LocalDate;
import java.util.Map;

import com.app.stocks.Stock;

import custom_exception.StockHandlingException;

public class StockValidationRules {
	public static void checkDupStockId(String sId, Map<String,Stock> stockMap) throws StockHandlingException {
		if(stockMap.containsKey(sId))
			throw new StockHandlingException("Duplicate stock id found");
		System.out.println("No Duplicates!!!");
	}
	
	public static LocalDate parseAndValidateDate(String date) throws StockHandlingException {
		LocalDate closingDate =  LocalDate.parse(date);
		if(closingDate.isBefore(LocalDate.now()))
		{
			throw new StockHandlingException("Invalid Date");
		}
		return closingDate;
	}
	
	public static int checkAvailableQuantity(int id,int quantity, Map<String,Stock> stockMap) throws StockHandlingException{
		Stock s1 = stockMap.get(id);
		if(s1==null)
			throw new StockHandlingException("Invlid id");
		if(s1.getQuantity()<quantity)
			throw new StockHandlingException("Invalid Quantity is more than available quantity");
		return quantity;
	}
}
