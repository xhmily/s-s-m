package com.mfs.base;

import org.springframework.dao.DataAccessException;

import java.util.List;
import java.util.Map;

public interface BaseMapper<T> {
    /**
     * 添加记录不返回主键
     * @param entity
     * @return
     * @throws DataAccessException
     */
    public int insert(T entity) throws DataAccessException;
    /**
     * 
     * @param entities
     * @return
     * @throws DataAccessException
     */
    public int insertBatch(List<T> entities) throws DataAccessException;
    /**
     * 查询总记录数
     * @param map
     * @return
     */
    @SuppressWarnings("rawtypes")
    public int queryCountByParams(Map map) throws DataAccessException;
    /**
     * 查询记录 通过id
     * @param id
     * @return
     */
    public T queryById(Integer id) throws DataAccessException;

    /**
     * 分页查询记录
     * @param baseQuery
     * @return
     */
    public List<T> queryForPage(BaseQuery baseQuery) throws DataAccessException;
    /**
     * 查询记录不带分页情况
     * @param map
     * @return
     */
    @SuppressWarnings("rawtypes")
    public List<T> queryByParams(Map map) throws DataAccessException;

    /**
     * 更新记录
     * @param entity
     * @return
     */
    public int update(T entity) throws DataAccessException;

    /**
     * 批量更新
     * @param map
     * @return
     * @throws DataAccessException
     */
    public int updateBatch(Map map) throws DataAccessException;

    /**
     * 删除记录
     * @param id
     * @return
     */
    public int delete(Integer id) throws DataAccessException;

    /**
     * 批量删除
     * @param ids
     * @return
     */
    public int deleteBatch(int[] ids) throws DataAccessException;
}