package com.niu.microcloud.dao;

import com.niu.vo.Dept;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * Created by ami on 2019/3/3.
 */
@Mapper
public interface IDeptDao {

    boolean doCreate(Dept vo);

    Dept findById(Long id);

    List<Dept> findAll();
}
