package com.haoze.hishttpservice;

import com.haoze.hishttpservice.dao.HisHttpDao;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.HashMap;
import java.util.Map;

@RunWith(SpringRunner.class)
@SpringBootTest
public class HisHttpserviceApplicationTests {

	@Autowired
	HisHttpDao hisHttpDao;

	@Test
	public void contextLoads() {

		Map<String,Object> map = new HashMap();
		map.put("as_patientId", "966188");
		map.put("al_visitid", 1);
		hisHttpDao.listPatientInspects(map);
	}

}
