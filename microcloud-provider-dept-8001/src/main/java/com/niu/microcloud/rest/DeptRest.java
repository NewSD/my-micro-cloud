package com.niu.microcloud.rest;

import com.niu.microcloud.service.IDeptService;
import com.niu.vo.Dept;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * Created by ami on 2019/3/3.
 */
@RestController
public class DeptRest {
    @Resource
    private IDeptService deptService;

    @RequestMapping(value = "/dept/get/{id}", method = RequestMethod.GET)
    public Object get(@PathVariable("id") long id) {
        return this.deptService.get(id);
    }

    @RequestMapping(value = "/dept/add", method = RequestMethod.GET)
    private Object add(@RequestBody Dept dept) {
        return this.deptService.add(dept);
    }

    @RequestMapping(value = "/dept/list", method = RequestMethod.GET)
    private Object list() {
        return this.deptService.list();
    }


}
