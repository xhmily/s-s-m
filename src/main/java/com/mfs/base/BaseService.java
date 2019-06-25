package com.mfs.base;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Map;

public abstract class BaseService<T> {
    @Autowired
    public BaseMapper <T> baseMapper;
    
    /**
     * 添加记录
     * @param entity
     * @return
     * @throws Exception
     */
    public int insert(T entity) throws Exception{
        int result= baseMapper.insert(entity);
        return result;
    }
    
    /**
     * 批量添加记录
     * @param entities
     * @return
     * @throws Exception
     */
    public int insertBatch(List<T> entities) throws Exception{
        return baseMapper.insertBatch(entities);
    }
    
    
    /**
     * 根据参数统计记录数
     * @param map
     * @return
     * @throws Exception
     */
    @SuppressWarnings("rawtypes")
    public int queryCountByParams(Map map)throws Exception{
        return baseMapper.queryCountByParams(map);
    }
    
    
    
    
    /**
     * 查询记录通过id
     * @param id
     * @return
     * @throws Exception
     */
    public T queryById(Integer id)throws Exception{
        AssertUtil.isNull(id, "记录id非空!");
        return baseMapper.queryById(id);
    }
    
    
    /**
     * 分页查询
     * @param baseQuery
     * @return
     * @throws Exception
     */
    public PageInfo<T> queryForPage(BaseQuery baseQuery)throws Exception{
        PageHelper.startPage(baseQuery.getPageNum(),baseQuery.getPageSize());
        List<T> list= baseMapper.queryForPage(baseQuery);       
        PageInfo<T> pageInfo=new PageInfo<T>(list);
        return pageInfo;        
    }
    
    
    
    
    /**
     * 
     * @param map
     * @return
     * @throws Exception
     */
    @SuppressWarnings("rawtypes")
    public List<T> queryByParams(Map map)throws Exception{  
        return baseMapper.queryByParams(map);  
    }
    
    
    
    /**
     * 查询记录
     * @param entity
     * @return
     * @throws Exception
     */
    public int update(T entity)throws Exception{
        return baseMapper.update(entity);
    }
    
    
    /**
     * 批量更新
     * @param map
     * @return
     * @throws Exception
     */
    @SuppressWarnings("rawtypes")
    public int updateBatch(Map map) throws Exception{
        return baseMapper.updateBatch(map);
    }
    
    /**
     * 删除记录
     * @param id
     * @return
     * @throws Exception
     */
    public int delete(Integer id) throws Exception{
        // 判断 空
        AssertUtil.isNull(id, "记录id非空！");
        AssertUtil.isNull(queryById(id), "待删除的记录不存在!");
        return  baseMapper.delete(id);
    }
    
    /**
     * 批量删除
     * @param ids
     * @return
     */
    public int deleteBatch(int[] ids) throws Exception{
        AssertUtil.isNull(ids.length==0,"请至少选择一项记录!");
        return  baseMapper.deleteBatch(ids);
    }
}