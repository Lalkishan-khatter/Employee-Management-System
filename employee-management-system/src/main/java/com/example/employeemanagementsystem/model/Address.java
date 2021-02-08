package com.example.employeemanagementsystem.model;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "mst_adr")
public class Address implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "adr_id", columnDefinition = "INT", length = 11)
    private Integer addressId;

    @Column(name = "adr_houseno", columnDefinition = "varchar(200)")
    private String houseNumber;

    @Column(name = "adr_bldnm", columnDefinition = "VARCHAR(200)")
    private String buildingNumber;

    @Column(name = "adr_flrno", columnDefinition = "VARCHAR(200)")
    private String floorNumber;

    @Column(name = "adr_street", columnDefinition = "VARCHAR(200)")
    private String street;

    @Column(name = "adr_area", columnDefinition = "VARCHAR(200)")
    private String area;

    @ManyToOne(cascade = {CascadeType.ALL})
    @JoinColumn(name = "city_id", referencedColumnName = "city_id")
    private City cityId;

    @ManyToOne(cascade = {CascadeType.ALL})
    @JoinColumn(name = "dist_id", referencedColumnName = "district_id")
    private District districtId;

    @Column(name = "adr_pinno", columnDefinition = "INT", length = 11)
    private int addressPinNumber;

    @ManyToOne(cascade = {CascadeType.ALL})
    @JoinColumn(name = "state_id", referencedColumnName = "state_id")
    private State stateId;

    @ManyToOne(cascade = {CascadeType.ALL})
    @JoinColumn(name = "country_id", referencedColumnName = "country_id")
    private Country countryId;

    public Integer getAddressId() {
        return addressId;
    }

    public void setAddressId(Integer addressId) {
        this.addressId = addressId;
    }

    public String getHouseNumber() {
        return houseNumber;
    }

    public void setHouseNumber(String houseNumber) {
        this.houseNumber = houseNumber;
    }

    public String getBuildingNumber() {
        return buildingNumber;
    }

    public void setBuildingNumber(String buildingNumber) {
        this.buildingNumber = buildingNumber;
    }

    public String getFloorNumber() {
        return floorNumber;
    }

    public void setFloorNumber(String floorNumber) {
        this.floorNumber = floorNumber;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public City getCityId() {
        return cityId;
    }

    public void setCityId(City cityId) {
        this.cityId = cityId;
    }
    public District getDistrictId() {
        return districtId;
    }

    public void setDistrictId(District districtId) {
        this.districtId = districtId;
    }

    public int getAddressPinNumber() {
        return addressPinNumber;
    }

    public void setAddressPinNumber(int addressPinNumber) {
        this.addressPinNumber = addressPinNumber;
    }

    public State getStateId() {
        return stateId;
    }

    public void setStateId(State stateId) {
        this.stateId = stateId;
    }

    public Country getCountryId() {
        return countryId;
    }

    public void setCountryId(Country countryId) {
        this.countryId = countryId;
    }
}