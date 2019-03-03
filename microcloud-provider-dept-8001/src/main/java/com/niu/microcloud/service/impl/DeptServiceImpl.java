package com.niu.microcloud.service.impl;

import com.niu.microcloud.dao.IDeptDao;
import com.niu.microcloud.service.IDeptService;
import com.niu.vo.Dept;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by ami on 2019/3/3.
 */
@Service
public class DeptServiceImpl implements IDeptService {

    @Resource
    private IDeptDao deptDao;

    @Override
    public Dept get(Long id) {
        return this.deptDao.findById(id);
    }

    @Override
    public boolean add(Dept dept) {
        return this.deptDao.doCreate(dept);
    }

    @Override
    public List<Dept> list() {
        return this.deptDao.findAll();
    }
}
