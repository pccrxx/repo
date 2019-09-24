package com.pcc.com.pcc.daoimpl;

import com.pcc.dao.ItemsDAO;
import com.pcc.domain.Item;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.List;

public class ItemsDAOImpl implements ItemsDAO {

    public List<Item> findAll() throws Exception {

        //加载驱动类
        //Class.forName("com.mysql.jdbc.Driver");
        //获取连接类
        //Connection Connection = DriverManager.getConnection("");
        //获取数据库操作对象
        return null;
    }
}
