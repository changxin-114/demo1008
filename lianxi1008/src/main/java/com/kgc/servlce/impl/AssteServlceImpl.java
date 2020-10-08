package com.kgc.servlce.impl;

import com.kgc.mapper.AssetsMapper;
import com.kgc.pojo.Assets;
import com.kgc.pojo.AssetsExample;
import com.kgc.servlce.AssteServlce;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
@Service("assteService")
public class AssteServlceImpl implements AssteServlce {

    @Resource
    AssetsMapper assetsMapper;
    public List<Assets> selByAssteId(String id) {
        AssetsExample example = new AssetsExample();
        if(id != null){
            AssetsExample.Criteria criteria = example.createCriteria();
            criteria.andAssetidLike("%"+id+"%");
        }

        List<Assets> asstes = assetsMapper.selectByExample(example);
        return asstes;
    }

    public int insert(Assets asstes) {
        int i = assetsMapper.insertSelective(asstes);
        return i;
    }
}
