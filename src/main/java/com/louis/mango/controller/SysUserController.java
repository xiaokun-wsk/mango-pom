package com.louis.mango.controller;

import com.louis.mango.model.SysUser;
import com.louis.mango.service.SysUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 *
 * @author xiaokun wang
 * description:
 * path: mango-v2-com.ccit.controller-SysUserController
 * date: 2019/11/14 19:56
 */
@RestController
@RequestMapping("user")
public class SysUserController {

    @Autowired
    private SysUserService sysUserService;

    @GetMapping("findAll")
    public List<SysUser> findAll(){
        return this.sysUserService.findAll();
    }
}
