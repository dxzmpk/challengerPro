package test.dao;

import java.util.List;
import test.model.EventsStatementsSummaryByAccountByEventName;

public interface EventsStatementsSummaryByAccountByEventNameMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table events_statements_summary_by_account_by_event_name
     *
     * @mbg.generated
     */
    int insert(EventsStatementsSummaryByAccountByEventName record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table events_statements_summary_by_account_by_event_name
     *
     * @mbg.generated
     */
    List<EventsStatementsSummaryByAccountByEventName> selectAll();
}