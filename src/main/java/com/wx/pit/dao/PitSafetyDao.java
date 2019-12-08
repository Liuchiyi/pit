package com.wx.pit.dao;

import com.wx.pit.entity.PitSafetyEntity;

import java.util.List;

public interface PitSafetyDao {
    List<PitSafetyEntity> selectAll()throws  Exception;
}
