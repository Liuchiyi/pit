package com.wx.pit.web.handler;
import com.wx.common.ThisSystemException;
import com.wx.pit.entity.PitEntity;
import com.wx.pit.function.PitFunction;

import com.wx.pit.web.handler.ao.PitAo;
import com.wx.pit.web.handler.vo.PitVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


import javax.servlet.http.HttpServletRequest;

@Controller

public class PitHandler {
    @Autowired
    PitFunction fun;

    @RequestMapping(path = "/pit/current.do",method = RequestMethod.GET)
    public String currentView()throws  Exception{
        return "pit/current";

    }
    @RequestMapping(path = "/pit/current.do",method = RequestMethod.POST)

    public String current(String num, HttpServletRequest req)throws  Exception{
        try {
            PitEntity p=fun.currentPit(num);
            PitVo vo=new PitVo();
            vo.setNum(p.getNum());
            vo.setToplateral(String.valueOf(p.getToplateral()));
            vo.setDeeplateral(String.valueOf(p.getDeeplateral()));
            vo.setTopvertical(String.valueOf(p.getTopvertical()));
            vo.setColumnvertical(String.valueOf(p.getColumnvertical()));
            vo.setGap(String.valueOf(p.getGap()));
            vo.setSlant(String.valueOf(p.getSlant()));
            vo.setWaterlevel(String.valueOf(p.getWaterlevel()));
            vo.setSupportforce(String.valueOf(p.getSupportforce()));
            vo.setBoltstress(String.valueOf(p.getBoltstress()));
            vo.setGap(String.valueOf(p.getGap()));
            req.setAttribute("p", vo);
        }catch (ThisSystemException e){
            req.setAttribute("message",e.getMessage());
        }
        return "pit/current";

    }


    @RequestMapping(path = "/pit/tunnel1.do",method = RequestMethod.GET)
    public String tunnel1View()throws  Exception{
        return "pit/tunnel1";

    }
    @RequestMapping(path = "/pit/tunnel1.do",method = RequestMethod.POST)

    public String tunnel1(String name, HttpServletRequest req)throws  Exception{

        return "pit/tunnel1";

    }




    @RequestMapping(path = "/pit/tunnel2.do",method = RequestMethod.GET)
    public String tunnel2View()throws  Exception{
        return "pit/tunnel2";

    }
    @RequestMapping(path = "/pit/tunnel2.do",method = RequestMethod.POST)

    public String tunnel2(String name, HttpServletRequest req)throws  Exception{

        return "pit/tunnel2";

    }

    @RequestMapping(path = "/pit/tunnel3.do",method = RequestMethod.GET)
    public String tunnel3View()throws  Exception{
        return "pit/tunnel3";

    }
    @RequestMapping(path = "/pit/tunnel3.do",method = RequestMethod.POST)

    public String tunnel3(String name, HttpServletRequest req)throws  Exception{

        return "pit/tunnel3";

    }
    @RequestMapping(path = "/pit/query.do",method = RequestMethod.GET)
    public String queryView()throws  Exception{
        return "pit/query";

    }
    @RequestMapping(path = "/pit/query.do",method = RequestMethod.POST)

    public String query(String name, HttpServletRequest req)throws  Exception{

        return "pit/query";
    }

    @RequestMapping(path = "/pit/locate.do",method = RequestMethod.GET)
    public String locateView()throws  Exception{
        return "pit/locate";

    }
    @RequestMapping(path = "/pit/locate.do",method = RequestMethod.POST)

    public String locate(String name, HttpServletRequest req)throws  Exception{

        return "pit/locate";
    }
    @RequestMapping(path = "/pit/update.do",method = RequestMethod.GET)
    public String updateView()throws  Exception{
        return "pit/update";

    }

    @RequestMapping(path = "/pit/update.do",method = RequestMethod.POST)

    public String update(PitAo ao, HttpServletRequest req)throws  Exception{
        try{
            //1 业务方法执行
            PitEntity p=fun.update(ao);
            //2业务跳转
            //TODO:后期跳转到XXX界面
            req.setAttribute("message", "录入成功!");
            return "pit/update";
        }catch(ThisSystemException e){
            req.setAttribute("message", e.getMessage());
        }
        return "pit/update";
    }
}
