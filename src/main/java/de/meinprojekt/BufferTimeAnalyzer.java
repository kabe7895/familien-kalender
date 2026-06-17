package de.meinprojekt;

import java.time.Duration;

public class BufferTimeAnalyzer {

	public Suggestion analyze(CalendarEvent first, CalendarEvent second) {

	    long minutes = Duration.between(
	            first.getEnd(),
	            second.getStart()
	    ).toMinutes();

	    if (minutes < 15) {
	        return new Suggestion(
	                SuggestionType.BUFFER_TIME,
	                "Zu wenig Pufferzeit",
	                0.85
	        );
	    }

	    return null;
	}
}