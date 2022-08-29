package com.apidayoff.apidayoff.resource;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.TimeZone;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.apidayoff.apidayoff.domain.NationalHolidays;

@RestController
@RequestMapping(value = "/holidays")
public class UserResource {

    @RequestMapping(method = RequestMethod.GET)
    public List<NationalHolidays> findAll() throws Exception {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM");
        sdf.setTimeZone(TimeZone.getTimeZone("GMT"));
        NationalHolidays tiradentes = new NationalHolidays("1", sdf.parse("21/04"), "Tiradentes");
        List<NationalHolidays> list = new ArrayList<>();
        list.addAll(Arrays.asList(tiradentes));
        return list;
    }
}
