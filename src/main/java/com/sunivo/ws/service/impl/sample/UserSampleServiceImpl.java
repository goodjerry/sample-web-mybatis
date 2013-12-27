package com.sunivo.ws.service.impl.sample;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sunivo.ws.beans.request.userSample.UserSampleListRequest;
import com.sunivo.ws.beans.response.userSample.UserSampleListResponse;
import com.sunivo.ws.dao.UserMapper;
import com.sunivo.ws.interfaces.server.IUserSampleService;
import com.sunivo.ws.service.DefaultServiceImpl;

/**
 * user sample模块接口实现类。<br> 
 * 〈功能详细描述〉
 *
 * @author liwen
 * @see [相关类/方法]（可选）
 * @since [产品/模块版本] （可选）
 */
@Service
public class UserSampleServiceImpl extends DefaultServiceImpl implements IUserSampleService {

    @Autowired
    private UserMapper userMapper;

    public UserSampleListResponse getUserList(UserSampleListRequest request) {
        // TODO Auto-generated method stub
        return null;
    }


    public UserSampleListResponse getUserList(com.sunivo.beans.entity.User user) {
        super.setDefaultMapper(userMapper);
        super.save(user);
        return null;
    }


}
