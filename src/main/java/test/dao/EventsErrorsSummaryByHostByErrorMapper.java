package test.dao;

import java.util.List;
import test.model.EventsErrorsSummaryByHostByError;

public interface EventsErrorsSummaryByHostByErrorMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table events_errors_summary_by_host_by_error
     *
     * @mbg.generated
     */
    int insert(EventsErrorsSummaryByHostByError record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table events_errors_summary_by_host_by_error
     *
     * @mbg.generated
     */
    List<EventsErrorsSummaryByHostByError> selectAll();
}