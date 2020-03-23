package com.peas.cloud.controller;

import com.peas.cloud.entity.Dept;
import com.peas.cloud.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/dept")
public class DeptController {

    @Autowired
    private DiscoveryClient client;

    @RequestMapping("/hello")
    public void hello(){
        System.out.println("hello world");
    }

    @Autowired
    private DeptService deptService;

    @PostMapping(value = "/save")
    public boolean save(@RequestBody Dept dept){
        return deptService.save(dept);
    }

    @GetMapping(value = "/get/{id}")
    public Dept get(@PathVariable Long id){
        return deptService.get(id);
    }

    @GetMapping(value = "/listDepartments")
    public List<Dept> listDepartments(){
        return deptService.listDepartments();
    }

    @RequestMapping(value = "/discovery", method = RequestMethod.GET)
    public Object discovery() {
        List<String> list = client.getServices();
        System.out.println("**********" + list);

        List<ServiceInstance> srvList = client.getInstances("CLOUD-DEPT");
        for (ServiceInstance element : srvList) {
            System.out.println(element.getServiceId() + "\t" + element.getHost() + "\t" + element.getPort() + "\t"
                    + element.getUri());
        }
        return this.client;
    }
}
