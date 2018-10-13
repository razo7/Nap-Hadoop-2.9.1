/**
 * Autogenerated by Avro
 * 
 * DO NOT EDIT DIRECTLY
 */
package org.apache.hadoop.mapreduce.jobhistory;  
@SuppressWarnings("all")
@org.apache.avro.specific.AvroGenerated
public class Event extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"Event\",\"namespace\":\"org.apache.hadoop.mapreduce.jobhistory\",\"fields\":[{\"name\":\"type\",\"type\":{\"type\":\"enum\",\"name\":\"EventType\",\"symbols\":[\"JOB_SUBMITTED\",\"JOB_INITED\",\"JOB_FINISHED\",\"JOB_PRIORITY_CHANGED\",\"JOB_STATUS_CHANGED\",\"JOB_QUEUE_CHANGED\",\"JOB_FAILED\",\"JOB_KILLED\",\"JOB_ERROR\",\"JOB_INFO_CHANGED\",\"TASK_STARTED\",\"TASK_FINISHED\",\"TASK_FAILED\",\"TASK_UPDATED\",\"NORMALIZED_RESOURCE\",\"MAP_ATTEMPT_STARTED\",\"MAP_ATTEMPT_FINISHED\",\"MAP_ATTEMPT_FAILED\",\"MAP_ATTEMPT_KILLED\",\"REDUCE_ATTEMPT_STARTED\",\"REDUCE_ATTEMPT_FINISHED\",\"REDUCE_ATTEMPT_FAILED\",\"REDUCE_ATTEMPT_KILLED\",\"SETUP_ATTEMPT_STARTED\",\"SETUP_ATTEMPT_FINISHED\",\"SETUP_ATTEMPT_FAILED\",\"SETUP_ATTEMPT_KILLED\",\"CLEANUP_ATTEMPT_STARTED\",\"CLEANUP_ATTEMPT_FINISHED\",\"CLEANUP_ATTEMPT_FAILED\",\"CLEANUP_ATTEMPT_KILLED\",\"AM_STARTED\"]}},{\"name\":\"event\",\"type\":[{\"type\":\"record\",\"name\":\"JobFinished\",\"fields\":[{\"name\":\"jobid\",\"type\":\"string\"},{\"name\":\"finishTime\",\"type\":\"long\"},{\"name\":\"finishedMaps\",\"type\":\"int\"},{\"name\":\"finishedReduces\",\"type\":\"int\"},{\"name\":\"failedMaps\",\"type\":\"int\"},{\"name\":\"failedReduces\",\"type\":\"int\"},{\"name\":\"totalCounters\",\"type\":{\"type\":\"record\",\"name\":\"JhCounters\",\"fields\":[{\"name\":\"name\",\"type\":\"string\"},{\"name\":\"groups\",\"type\":{\"type\":\"array\",\"items\":{\"type\":\"record\",\"name\":\"JhCounterGroup\",\"fields\":[{\"name\":\"name\",\"type\":\"string\"},{\"name\":\"displayName\",\"type\":\"string\"},{\"name\":\"counts\",\"type\":{\"type\":\"array\",\"items\":{\"type\":\"record\",\"name\":\"JhCounter\",\"fields\":[{\"name\":\"name\",\"type\":\"string\"},{\"name\":\"displayName\",\"type\":\"string\"},{\"name\":\"value\",\"type\":\"long\"}]}}}]}}}]}},{\"name\":\"mapCounters\",\"type\":\"JhCounters\"},{\"name\":\"reduceCounters\",\"type\":\"JhCounters\"}]},{\"type\":\"record\",\"name\":\"JobInfoChange\",\"fields\":[{\"name\":\"jobid\",\"type\":\"string\"},{\"name\":\"submitTime\",\"type\":\"long\"},{\"name\":\"launchTime\",\"type\":\"long\"}]},{\"type\":\"record\",\"name\":\"JobInited\",\"fields\":[{\"name\":\"jobid\",\"type\":\"string\"},{\"name\":\"launchTime\",\"type\":\"long\"},{\"name\":\"totalMaps\",\"type\":\"int\"},{\"name\":\"totalReduces\",\"type\":\"int\"},{\"name\":\"jobStatus\",\"type\":\"string\"},{\"name\":\"uberized\",\"type\":\"boolean\"}]},{\"type\":\"record\",\"name\":\"AMStarted\",\"fields\":[{\"name\":\"applicationAttemptId\",\"type\":\"string\"},{\"name\":\"startTime\",\"type\":\"long\"},{\"name\":\"containerId\",\"type\":\"string\"},{\"name\":\"nodeManagerHost\",\"type\":\"string\"},{\"name\":\"nodeManagerPort\",\"type\":\"int\"},{\"name\":\"nodeManagerHttpPort\",\"type\":\"int\"}]},{\"type\":\"record\",\"name\":\"JobPriorityChange\",\"fields\":[{\"name\":\"jobid\",\"type\":\"string\"},{\"name\":\"priority\",\"type\":\"string\"}]},{\"type\":\"record\",\"name\":\"JobQueueChange\",\"fields\":[{\"name\":\"jobid\",\"type\":\"string\"},{\"name\":\"jobQueueName\",\"type\":\"string\"}]},{\"type\":\"record\",\"name\":\"JobStatusChanged\",\"fields\":[{\"name\":\"jobid\",\"type\":\"string\"},{\"name\":\"jobStatus\",\"type\":\"string\"}]},{\"type\":\"record\",\"name\":\"JobSubmitted\",\"fields\":[{\"name\":\"jobid\",\"type\":\"string\"},{\"name\":\"jobName\",\"type\":\"string\"},{\"name\":\"userName\",\"type\":\"string\"},{\"name\":\"submitTime\",\"type\":\"long\"},{\"name\":\"jobConfPath\",\"type\":\"string\"},{\"name\":\"acls\",\"type\":{\"type\":\"map\",\"values\":\"string\"}},{\"name\":\"jobQueueName\",\"type\":\"string\"},{\"name\":\"workflowId\",\"type\":[\"null\",\"string\"],\"default\":null},{\"name\":\"workflowName\",\"type\":[\"null\",\"string\"],\"default\":null},{\"name\":\"workflowNodeName\",\"type\":[\"null\",\"string\"],\"default\":null},{\"name\":\"workflowAdjacencies\",\"type\":[\"null\",\"string\"],\"default\":null},{\"name\":\"workflowTags\",\"type\":[\"null\",\"string\"],\"default\":null}]},{\"type\":\"record\",\"name\":\"JobUnsuccessfulCompletion\",\"fields\":[{\"name\":\"jobid\",\"type\":\"string\"},{\"name\":\"finishTime\",\"type\":\"long\"},{\"name\":\"finishedMaps\",\"type\":\"int\"},{\"name\":\"finishedReduces\",\"type\":\"int\"},{\"name\":\"jobStatus\",\"type\":\"string\"},{\"name\":\"diagnostics\",\"type\":[\"null\",\"string\"],\"default\":null}]},{\"type\":\"record\",\"name\":\"MapAttemptFinished\",\"fields\":[{\"name\":\"taskid\",\"type\":\"string\"},{\"name\":\"attemptId\",\"type\":\"string\"},{\"name\":\"taskType\",\"type\":\"string\"},{\"name\":\"taskStatus\",\"type\":\"string\"},{\"name\":\"mapFinishTime\",\"type\":\"long\"},{\"name\":\"finishTime\",\"type\":\"long\"},{\"name\":\"hostname\",\"type\":\"string\"},{\"name\":\"port\",\"type\":\"int\"},{\"name\":\"rackname\",\"type\":\"string\"},{\"name\":\"state\",\"type\":\"string\"},{\"name\":\"counters\",\"type\":\"JhCounters\"},{\"name\":\"clockSplits\",\"type\":{\"type\":\"array\",\"items\":\"int\"}},{\"name\":\"cpuUsages\",\"type\":{\"type\":\"array\",\"items\":\"int\"}},{\"name\":\"vMemKbytes\",\"type\":{\"type\":\"array\",\"items\":\"int\"}},{\"name\":\"physMemKbytes\",\"type\":{\"type\":\"array\",\"items\":\"int\"}}]},{\"type\":\"record\",\"name\":\"ReduceAttemptFinished\",\"fields\":[{\"name\":\"taskid\",\"type\":\"string\"},{\"name\":\"attemptId\",\"type\":\"string\"},{\"name\":\"taskType\",\"type\":\"string\"},{\"name\":\"taskStatus\",\"type\":\"string\"},{\"name\":\"shuffleFinishTime\",\"type\":\"long\"},{\"name\":\"sortFinishTime\",\"type\":\"long\"},{\"name\":\"finishTime\",\"type\":\"long\"},{\"name\":\"hostname\",\"type\":\"string\"},{\"name\":\"port\",\"type\":\"int\"},{\"name\":\"rackname\",\"type\":\"string\"},{\"name\":\"state\",\"type\":\"string\"},{\"name\":\"counters\",\"type\":\"JhCounters\"},{\"name\":\"clockSplits\",\"type\":{\"type\":\"array\",\"items\":\"int\"}},{\"name\":\"cpuUsages\",\"type\":{\"type\":\"array\",\"items\":\"int\"}},{\"name\":\"vMemKbytes\",\"type\":{\"type\":\"array\",\"items\":\"int\"}},{\"name\":\"physMemKbytes\",\"type\":{\"type\":\"array\",\"items\":\"int\"}}]},{\"type\":\"record\",\"name\":\"TaskAttemptFinished\",\"fields\":[{\"name\":\"taskid\",\"type\":\"string\"},{\"name\":\"attemptId\",\"type\":\"string\"},{\"name\":\"taskType\",\"type\":\"string\"},{\"name\":\"taskStatus\",\"type\":\"string\"},{\"name\":\"finishTime\",\"type\":\"long\"},{\"name\":\"rackname\",\"type\":\"string\"},{\"name\":\"hostname\",\"type\":\"string\"},{\"name\":\"state\",\"type\":\"string\"},{\"name\":\"counters\",\"type\":\"JhCounters\"}]},{\"type\":\"record\",\"name\":\"TaskAttemptStarted\",\"fields\":[{\"name\":\"taskid\",\"type\":\"string\"},{\"name\":\"taskType\",\"type\":\"string\"},{\"name\":\"attemptId\",\"type\":\"string\"},{\"name\":\"startTime\",\"type\":\"long\"},{\"name\":\"trackerName\",\"type\":\"string\"},{\"name\":\"httpPort\",\"type\":\"int\"},{\"name\":\"shufflePort\",\"type\":\"int\"},{\"name\":\"containerId\",\"type\":\"string\"},{\"name\":\"locality\",\"type\":[\"null\",\"string\"],\"default\":null},{\"name\":\"avataar\",\"type\":[\"null\",\"string\"],\"default\":null}]},{\"type\":\"record\",\"name\":\"TaskAttemptUnsuccessfulCompletion\",\"fields\":[{\"name\":\"taskid\",\"type\":\"string\"},{\"name\":\"taskType\",\"type\":\"string\"},{\"name\":\"attemptId\",\"type\":\"string\"},{\"name\":\"finishTime\",\"type\":\"long\"},{\"name\":\"hostname\",\"type\":\"string\"},{\"name\":\"port\",\"type\":\"int\"},{\"name\":\"rackname\",\"type\":\"string\"},{\"name\":\"status\",\"type\":\"string\"},{\"name\":\"error\",\"type\":\"string\"},{\"name\":\"counters\",\"type\":[\"null\",\"JhCounters\"],\"default\":null},{\"name\":\"clockSplits\",\"type\":{\"type\":\"array\",\"items\":\"int\"}},{\"name\":\"cpuUsages\",\"type\":{\"type\":\"array\",\"items\":\"int\"}},{\"name\":\"vMemKbytes\",\"type\":{\"type\":\"array\",\"items\":\"int\"}},{\"name\":\"physMemKbytes\",\"type\":{\"type\":\"array\",\"items\":\"int\"}}]},{\"type\":\"record\",\"name\":\"TaskFailed\",\"fields\":[{\"name\":\"taskid\",\"type\":\"string\"},{\"name\":\"taskType\",\"type\":\"string\"},{\"name\":\"finishTime\",\"type\":\"long\"},{\"name\":\"error\",\"type\":\"string\"},{\"name\":\"failedDueToAttempt\",\"type\":[\"null\",\"string\"]},{\"name\":\"status\",\"type\":\"string\"},{\"name\":\"counters\",\"type\":[\"null\",\"JhCounters\"],\"default\":null}]},{\"type\":\"record\",\"name\":\"TaskFinished\",\"fields\":[{\"name\":\"taskid\",\"type\":\"string\"},{\"name\":\"taskType\",\"type\":\"string\"},{\"name\":\"finishTime\",\"type\":\"long\"},{\"name\":\"status\",\"type\":\"string\"},{\"name\":\"counters\",\"type\":\"JhCounters\"},{\"name\":\"successfulAttemptId\",\"type\":[\"null\",\"string\"],\"default\":null}]},{\"type\":\"record\",\"name\":\"TaskStarted\",\"fields\":[{\"name\":\"taskid\",\"type\":\"string\"},{\"name\":\"taskType\",\"type\":\"string\"},{\"name\":\"startTime\",\"type\":\"long\"},{\"name\":\"splitLocations\",\"type\":\"string\"}]},{\"type\":\"record\",\"name\":\"TaskUpdated\",\"fields\":[{\"name\":\"taskid\",\"type\":\"string\"},{\"name\":\"finishTime\",\"type\":\"long\"}]}]}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }
  @Deprecated public org.apache.hadoop.mapreduce.jobhistory.EventType type;
  @Deprecated public java.lang.Object event;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>. 
   */
  public Event() {}

  /**
   * All-args constructor.
   */
  public Event(org.apache.hadoop.mapreduce.jobhistory.EventType type, java.lang.Object event) {
    this.type = type;
    this.event = event;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call. 
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return type;
    case 1: return event;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }
  // Used by DatumReader.  Applications should not call. 
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: type = (org.apache.hadoop.mapreduce.jobhistory.EventType)value$; break;
    case 1: event = (java.lang.Object)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'type' field.
   */
  public org.apache.hadoop.mapreduce.jobhistory.EventType getType() {
    return type;
  }

  /**
   * Sets the value of the 'type' field.
   * @param value the value to set.
   */
  public void setType(org.apache.hadoop.mapreduce.jobhistory.EventType value) {
    this.type = value;
  }

  /**
   * Gets the value of the 'event' field.
   */
  public java.lang.Object getEvent() {
    return event;
  }

  /**
   * Sets the value of the 'event' field.
   * @param value the value to set.
   */
  public void setEvent(java.lang.Object value) {
    this.event = value;
  }

  /** Creates a new Event RecordBuilder */
  public static org.apache.hadoop.mapreduce.jobhistory.Event.Builder newBuilder() {
    return new org.apache.hadoop.mapreduce.jobhistory.Event.Builder();
  }
  
  /** Creates a new Event RecordBuilder by copying an existing Builder */
  public static org.apache.hadoop.mapreduce.jobhistory.Event.Builder newBuilder(org.apache.hadoop.mapreduce.jobhistory.Event.Builder other) {
    return new org.apache.hadoop.mapreduce.jobhistory.Event.Builder(other);
  }
  
  /** Creates a new Event RecordBuilder by copying an existing Event instance */
  public static org.apache.hadoop.mapreduce.jobhistory.Event.Builder newBuilder(org.apache.hadoop.mapreduce.jobhistory.Event other) {
    return new org.apache.hadoop.mapreduce.jobhistory.Event.Builder(other);
  }
  
  /**
   * RecordBuilder for Event instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<Event>
    implements org.apache.avro.data.RecordBuilder<Event> {

    private org.apache.hadoop.mapreduce.jobhistory.EventType type;
    private java.lang.Object event;

    /** Creates a new Builder */
    private Builder() {
      super(org.apache.hadoop.mapreduce.jobhistory.Event.SCHEMA$);
    }
    
    /** Creates a Builder by copying an existing Builder */
    private Builder(org.apache.hadoop.mapreduce.jobhistory.Event.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.type)) {
        this.type = data().deepCopy(fields()[0].schema(), other.type);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.event)) {
        this.event = data().deepCopy(fields()[1].schema(), other.event);
        fieldSetFlags()[1] = true;
      }
    }
    
    /** Creates a Builder by copying an existing Event instance */
    private Builder(org.apache.hadoop.mapreduce.jobhistory.Event other) {
            super(org.apache.hadoop.mapreduce.jobhistory.Event.SCHEMA$);
      if (isValidValue(fields()[0], other.type)) {
        this.type = data().deepCopy(fields()[0].schema(), other.type);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.event)) {
        this.event = data().deepCopy(fields()[1].schema(), other.event);
        fieldSetFlags()[1] = true;
      }
    }

    /** Gets the value of the 'type' field */
    public org.apache.hadoop.mapreduce.jobhistory.EventType getType() {
      return type;
    }
    
    /** Sets the value of the 'type' field */
    public org.apache.hadoop.mapreduce.jobhistory.Event.Builder setType(org.apache.hadoop.mapreduce.jobhistory.EventType value) {
      validate(fields()[0], value);
      this.type = value;
      fieldSetFlags()[0] = true;
      return this; 
    }
    
    /** Checks whether the 'type' field has been set */
    public boolean hasType() {
      return fieldSetFlags()[0];
    }
    
    /** Clears the value of the 'type' field */
    public org.apache.hadoop.mapreduce.jobhistory.Event.Builder clearType() {
      type = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /** Gets the value of the 'event' field */
    public java.lang.Object getEvent() {
      return event;
    }
    
    /** Sets the value of the 'event' field */
    public org.apache.hadoop.mapreduce.jobhistory.Event.Builder setEvent(java.lang.Object value) {
      validate(fields()[1], value);
      this.event = value;
      fieldSetFlags()[1] = true;
      return this; 
    }
    
    /** Checks whether the 'event' field has been set */
    public boolean hasEvent() {
      return fieldSetFlags()[1];
    }
    
    /** Clears the value of the 'event' field */
    public org.apache.hadoop.mapreduce.jobhistory.Event.Builder clearEvent() {
      event = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    @Override
    public Event build() {
      try {
        Event record = new Event();
        record.type = fieldSetFlags()[0] ? this.type : (org.apache.hadoop.mapreduce.jobhistory.EventType) defaultValue(fields()[0]);
        record.event = fieldSetFlags()[1] ? this.event : (java.lang.Object) defaultValue(fields()[1]);
        return record;
      } catch (Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }
}
