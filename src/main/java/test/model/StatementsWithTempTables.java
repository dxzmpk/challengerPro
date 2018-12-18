package test.model;

import java.math.BigDecimal;
import java.util.Date;

/**
 * Database Table Remarks:
 *   VIEW
 *
 * This class was generated by MyBatis Generator.
 * This class corresponds to the database table statements_with_temp_tables
 */
public class StatementsWithTempTables {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column statements_with_temp_tables.db
     *
     * @mbg.generated
     */
    private String db;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column statements_with_temp_tables.exec_count
     *
     * @mbg.generated
     */
    private Long execCount;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column statements_with_temp_tables.memory_tmp_tables
     *
     * @mbg.generated
     */
    private Long memoryTmpTables;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column statements_with_temp_tables.disk_tmp_tables
     *
     * @mbg.generated
     */
    private Long diskTmpTables;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column statements_with_temp_tables.avg_tmp_tables_per_query
     *
     * @mbg.generated
     */
    private BigDecimal avgTmpTablesPerQuery;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column statements_with_temp_tables.tmp_tables_to_disk_pct
     *
     * @mbg.generated
     */
    private BigDecimal tmpTablesToDiskPct;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column statements_with_temp_tables.first_seen
     *
     * @mbg.generated
     */
    private Date firstSeen;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column statements_with_temp_tables.last_seen
     *
     * @mbg.generated
     */
    private Date lastSeen;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column statements_with_temp_tables.digest
     *
     * @mbg.generated
     */
    private String digest;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column statements_with_temp_tables.query
     *
     * @mbg.generated
     */
    private String query;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column statements_with_temp_tables.total_latency
     *
     * @mbg.generated
     */
    private String totalLatency;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column statements_with_temp_tables.db
     *
     * @return the value of statements_with_temp_tables.db
     *
     * @mbg.generated
     */
    public String getDb() {
        return db;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column statements_with_temp_tables.db
     *
     * @param db the value for statements_with_temp_tables.db
     *
     * @mbg.generated
     */
    public void setDb(String db) {
        this.db = db == null ? null : db.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column statements_with_temp_tables.exec_count
     *
     * @return the value of statements_with_temp_tables.exec_count
     *
     * @mbg.generated
     */
    public Long getExecCount() {
        return execCount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column statements_with_temp_tables.exec_count
     *
     * @param execCount the value for statements_with_temp_tables.exec_count
     *
     * @mbg.generated
     */
    public void setExecCount(Long execCount) {
        this.execCount = execCount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column statements_with_temp_tables.memory_tmp_tables
     *
     * @return the value of statements_with_temp_tables.memory_tmp_tables
     *
     * @mbg.generated
     */
    public Long getMemoryTmpTables() {
        return memoryTmpTables;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column statements_with_temp_tables.memory_tmp_tables
     *
     * @param memoryTmpTables the value for statements_with_temp_tables.memory_tmp_tables
     *
     * @mbg.generated
     */
    public void setMemoryTmpTables(Long memoryTmpTables) {
        this.memoryTmpTables = memoryTmpTables;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column statements_with_temp_tables.disk_tmp_tables
     *
     * @return the value of statements_with_temp_tables.disk_tmp_tables
     *
     * @mbg.generated
     */
    public Long getDiskTmpTables() {
        return diskTmpTables;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column statements_with_temp_tables.disk_tmp_tables
     *
     * @param diskTmpTables the value for statements_with_temp_tables.disk_tmp_tables
     *
     * @mbg.generated
     */
    public void setDiskTmpTables(Long diskTmpTables) {
        this.diskTmpTables = diskTmpTables;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column statements_with_temp_tables.avg_tmp_tables_per_query
     *
     * @return the value of statements_with_temp_tables.avg_tmp_tables_per_query
     *
     * @mbg.generated
     */
    public BigDecimal getAvgTmpTablesPerQuery() {
        return avgTmpTablesPerQuery;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column statements_with_temp_tables.avg_tmp_tables_per_query
     *
     * @param avgTmpTablesPerQuery the value for statements_with_temp_tables.avg_tmp_tables_per_query
     *
     * @mbg.generated
     */
    public void setAvgTmpTablesPerQuery(BigDecimal avgTmpTablesPerQuery) {
        this.avgTmpTablesPerQuery = avgTmpTablesPerQuery;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column statements_with_temp_tables.tmp_tables_to_disk_pct
     *
     * @return the value of statements_with_temp_tables.tmp_tables_to_disk_pct
     *
     * @mbg.generated
     */
    public BigDecimal getTmpTablesToDiskPct() {
        return tmpTablesToDiskPct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column statements_with_temp_tables.tmp_tables_to_disk_pct
     *
     * @param tmpTablesToDiskPct the value for statements_with_temp_tables.tmp_tables_to_disk_pct
     *
     * @mbg.generated
     */
    public void setTmpTablesToDiskPct(BigDecimal tmpTablesToDiskPct) {
        this.tmpTablesToDiskPct = tmpTablesToDiskPct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column statements_with_temp_tables.first_seen
     *
     * @return the value of statements_with_temp_tables.first_seen
     *
     * @mbg.generated
     */
    public Date getFirstSeen() {
        return firstSeen;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column statements_with_temp_tables.first_seen
     *
     * @param firstSeen the value for statements_with_temp_tables.first_seen
     *
     * @mbg.generated
     */
    public void setFirstSeen(Date firstSeen) {
        this.firstSeen = firstSeen;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column statements_with_temp_tables.last_seen
     *
     * @return the value of statements_with_temp_tables.last_seen
     *
     * @mbg.generated
     */
    public Date getLastSeen() {
        return lastSeen;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column statements_with_temp_tables.last_seen
     *
     * @param lastSeen the value for statements_with_temp_tables.last_seen
     *
     * @mbg.generated
     */
    public void setLastSeen(Date lastSeen) {
        this.lastSeen = lastSeen;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column statements_with_temp_tables.digest
     *
     * @return the value of statements_with_temp_tables.digest
     *
     * @mbg.generated
     */
    public String getDigest() {
        return digest;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column statements_with_temp_tables.digest
     *
     * @param digest the value for statements_with_temp_tables.digest
     *
     * @mbg.generated
     */
    public void setDigest(String digest) {
        this.digest = digest == null ? null : digest.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column statements_with_temp_tables.query
     *
     * @return the value of statements_with_temp_tables.query
     *
     * @mbg.generated
     */
    public String getQuery() {
        return query;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column statements_with_temp_tables.query
     *
     * @param query the value for statements_with_temp_tables.query
     *
     * @mbg.generated
     */
    public void setQuery(String query) {
        this.query = query == null ? null : query.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column statements_with_temp_tables.total_latency
     *
     * @return the value of statements_with_temp_tables.total_latency
     *
     * @mbg.generated
     */
    public String getTotalLatency() {
        return totalLatency;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column statements_with_temp_tables.total_latency
     *
     * @param totalLatency the value for statements_with_temp_tables.total_latency
     *
     * @mbg.generated
     */
    public void setTotalLatency(String totalLatency) {
        this.totalLatency = totalLatency == null ? null : totalLatency.trim();
    }
}