package com.apidayoff.apidayoff.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.apidayoff.apidayoff.domain.NationalHolidays;
import com.apidayoff.apidayoff.repository.HolidaysRepository;

@Service
public class HolidaysServices {
    @Autowired
    private HolidaysRepository holidays;

    public List<NationalHolidays> findAll() {
        return holidays.findAll();
    }
}
