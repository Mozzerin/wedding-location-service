package com.smsys.weddinglocationservice.dao.converter;


import org.bson.json.Converter;
import org.bson.json.StrictJsonWriter;

import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.util.Date;

public class ZonedDateTimeConverter implements Converter<Date, ZonedDateTime> {

    @Override
    public ZonedDateTime convert(Date date) {
        return date.toInstant().atZone(ZoneOffset.UTC);
    }

    @Override
    public void convert(Date value, StrictJsonWriter writer) {

    }
}
