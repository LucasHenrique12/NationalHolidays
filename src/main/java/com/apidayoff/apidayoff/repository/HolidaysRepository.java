package com.apidayoff.apidayoff.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.apidayoff.apidayoff.domain.NationalHolidays;

@Repository
public interface DateRepository extends MongoRepository<NationalHolidays, String> {

}
