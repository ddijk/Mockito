package com.mycompany.mockito;

import java.util.List;

import org.mockito.ArgumentMatcher;

class ListOfTwoElements implements ArgumentMatcher<List> {
    public boolean matches(List list) {
        return list.size() == 2;
    }
    public String toString() {
        //printed in verification errors
        return "[list of 2 elements]";
    }
}
