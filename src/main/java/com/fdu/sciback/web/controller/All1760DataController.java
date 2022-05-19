package com.fdu.sciback.web.controller;



import com.fdu.sciback.entity.All1760DataEntity;
import com.fdu.sciback.entity.Id2NameEntity;
import com.fdu.sciback.entity.SciEntity;
import com.fdu.sciback.service.IAll1760DataService;
import com.fdu.sciback.service.IId2NameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@ResponseBody
@RequestMapping("/all1760data")
@CrossOrigin
public class All1760DataController {
    @Autowired
    private IAll1760DataService all1760DataService;

    @GetMapping("/list")
    public List<All1760DataEntity> queryAll(){
        List<All1760DataEntity> L=all1760DataService.queryAll();
        return L;
    }
}
