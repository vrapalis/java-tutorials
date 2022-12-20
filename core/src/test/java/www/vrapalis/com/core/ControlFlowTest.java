package www.vrapalis.com.core;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

@DisplayName("Control flow test")
public class ControlFlowTest {

    @Test
    @DisplayName("If else should execute right control flow test")
    void ifElseTest() {
        // Given
        var subject = 5;
        char ch = 0;

        // When
        if (subject > 5) {
            ch = 'A';
        } else if (subject > 6) {
            ch = 'B';
        } else if (subject >= 5) {
            ch = 'C';
        } else {
            ch = 'D';
        }

        // Then
        Assertions.assertThat(ch).isEqualTo('C');

        // When
        if (subject > 6) {
            ch = 'F';
        } else if (subject > 4) {
            return;
        }

        // Then should not be executed
        Assertions.assertThat(true).isFalse();
    }

    @Test
    @DisplayName("Standard switch statement should execute proper control flow test")
    void standardSwitchStatementTest() {
        // Given
        final var str = "Default Switch";

        // When
        switch (str) {
            case "Expression Switch":
                // Then should not be executed
                Assertions.assertThat(str).isEqualTo("Expression Switch");
                break;
            case "Default Switch":
                // Then
                Assertions.assertThat(str).isEqualTo("Default Switch");
                break;
            default:
                break;
        }

        // Missing break statement (Statements will fall through)
        // Given
        final var months = new ArrayList<String>();
        final var month = 9;

        // When
        switch (month) {
            case 1:
                months.add("January");
            case 2:
                months.add("February");
            case 3:
                months.add("March");
            case 4:
                months.add("April");
            case 5:
                months.add("May");
            case 6:
                months.add("June");
            case 7:
                months.add("July");
            case 8:
                months.add("August");
            case 9:
                months.add("September");
            case 10:
                months.add("October");
            case 11:
                months.add("November");
            case 12:
                months.add("December");
                break;
            default:
                break;
        }

        // Then
        Assertions.assertThat(months).containsExactly("September", "October", "November", "December");
    }

    @Test
    @DisplayName("Expression switch should calculate right expression test")
    void expressionSwitchStatementTest() {
        // Given
        char ch;
        final var subject = 3;

        // When
        ch = switch (subject) {
            case 1 -> 'A';
            case 2 -> 'B';
            case 3 -> 'C';
            default -> 'D';
        };

        // Then
        Assertions.assertThat(ch).isEqualTo('C');
    }

    @Test
    @DisplayName("Loops should execute block of statements test")
    void loopsTest() {
        // Given
        var counter = 0;
        // When
        while (counter < 3) {
            counter++;
        }
        // Then
        Assertions.assertThat(counter).isEqualTo(3);

        // Given (Branching with continue)
        var foundedCharO = 0;
        var word = "Hello Word!!!";
        // When
        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) != 'o') {
                continue;
            }
            foundedCharO++;
        }
        // Then
        Assertions.assertThat(foundedCharO).isEqualTo(2);
    }
}
