package com.fdu.sciback.web.controller;

import com.fdu.sciback.entity.SciEntity;
import com.fdu.sciback.service.ISciService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@ResponseBody
@RequestMapping("/sci")
@CrossOrigin
public class SciController {

    @Autowired
    private ISciService sciService;

    @GetMapping("/list")
    public List<SciEntity> queryAll(){
        List<SciEntity> L=sciService.queryAll();
        return L;
    }
}
