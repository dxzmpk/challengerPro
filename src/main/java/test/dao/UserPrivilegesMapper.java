package test.dao;

import java.util.List;
import test.model.UserPrivileges;

public interface UserPrivilegesMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table USER_PRIVILEGES
     *
     * @mbg.generated
     */
    int insert(UserPrivileges record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table USER_PRIVILEGES
     *
     * @mbg.generated
     */
    List<UserPrivileges> selectAll();
}