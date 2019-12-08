package com.wx.pit.function.impl;

import com.wx.common.ThisSystemException;
import com.wx.common.ThisSystemUtil;
import com.wx.pit.dao.PitDao;
import com.wx.pit.entity.PitEntity;
import com.wx.pit.function.PitFunction;
import static com.wx.common.AssertThrowUtil.*;

import com.wx.pit.web.handler.ao.PitAo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PitFunctionImpl implements PitFunction {
    @Autowired
    PitDao pdao;
    @Override
    public PitEntity currentPit(String num)throws Exception {
        //1验证参数
        num = $("通道必须选择！", num);
//        2业务处理
        PitEntity p = pdao.select("num", num);
        if (p == null) {
            throw new ThisSystemException("未找到此通道");
        }
//        3封装业务结果

        return p;
    }

  @Override
    public PitEntity update(PitAo ao) throws Exception {
        //1 参数验证
        if(ao==null){
            throw new IllegalArgumentException("ao不能为空");
        }

        //2 业务处理
        PitEntity p=new PitEntity();

        p.setId(ThisSystemUtil.uuid());
        p.setNum(ao.getNum());
        p.setToplateral(ao.getToplateral());
        p.setTopvertical(ao.getTopvertical());
        p.setSlant(ao.getSlant());
        p.setDeeplateral(ao.getDeeplateral());
        p.setColumnvertical(ao.getColumnvertical());
        p.setWaterlevel(ao.getWaterlevel());
        p.setSupportforce(ao.getSupportforce());
        p.setBoltstress(ao.getBoltstress());
        p.setGap(ao.getGap());
        pdao.insert(p);

        //3 封装业务结果
        return p;
    }
}
