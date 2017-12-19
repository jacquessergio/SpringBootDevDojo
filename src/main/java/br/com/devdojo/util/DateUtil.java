package br.com.devdojo.util;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateUtil {

	public String formatLocalDateTimeToDatabaseStyle(LocalDateTime dateTime) {
		
		return DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss").format(dateTime);
	}
}
