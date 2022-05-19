package com.fdu.sciback.web.controller;

import com.fdu.sciback.entity.Id2NameEntity;
import com.fdu.sciback.entity.SciEntity;
import com.fdu.sciback.service.IId2NameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@ResponseBody
@RequestMapping("/id2name")
@CrossOrigin
public class Id2NameController {
    @Autowired
    private IId2NameService id2NameService;

    @GetMapping("/list")
    public List<Id2NameEntity> queryAll(){
        List<Id2NameEntity> L=id2NameService.queryAll();
        return L;
    }
}
