package test.model;

/**
 *
 * This class was generated by MyBatis Generator.
 * This class corresponds to the database table OPTIMIZER_TRACE
 */
public class OptimizerTrace {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column OPTIMIZER_TRACE.QUERY
     *
     * @mbg.generated
     */
    private String query;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column OPTIMIZER_TRACE.TRACE
     *
     * @mbg.generated
     */
    private String trace;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column OPTIMIZER_TRACE.MISSING_BYTES_BEYOND_MAX_MEM_SIZE
     *
     * @mbg.generated
     */
    private Integer missingBytesBeyondMaxMemSize;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column OPTIMIZER_TRACE.INSUFFICIENT_PRIVILEGES
     *
     * @mbg.generated
     */
    private Boolean insufficientPrivileges;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column OPTIMIZER_TRACE.QUERY
     *
     * @return the value of OPTIMIZER_TRACE.QUERY
     *
     * @mbg.generated
     */
    public String getQuery() {
        return query;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column OPTIMIZER_TRACE.QUERY
     *
     * @param query the value for OPTIMIZER_TRACE.QUERY
     *
     * @mbg.generated
     */
    public void setQuery(String query) {
        this.query = query == null ? null : query.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column OPTIMIZER_TRACE.TRACE
     *
     * @return the value of OPTIMIZER_TRACE.TRACE
     *
     * @mbg.generated
     */
    public String getTrace() {
        return trace;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column OPTIMIZER_TRACE.TRACE
     *
     * @param trace the value for OPTIMIZER_TRACE.TRACE
     *
     * @mbg.generated
     */
    public void setTrace(String trace) {
        this.trace = trace == null ? null : trace.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column OPTIMIZER_TRACE.MISSING_BYTES_BEYOND_MAX_MEM_SIZE
     *
     * @return the value of OPTIMIZER_TRACE.MISSING_BYTES_BEYOND_MAX_MEM_SIZE
     *
     * @mbg.generated
     */
    public Integer getMissingBytesBeyondMaxMemSize() {
        return missingBytesBeyondMaxMemSize;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column OPTIMIZER_TRACE.MISSING_BYTES_BEYOND_MAX_MEM_SIZE
     *
     * @param missingBytesBeyondMaxMemSize the value for OPTIMIZER_TRACE.MISSING_BYTES_BEYOND_MAX_MEM_SIZE
     *
     * @mbg.generated
     */
    public void setMissingBytesBeyondMaxMemSize(Integer missingBytesBeyondMaxMemSize) {
        this.missingBytesBeyondMaxMemSize = missingBytesBeyondMaxMemSize;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column OPTIMIZER_TRACE.INSUFFICIENT_PRIVILEGES
     *
     * @return the value of OPTIMIZER_TRACE.INSUFFICIENT_PRIVILEGES
     *
     * @mbg.generated
     */
    public Boolean getInsufficientPrivileges() {
        return insufficientPrivileges;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column OPTIMIZER_TRACE.INSUFFICIENT_PRIVILEGES
     *
     * @param insufficientPrivileges the value for OPTIMIZER_TRACE.INSUFFICIENT_PRIVILEGES
     *
     * @mbg.generated
     */
    public void setInsufficientPrivileges(Boolean insufficientPrivileges) {
        this.insufficientPrivileges = insufficientPrivileges;
    }
}