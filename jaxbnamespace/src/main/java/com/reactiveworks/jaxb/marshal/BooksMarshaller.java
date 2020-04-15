package com.reactiveworks.jaxb.marshal;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

import com.reactiveworks.jaxb.binding.Book;
import com.reactiveworks.jaxb.binding.Books;

public class BooksMarshaller {
	static Books booksObj = new Books();
	
	public static void createBooksList() {
		List<Book> books;
		booksObj.setBooks(new ArrayList<Book>());
		Book bookObj1=new Book();
		Book bookObj2=new Book();
		
		bookObj1.setBook("Book1");
		bookObj1.setCount(5);
		bookObj1.setTitle("title1");
		
		bookObj2.setBook("Book2");
		bookObj2.setCount(7);
		bookObj2.setTitle("title2");
		
		books=booksObj.getBooks();
		books.add(bookObj1);
		books.add(bookObj2);
		
	}

	public static void marshal() {
		
		createBooksList();

		try {
			JAXBContext jaxbContext = JAXBContext.newInstance(Books.class);
			Marshaller marshallerObj = jaxbContext.createMarshaller();
			marshallerObj.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true); // to format the output
			marshallerObj.marshal(booksObj, System.out); // to print xml in the cosole
		} catch (JAXBException jaxbExp) {
			jaxbExp.printStackTrace();
		}
	}

	public static void main(String[] args) {
		marshal();
	}
	
}