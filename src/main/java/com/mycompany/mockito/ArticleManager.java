package com.mycompany.mockito;

public class ArticleManager {

    ArticleCalculator articleCalculator;


    public ArticleManager(ArticleCalculator articleCalculator) {
        this.articleCalculator = articleCalculator;
    }

    public String getPriceForArticle(String article) {

        int price = articleCalculator.getPrice(article);

        return String.format("Dit artikel kost %d euro.", price);

    }
}
