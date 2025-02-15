package com.example;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AddTest {

    Add add = new Add();


    @Test
    @DisplayName("2 + 2 = 4")
    void addingTwoNumbers(){
        assertEquals(4,add.addtwo(2,2));
    }

    @Test
    @DisplayName("2 + 2 + 2 = 6")
    void addingThreeNumbers(){
        assertEquals(6, add.addThree(2,2,2));
    }

    @Test
    @DisplayName("Adding all numbers in list")
    void addingAllNumbersThatIsAList(){
        assertEquals(10, add.addFromList(List.of(5,5)));
    }

}
