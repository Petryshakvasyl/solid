package ua.lviv.logos.solid.goodsrp.converter;

import ua.lviv.logos.solid.goodsrp.model.Book;

public class PdfConverter implements BookConverter {

    @Override
    public void convert(Book book) {
        System.out.println("Convert to pdf");
    }
}
