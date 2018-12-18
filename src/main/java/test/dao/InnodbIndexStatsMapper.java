package test.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import test.model.InnodbIndexStats;

public interface InnodbIndexStatsMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table innodb_index_stats
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(@Param("databaseName") String databaseName, @Param("tableName") String tableName, @Param("indexName") String indexName, @Param("statName") String statName);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table innodb_index_stats
     *
     * @mbg.generated
     */
    int insert(InnodbIndexStats record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table innodb_index_stats
     *
     * @mbg.generated
     */
    InnodbIndexStats selectByPrimaryKey(@Param("databaseName") String databaseName, @Param("tableName") String tableName, @Param("indexName") String indexName, @Param("statName") String statName);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table innodb_index_stats
     *
     * @mbg.generated
     */
    List<InnodbIndexStats> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table innodb_index_stats
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(InnodbIndexStats record);
}