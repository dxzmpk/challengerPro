package test.model;

/**
 *
 * This class was generated by MyBatis Generator.
 * This class corresponds to the database table events_waits_current
 */
public class EventsWaitsCurrent {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column events_waits_current.THREAD_ID
     *
     * @mbg.generated
     */
    private Long threadId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column events_waits_current.EVENT_ID
     *
     * @mbg.generated
     */
    private Long eventId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column events_waits_current.END_EVENT_ID
     *
     * @mbg.generated
     */
    private Long endEventId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column events_waits_current.EVENT_NAME
     *
     * @mbg.generated
     */
    private String eventName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column events_waits_current.SOURCE
     *
     * @mbg.generated
     */
    private String source;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column events_waits_current.TIMER_START
     *
     * @mbg.generated
     */
    private Long timerStart;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column events_waits_current.TIMER_END
     *
     * @mbg.generated
     */
    private Long timerEnd;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column events_waits_current.TIMER_WAIT
     *
     * @mbg.generated
     */
    private Long timerWait;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column events_waits_current.SPINS
     *
     * @mbg.generated
     */
    private Integer spins;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column events_waits_current.OBJECT_SCHEMA
     *
     * @mbg.generated
     */
    private String objectSchema;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column events_waits_current.OBJECT_NAME
     *
     * @mbg.generated
     */
    private String objectName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column events_waits_current.INDEX_NAME
     *
     * @mbg.generated
     */
    private String indexName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column events_waits_current.OBJECT_TYPE
     *
     * @mbg.generated
     */
    private String objectType;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column events_waits_current.OBJECT_INSTANCE_BEGIN
     *
     * @mbg.generated
     */
    private Long objectInstanceBegin;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column events_waits_current.NESTING_EVENT_ID
     *
     * @mbg.generated
     */
    private Long nestingEventId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column events_waits_current.NESTING_EVENT_TYPE
     *
     * @mbg.generated
     */
    private String nestingEventType;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column events_waits_current.OPERATION
     *
     * @mbg.generated
     */
    private String operation;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column events_waits_current.NUMBER_OF_BYTES
     *
     * @mbg.generated
     */
    private Long numberOfBytes;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column events_waits_current.FLAGS
     *
     * @mbg.generated
     */
    private Integer flags;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column events_waits_current.THREAD_ID
     *
     * @return the value of events_waits_current.THREAD_ID
     *
     * @mbg.generated
     */
    public Long getThreadId() {
        return threadId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column events_waits_current.THREAD_ID
     *
     * @param threadId the value for events_waits_current.THREAD_ID
     *
     * @mbg.generated
     */
    public void setThreadId(Long threadId) {
        this.threadId = threadId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column events_waits_current.EVENT_ID
     *
     * @return the value of events_waits_current.EVENT_ID
     *
     * @mbg.generated
     */
    public Long getEventId() {
        return eventId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column events_waits_current.EVENT_ID
     *
     * @param eventId the value for events_waits_current.EVENT_ID
     *
     * @mbg.generated
     */
    public void setEventId(Long eventId) {
        this.eventId = eventId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column events_waits_current.END_EVENT_ID
     *
     * @return the value of events_waits_current.END_EVENT_ID
     *
     * @mbg.generated
     */
    public Long getEndEventId() {
        return endEventId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column events_waits_current.END_EVENT_ID
     *
     * @param endEventId the value for events_waits_current.END_EVENT_ID
     *
     * @mbg.generated
     */
    public void setEndEventId(Long endEventId) {
        this.endEventId = endEventId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column events_waits_current.EVENT_NAME
     *
     * @return the value of events_waits_current.EVENT_NAME
     *
     * @mbg.generated
     */
    public String getEventName() {
        return eventName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column events_waits_current.EVENT_NAME
     *
     * @param eventName the value for events_waits_current.EVENT_NAME
     *
     * @mbg.generated
     */
    public void setEventName(String eventName) {
        this.eventName = eventName == null ? null : eventName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column events_waits_current.SOURCE
     *
     * @return the value of events_waits_current.SOURCE
     *
     * @mbg.generated
     */
    public String getSource() {
        return source;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column events_waits_current.SOURCE
     *
     * @param source the value for events_waits_current.SOURCE
     *
     * @mbg.generated
     */
    public void setSource(String source) {
        this.source = source == null ? null : source.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column events_waits_current.TIMER_START
     *
     * @return the value of events_waits_current.TIMER_START
     *
     * @mbg.generated
     */
    public Long getTimerStart() {
        return timerStart;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column events_waits_current.TIMER_START
     *
     * @param timerStart the value for events_waits_current.TIMER_START
     *
     * @mbg.generated
     */
    public void setTimerStart(Long timerStart) {
        this.timerStart = timerStart;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column events_waits_current.TIMER_END
     *
     * @return the value of events_waits_current.TIMER_END
     *
     * @mbg.generated
     */
    public Long getTimerEnd() {
        return timerEnd;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column events_waits_current.TIMER_END
     *
     * @param timerEnd the value for events_waits_current.TIMER_END
     *
     * @mbg.generated
     */
    public void setTimerEnd(Long timerEnd) {
        this.timerEnd = timerEnd;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column events_waits_current.TIMER_WAIT
     *
     * @return the value of events_waits_current.TIMER_WAIT
     *
     * @mbg.generated
     */
    public Long getTimerWait() {
        return timerWait;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column events_waits_current.TIMER_WAIT
     *
     * @param timerWait the value for events_waits_current.TIMER_WAIT
     *
     * @mbg.generated
     */
    public void setTimerWait(Long timerWait) {
        this.timerWait = timerWait;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column events_waits_current.SPINS
     *
     * @return the value of events_waits_current.SPINS
     *
     * @mbg.generated
     */
    public Integer getSpins() {
        return spins;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column events_waits_current.SPINS
     *
     * @param spins the value for events_waits_current.SPINS
     *
     * @mbg.generated
     */
    public void setSpins(Integer spins) {
        this.spins = spins;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column events_waits_current.OBJECT_SCHEMA
     *
     * @return the value of events_waits_current.OBJECT_SCHEMA
     *
     * @mbg.generated
     */
    public String getObjectSchema() {
        return objectSchema;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column events_waits_current.OBJECT_SCHEMA
     *
     * @param objectSchema the value for events_waits_current.OBJECT_SCHEMA
     *
     * @mbg.generated
     */
    public void setObjectSchema(String objectSchema) {
        this.objectSchema = objectSchema == null ? null : objectSchema.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column events_waits_current.OBJECT_NAME
     *
     * @return the value of events_waits_current.OBJECT_NAME
     *
     * @mbg.generated
     */
    public String getObjectName() {
        return objectName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column events_waits_current.OBJECT_NAME
     *
     * @param objectName the value for events_waits_current.OBJECT_NAME
     *
     * @mbg.generated
     */
    public void setObjectName(String objectName) {
        this.objectName = objectName == null ? null : objectName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column events_waits_current.INDEX_NAME
     *
     * @return the value of events_waits_current.INDEX_NAME
     *
     * @mbg.generated
     */
    public String getIndexName() {
        return indexName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column events_waits_current.INDEX_NAME
     *
     * @param indexName the value for events_waits_current.INDEX_NAME
     *
     * @mbg.generated
     */
    public void setIndexName(String indexName) {
        this.indexName = indexName == null ? null : indexName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column events_waits_current.OBJECT_TYPE
     *
     * @return the value of events_waits_current.OBJECT_TYPE
     *
     * @mbg.generated
     */
    public String getObjectType() {
        return objectType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column events_waits_current.OBJECT_TYPE
     *
     * @param objectType the value for events_waits_current.OBJECT_TYPE
     *
     * @mbg.generated
     */
    public void setObjectType(String objectType) {
        this.objectType = objectType == null ? null : objectType.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column events_waits_current.OBJECT_INSTANCE_BEGIN
     *
     * @return the value of events_waits_current.OBJECT_INSTANCE_BEGIN
     *
     * @mbg.generated
     */
    public Long getObjectInstanceBegin() {
        return objectInstanceBegin;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column events_waits_current.OBJECT_INSTANCE_BEGIN
     *
     * @param objectInstanceBegin the value for events_waits_current.OBJECT_INSTANCE_BEGIN
     *
     * @mbg.generated
     */
    public void setObjectInstanceBegin(Long objectInstanceBegin) {
        this.objectInstanceBegin = objectInstanceBegin;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column events_waits_current.NESTING_EVENT_ID
     *
     * @return the value of events_waits_current.NESTING_EVENT_ID
     *
     * @mbg.generated
     */
    public Long getNestingEventId() {
        return nestingEventId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column events_waits_current.NESTING_EVENT_ID
     *
     * @param nestingEventId the value for events_waits_current.NESTING_EVENT_ID
     *
     * @mbg.generated
     */
    public void setNestingEventId(Long nestingEventId) {
        this.nestingEventId = nestingEventId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column events_waits_current.NESTING_EVENT_TYPE
     *
     * @return the value of events_waits_current.NESTING_EVENT_TYPE
     *
     * @mbg.generated
     */
    public String getNestingEventType() {
        return nestingEventType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column events_waits_current.NESTING_EVENT_TYPE
     *
     * @param nestingEventType the value for events_waits_current.NESTING_EVENT_TYPE
     *
     * @mbg.generated
     */
    public void setNestingEventType(String nestingEventType) {
        this.nestingEventType = nestingEventType == null ? null : nestingEventType.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column events_waits_current.OPERATION
     *
     * @return the value of events_waits_current.OPERATION
     *
     * @mbg.generated
     */
    public String getOperation() {
        return operation;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column events_waits_current.OPERATION
     *
     * @param operation the value for events_waits_current.OPERATION
     *
     * @mbg.generated
     */
    public void setOperation(String operation) {
        this.operation = operation == null ? null : operation.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column events_waits_current.NUMBER_OF_BYTES
     *
     * @return the value of events_waits_current.NUMBER_OF_BYTES
     *
     * @mbg.generated
     */
    public Long getNumberOfBytes() {
        return numberOfBytes;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column events_waits_current.NUMBER_OF_BYTES
     *
     * @param numberOfBytes the value for events_waits_current.NUMBER_OF_BYTES
     *
     * @mbg.generated
     */
    public void setNumberOfBytes(Long numberOfBytes) {
        this.numberOfBytes = numberOfBytes;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column events_waits_current.FLAGS
     *
     * @return the value of events_waits_current.FLAGS
     *
     * @mbg.generated
     */
    public Integer getFlags() {
        return flags;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column events_waits_current.FLAGS
     *
     * @param flags the value for events_waits_current.FLAGS
     *
     * @mbg.generated
     */
    public void setFlags(Integer flags) {
        this.flags = flags;
    }
}