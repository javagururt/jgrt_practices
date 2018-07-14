package com.javaguru.practices.practice_5.task1;

import org.junit.Test;

import java.lang.reflect.Method;

import static org.junit.Assert.assertEquals;

public class BookTest {

    @Test
    public void gettersAndSetters() throws Exception {
        Book book = new Book();
        Method setAuthor = book.getClass().getDeclaredMethod("setAuthor", String.class);
        Method setTitle = book.getClass().getDeclaredMethod("setTitle", String.class);
        Method setPageCount = book.getClass().getDeclaredMethod("setPageCount", int.class);
        Method getAuthor = book.getClass().getDeclaredMethod("getAuthor");
        Method getTitle = book.getClass().getDeclaredMethod("getTitle");
        Method getPageCount = book.getClass().getDeclaredMethod("getPageCount");
    }

    @Test
    public void overrideToString() throws Exception {
        Book book = new Book();

        Method setAuthor = book.getClass().getDeclaredMethod("setAuthor", String.class);
        Method setTitle = book.getClass().getDeclaredMethod("setTitle", String.class);
        Method setPageCount = book.getClass().getDeclaredMethod("setPageCount", int.class);

        setAuthor.invoke(book, "Author");
        setPageCount.invoke(book, 100);
        setTitle.invoke(book, "Title");

        assertEquals(book.toString(), "Book{author='Author', title='Title', pageCount=100}");
    }

    @Test
    public void overrideEquals() throws Exception {
        Book book = new Book();
        Method setAuthor = book.getClass().getDeclaredMethod("setAuthor", String.class);
        Method setTitle = book.getClass().getDeclaredMethod("setTitle", String.class);
        Method setPageCount = book.getClass().getDeclaredMethod("setPageCount", int.class);

        setAuthor.invoke(book, "Author");
        setPageCount.invoke(book, 100);
        setTitle.invoke(book, "Title");

        Book book2 = new Book();
        setAuthor.invoke(book2, "Author");
        setPageCount.invoke(book2, 100);
        setTitle.invoke(book2, "Title");

        assertEquals(book, book2);
    }
}