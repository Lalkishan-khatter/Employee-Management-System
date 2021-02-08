package com.example.employeemanagementsystem.model;

import javax.persistence.*;

@Entity
@Table(name = "mst_district")
public class District {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "district_id", columnDefinition = "INT", length = 11)
    private Integer districtId;

    @Column(name = "district_name")
    private String districtName;

    public Integer getDistrictId() {
        return districtId;
    }

    public void setDistrictId(Integer districtId) {
        this.districtId = districtId;
    }

    public String getDistrictName() {
        return districtName;
    }

    public void setDistrictName(String districtName) {
        this.districtName = districtName;
    }
}