package cn.seeyourface.springcloud.service;

import cn.seeyourface.springcloud.entity.Dept;

import java.util.List;

public interface IDeptService {

    public boolean addDept(Dept dept);

    public Dept qryDeptById(long id);

    public List<Dept> qryAll();
}
