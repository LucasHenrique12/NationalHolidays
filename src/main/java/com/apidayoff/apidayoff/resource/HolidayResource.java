package com.apidayoff.apidayoff.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.apidayoff.apidayoff.domain.NationalHolidays;
import com.apidayoff.apidayoff.services.HolidaysServices;

@RestController
@RequestMapping(value = "/holidays")
public class HolidayResource {

    @Autowired
    private HolidaysServices service;

    @RequestMapping(method = RequestMethod.GET)
    public ResponseEntity<List<NationalHolidays>> findAll() {
        List<NationalHolidays> list = service.findAll();
        return ResponseEntity.ok().body(list);
    }
}
