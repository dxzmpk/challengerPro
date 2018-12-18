package test.model;

/**
 *
 * This class was generated by MyBatis Generator.
 * This class corresponds to the database table events_statements_histogram_global
 */
public class EventsStatementsHistogramGlobal {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column events_statements_histogram_global.BUCKET_NUMBER
     *
     * @mbg.generated
     */
    private Integer bucketNumber;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column events_statements_histogram_global.BUCKET_TIMER_LOW
     *
     * @mbg.generated
     */
    private Long bucketTimerLow;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column events_statements_histogram_global.BUCKET_TIMER_HIGH
     *
     * @mbg.generated
     */
    private Long bucketTimerHigh;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column events_statements_histogram_global.COUNT_BUCKET
     *
     * @mbg.generated
     */
    private Long countBucket;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column events_statements_histogram_global.COUNT_BUCKET_AND_LOWER
     *
     * @mbg.generated
     */
    private Long countBucketAndLower;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column events_statements_histogram_global.BUCKET_QUANTILE
     *
     * @mbg.generated
     */
    private Double bucketQuantile;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column events_statements_histogram_global.BUCKET_NUMBER
     *
     * @return the value of events_statements_histogram_global.BUCKET_NUMBER
     *
     * @mbg.generated
     */
    public Integer getBucketNumber() {
        return bucketNumber;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column events_statements_histogram_global.BUCKET_NUMBER
     *
     * @param bucketNumber the value for events_statements_histogram_global.BUCKET_NUMBER
     *
     * @mbg.generated
     */
    public void setBucketNumber(Integer bucketNumber) {
        this.bucketNumber = bucketNumber;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column events_statements_histogram_global.BUCKET_TIMER_LOW
     *
     * @return the value of events_statements_histogram_global.BUCKET_TIMER_LOW
     *
     * @mbg.generated
     */
    public Long getBucketTimerLow() {
        return bucketTimerLow;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column events_statements_histogram_global.BUCKET_TIMER_LOW
     *
     * @param bucketTimerLow the value for events_statements_histogram_global.BUCKET_TIMER_LOW
     *
     * @mbg.generated
     */
    public void setBucketTimerLow(Long bucketTimerLow) {
        this.bucketTimerLow = bucketTimerLow;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column events_statements_histogram_global.BUCKET_TIMER_HIGH
     *
     * @return the value of events_statements_histogram_global.BUCKET_TIMER_HIGH
     *
     * @mbg.generated
     */
    public Long getBucketTimerHigh() {
        return bucketTimerHigh;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column events_statements_histogram_global.BUCKET_TIMER_HIGH
     *
     * @param bucketTimerHigh the value for events_statements_histogram_global.BUCKET_TIMER_HIGH
     *
     * @mbg.generated
     */
    public void setBucketTimerHigh(Long bucketTimerHigh) {
        this.bucketTimerHigh = bucketTimerHigh;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column events_statements_histogram_global.COUNT_BUCKET
     *
     * @return the value of events_statements_histogram_global.COUNT_BUCKET
     *
     * @mbg.generated
     */
    public Long getCountBucket() {
        return countBucket;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column events_statements_histogram_global.COUNT_BUCKET
     *
     * @param countBucket the value for events_statements_histogram_global.COUNT_BUCKET
     *
     * @mbg.generated
     */
    public void setCountBucket(Long countBucket) {
        this.countBucket = countBucket;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column events_statements_histogram_global.COUNT_BUCKET_AND_LOWER
     *
     * @return the value of events_statements_histogram_global.COUNT_BUCKET_AND_LOWER
     *
     * @mbg.generated
     */
    public Long getCountBucketAndLower() {
        return countBucketAndLower;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column events_statements_histogram_global.COUNT_BUCKET_AND_LOWER
     *
     * @param countBucketAndLower the value for events_statements_histogram_global.COUNT_BUCKET_AND_LOWER
     *
     * @mbg.generated
     */
    public void setCountBucketAndLower(Long countBucketAndLower) {
        this.countBucketAndLower = countBucketAndLower;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column events_statements_histogram_global.BUCKET_QUANTILE
     *
     * @return the value of events_statements_histogram_global.BUCKET_QUANTILE
     *
     * @mbg.generated
     */
    public Double getBucketQuantile() {
        return bucketQuantile;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column events_statements_histogram_global.BUCKET_QUANTILE
     *
     * @param bucketQuantile the value for events_statements_histogram_global.BUCKET_QUANTILE
     *
     * @mbg.generated
     */
    public void setBucketQuantile(Double bucketQuantile) {
        this.bucketQuantile = bucketQuantile;
    }
}