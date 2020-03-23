package com.peas.cloud.service.impl;

import com.peas.cloud.entity.Dept;
import com.peas.cloud.service.DeptClientService;
import feign.hystrix.FallbackFactory;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * 统一的熔断处理
 */
@Component
public class DeptClientServiceFallbackFactory implements FallbackFactory<DeptClientService> {
    @Override
    public DeptClientService create(Throwable throwable) {
        return new DeptClientService() {
            @Override
            public Dept get(long id) {
                return new Dept().setDeptNo(id)
                        .setDName("该ID："+id+"没有没有对应的信息,Consumer客户端提供的降级信息,此刻服务Provider已经关闭")
                        .setDb_Source("no this database in MySQL");

            }

            @Override
            public List<Dept> listDepartments() {
                return null;
            }

            @Override
            public boolean save(Dept dept) {
                return false;
            }
        };
    }

}
