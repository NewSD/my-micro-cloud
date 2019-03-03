package com.niu.microsoft.service;

import com.niu.vo.Dept;

import java.util.List;

/**
 * Created by ami on 2019/3/3.
 */
public interface IDetService {
    Dept get(Long id);

    boolean add(Dept dept);

    List<Dept> list();
}
