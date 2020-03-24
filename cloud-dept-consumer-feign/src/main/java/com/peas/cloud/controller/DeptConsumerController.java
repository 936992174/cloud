package com.peas.cloud.controller;

import com.peas.cloud.entity.Dept;
import com.peas.cloud.service.DeptClientService;
import com.peas.cloud.util.WebUtil;
import com.peas.cloud.web.JsonResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/consumer/dept")
public class DeptConsumerController {
    @Autowired
    private DeptClientService deptClientService;

    @RequestMapping(value = "/get/{id}")
    public JsonResponse get(@PathVariable("id") Long id) {
        return WebUtil.successJsonResponse("获取成功",this.deptClientService.get(id));
    }

    @RequestMapping(value = "/listDepartments")
    public List<Dept> listDepartments() {
        return this.deptClientService.listDepartments();
    }

    @RequestMapping(value = "/save")
    public Object save(Dept dept) {
        return this.deptClientService.save(dept);
    }


}
