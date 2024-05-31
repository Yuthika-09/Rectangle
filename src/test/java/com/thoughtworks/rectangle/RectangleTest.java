package com.thoughtworks.rectangle;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.closeTo;
import static org.hamcrest.Matchers.is;

import org.junit.jupiter.api.Test;


public class RectangleTest {

    @Test
    void shouldReturnAreaWhenLengthAndBreadthAreGiven(){

        double length = 5.0;
        double breadth = 20.0;

        double expectedArea = 100.0; 

        Rectangle rectangle = new Rectangle(length, breadth);
        double actualArea = rectangle.area(); 

        assertThat(actualArea, is(closeTo(expectedArea, 0.001)));

    }

    @Test
    void shouldReturnPerimeterWhenLengthAndBreadthAreGiven(){

        double length = 5.0;
        double breadth = 20.0;

        double expectedPerimeter = 50.0;
        
        Rectangle rectangle = new Rectangle(length, breadth);
        double actualPerimeter = rectangle.perimeter();
        
        assertThat(actualPerimeter, is(closeTo(expectedPerimeter, 0.001)));

    }
    
}
