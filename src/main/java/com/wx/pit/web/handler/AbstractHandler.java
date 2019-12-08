package com.wx.pit.web.handler;

import com.wx.pit.entity.PitSafetyEntity;

import javax.servlet.http.HttpServletRequest;
import java.util.Map;

public abstract class AbstractHandler {
    public PitSafetyEntity getSafety(HttpServletRequest req, String rank){
        Map<String, PitSafetyEntity> safetyMap=(Map<String, PitSafetyEntity>)req.getServletContext().getAttribute("SAFETY-MAP");
        return safetyMap.get(rank);
    }
}
