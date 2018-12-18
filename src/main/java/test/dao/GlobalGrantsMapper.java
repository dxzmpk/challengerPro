package test.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import test.model.GlobalGrants;

public interface GlobalGrantsMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table global_grants
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(@Param("user") String user, @Param("host") String host, @Param("priv") String priv);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table global_grants
     *
     * @mbg.generated
     */
    int insert(GlobalGrants record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table global_grants
     *
     * @mbg.generated
     */
    GlobalGrants selectByPrimaryKey(@Param("user") String user, @Param("host") String host, @Param("priv") String priv);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table global_grants
     *
     * @mbg.generated
     */
    List<GlobalGrants> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table global_grants
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(GlobalGrants record);
}