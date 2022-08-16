package com.example.library;
import com.example.library.book;

public class bookImpl {
    public static void main(String[] args){
        book book = new book();
        book.setAuthor("Cheetan Bhagat");
        book.setISBN(2235455);
        book.setTitle("5 point someone");
        book.setYOP(2006);
        System.out.println(book.getAuthor());
        System.out.println(book.getISBN());
        System.out.println(book.getTitle());
        System.out.println(book.getYOP());
    }
}
