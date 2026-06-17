package de.meinprojekt;

import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.*;

class BufferTimeAnalyzerTest {

    @Test
    void shouldDetectTooSmallBuffer() {

        CalendarEvent first =
                new CalendarEvent(
                        "Schule",
                        LocalDateTime.of(2026, 6, 17, 8, 0),
                        LocalDateTime.of(2026, 6, 17, 10, 0));

        CalendarEvent second =
                new CalendarEvent(
                        "Arzt",
                        LocalDateTime.of(2026, 6, 17, 10, 5),
                        LocalDateTime.of(2026, 6, 17, 11, 0));

        BufferTimeAnalyzer analyzer =
                new BufferTimeAnalyzer();

        Suggestion suggestion =
                analyzer.analyze(first, second);

        assertNotNull(suggestion);
        assertEquals(SuggestionType.BUFFER_TIME, suggestion.getType());
    }
    
    @Test
    void shouldFailWhenNoBufferDetected() {

        CalendarEvent first =
                new CalendarEvent("A",
                        LocalDateTime.of(2026, 6, 17, 8, 0),
                        LocalDateTime.of(2026, 6, 17, 9, 0));

        CalendarEvent second =
                new CalendarEvent("B",
                        LocalDateTime.of(2026, 6, 17, 12, 0),
                        LocalDateTime.of(2026, 6, 17, 13, 0));

        BufferTimeAnalyzer analyzer = new BufferTimeAnalyzer();

        Suggestion suggestion = analyzer.analyze(first, second);

        assertNull(suggestion); // 👈 zeigt deinen Fehler perfekt
    }
}
