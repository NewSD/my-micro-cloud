package com.niu.microcloud.service;

import com.niu.microcloud.Dept_8001_StartSpringCloudApplication;
import com.niu.vo.Dept;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import javax.annotation.Resource;

import static org.junit.Assert.*;

/**
 * Created by ami on 2019/3/3.
 */

@WebAppConfiguration
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = Dept_8001_StartSpringCloudApplication.class)
public class IDeptServiceTest {
    @Resource
    private IDeptService deptService;

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void get() throws Exception {
        Dept dept = this.deptService.get(1L);
        Assert.assertEquals("开发部", dept.getDname());
    }

    @Test
    public void add() throws Exception {
        Dept dept = new Dept();
        dept.setDname("测试部" + System.currentTimeMillis());
        dept.setLoc("位置" + System.currentTimeMillis());
        System.out.println(this.deptService.add(dept));
    }

    @Test
    public void list() throws Exception {
        System.out.println(this.deptService.list());
    }

}