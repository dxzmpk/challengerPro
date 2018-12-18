package test.dao;

import java.util.List;
import test.model.SlaveMasterInfo;

public interface SlaveMasterInfoMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table slave_master_info
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(String channelName);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table slave_master_info
     *
     * @mbg.generated
     */
    int insert(SlaveMasterInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table slave_master_info
     *
     * @mbg.generated
     */
    SlaveMasterInfo selectByPrimaryKey(String channelName);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table slave_master_info
     *
     * @mbg.generated
     */
    List<SlaveMasterInfo> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table slave_master_info
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(SlaveMasterInfo record);
}