package com.example.springboot.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.springboot.bean.New;
import com.example.springboot.bean.Old;
import com.example.springboot.mapper.NewMapper;
import com.example.springboot.mapper.OldMapper;
import com.example.springboot.service.OldService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

/**
 * @author cmsxyz@163.com
 * @date 2024-07-18 2:46
 * @usage
 */
@Service
public class OldServiceImpl extends ServiceImpl<OldMapper, Old> implements OldService {
    @Autowired
    private OldMapper oldMapper;
    @Autowired
    private NewMapper newMapper;

    public void copyData(){
        List<Old> sourceList = oldMapper.selectList(new QueryWrapper<Old>().gt("id", 15));

        List<New> targetList = sourceList.stream()
                .map(source -> {
                    New target = new New();
                    target.setId(source.getId());
                    target.setCode(source.getCode());
                    target.setPath(source.getPath());
                    target.setAddress(source.getAddress());
                    return target;
                })
                .collect(Collectors.toList());
        for (New aNew : targetList) {
            newMapper.insert(aNew);
        }



    }


}
