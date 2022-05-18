package com.fdu.sciback.service.impl;

import com.fdu.sciback.entity.SciEntity;
import com.fdu.sciback.mapper.SciMapper;
import com.fdu.sciback.service.ISciService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SciServiceImpl implements ISciService {
    @Autowired
    private SciMapper sciMapper;

    @Override
    public List<SciEntity> queryAll() {
        return sciMapper.queryAll();
    }
}
