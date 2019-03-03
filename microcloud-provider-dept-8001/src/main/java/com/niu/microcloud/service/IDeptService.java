package com.niu.microcloud.service;

import com.niu.vo.Dept;

import java.util.List;

/**
 * Created by ami on 2019/3/3.
 */
public interface IDeptService {
    Dept get(Long id);

    boolean add(Dept dept);

    List<Dept> list();
}
