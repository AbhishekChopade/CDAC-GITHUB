package tester;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import static utils.StockValidationRules.*;
import static utils.StockUtils.*;
import com.app.stocks.Stock;

import custom_exception.StockHandlingException;

public class StockTradingService {

	public static void main(String[] args) {
		try(Scanner sc =  new Scanner(System.in)){
			// Map<String,Stock> stockMap = new HashMap<>();
			 Map<String,Stock> stockMap = populateStocks();
			 boolean exit = false;
			 while(!exit) {
				 System.out.println("Enter Options :\n"+"1. Add New stock in the market\n"+"2. View Available stocks by Company\n"+
						 			"3. Purchase stocks\n"+"4. Sell Stocks\n"+"5. Save n Exit : Before terminating application \n"+"6. Print all details\n"+"7. Exit\n");
				 try {
					 switch(sc.nextInt()) {
					 case 1://Add New stock in the market
						 
						 System.out.println("Enter the stockid, stockName, companyName, stockPrice, "
						 		+ "closingDate ,quantity: ");
						 String stockId = sc.next();
						 checkDupStockId(stockId, stockMap);
						 Stock s1 = new Stock(stockId, sc.next(), sc.nextLine(), sc.nextDouble(), parseAndValidateDate(sc.next()), sc.nextInt());
						 stockMap.put(stockId, s1);
						 System.out.println("Stock is added");
						 break;
						 
					 case 2://View Available stocks by Company
						 System.out.println("Enter the company name :");
						 String companyName = sc.next();
						 for(Stock s : stockMap.values()) {
							 if(s.getCompanyName().equalsIgnoreCase(companyName)) {
								 System.out.println(stockMap.get(s.getStockId()));
							 }
						 }
						 sc.nextLine();
						 break;
						 
						 
					 case 3://Purchase stocks
						 System.out.println("Enter stockId and quantity");
						 s1 = findStockById(sc.next(), stockMap);
						 int quan = sc.nextInt();
						 s1.setQuantity(s1.getQuantity()+quan);
						 System.out.println("Stocks are purchased");
						 break;
						 
					 case 4://Sell Stocks
						 System.out.println("Enter stockId and quantity");
						 s1 = findStockById(sc.next(), stockMap);
						 quan = sc.nextInt();
						 if(quan>s1.getQuantity())
							 throw new StockHandlingException("Invalid quqntity");
						 else {
							 s1.setQuantity(s1.getQuantity()-quan);
							 System.out.println("Stocks are sold");
						 }
						 break;
						 
					 case 5://Save the Stocks in bin file
						 System.out.println("Enter the file name :");
						 try(ObjectOutputStream output = new ObjectOutputStream(new FileOutputStream(sc.next()))){
							 output.writeObject(stockMap);
							 System.out.println("Stocks are saved");
						 }catch(Exception e) {
							 e.printStackTrace();
						 }
						 break;
						 
					 case 6://Print all details
						 System.out.println("All stock details");
						 stockMap.forEach((i,s)->System.out.println(s));
						 break;
						 
					 case 7://Exit
						 exit = true;
						 System.out.println("Exit!!!!");
						 break;
					 
					 }
				 }catch (Exception e) {
					e.printStackTrace();
					sc.nextLine();
				}
			 }
		}
	}

}
