package ua.lviv.logos.solid.goodsrp.badconverters;

import ua.lviv.logos.solid.goodsrp.model.Book;

public interface BadBookConverter {
    //
    //    public void convertToPdf(Book book) {
    //        System.out.println("I am converting to pdf .. "+ book);
    //    }

    void convert(Book book, String type);
}
