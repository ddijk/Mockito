package com.mycompany.mockito;

import static org.mockito.ArgumentMatchers.anyList;
import static org.mockito.ArgumentMatchers.argThat;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class Mockito2 {


    @Test
    public void test() {

        List mock = mock(List.class);

        when(mock.addAll(anyList())).thenThrow(new RuntimeException());

        mock.addAll(Arrays.asList("one", "two"));

        verify(mock).addAll(argThat(new ListOfTwoElements()));
    }
}
