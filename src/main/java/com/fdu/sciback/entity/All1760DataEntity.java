package com.fdu.sciback.entity;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.Objects;

@Entity
@Table(name = "all1760data", schema = "public", catalog = "postgres")
public class All1760DataEntity {
    @Basic
    @Column(name = "id")
    private int id;
    @Basic
    @Column(name = "info")
    private Object info;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Object getInfo() {
        return info;
    }

    public void setInfo(Object info) {
        this.info = info;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        All1760DataEntity that = (All1760DataEntity) o;
        return id == that.id && Objects.equals(info, that.info);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, info);
    }
}
