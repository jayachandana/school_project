package com.ty.controller;

import com.ty.dao.BookDAO;
import com.ty.dto.ReferenceBook;

public class ReferenceBookController {
	public static void main(String[] args) {
		
	
	BookDAO referenceBookDAO = new BookDAO();
	ReferenceBook referenceBook = new ReferenceBook();
/*	referenceBook.setName("theory");
	referenceBook.setSubject("chemistry");
	referenceBook.setAuthor("kalyan");
	referenceBookDAO.saveReferenceBook(referenceBook);                  //insert book
	System.out.println("inserted");*/
/*	referenceBookDAO.deleteReferenceBook(3);             // delete book
	System.out.println("deleted");*/
	//referenceBookDAO.findReferenceBookById(4);                  //find book
	//System.out.println("book is searching");
	
	referenceBook.setName("java");
	referenceBook.setSubject("advance java");
	referenceBook.setAuthor("sun");
	referenceBookDAO.updateReferenceBook(referenceBook);
	System.out.println("updated suceessfully");

}
}

