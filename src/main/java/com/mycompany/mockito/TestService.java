/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mockito;

/**
 *
 * @author dickdijk
 */
public class TestService {

    /**
     * Gets the unique id.
     *
     * @return the unique id
     */
    public int getUniqueId() {
        return 43;
    }

    public int testing(int num) {
        someMethod("");
        return num;
    }

    public void someMethod(String someMethod) {
        testing(1);
    }
}
