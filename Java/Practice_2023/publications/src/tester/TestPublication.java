package tester;

import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;

import static utils.PublicationValidationRules.*;
import com.app.core.Book;
import com.app.core.Publication;
import com.app.core.Tape;

public class TestPublication {

	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in)){
			Map<Integer,Publication> pubMap = new HashMap<>();
			boolean exit = false;
			while(!exit) {
				System.out.println("Enter Options :\n"+"1. Publish new book\n"+"2. Publish new tape\n"+
								"3. List all book publications ordered by publish date in descending order\n"+
								"4. List top 5 publications of current year based on rating\n"+
								"5. Remove all publications which are 5 years old\n"+"6. Display all details\n"+"7. Exit\n");
				try {
					switch(sc.nextInt()) {
					case 1://Publish new book
						System.out.println("Enter  pubTitle,  price, publishDate, rating, pageCount");
						String title = sc.next();
						checkDupTitle(title, pubMap);
						Publication p1 = new Book(title, sc.nextDouble(), parseAndValidateDate(sc.next()), 
								sc.nextInt(), sc.nextInt());
						pubMap.put(p1.getPubId(), p1);
						System.out.println("Book is added");
						break;
						
					case 2:// Publish new tape
						System.out.println("Enter  pubTitle,  price, publishDate, rating, playingTime");
						title = sc.next();
						checkDupTitle(title, pubMap);
						p1 = new Tape(title, sc.nextDouble(), parseAndValidateDate(sc.next()), 
								sc.nextInt(), sc.nextInt());
						pubMap.put(p1.getPubId(), p1);
						System.out.println("Tape is added");
						break;
						
					case 3://List all book publications ordered by publish date in descending order
						List <Publication> pubList = new ArrayList<>(pubMap.values());
						List<Publication> bookList =  new ArrayList<>();
						for(Publication p:pubList)
						{
							if(p instanceof Book && p!=null) {
								bookList.add(p);
							
							}else
								continue;
						}

						Collections.sort(bookList, (b1,b2)->b2.getPublishDate().compareTo(b1.getPublishDate()));
						System.out.println("All book publications ordered by publish date in descending order");
						bookList.forEach(b->System.out.println(b));
						break;
						
					case 4://List top 5 publications of current year based on rating
						pubList = new ArrayList<>(pubMap.values());
						int counter = 5;
						Collections.sort(pubList, (b1,b2)->((Integer)b2.getRating()).compareTo(b1.getRating()));
						System.out.println("List top 5 publications of current year based on rating");
						for(Publication p:pubList) {
							if(counter>0) {
								System.out.println(p);
								counter--;
							}
						}
						break;
						
					case 5://Remove all publications which are 5 years old
						
						pubList = new ArrayList<>(pubMap.values());
						Iterator<Publication> pubItr = pubList.iterator();
						while(pubItr.hasNext()) {
							Publication p = pubItr.next();
							int year = Period.between(p.getPublishDate(),LocalDate.now()).getYears();
							if(year>=5) {
								System.out.println("Publication removed "+p);
								pubItr.remove();
							}
							
						}

						
//						LocalDate today = LocalDate.now();
//						List<Integer> IdList = pubMap.values().stream().filter(p->p.getPublishDate().isBefore(today.minusYears(5))).map(p->p.getPubId()).collect(Collectors.toList());
						
						break;
						
					case 6://Display all details
						pubMap.forEach((pk,pv)->System.out.println(pv));
						break;
						
					case 7://Exit
						exit = true;
						System.out.println("Exit!!!");
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
