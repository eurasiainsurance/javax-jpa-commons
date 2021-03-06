package tech.lapsa.javax.jpa.converters;

import java.sql.Time;
import java.time.LocalTime;

import javax.persistence.AttributeConverter;
import javax.persistence.Converter;

@Converter(autoApply = true)
public class LocalTimeAttributeConverter implements AttributeConverter<LocalTime, Time> {

    @Override
    public Time convertToDatabaseColumn(final LocalTime localTime) {
	return localTime == null ? null : Time.valueOf(localTime);
    }

    @Override
    public LocalTime convertToEntityAttribute(final Time sqlTime) {
	return sqlTime == null ? null : sqlTime.toLocalTime();
    }

}
