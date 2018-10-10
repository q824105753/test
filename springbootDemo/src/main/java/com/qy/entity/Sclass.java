package com.qy.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
@Entity
public class Sclass {
    @Id
    @GeneratedValue
    private Integer cid;

    private String cname;

    public Integer getCid() {
        return cid;
    }

    @Override
    public String toString() {
        return "Sclass{" +
                "cid=" + cid +
                ", cname='" + cname + '\'' +
                '}';
    }

    public void setCid(Integer cid) {
        this.cid = cid;
    }

    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname;
    }
}
