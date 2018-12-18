package test.dao;

import java.util.List;
import test.model.SysConfig;

public interface SysConfigMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_config
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(String variable);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_config
     *
     * @mbg.generated
     */
    int insert(SysConfig record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_config
     *
     * @mbg.generated
     */
    SysConfig selectByPrimaryKey(String variable);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_config
     *
     * @mbg.generated
     */
    List<SysConfig> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_config
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(SysConfig record);
}