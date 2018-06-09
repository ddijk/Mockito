package com.mycompany.mockito;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.ArgumentCaptor;
import org.mockito.Captor;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.MockitoJUnitRunner;

/**
 * To inject mocks, use @RunWith(MockitoJUnitRunner.class) or  MockitoAnnotations.initMocks(this)
 * Only one of them is enough.
 */
@RunWith(MockitoJUnitRunner.class)
public class ArticleManagerTest {

    private static final String XBOX = "xbox";
    @Mock private ArticleCalculator calculator;
//    @Mock private ArticleDatabase database;
//    @Mock private UserProvider userProvider;

    @InjectMocks private ArticleManager manager;

    @Captor ArgumentCaptor<String> articleName;

    @Before
    public void init() {
//        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void verifyGetPrice() {

        when(calculator.getPrice(XBOX)).thenReturn(4);

        assertEquals("Dit artikel kost 4 euro.", manager.getPriceForArticle(XBOX));
    }


    @Test
    public void verifyGetPriceWithRedundantCaptor() {


        when(calculator.getPrice(articleName.capture())).thenReturn(4);

        assertEquals("Dit artikel kost 4 euro.", manager.getPriceForArticle("aaa"));

        assertEquals("Calculator should be called with given article", "aaa", articleName.getValue());
    }





}
