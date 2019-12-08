package com.wx.pit.web.listener;

import com.wx.pit.dao.PitSafetyDao;
import com.wx.pit.entity.PitSafetyEntity;
import org.springframework.web.context.ContextLoaderListener;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ApplicationListener extends ContextLoaderListener implements  ServletContextListener {
    @Override
    public void contextDestroyed(ServletContextEvent event) {
        super.contextDestroyed(event);
    }

    @Override
    public void contextInitialized(ServletContextEvent evt) {
        super.contextInitialized(evt);

        ServletContext sc=evt.getServletContext();
        //初始化系统数据
        try{
            this.initPitSafety(sc);
        }catch(Exception e){
            e.printStackTrace();
        }
    }

    private  void  initPitSafety(ServletContext sc)throws  Exception{
        WebApplicationContext ac = WebApplicationContextUtils.getWebApplicationContext(sc);

        //获取dao
        PitSafetyDao sdao=ac.getBean(PitSafetyDao.class);
        List<PitSafetyEntity> safety=sdao.selectAll();
        Map<String,PitSafetyEntity> safetyMap=new HashMap<>();
        for(PitSafetyEntity s:safety){
            safetyMap.put(s.getNum(),s);
        }
        sc.setAttribute("SAFETY-MAP",safetyMap);
    }
}
