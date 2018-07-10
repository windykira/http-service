package com.haoze.hishttpservice.model;

/**
 * 病人病历信息。
 * @author maxl
 * @time 2018-07-05。
 */
public class PatientEmrModel {

    private String patientId;
    private String patientName;

    public String getPatientId() {
        return patientId;
    }

    public void setPatientId(String patientId) {
        this.patientId = patientId;
    }

    public String getPatientName() {
        return patientName;
    }

    public void setPatientName(String patientName) {
        this.patientName = patientName;
    }
}
