package com.fdu.sciback.mapper;

import com.fdu.sciback.entity.DblpEntity;
import com.fdu.sciback.entity.Id2NameEntity;

import java.util.List;

public interface Id2NameMapper {
    List<Id2NameEntity> queryAll();
}
