package com.example.employeemanagementsystem.model;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "mst_city")
public class City implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "city_id", columnDefinition = "INT", length = 11)
    private Integer cityId;

    @Column(name = "city_name")
    private String cityName;

    public Integer getCityId() {
        return cityId;
    }

    public void setCityId(Integer cityId) {
        this.cityId = cityId;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }
}