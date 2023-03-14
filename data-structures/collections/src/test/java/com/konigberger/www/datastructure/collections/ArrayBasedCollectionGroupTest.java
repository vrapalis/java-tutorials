package com.konigberger.www.datastructure.collections;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

@DisplayName("Array based collection implementation group test")
class ArrayBasedCollectionGroupTest {

    private CollectionAPI<String> elements;

    @Nested
    @DisplayName("Collection add method group test")
    class ArrayBasedCollectionAddMethodGroupTest {

        @BeforeEach
        void setUp() {
            elements = new ArrayBasedCollection<>(3);
        }

        @Test
        @DisplayName("Add one element to the collection test")
        void addElementShouldIncreaseSizeTest() {
            // When
            elements.add("Car");

            // Then
            Assertions.assertThat(elements.size()).isEqualTo(1);
        }

        @Test
        @DisplayName("Add element to full collection should return false")
        void addElementToFullCollectionShouldReturnFalseTest() {
            // When
            elements.add("Car");
            elements.add("Ball");
            elements.add("Umbrella");

            // Then
            Assertions.assertThat(elements.add("Should return false")).isFalse();
            Assertions.assertThat(elements.size()).isEqualTo(3);
        }
    }

    @Nested
    @DisplayName("Collection full method group test")
    class ArrayBasedCollectionFullMethodGroupTest {

        @BeforeEach
        void setUp() {
            elements = new ArrayBasedCollection<>(1);
        }

        @Test
        @DisplayName("Collection should return false after creation, if collection is not full test")
        void collectionShouldReturnFalseIfCollectionIsNotFull() {

            // Then
            Assertions.assertThat(elements.isFull()).isFalse();
        }

        @Test
        @DisplayName("Collection should return true if collection is full test")
        void collectionShouldReturnTrueIfCollectionIsFullTest() {
            // When
            elements.add("Car");

            // Then
            Assertions.assertThat(elements.isFull()).isTrue();
        }
    }

    @Nested
    @DisplayName("Collection empty method group test")
    class ArrayBasedCollectionEmptyMethodGroupTest {

        @BeforeEach
        void setUp() {
            elements = new ArrayBasedCollection<>(1);
        }

        @Test
        @DisplayName("Collection should be not empty if element was added to the collection test")
        void shouldBeNotEmptyTest() {
            // When
            elements.add("Car");

            // Then
            Assertions.assertThat(elements.isEmpty()).isFalse();
        }

        @Test
        @DisplayName("Collection should be empty after creation test")
        void shouldBeEmptyTest() {
            // Then
            Assertions.assertThat(elements.isEmpty()).isTrue();
        }
    }

    @Nested
    @DisplayName("Collection get method group test")
    class ArrayBasedCollectionGetMethodGroupTest {

        @BeforeEach
        void setUp() {
            elements = new ArrayBasedCollection<>(3);
        }

        @Test
        @DisplayName("Collection should return element test")
        void shouldReturnElementTest() {
            // When
            var car = "Car";
            elements.add(car);
            var ball = "Ball";
            elements.add(ball);
            elements.add("Umbrella");

            // Then
            Assertions.assertThat("Car").isEqualTo(car);
            Assertions.assertThat("Ball").isEqualTo(ball);
        }

        @Test
        @DisplayName("Collection should return null for not existing element in the collection test")
        void shouldReturnNullForNotExistingElementTest() {
            // When
            elements.add("Car");

            // Then
            Assertions.assertThat(elements.get("Not exists")).isEqualTo(null);
        }
    }

    @Nested
    @DisplayName("Collection remove method group test")
    class ArrayBasedCollectionRemoveMethodGroupTest {

        @BeforeEach
        void setUp() {
            elements = new ArrayBasedCollection<>(3);
        }

        @Test
        @DisplayName("Collection remove element should return true test")
        void shouldRemoveElementReturnTrueTest() {
            // When
            var car = "Car";
            elements.add(car);
            elements.add("Ball");
            elements.add("Umbrella");

            // Then
            Assertions.assertThat(elements.remove(car)).isTrue();
            Assertions.assertThat(elements.remove("Umbrella")).isTrue();
        }

        @Test
        @DisplayName("Collection remove method should return false for not existing element test")
        void shouldRemoveElementShouldReturnFalseForNotExistingElementTest() {
            // When
            elements.add("Car");

            // Then
            Assertions.assertThat(elements.remove("Not existing element")).isFalse();
        }
    }
}