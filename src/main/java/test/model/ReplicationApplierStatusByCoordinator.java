package test.model;

import java.util.Date;

/**
 *
 * This class was generated by MyBatis Generator.
 * This class corresponds to the database table replication_applier_status_by_coordinator
 */
public class ReplicationApplierStatusByCoordinator {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column replication_applier_status_by_coordinator.CHANNEL_NAME
     *
     * @mbg.generated
     */
    private String channelName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column replication_applier_status_by_coordinator.THREAD_ID
     *
     * @mbg.generated
     */
    private Long threadId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column replication_applier_status_by_coordinator.SERVICE_STATE
     *
     * @mbg.generated
     */
    private String serviceState;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column replication_applier_status_by_coordinator.LAST_ERROR_NUMBER
     *
     * @mbg.generated
     */
    private Integer lastErrorNumber;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column replication_applier_status_by_coordinator.LAST_ERROR_MESSAGE
     *
     * @mbg.generated
     */
    private String lastErrorMessage;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column replication_applier_status_by_coordinator.LAST_ERROR_TIMESTAMP
     *
     * @mbg.generated
     */
    private Date lastErrorTimestamp;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column replication_applier_status_by_coordinator.LAST_PROCESSED_TRANSACTION
     *
     * @mbg.generated
     */
    private String lastProcessedTransaction;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column replication_applier_status_by_coordinator.LAST_PROCESSED_TRANSACTION_ORIGINAL_COMMIT_TIMESTAMP
     *
     * @mbg.generated
     */
    private Date lastProcessedTransactionOriginalCommitTimestamp;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column replication_applier_status_by_coordinator.LAST_PROCESSED_TRANSACTION_IMMEDIATE_COMMIT_TIMESTAMP
     *
     * @mbg.generated
     */
    private Date lastProcessedTransactionImmediateCommitTimestamp;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column replication_applier_status_by_coordinator.LAST_PROCESSED_TRANSACTION_START_BUFFER_TIMESTAMP
     *
     * @mbg.generated
     */
    private Date lastProcessedTransactionStartBufferTimestamp;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column replication_applier_status_by_coordinator.LAST_PROCESSED_TRANSACTION_END_BUFFER_TIMESTAMP
     *
     * @mbg.generated
     */
    private Date lastProcessedTransactionEndBufferTimestamp;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column replication_applier_status_by_coordinator.PROCESSING_TRANSACTION
     *
     * @mbg.generated
     */
    private String processingTransaction;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column replication_applier_status_by_coordinator.PROCESSING_TRANSACTION_ORIGINAL_COMMIT_TIMESTAMP
     *
     * @mbg.generated
     */
    private Date processingTransactionOriginalCommitTimestamp;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column replication_applier_status_by_coordinator.PROCESSING_TRANSACTION_IMMEDIATE_COMMIT_TIMESTAMP
     *
     * @mbg.generated
     */
    private Date processingTransactionImmediateCommitTimestamp;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column replication_applier_status_by_coordinator.PROCESSING_TRANSACTION_START_BUFFER_TIMESTAMP
     *
     * @mbg.generated
     */
    private Date processingTransactionStartBufferTimestamp;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column replication_applier_status_by_coordinator.CHANNEL_NAME
     *
     * @return the value of replication_applier_status_by_coordinator.CHANNEL_NAME
     *
     * @mbg.generated
     */
    public String getChannelName() {
        return channelName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column replication_applier_status_by_coordinator.CHANNEL_NAME
     *
     * @param channelName the value for replication_applier_status_by_coordinator.CHANNEL_NAME
     *
     * @mbg.generated
     */
    public void setChannelName(String channelName) {
        this.channelName = channelName == null ? null : channelName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column replication_applier_status_by_coordinator.THREAD_ID
     *
     * @return the value of replication_applier_status_by_coordinator.THREAD_ID
     *
     * @mbg.generated
     */
    public Long getThreadId() {
        return threadId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column replication_applier_status_by_coordinator.THREAD_ID
     *
     * @param threadId the value for replication_applier_status_by_coordinator.THREAD_ID
     *
     * @mbg.generated
     */
    public void setThreadId(Long threadId) {
        this.threadId = threadId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column replication_applier_status_by_coordinator.SERVICE_STATE
     *
     * @return the value of replication_applier_status_by_coordinator.SERVICE_STATE
     *
     * @mbg.generated
     */
    public String getServiceState() {
        return serviceState;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column replication_applier_status_by_coordinator.SERVICE_STATE
     *
     * @param serviceState the value for replication_applier_status_by_coordinator.SERVICE_STATE
     *
     * @mbg.generated
     */
    public void setServiceState(String serviceState) {
        this.serviceState = serviceState == null ? null : serviceState.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column replication_applier_status_by_coordinator.LAST_ERROR_NUMBER
     *
     * @return the value of replication_applier_status_by_coordinator.LAST_ERROR_NUMBER
     *
     * @mbg.generated
     */
    public Integer getLastErrorNumber() {
        return lastErrorNumber;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column replication_applier_status_by_coordinator.LAST_ERROR_NUMBER
     *
     * @param lastErrorNumber the value for replication_applier_status_by_coordinator.LAST_ERROR_NUMBER
     *
     * @mbg.generated
     */
    public void setLastErrorNumber(Integer lastErrorNumber) {
        this.lastErrorNumber = lastErrorNumber;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column replication_applier_status_by_coordinator.LAST_ERROR_MESSAGE
     *
     * @return the value of replication_applier_status_by_coordinator.LAST_ERROR_MESSAGE
     *
     * @mbg.generated
     */
    public String getLastErrorMessage() {
        return lastErrorMessage;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column replication_applier_status_by_coordinator.LAST_ERROR_MESSAGE
     *
     * @param lastErrorMessage the value for replication_applier_status_by_coordinator.LAST_ERROR_MESSAGE
     *
     * @mbg.generated
     */
    public void setLastErrorMessage(String lastErrorMessage) {
        this.lastErrorMessage = lastErrorMessage == null ? null : lastErrorMessage.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column replication_applier_status_by_coordinator.LAST_ERROR_TIMESTAMP
     *
     * @return the value of replication_applier_status_by_coordinator.LAST_ERROR_TIMESTAMP
     *
     * @mbg.generated
     */
    public Date getLastErrorTimestamp() {
        return lastErrorTimestamp;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column replication_applier_status_by_coordinator.LAST_ERROR_TIMESTAMP
     *
     * @param lastErrorTimestamp the value for replication_applier_status_by_coordinator.LAST_ERROR_TIMESTAMP
     *
     * @mbg.generated
     */
    public void setLastErrorTimestamp(Date lastErrorTimestamp) {
        this.lastErrorTimestamp = lastErrorTimestamp;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column replication_applier_status_by_coordinator.LAST_PROCESSED_TRANSACTION
     *
     * @return the value of replication_applier_status_by_coordinator.LAST_PROCESSED_TRANSACTION
     *
     * @mbg.generated
     */
    public String getLastProcessedTransaction() {
        return lastProcessedTransaction;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column replication_applier_status_by_coordinator.LAST_PROCESSED_TRANSACTION
     *
     * @param lastProcessedTransaction the value for replication_applier_status_by_coordinator.LAST_PROCESSED_TRANSACTION
     *
     * @mbg.generated
     */
    public void setLastProcessedTransaction(String lastProcessedTransaction) {
        this.lastProcessedTransaction = lastProcessedTransaction == null ? null : lastProcessedTransaction.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column replication_applier_status_by_coordinator.LAST_PROCESSED_TRANSACTION_ORIGINAL_COMMIT_TIMESTAMP
     *
     * @return the value of replication_applier_status_by_coordinator.LAST_PROCESSED_TRANSACTION_ORIGINAL_COMMIT_TIMESTAMP
     *
     * @mbg.generated
     */
    public Date getLastProcessedTransactionOriginalCommitTimestamp() {
        return lastProcessedTransactionOriginalCommitTimestamp;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column replication_applier_status_by_coordinator.LAST_PROCESSED_TRANSACTION_ORIGINAL_COMMIT_TIMESTAMP
     *
     * @param lastProcessedTransactionOriginalCommitTimestamp the value for replication_applier_status_by_coordinator.LAST_PROCESSED_TRANSACTION_ORIGINAL_COMMIT_TIMESTAMP
     *
     * @mbg.generated
     */
    public void setLastProcessedTransactionOriginalCommitTimestamp(Date lastProcessedTransactionOriginalCommitTimestamp) {
        this.lastProcessedTransactionOriginalCommitTimestamp = lastProcessedTransactionOriginalCommitTimestamp;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column replication_applier_status_by_coordinator.LAST_PROCESSED_TRANSACTION_IMMEDIATE_COMMIT_TIMESTAMP
     *
     * @return the value of replication_applier_status_by_coordinator.LAST_PROCESSED_TRANSACTION_IMMEDIATE_COMMIT_TIMESTAMP
     *
     * @mbg.generated
     */
    public Date getLastProcessedTransactionImmediateCommitTimestamp() {
        return lastProcessedTransactionImmediateCommitTimestamp;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column replication_applier_status_by_coordinator.LAST_PROCESSED_TRANSACTION_IMMEDIATE_COMMIT_TIMESTAMP
     *
     * @param lastProcessedTransactionImmediateCommitTimestamp the value for replication_applier_status_by_coordinator.LAST_PROCESSED_TRANSACTION_IMMEDIATE_COMMIT_TIMESTAMP
     *
     * @mbg.generated
     */
    public void setLastProcessedTransactionImmediateCommitTimestamp(Date lastProcessedTransactionImmediateCommitTimestamp) {
        this.lastProcessedTransactionImmediateCommitTimestamp = lastProcessedTransactionImmediateCommitTimestamp;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column replication_applier_status_by_coordinator.LAST_PROCESSED_TRANSACTION_START_BUFFER_TIMESTAMP
     *
     * @return the value of replication_applier_status_by_coordinator.LAST_PROCESSED_TRANSACTION_START_BUFFER_TIMESTAMP
     *
     * @mbg.generated
     */
    public Date getLastProcessedTransactionStartBufferTimestamp() {
        return lastProcessedTransactionStartBufferTimestamp;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column replication_applier_status_by_coordinator.LAST_PROCESSED_TRANSACTION_START_BUFFER_TIMESTAMP
     *
     * @param lastProcessedTransactionStartBufferTimestamp the value for replication_applier_status_by_coordinator.LAST_PROCESSED_TRANSACTION_START_BUFFER_TIMESTAMP
     *
     * @mbg.generated
     */
    public void setLastProcessedTransactionStartBufferTimestamp(Date lastProcessedTransactionStartBufferTimestamp) {
        this.lastProcessedTransactionStartBufferTimestamp = lastProcessedTransactionStartBufferTimestamp;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column replication_applier_status_by_coordinator.LAST_PROCESSED_TRANSACTION_END_BUFFER_TIMESTAMP
     *
     * @return the value of replication_applier_status_by_coordinator.LAST_PROCESSED_TRANSACTION_END_BUFFER_TIMESTAMP
     *
     * @mbg.generated
     */
    public Date getLastProcessedTransactionEndBufferTimestamp() {
        return lastProcessedTransactionEndBufferTimestamp;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column replication_applier_status_by_coordinator.LAST_PROCESSED_TRANSACTION_END_BUFFER_TIMESTAMP
     *
     * @param lastProcessedTransactionEndBufferTimestamp the value for replication_applier_status_by_coordinator.LAST_PROCESSED_TRANSACTION_END_BUFFER_TIMESTAMP
     *
     * @mbg.generated
     */
    public void setLastProcessedTransactionEndBufferTimestamp(Date lastProcessedTransactionEndBufferTimestamp) {
        this.lastProcessedTransactionEndBufferTimestamp = lastProcessedTransactionEndBufferTimestamp;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column replication_applier_status_by_coordinator.PROCESSING_TRANSACTION
     *
     * @return the value of replication_applier_status_by_coordinator.PROCESSING_TRANSACTION
     *
     * @mbg.generated
     */
    public String getProcessingTransaction() {
        return processingTransaction;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column replication_applier_status_by_coordinator.PROCESSING_TRANSACTION
     *
     * @param processingTransaction the value for replication_applier_status_by_coordinator.PROCESSING_TRANSACTION
     *
     * @mbg.generated
     */
    public void setProcessingTransaction(String processingTransaction) {
        this.processingTransaction = processingTransaction == null ? null : processingTransaction.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column replication_applier_status_by_coordinator.PROCESSING_TRANSACTION_ORIGINAL_COMMIT_TIMESTAMP
     *
     * @return the value of replication_applier_status_by_coordinator.PROCESSING_TRANSACTION_ORIGINAL_COMMIT_TIMESTAMP
     *
     * @mbg.generated
     */
    public Date getProcessingTransactionOriginalCommitTimestamp() {
        return processingTransactionOriginalCommitTimestamp;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column replication_applier_status_by_coordinator.PROCESSING_TRANSACTION_ORIGINAL_COMMIT_TIMESTAMP
     *
     * @param processingTransactionOriginalCommitTimestamp the value for replication_applier_status_by_coordinator.PROCESSING_TRANSACTION_ORIGINAL_COMMIT_TIMESTAMP
     *
     * @mbg.generated
     */
    public void setProcessingTransactionOriginalCommitTimestamp(Date processingTransactionOriginalCommitTimestamp) {
        this.processingTransactionOriginalCommitTimestamp = processingTransactionOriginalCommitTimestamp;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column replication_applier_status_by_coordinator.PROCESSING_TRANSACTION_IMMEDIATE_COMMIT_TIMESTAMP
     *
     * @return the value of replication_applier_status_by_coordinator.PROCESSING_TRANSACTION_IMMEDIATE_COMMIT_TIMESTAMP
     *
     * @mbg.generated
     */
    public Date getProcessingTransactionImmediateCommitTimestamp() {
        return processingTransactionImmediateCommitTimestamp;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column replication_applier_status_by_coordinator.PROCESSING_TRANSACTION_IMMEDIATE_COMMIT_TIMESTAMP
     *
     * @param processingTransactionImmediateCommitTimestamp the value for replication_applier_status_by_coordinator.PROCESSING_TRANSACTION_IMMEDIATE_COMMIT_TIMESTAMP
     *
     * @mbg.generated
     */
    public void setProcessingTransactionImmediateCommitTimestamp(Date processingTransactionImmediateCommitTimestamp) {
        this.processingTransactionImmediateCommitTimestamp = processingTransactionImmediateCommitTimestamp;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column replication_applier_status_by_coordinator.PROCESSING_TRANSACTION_START_BUFFER_TIMESTAMP
     *
     * @return the value of replication_applier_status_by_coordinator.PROCESSING_TRANSACTION_START_BUFFER_TIMESTAMP
     *
     * @mbg.generated
     */
    public Date getProcessingTransactionStartBufferTimestamp() {
        return processingTransactionStartBufferTimestamp;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column replication_applier_status_by_coordinator.PROCESSING_TRANSACTION_START_BUFFER_TIMESTAMP
     *
     * @param processingTransactionStartBufferTimestamp the value for replication_applier_status_by_coordinator.PROCESSING_TRANSACTION_START_BUFFER_TIMESTAMP
     *
     * @mbg.generated
     */
    public void setProcessingTransactionStartBufferTimestamp(Date processingTransactionStartBufferTimestamp) {
        this.processingTransactionStartBufferTimestamp = processingTransactionStartBufferTimestamp;
    }
}