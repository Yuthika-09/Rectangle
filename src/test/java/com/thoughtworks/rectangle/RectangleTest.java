package com.thoughtworks.rectangle;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

import org.junit.jupiter.api.Test;


public class RectangleTest {

    @Test
    void shouldReturnAreaWhenLengthAndBreadthAreGiven(){

        int length = 5;
        int breadth = 20;

        int expectedArea = 100; 

        Rectangle rectangle = new Rectangle(length, breadth);
        int actualArea = rectangle.area(); 

        assertThat(actualArea, equalTo(expectedArea));
    }
    
}
