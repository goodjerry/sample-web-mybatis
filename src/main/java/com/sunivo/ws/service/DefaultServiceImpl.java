package com.sunivo.ws.service;

import java.util.List;

import com.esotericsoftware.reflectasm.MethodAccess;
import com.sunivo.dao.api.QueryParams;

public class DefaultServiceImpl<T> implements Service<T> {

    // Mybatis映射器
    private Object defaultMapper;

    public Integer save(T entity) {
        MethodAccess access = MethodAccess.get(defaultMapper.getClass());
        Integer res = (Integer)access.invoke(defaultMapper, "insertSelective", entity);
        return res;
    }

    public void update(T entity) {
        MethodAccess access = MethodAccess.get(defaultMapper.getClass());
        access.invoke(defaultMapper, "updateByPrimaryKeySelective", entity);
    }

    public void delete(Integer id) {
        MethodAccess access = MethodAccess.get(defaultMapper.getClass());
        access.invoke(defaultMapper, "deleteByPrimaryKey", id);
    }

    public void deleteByIds(String ids) {
        
    }

    public T getById(Integer id) {
        return null;
    }

    public List<T> queryByPage(QueryParams<?> queryParams) {
        // TODO Auto-generated method stub
        
        
        return null;
    }

    public List<T> queryAll() {
        // TODO Auto-generated method stub
        return null;
    }

    public int getTotalCount(Object params) {
        // TODO Auto-generated method stub
        return 0;
    }
    
    public Object getDefaultMapper() {
        return defaultMapper;
    }

    public void setDefaultMapper(Object defaultMapper) {
        this.defaultMapper = defaultMapper;
    }

}
