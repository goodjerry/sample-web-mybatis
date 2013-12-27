package com.sunivo.ws.service;

import com.sunivo.beans.entity.User;


/**
 * user对象的操作接口。<br> 
 * 〈功能详细描述〉
 *
 * @author liwen
 * @see [相关类/方法]（可选）
 * @since [产品/模块版本] （可选）
 */
public interface UserService {
    /**
     * 功能描述: 保存user对象的方法。<br>
     * 〈功能详细描述〉
     *
     * @param user
     * @see [相关类/方法](可选)
     * @since [产品/模块版本](可选)
     */
    void insertUser(User user);
}
