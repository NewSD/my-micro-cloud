package com.niu.microcloud.controller;

import com.niu.vo.Dept;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by ami on 2019/3/3.
 */
@RestController
public class ConsumerDeptController {

    private final static String DEPT_GET_URL = "http://dept-8001.com:8001/dept/get/";
    private final static String DEPT_ADD_URL = "http://dept-8001.com:8001/dept/add";
    private final static String DEPT_LIST_URL = "http://dept-8001.com:8001/dept/list/";
    @Resource
    private RestTemplate restTemplate;

//    http://client.com/consumer/dept/get?id=7
    @RequestMapping(value = "/consumer/dept/get")
    public Object getDept(long id) {
        Dept dept = this.restTemplate.getForObject(DEPT_GET_URL + id, Dept.class);
        return dept;
    }

//    http://client.com/consumer/dept/list
//    头信息处理
    @RequestMapping(value = "/consumer/dept/list")
    public Object listDept() {
        List<Dept> dept = this.restTemplate.getForObject(DEPT_LIST_URL, List.class);
        return dept;

    }
//http://client.com/consumer/dept/add?dname=WEB
    @RequestMapping(value = "/consumer/dept/add")
    public Object addDept(Dept dept) {
        return this.restTemplate.postForObject(DEPT_ADD_URL, dept, Boolean.class);
    }


}
