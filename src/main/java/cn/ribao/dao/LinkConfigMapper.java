package cn.ribao.dao;

import cn.ribao.po.LinkConfig;

public interface LinkConfigMapper {
    int deleteByPrimaryKey(Long id);

    int insert(LinkConfig record);

    int insertSelective(LinkConfig record);

    LinkConfig selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(LinkConfig record);

    int updateByPrimaryKey(LinkConfig record);
}