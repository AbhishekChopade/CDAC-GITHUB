package utils;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;
import static java.time.LocalDate.parse;
import com.app.stocks.Stock;

import custom_exception.StockHandlingException;

public class StockUtils {
	public static Stock findStockById(String id ,Map<String,Stock> stockMap) throws StockHandlingException {
		
		if(!(stockMap.containsKey(id)))
			throw new StockHandlingException("Invalid id");
		return stockMap.get(id);
	}
	
	public static Map<String,Stock> populateStocks(){
		Map<String,Stock> stockMap = new HashMap<>();
		stockMap.put("STK001", new Stock("STK001", "Apple", "Apple", 150.50,parse("2023-12-21"), 100));
		stockMap.put("STK002", new Stock("STK002", "Microsoft", "Microsoft", 300.75, parse("2023-11-21"), 50));
		stockMap.put("STK003", new Stock("STK003", "Amazon", "Amazon.com", 2500.25, parse("2023-10-31"), 200));
		stockMap.put("STK004", new Stock("STK004", "Google", "Alphabet", 1800.80,parse("2023-12-25"), 75));
		stockMap.put("STK005", new Stock("STK005", "Tesla", "Tesla", 900.60, parse("2023-11-01"), 30));
		return stockMap;
	}
}
