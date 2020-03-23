package com.peas.cloud.service;

import com.peas.cloud.entity.Dept;
import com.peas.cloud.service.impl.DeptClientServiceFallbackFactory;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@FeignClient(value = "CLOUD-DEPT",fallbackFactory= DeptClientServiceFallbackFactory.class)
public interface DeptClientService
{
    @RequestMapping(value = "/dept/get/{id}",method = RequestMethod.GET)
    public Dept get(@PathVariable("id") long id);

    @RequestMapping(value = "/dept/listDepartments",method = RequestMethod.GET)
    public List<Dept> listDepartments();

    @RequestMapping(value = "/dept/save",method = RequestMethod.POST)
    public boolean save(Dept dept);
}
