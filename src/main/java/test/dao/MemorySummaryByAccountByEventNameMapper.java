package test.dao;

import java.util.List;
import test.model.MemorySummaryByAccountByEventName;

public interface MemorySummaryByAccountByEventNameMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table memory_summary_by_account_by_event_name
     *
     * @mbg.generated
     */
    int insert(MemorySummaryByAccountByEventName record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table memory_summary_by_account_by_event_name
     *
     * @mbg.generated
     */
    List<MemorySummaryByAccountByEventName> selectAll();
}