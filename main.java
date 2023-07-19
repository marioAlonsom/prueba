package prueba;

import java.text.SimpleDateFormat;
import java.util.Comparator;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;

public class main {
//Ejercicio 2
	public static void main(String[] args) {
		Date date = new Date();
		SimpleDateFormat format = new SimpleDateFormat("MM-dd-yyyy");

		date = format.parse(format.format(date));
		
		
		  
	}
	private Optional<BookDate> filter(String filter, List<Book> books){
		Iterator<Book> it = books.iterator();
		List<Book> actualList;
		
		while (it.hasNext()) {
		    Book book = it.next();
		    if (book.getDate().equals(null)) {
		        it.remove();
		        System.out.println(it.next());
		    }
		    if (book.sumary.contains(book.getAuthor().getName()) || book.title.contains(book.getAuthor().getName()))
		    {
		    	it.remove();
		    	actualList.add(it.next());
		    }
		    actualList.sort(Comparator.comparing(Book :: book.getDate()));
		    actualList.sort(Comparator.comparing(Book :: book.getAuthor().getBio()));
		    }
		}
		
		}

}
