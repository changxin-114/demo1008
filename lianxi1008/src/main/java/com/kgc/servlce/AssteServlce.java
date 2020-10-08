package com.kgc.servlce;

import com.kgc.pojo.Assets;

import java.util.List;

public interface AssteServlce {
    List<Assets> selByAssteId(String id);
    int insert(Assets asstes);
}
