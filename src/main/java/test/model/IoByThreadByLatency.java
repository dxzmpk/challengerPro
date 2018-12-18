package test.model;

import java.math.BigDecimal;

/**
 * Database Table Remarks:
 *   VIEW
 *
 * This class was generated by MyBatis Generator.
 * This class corresponds to the database table io_by_thread_by_latency
 */
public class IoByThreadByLatency {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column io_by_thread_by_latency.user
     *
     * @mbg.generated
     */
    private String user;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column io_by_thread_by_latency.total
     *
     * @mbg.generated
     */
    private BigDecimal total;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column io_by_thread_by_latency.thread_id
     *
     * @mbg.generated
     */
    private Long threadId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column io_by_thread_by_latency.processlist_id
     *
     * @mbg.generated
     */
    private Long processlistId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column io_by_thread_by_latency.total_latency
     *
     * @mbg.generated
     */
    private String totalLatency;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column io_by_thread_by_latency.min_latency
     *
     * @mbg.generated
     */
    private String minLatency;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column io_by_thread_by_latency.avg_latency
     *
     * @mbg.generated
     */
    private String avgLatency;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column io_by_thread_by_latency.max_latency
     *
     * @mbg.generated
     */
    private String maxLatency;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column io_by_thread_by_latency.user
     *
     * @return the value of io_by_thread_by_latency.user
     *
     * @mbg.generated
     */
    public String getUser() {
        return user;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column io_by_thread_by_latency.user
     *
     * @param user the value for io_by_thread_by_latency.user
     *
     * @mbg.generated
     */
    public void setUser(String user) {
        this.user = user == null ? null : user.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column io_by_thread_by_latency.total
     *
     * @return the value of io_by_thread_by_latency.total
     *
     * @mbg.generated
     */
    public BigDecimal getTotal() {
        return total;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column io_by_thread_by_latency.total
     *
     * @param total the value for io_by_thread_by_latency.total
     *
     * @mbg.generated
     */
    public void setTotal(BigDecimal total) {
        this.total = total;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column io_by_thread_by_latency.thread_id
     *
     * @return the value of io_by_thread_by_latency.thread_id
     *
     * @mbg.generated
     */
    public Long getThreadId() {
        return threadId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column io_by_thread_by_latency.thread_id
     *
     * @param threadId the value for io_by_thread_by_latency.thread_id
     *
     * @mbg.generated
     */
    public void setThreadId(Long threadId) {
        this.threadId = threadId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column io_by_thread_by_latency.processlist_id
     *
     * @return the value of io_by_thread_by_latency.processlist_id
     *
     * @mbg.generated
     */
    public Long getProcesslistId() {
        return processlistId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column io_by_thread_by_latency.processlist_id
     *
     * @param processlistId the value for io_by_thread_by_latency.processlist_id
     *
     * @mbg.generated
     */
    public void setProcesslistId(Long processlistId) {
        this.processlistId = processlistId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column io_by_thread_by_latency.total_latency
     *
     * @return the value of io_by_thread_by_latency.total_latency
     *
     * @mbg.generated
     */
    public String getTotalLatency() {
        return totalLatency;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column io_by_thread_by_latency.total_latency
     *
     * @param totalLatency the value for io_by_thread_by_latency.total_latency
     *
     * @mbg.generated
     */
    public void setTotalLatency(String totalLatency) {
        this.totalLatency = totalLatency == null ? null : totalLatency.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column io_by_thread_by_latency.min_latency
     *
     * @return the value of io_by_thread_by_latency.min_latency
     *
     * @mbg.generated
     */
    public String getMinLatency() {
        return minLatency;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column io_by_thread_by_latency.min_latency
     *
     * @param minLatency the value for io_by_thread_by_latency.min_latency
     *
     * @mbg.generated
     */
    public void setMinLatency(String minLatency) {
        this.minLatency = minLatency == null ? null : minLatency.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column io_by_thread_by_latency.avg_latency
     *
     * @return the value of io_by_thread_by_latency.avg_latency
     *
     * @mbg.generated
     */
    public String getAvgLatency() {
        return avgLatency;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column io_by_thread_by_latency.avg_latency
     *
     * @param avgLatency the value for io_by_thread_by_latency.avg_latency
     *
     * @mbg.generated
     */
    public void setAvgLatency(String avgLatency) {
        this.avgLatency = avgLatency == null ? null : avgLatency.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column io_by_thread_by_latency.max_latency
     *
     * @return the value of io_by_thread_by_latency.max_latency
     *
     * @mbg.generated
     */
    public String getMaxLatency() {
        return maxLatency;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column io_by_thread_by_latency.max_latency
     *
     * @param maxLatency the value for io_by_thread_by_latency.max_latency
     *
     * @mbg.generated
     */
    public void setMaxLatency(String maxLatency) {
        this.maxLatency = maxLatency == null ? null : maxLatency.trim();
    }
}