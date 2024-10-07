package com.example.springboot.mapper;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.springboot.bean.New;
import com.example.springboot.bean.Old;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

/**
 * @author cmsxyz@163.com
 * @date 2024-07-18 0:31
 * @usage
 */
@Repository
public interface NewMapper extends BaseMapper<New> {

}
