package cn.itcast.eshop.user.dao.impl;

import cn.itcast.eshop.common.dao.IDataAccess;
import cn.itcast.eshop.common.dao.impl.BaseDAOImpl;
import cn.itcast.eshop.common.dao.impl.TXTDataAccess;
import cn.itcast.eshop.user.dao.UserDAO;
import cn.itcast.eshop.user.entity.User;

import java.util.List;

public class UserDAOImpl extends BaseDAOImpl implements UserDAO {

    /**
     * 调用IDataAccess获取数据并返回
     * 1.创建IDataAccess子类TXTDataAccess的对象
     *     IDataAccess dataAccess = new TXTDataAccess();
     * 2.调用该对象的方法获取所有用户数据并返回
     *      List<User> userList = dataAccess.getList(User.class);
     * @return 返回用户对象列表
     * @throws Exception
     */
    public List<User> getEntityList() throws Exception {
        // 2.调用该对象的方法获取所有用户数据并返回
        return dataAccess.getList(User.class);
    }
}
