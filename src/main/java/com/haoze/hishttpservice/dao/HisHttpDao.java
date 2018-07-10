package com.haoze.hishttpservice.dao;

import com.haoze.hishttpservice.model.PatientEmrModel;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

import java.util.List;
import java.util.Map;

/**
 * 病人病历。
 * @author maxl
 * @time 2018-07-05。
 */
public interface HisHttpDao {

    @Select("call pro_list()")
    @Results({
            @Result(property = "patientId",  column = "PATIENTID"),
            @Result(property = "patientName", column = "PATIENTNAME")
    })
    List<PatientEmrModel> listPatientEmrs(Map<String,Object> paramsMap);
}
