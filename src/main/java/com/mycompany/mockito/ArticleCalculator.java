package com.mycompany.mockito;

public class ArticleCalculator {


    public int getPrice(String article) {
        throw new RuntimeException("You fool");
    }
}
