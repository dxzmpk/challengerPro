package test.dao;

import java.util.List;
import test.model.EventsWaitsSummaryByAccountByEventName;

public interface EventsWaitsSummaryByAccountByEventNameMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table events_waits_summary_by_account_by_event_name
     *
     * @mbg.generated
     */
    int insert(EventsWaitsSummaryByAccountByEventName record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table events_waits_summary_by_account_by_event_name
     *
     * @mbg.generated
     */
    List<EventsWaitsSummaryByAccountByEventName> selectAll();
}