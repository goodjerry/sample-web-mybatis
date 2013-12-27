package com.sunivo.ws.service;

/**  
 * Description: <类功能描述-必填> 公共接口，包括添加、修改、删除、通过id查询、分页查询、查询总数
 * Copyright:   Copyright (c)2013  
 * Company:     ChunYu 
 * @author:     liwen  
 * @version:    1.0  
 * Create at:   2013-12-27 下午3:09:51  
 *  
 * Modification History:  
 * Date         Author      Version     Description  
 * ------------------------------------------------------------------  
 * 2012-12-21   ChenZhao      1.0       如果修改了;必填  
 */

import java.util.List;

import com.sunivo.dao.api.QueryParams;

public interface Service<T> {

    /**
     * {方法的功能/动作描述}
     * 
     * @param {引入参数名} {引入参数说明}
     * @return {返回参数名} {返回参数说明}
     * @exception {说明在某情况下,将发生什么异常}
     */
    public Integer save(T entity);

    /**
     * {方法的功能/动作描述}
     * 
     * @param {引入参数名} {引入参数说明}
     * @return {返回参数名} {返回参数说明}
     * @exception {说明在某情况下,将发生什么异常}
     */
    public void update(T entity);

    /**
     * {方法的功能/动作描述}
     * 
     * @param {引入参数名} {引入参数说明}
     * @return {返回参数名} {返回参数说明}
     * @exception {说明在某情况下,将发生什么异常}
     */
    public void delete(Integer id);

    /**
     * {方法的功能/动作描述}
     * 
     * @param {引入参数名} {引入参数说明}
     * @return {返回参数名} {返回参数说明}
     * @exception {说明在某情况下,将发生什么异常}
     */
    public void deleteByIds(String ids);

    /**
     * {方法的功能/动作描述}
     * 
     * @param {引入参数名} {引入参数说明}
     * @return {返回参数名} {返回参数说明}
     * @exception {说明在某情况下,将发生什么异常}
     */
    public T getById(Integer id);

    /**
     * {方法的功能/动作描述}
     * 
     * @param {引入参数名} {引入参数说明}
     * @return {返回参数名} {返回参数说明}
     * @exception {说明在某情况下,将发生什么异常}
     */
    public List<T> queryByPage(QueryParams<?> queryParams);

    /**
     * {方法的功能/动作描述}
     * 
     * @param {引入参数名} {引入参数说明}
     * @return {返回参数名} {返回参数说明}
     * @exception {说明在某情况下,将发生什么异常}
     */
    public List<T> queryAll();

    /**
     * {方法的功能/动作描述}
     * 
     * @param {引入参数名} {引入参数说明}
     * @return {返回参数名} {返回参数说明}
     * @exception {说明在某情况下,将发生什么异常}
     */
    public int getTotalCount(Object params);
}
