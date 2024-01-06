package utils;

import java.time.LocalDate;
import java.util.Map;

import com.app.core.Publication;

import custom_exception.PublicationHandlingException;

public class PublicationValidationRules {
	
	public static LocalDate parseAndValidateDate(String date) {
		return LocalDate.parse(date);
	}
	
	public static void checkDupTitle(String title,Map<Integer,Publication> pubMap) throws PublicationHandlingException {
		for(Publication p:pubMap.values()) {
			if(p.getPubTitle().equalsIgnoreCase(title))
				throw new PublicationHandlingException("Duplicate title found");
			
		}
	}
	
//	public static Publication validateAll(String pubTitle, double price, String pubDate, int rating,Map<Integer,Publication> pubMap) throws PublicationHandlingException {
//		LocalDate  publishDate = parseAndValidateDate(pubDate);
//		checkDupTitle(pubTitle,pubMap);
//		
//		return new Publication(rating, pubTitle, price, publishDate, rating);
//	}
}
