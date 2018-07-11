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

    /**
     * 查询病人列表
     * @param paramsMap
     * @return
     */
    List<PatientEmrModel> listPatientEmrs(Map<String,Object> paramsMap);

    /**
     * 查询病人检查列表
     * @param paramsMap
     * @return
     */
    List<Map> listPatientInspects(Map<String,Object> paramsMap);
}
