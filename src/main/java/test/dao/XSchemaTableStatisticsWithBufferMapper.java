package test.dao;

import java.util.List;
import test.model.XSchemaTableStatisticsWithBuffer;

public interface XSchemaTableStatisticsWithBufferMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table x$schema_table_statistics_with_buffer
     *
     * @mbg.generated
     */
    int insert(XSchemaTableStatisticsWithBuffer record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table x$schema_table_statistics_with_buffer
     *
     * @mbg.generated
     */
    List<XSchemaTableStatisticsWithBuffer> selectAll();
}