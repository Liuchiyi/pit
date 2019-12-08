package com.wx.pit.function;

import com.wx.pit.entity.PitEntity;
import com.wx.pit.web.handler.ao.PitAo;
import org.springframework.transaction.annotation.Transactional;

public interface PitFunction {
//基坑信息展示
    PitEntity currentPit(String num)throws  Exception;
//    基坑信息录入
    @Transactional
PitEntity update(PitAo ao)throws Exception;
}
