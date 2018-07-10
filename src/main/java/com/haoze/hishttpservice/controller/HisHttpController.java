package com.haoze.hishttpservice.controller;

import com.haoze.hishttpservice.dao.HisHttpDao;
import com.haoze.hishttpservice.model.PatientEmrModel;
import org.apache.catalina.servlet4preview.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/his/http")
public class HisHttpController {

    /*@Autowired
    HisHttpDao hisHttpDao;*/

    @GetMapping("/listPatientEmrs")
    @ResponseBody
    List<PatientEmrModel> listPatientEmrs(HttpServletRequest request) {

        System.out.println(request.getParameter("INDATE") + "********");
        List<PatientEmrModel> list = new ArrayList();
        PatientEmrModel patientEmrModel = new PatientEmrModel();
        patientEmrModel.setPatientId("1");
        patientEmrModel.setPatientName("张三");
        list.add(patientEmrModel);

        patientEmrModel = new PatientEmrModel();
        patientEmrModel.setPatientId("2");
        patientEmrModel.setPatientName("李四");
        list.add(patientEmrModel);

        return list;
    }
}
