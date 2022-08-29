package com.apidayoff.apidayoff.domain;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "national")
public class NationalHolidays implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    private String id;
    private Date date;
    private String title;

    public NationalHolidays() {
    }

    public NationalHolidays(String id, Date date, String title) {
        this.id = id;
        this.date = date;
        this.title = title;
    }

    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Date getDate() {
        return this.date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof NationalHolidays)) {
            return false;
        }
        NationalHolidays nationalHolidays = (NationalHolidays) o;
        return Objects.equals(id, nationalHolidays.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

}