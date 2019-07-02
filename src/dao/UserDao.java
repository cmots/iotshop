/**
 * @author: cmots
 * @date: 2019/7/2 19:10
 * @description: 用来操作User类的数据
 */
package dao;

import model.User;
import org.apache.ibatis.annotations.Insert;

public interface UserDao {
    @Insert("INSERT INTO ")
    public void register(User user);

}
