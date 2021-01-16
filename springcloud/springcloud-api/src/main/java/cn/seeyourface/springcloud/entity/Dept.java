package cn.seeyourface.springcloud.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@NoArgsConstructor
public class Dept implements Serializable {
    private Long deptno;
    private String dname;
//    标识该条数据是保存在哪个数据库中，微服务一个服务对应一个数据库，同一个信息可能存在不同数据库
    private String dbsource;

    public Dept(String dname) {
        this.dname = dname;
    }
}
