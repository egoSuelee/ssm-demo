package org.ssm.dao;

import org.apache.ibatis.annotations.Param;
import org.ssm.entity.User;

import java.util.Date;
import java.util.List;

/**
 * Created by xwy_brh on 2017/9/1.
 */
public interface UserDao {

    /**
     * �����û�
     *
     * @param userName
     * @param userNo
     * @param password
     * @param tel
     * @param createTime
     */
    int insertUser(String userName, String userNo, String password, String tel, Date createTime);


    /**
     * ��ѯ�û�����Ϣ
     *
     * @param userNo
     * @return �����û�����
     */
    User queryByUserNo(String userNo);

    /**
     * ��ѯ�����û���Ϣ
     *
     * @param offset
     * @param limit
     * @return �û���Ϣ�����б�
     */
    List<User> queryAll(@Param("offset") int offset, @Param("limit") int limit);

}
