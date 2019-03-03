package com.niu.microcloud.dao;

import com.niu.vo.Dept;

import java.util.List;

/**
 * Created by ami on 2019/3/3.
 */
public interface IDeptDao {

    boolean doCreate(Dept vo);

    Dept findById(Long id);

    List<Dept> findAll();
}
