package com.cy.java.jdk8.time;

import java.time.Clock;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public class TestJava8Time01 {
	public static void main(String[] args) {
		//Clock(时钟对象)
		Clock clock = Clock.systemDefaultZone();
		System.out.println(clock.getZone());
		Clock utc = Clock.systemUTC();
		System.out.println(utc);
		//1.Instant(时间戳)
	Instant instant = Instant.now();
		System.out.println(instant);
		instant.plusMillis(TimeUnit.HOURS.toMillis(8));
		System.out.println(instant);
		//2.LocalDateTime 时期
		LocalDateTime localDateTime=LocalDateTime.now();
		System.out.println(localDateTime);
		
		Set<String> zoneIds = ZoneId.getAvailableZoneIds();
		System.out.println(zoneIds);
		
		ZoneId defaltZoneId = ZoneId.systemDefault();
		System.out.println(defaltZoneId);
		//localDateTime.plusHours(8);
		
		//ZoneDateTime
		ZonedDateTime zonedDateTime = ZonedDateTime.now();
		System.out.println(zonedDateTime);
		
		//DateTimeFormatter
		DateTimeFormatter dtr =
		DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss", Locale.CHINA);
		String dateStr=
				LocalDateTime.now().format(dtr);
		System.out.println(dateStr);
		
	}
}
