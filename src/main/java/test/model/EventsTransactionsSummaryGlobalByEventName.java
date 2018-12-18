package test.model;

/**
 *
 * This class was generated by MyBatis Generator.
 * This class corresponds to the database table events_transactions_summary_global_by_event_name
 */
public class EventsTransactionsSummaryGlobalByEventName {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column events_transactions_summary_global_by_event_name.EVENT_NAME
     *
     * @mbg.generated
     */
    private String eventName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column events_transactions_summary_global_by_event_name.COUNT_STAR
     *
     * @mbg.generated
     */
    private Long countStar;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column events_transactions_summary_global_by_event_name.SUM_TIMER_WAIT
     *
     * @mbg.generated
     */
    private Long sumTimerWait;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column events_transactions_summary_global_by_event_name.MIN_TIMER_WAIT
     *
     * @mbg.generated
     */
    private Long minTimerWait;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column events_transactions_summary_global_by_event_name.AVG_TIMER_WAIT
     *
     * @mbg.generated
     */
    private Long avgTimerWait;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column events_transactions_summary_global_by_event_name.MAX_TIMER_WAIT
     *
     * @mbg.generated
     */
    private Long maxTimerWait;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column events_transactions_summary_global_by_event_name.COUNT_READ_WRITE
     *
     * @mbg.generated
     */
    private Long countReadWrite;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column events_transactions_summary_global_by_event_name.SUM_TIMER_READ_WRITE
     *
     * @mbg.generated
     */
    private Long sumTimerReadWrite;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column events_transactions_summary_global_by_event_name.MIN_TIMER_READ_WRITE
     *
     * @mbg.generated
     */
    private Long minTimerReadWrite;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column events_transactions_summary_global_by_event_name.AVG_TIMER_READ_WRITE
     *
     * @mbg.generated
     */
    private Long avgTimerReadWrite;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column events_transactions_summary_global_by_event_name.MAX_TIMER_READ_WRITE
     *
     * @mbg.generated
     */
    private Long maxTimerReadWrite;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column events_transactions_summary_global_by_event_name.COUNT_READ_ONLY
     *
     * @mbg.generated
     */
    private Long countReadOnly;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column events_transactions_summary_global_by_event_name.SUM_TIMER_READ_ONLY
     *
     * @mbg.generated
     */
    private Long sumTimerReadOnly;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column events_transactions_summary_global_by_event_name.MIN_TIMER_READ_ONLY
     *
     * @mbg.generated
     */
    private Long minTimerReadOnly;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column events_transactions_summary_global_by_event_name.AVG_TIMER_READ_ONLY
     *
     * @mbg.generated
     */
    private Long avgTimerReadOnly;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column events_transactions_summary_global_by_event_name.MAX_TIMER_READ_ONLY
     *
     * @mbg.generated
     */
    private Long maxTimerReadOnly;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column events_transactions_summary_global_by_event_name.EVENT_NAME
     *
     * @return the value of events_transactions_summary_global_by_event_name.EVENT_NAME
     *
     * @mbg.generated
     */
    public String getEventName() {
        return eventName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column events_transactions_summary_global_by_event_name.EVENT_NAME
     *
     * @param eventName the value for events_transactions_summary_global_by_event_name.EVENT_NAME
     *
     * @mbg.generated
     */
    public void setEventName(String eventName) {
        this.eventName = eventName == null ? null : eventName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column events_transactions_summary_global_by_event_name.COUNT_STAR
     *
     * @return the value of events_transactions_summary_global_by_event_name.COUNT_STAR
     *
     * @mbg.generated
     */
    public Long getCountStar() {
        return countStar;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column events_transactions_summary_global_by_event_name.COUNT_STAR
     *
     * @param countStar the value for events_transactions_summary_global_by_event_name.COUNT_STAR
     *
     * @mbg.generated
     */
    public void setCountStar(Long countStar) {
        this.countStar = countStar;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column events_transactions_summary_global_by_event_name.SUM_TIMER_WAIT
     *
     * @return the value of events_transactions_summary_global_by_event_name.SUM_TIMER_WAIT
     *
     * @mbg.generated
     */
    public Long getSumTimerWait() {
        return sumTimerWait;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column events_transactions_summary_global_by_event_name.SUM_TIMER_WAIT
     *
     * @param sumTimerWait the value for events_transactions_summary_global_by_event_name.SUM_TIMER_WAIT
     *
     * @mbg.generated
     */
    public void setSumTimerWait(Long sumTimerWait) {
        this.sumTimerWait = sumTimerWait;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column events_transactions_summary_global_by_event_name.MIN_TIMER_WAIT
     *
     * @return the value of events_transactions_summary_global_by_event_name.MIN_TIMER_WAIT
     *
     * @mbg.generated
     */
    public Long getMinTimerWait() {
        return minTimerWait;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column events_transactions_summary_global_by_event_name.MIN_TIMER_WAIT
     *
     * @param minTimerWait the value for events_transactions_summary_global_by_event_name.MIN_TIMER_WAIT
     *
     * @mbg.generated
     */
    public void setMinTimerWait(Long minTimerWait) {
        this.minTimerWait = minTimerWait;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column events_transactions_summary_global_by_event_name.AVG_TIMER_WAIT
     *
     * @return the value of events_transactions_summary_global_by_event_name.AVG_TIMER_WAIT
     *
     * @mbg.generated
     */
    public Long getAvgTimerWait() {
        return avgTimerWait;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column events_transactions_summary_global_by_event_name.AVG_TIMER_WAIT
     *
     * @param avgTimerWait the value for events_transactions_summary_global_by_event_name.AVG_TIMER_WAIT
     *
     * @mbg.generated
     */
    public void setAvgTimerWait(Long avgTimerWait) {
        this.avgTimerWait = avgTimerWait;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column events_transactions_summary_global_by_event_name.MAX_TIMER_WAIT
     *
     * @return the value of events_transactions_summary_global_by_event_name.MAX_TIMER_WAIT
     *
     * @mbg.generated
     */
    public Long getMaxTimerWait() {
        return maxTimerWait;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column events_transactions_summary_global_by_event_name.MAX_TIMER_WAIT
     *
     * @param maxTimerWait the value for events_transactions_summary_global_by_event_name.MAX_TIMER_WAIT
     *
     * @mbg.generated
     */
    public void setMaxTimerWait(Long maxTimerWait) {
        this.maxTimerWait = maxTimerWait;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column events_transactions_summary_global_by_event_name.COUNT_READ_WRITE
     *
     * @return the value of events_transactions_summary_global_by_event_name.COUNT_READ_WRITE
     *
     * @mbg.generated
     */
    public Long getCountReadWrite() {
        return countReadWrite;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column events_transactions_summary_global_by_event_name.COUNT_READ_WRITE
     *
     * @param countReadWrite the value for events_transactions_summary_global_by_event_name.COUNT_READ_WRITE
     *
     * @mbg.generated
     */
    public void setCountReadWrite(Long countReadWrite) {
        this.countReadWrite = countReadWrite;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column events_transactions_summary_global_by_event_name.SUM_TIMER_READ_WRITE
     *
     * @return the value of events_transactions_summary_global_by_event_name.SUM_TIMER_READ_WRITE
     *
     * @mbg.generated
     */
    public Long getSumTimerReadWrite() {
        return sumTimerReadWrite;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column events_transactions_summary_global_by_event_name.SUM_TIMER_READ_WRITE
     *
     * @param sumTimerReadWrite the value for events_transactions_summary_global_by_event_name.SUM_TIMER_READ_WRITE
     *
     * @mbg.generated
     */
    public void setSumTimerReadWrite(Long sumTimerReadWrite) {
        this.sumTimerReadWrite = sumTimerReadWrite;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column events_transactions_summary_global_by_event_name.MIN_TIMER_READ_WRITE
     *
     * @return the value of events_transactions_summary_global_by_event_name.MIN_TIMER_READ_WRITE
     *
     * @mbg.generated
     */
    public Long getMinTimerReadWrite() {
        return minTimerReadWrite;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column events_transactions_summary_global_by_event_name.MIN_TIMER_READ_WRITE
     *
     * @param minTimerReadWrite the value for events_transactions_summary_global_by_event_name.MIN_TIMER_READ_WRITE
     *
     * @mbg.generated
     */
    public void setMinTimerReadWrite(Long minTimerReadWrite) {
        this.minTimerReadWrite = minTimerReadWrite;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column events_transactions_summary_global_by_event_name.AVG_TIMER_READ_WRITE
     *
     * @return the value of events_transactions_summary_global_by_event_name.AVG_TIMER_READ_WRITE
     *
     * @mbg.generated
     */
    public Long getAvgTimerReadWrite() {
        return avgTimerReadWrite;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column events_transactions_summary_global_by_event_name.AVG_TIMER_READ_WRITE
     *
     * @param avgTimerReadWrite the value for events_transactions_summary_global_by_event_name.AVG_TIMER_READ_WRITE
     *
     * @mbg.generated
     */
    public void setAvgTimerReadWrite(Long avgTimerReadWrite) {
        this.avgTimerReadWrite = avgTimerReadWrite;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column events_transactions_summary_global_by_event_name.MAX_TIMER_READ_WRITE
     *
     * @return the value of events_transactions_summary_global_by_event_name.MAX_TIMER_READ_WRITE
     *
     * @mbg.generated
     */
    public Long getMaxTimerReadWrite() {
        return maxTimerReadWrite;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column events_transactions_summary_global_by_event_name.MAX_TIMER_READ_WRITE
     *
     * @param maxTimerReadWrite the value for events_transactions_summary_global_by_event_name.MAX_TIMER_READ_WRITE
     *
     * @mbg.generated
     */
    public void setMaxTimerReadWrite(Long maxTimerReadWrite) {
        this.maxTimerReadWrite = maxTimerReadWrite;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column events_transactions_summary_global_by_event_name.COUNT_READ_ONLY
     *
     * @return the value of events_transactions_summary_global_by_event_name.COUNT_READ_ONLY
     *
     * @mbg.generated
     */
    public Long getCountReadOnly() {
        return countReadOnly;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column events_transactions_summary_global_by_event_name.COUNT_READ_ONLY
     *
     * @param countReadOnly the value for events_transactions_summary_global_by_event_name.COUNT_READ_ONLY
     *
     * @mbg.generated
     */
    public void setCountReadOnly(Long countReadOnly) {
        this.countReadOnly = countReadOnly;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column events_transactions_summary_global_by_event_name.SUM_TIMER_READ_ONLY
     *
     * @return the value of events_transactions_summary_global_by_event_name.SUM_TIMER_READ_ONLY
     *
     * @mbg.generated
     */
    public Long getSumTimerReadOnly() {
        return sumTimerReadOnly;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column events_transactions_summary_global_by_event_name.SUM_TIMER_READ_ONLY
     *
     * @param sumTimerReadOnly the value for events_transactions_summary_global_by_event_name.SUM_TIMER_READ_ONLY
     *
     * @mbg.generated
     */
    public void setSumTimerReadOnly(Long sumTimerReadOnly) {
        this.sumTimerReadOnly = sumTimerReadOnly;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column events_transactions_summary_global_by_event_name.MIN_TIMER_READ_ONLY
     *
     * @return the value of events_transactions_summary_global_by_event_name.MIN_TIMER_READ_ONLY
     *
     * @mbg.generated
     */
    public Long getMinTimerReadOnly() {
        return minTimerReadOnly;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column events_transactions_summary_global_by_event_name.MIN_TIMER_READ_ONLY
     *
     * @param minTimerReadOnly the value for events_transactions_summary_global_by_event_name.MIN_TIMER_READ_ONLY
     *
     * @mbg.generated
     */
    public void setMinTimerReadOnly(Long minTimerReadOnly) {
        this.minTimerReadOnly = minTimerReadOnly;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column events_transactions_summary_global_by_event_name.AVG_TIMER_READ_ONLY
     *
     * @return the value of events_transactions_summary_global_by_event_name.AVG_TIMER_READ_ONLY
     *
     * @mbg.generated
     */
    public Long getAvgTimerReadOnly() {
        return avgTimerReadOnly;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column events_transactions_summary_global_by_event_name.AVG_TIMER_READ_ONLY
     *
     * @param avgTimerReadOnly the value for events_transactions_summary_global_by_event_name.AVG_TIMER_READ_ONLY
     *
     * @mbg.generated
     */
    public void setAvgTimerReadOnly(Long avgTimerReadOnly) {
        this.avgTimerReadOnly = avgTimerReadOnly;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column events_transactions_summary_global_by_event_name.MAX_TIMER_READ_ONLY
     *
     * @return the value of events_transactions_summary_global_by_event_name.MAX_TIMER_READ_ONLY
     *
     * @mbg.generated
     */
    public Long getMaxTimerReadOnly() {
        return maxTimerReadOnly;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column events_transactions_summary_global_by_event_name.MAX_TIMER_READ_ONLY
     *
     * @param maxTimerReadOnly the value for events_transactions_summary_global_by_event_name.MAX_TIMER_READ_ONLY
     *
     * @mbg.generated
     */
    public void setMaxTimerReadOnly(Long maxTimerReadOnly) {
        this.maxTimerReadOnly = maxTimerReadOnly;
    }
}