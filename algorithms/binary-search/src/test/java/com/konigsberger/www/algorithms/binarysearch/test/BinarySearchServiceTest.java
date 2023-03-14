package com.konigsberger.www.algorithms.binarysearch.test;

import com.konigsberger.www.algorithms.binarysearch.BinarySearchService;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("Binary search test")
public class BinarySearchServiceTest {

    private int[] elements;

    @BeforeEach
    void setUp() {
        elements = new int[6];
        for (var i = 0; i < elements.length; i++) {
            elements[i] = i;
        }
    }

    @Test
    void binarySearchTest() {
        // When
        var foundTarget = BinarySearchService.search(elements, 3);

        // Then
        Assertions.assertThat(foundTarget).isEqualTo(3);
    }

    @Test
    void findNotExistsElementShouldReturnNegativeIntTest() {
        // When
        var foundTarget = BinarySearchService.search(elements, 8);

        // Then
        Assertions.assertThat(foundTarget).isEqualTo(-1);
    }
}
