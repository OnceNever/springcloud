package cn.seeyourface.springcloud.mapper;

import cn.seeyourface.springcloud.entity.Dept;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface DeptMapper {

    public boolean addDept(Dept dept);

    public Dept qryDeptById(long id);

    public List<Dept> qryAll();
}
