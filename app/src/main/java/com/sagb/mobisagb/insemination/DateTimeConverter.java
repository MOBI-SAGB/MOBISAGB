package com.sagb.mobisagb.insemination;

/**
 * Created by USER on 03/11/16.
 */

import org.greenrobot.greendao.converter.PropertyConverter;
import org.joda.time.DateTime;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;

public class DateTimeConverter implements PropertyConverter<DateTime, String> {


   public  static  final DateTimeFormatter SIMPLE_DATE_FORMATTER = DateTimeFormat.forPattern("yyyy-MM-dd");

    @Override
    public DateTime convertToEntityProperty(String databaseValue) {
        return DateTime.parse(databaseValue,SIMPLE_DATE_FORMATTER);
    }

    @Override
    public String convertToDatabaseValue(DateTime entityProperty) {
        return entityProperty.toString(SIMPLE_DATE_FORMATTER);
    }
}