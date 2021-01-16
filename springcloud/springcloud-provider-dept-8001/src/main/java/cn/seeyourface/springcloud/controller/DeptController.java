package cn.seeyourface.springcloud.controller;

import cn.seeyourface.springcloud.entity.Dept;
import cn.seeyourface.springcloud.service.DeptServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

//提供服务
@RestController
public class DeptController {

    @Autowired
    DeptServiceImpl deptService;

    @PostMapping("/dept/add")
    public boolean addDept(Dept dept) {
        return deptService.addDept(dept);
    }

    @GetMapping("/dept/get/{id}")
    public Dept qryDeptById(@PathVariable("id") long id) {
        return deptService.qryDeptById(id);
    }

    @GetMapping("/dept/list")
    public List<Dept> qryAll() {
        return deptService.qryAll();
    }
}
