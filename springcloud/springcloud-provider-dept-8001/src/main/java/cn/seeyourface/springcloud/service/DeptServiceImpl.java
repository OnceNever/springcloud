package cn.seeyourface.springcloud.service;

import cn.seeyourface.springcloud.entity.Dept;
import cn.seeyourface.springcloud.mapper.DeptMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DeptServiceImpl implements IDeptService{

    @Autowired
    DeptMapper deptMapper;

    @Override
    public boolean addDept(Dept dept) {
        return deptMapper.addDept(dept);
    }

    @Override
    public Dept qryDeptById(long id) {
        return deptMapper.qryDeptById(id);
    }

    @Override
    public List<Dept> qryAll() {
        return deptMapper.qryAll();
    }
}
