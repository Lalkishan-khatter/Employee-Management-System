package com.example.employeemanagementsystem.model;

import javax.persistence.*;

@Entity
@Table(name = "mst_state")
public class State {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "state_id", columnDefinition = "INT", length = 11)
    private Integer stateId;

    @Column(name = "state_name")
    private String stateName;

    public Integer getStateId() {
        return stateId;
    }

    public void setStateId(Integer stateId) {
        this.stateId = stateId;
    }

    public String getStateName() {
        return stateName;
    }

    public void setStateName(String stateName) {
        this.stateName = stateName;
    }
}