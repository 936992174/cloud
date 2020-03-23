package com.peas.cloud.service;

import com.peas.cloud.entity.Dept;

import java.util.List;

public interface DeptService {
    public boolean save(Dept dept);

    public Dept get(Long id);

    public List<Dept> listDepartments();

}
