package com.peas.cloud.service.impl;

import com.peas.cloud.dao.DeptDao;
import com.peas.cloud.entity.Dept;
import com.peas.cloud.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DeptServiceImpl implements DeptService {

    @Autowired
    private DeptDao deptDao;

    @Override
    public boolean save(Dept dept) {
        return deptDao.addDept(dept);
    }

    @Override
    public Dept get(Long id) {
        return deptDao.findById(id);
    }

    @Override
    public List<Dept> listDepartments() {
        return deptDao.findAll();
    }
}
