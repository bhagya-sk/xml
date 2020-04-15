package com.reactiveworks.jaxb.bind;

public class Book {
	private String title;
	private String book;
	private int count;

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getBook() {
		return book;
	}

	public void setBook(String book) {
		this.book = book;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	@Override
	public String toString() {
		return "Book [title:" + title + ", book:" + book + ", count:" + count + "]";
	}

}
