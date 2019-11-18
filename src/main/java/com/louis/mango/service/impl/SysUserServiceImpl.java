package com.louis.mango.service.impl;

import com.louis.mango.dao.SysUserMapper;
import com.louis.mango.model.SysUser;
import com.louis.mango.service.SysUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 *
 * @author xiaokun wang
 * description:
 * path: mango-v2-com.louis.mango.service.impl-SysUSerServiceImpl
 * date: 2019/11/14 19:53
 */

@Service
public class SysUserServiceImpl implements SysUserService {

    @Autowired
    private SysUserMapper sysUserMapper;

    @Override
    public List<SysUser> findAll() {
        return this.sysUserMapper.findAll();
    }
}
