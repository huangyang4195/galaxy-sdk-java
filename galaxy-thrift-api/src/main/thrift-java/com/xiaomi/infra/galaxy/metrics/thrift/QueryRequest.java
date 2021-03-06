/**
 * Autogenerated by Thrift Compiler (0.9.2)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.xiaomi.infra.galaxy.metrics.thrift;

import libthrift091.scheme.IScheme;
import libthrift091.scheme.SchemeFactory;
import libthrift091.scheme.StandardScheme;

import libthrift091.scheme.TupleScheme;
import libthrift091.protocol.TTupleProtocol;
import libthrift091.protocol.TProtocolException;
import libthrift091.EncodingUtils;
import libthrift091.TException;
import libthrift091.async.AsyncMethodCallback;
import libthrift091.server.AbstractNonblockingServer.*;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.EnumMap;
import java.util.Set;
import java.util.HashSet;
import java.util.EnumSet;
import java.util.Collections;
import java.util.BitSet;
import java.nio.ByteBuffer;
import java.util.Arrays;
import javax.annotation.Generated;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked"})
@Generated(value = "Autogenerated by Thrift Compiler (0.9.2)", date = "2017-3-2")
public class QueryRequest implements libthrift091.TBase<QueryRequest, QueryRequest._Fields>, java.io.Serializable, Cloneable, Comparable<QueryRequest> {
  private static final libthrift091.protocol.TStruct STRUCT_DESC = new libthrift091.protocol.TStruct("QueryRequest");

  private static final libthrift091.protocol.TField METRIC_KEY_FIELD_DESC = new libthrift091.protocol.TField("metricKey", libthrift091.protocol.TType.STRUCT, (short)1);
  private static final libthrift091.protocol.TField START_TIME_FIELD_DESC = new libthrift091.protocol.TField("startTime", libthrift091.protocol.TType.I64, (short)2);
  private static final libthrift091.protocol.TField END_TIME_FIELD_DESC = new libthrift091.protocol.TField("endTime", libthrift091.protocol.TType.I64, (short)3);
  private static final libthrift091.protocol.TField AGGREGATOR_FIELD_DESC = new libthrift091.protocol.TField("aggregator", libthrift091.protocol.TType.I32, (short)4);
  private static final libthrift091.protocol.TField DOWN_SAMPLE_FIELD_DESC = new libthrift091.protocol.TField("downSample", libthrift091.protocol.TType.STRUCT, (short)5);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new QueryRequestStandardSchemeFactory());
    schemes.put(TupleScheme.class, new QueryRequestTupleSchemeFactory());
  }

  public MetricKey metricKey; // optional
  public long startTime; // optional
  public long endTime; // optional
  /**
   * 
   * @see Aggregator
   */
  public Aggregator aggregator; // optional
  public DownSample downSample; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements libthrift091.TFieldIdEnum {
    METRIC_KEY((short)1, "metricKey"),
    START_TIME((short)2, "startTime"),
    END_TIME((short)3, "endTime"),
    /**
     * 
     * @see Aggregator
     */
    AGGREGATOR((short)4, "aggregator"),
    DOWN_SAMPLE((short)5, "downSample");

    private static final Map<String, _Fields> byName = new HashMap<String, _Fields>();

    static {
      for (_Fields field : EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
        case 1: // METRIC_KEY
          return METRIC_KEY;
        case 2: // START_TIME
          return START_TIME;
        case 3: // END_TIME
          return END_TIME;
        case 4: // AGGREGATOR
          return AGGREGATOR;
        case 5: // DOWN_SAMPLE
          return DOWN_SAMPLE;
        default:
          return null;
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, throwing an exception
     * if it is not found.
     */
    public static _Fields findByThriftIdOrThrow(int fieldId) {
      _Fields fields = findByThriftId(fieldId);
      if (fields == null) throw new IllegalArgumentException("Field " + fieldId + " doesn't exist!");
      return fields;
    }

    /**
     * Find the _Fields constant that matches name, or null if its not found.
     */
    public static _Fields findByName(String name) {
      return byName.get(name);
    }

    private final short _thriftId;
    private final String _fieldName;

    _Fields(short thriftId, String fieldName) {
      _thriftId = thriftId;
      _fieldName = fieldName;
    }

    public short getThriftFieldId() {
      return _thriftId;
    }

    public String getFieldName() {
      return _fieldName;
    }
  }

  // isset id assignments
  private static final int __STARTTIME_ISSET_ID = 0;
  private static final int __ENDTIME_ISSET_ID = 1;
  private byte __isset_bitfield = 0;
  private static final _Fields optionals[] = {_Fields.METRIC_KEY,_Fields.START_TIME,_Fields.END_TIME,_Fields.AGGREGATOR,_Fields.DOWN_SAMPLE};
  public static final Map<_Fields, libthrift091.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, libthrift091.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, libthrift091.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.METRIC_KEY, new libthrift091.meta_data.FieldMetaData("metricKey", libthrift091.TFieldRequirementType.OPTIONAL, 
        new libthrift091.meta_data.StructMetaData(libthrift091.protocol.TType.STRUCT, MetricKey.class)));
    tmpMap.put(_Fields.START_TIME, new libthrift091.meta_data.FieldMetaData("startTime", libthrift091.TFieldRequirementType.OPTIONAL, 
        new libthrift091.meta_data.FieldValueMetaData(libthrift091.protocol.TType.I64)));
    tmpMap.put(_Fields.END_TIME, new libthrift091.meta_data.FieldMetaData("endTime", libthrift091.TFieldRequirementType.OPTIONAL, 
        new libthrift091.meta_data.FieldValueMetaData(libthrift091.protocol.TType.I64)));
    tmpMap.put(_Fields.AGGREGATOR, new libthrift091.meta_data.FieldMetaData("aggregator", libthrift091.TFieldRequirementType.OPTIONAL, 
        new libthrift091.meta_data.EnumMetaData(libthrift091.protocol.TType.ENUM, Aggregator.class)));
    tmpMap.put(_Fields.DOWN_SAMPLE, new libthrift091.meta_data.FieldMetaData("downSample", libthrift091.TFieldRequirementType.OPTIONAL, 
        new libthrift091.meta_data.StructMetaData(libthrift091.protocol.TType.STRUCT, DownSample.class)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    libthrift091.meta_data.FieldMetaData.addStructMetaDataMap(QueryRequest.class, metaDataMap);
  }

  public QueryRequest() {
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public QueryRequest(QueryRequest other) {
    __isset_bitfield = other.__isset_bitfield;
    if (other.isSetMetricKey()) {
      this.metricKey = new MetricKey(other.metricKey);
    }
    this.startTime = other.startTime;
    this.endTime = other.endTime;
    if (other.isSetAggregator()) {
      this.aggregator = other.aggregator;
    }
    if (other.isSetDownSample()) {
      this.downSample = new DownSample(other.downSample);
    }
  }

  public QueryRequest deepCopy() {
    return new QueryRequest(this);
  }

  @Override
  public void clear() {
    this.metricKey = null;
    setStartTimeIsSet(false);
    this.startTime = 0;
    setEndTimeIsSet(false);
    this.endTime = 0;
    this.aggregator = null;
    this.downSample = null;
  }

  public MetricKey getMetricKey() {
    return this.metricKey;
  }

  public QueryRequest setMetricKey(MetricKey metricKey) {
    this.metricKey = metricKey;
    return this;
  }

  public void unsetMetricKey() {
    this.metricKey = null;
  }

  /** Returns true if field metricKey is set (has been assigned a value) and false otherwise */
  public boolean isSetMetricKey() {
    return this.metricKey != null;
  }

  public void setMetricKeyIsSet(boolean value) {
    if (!value) {
      this.metricKey = null;
    }
  }

  public long getStartTime() {
    return this.startTime;
  }

  public QueryRequest setStartTime(long startTime) {
    this.startTime = startTime;
    setStartTimeIsSet(true);
    return this;
  }

  public void unsetStartTime() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __STARTTIME_ISSET_ID);
  }

  /** Returns true if field startTime is set (has been assigned a value) and false otherwise */
  public boolean isSetStartTime() {
    return EncodingUtils.testBit(__isset_bitfield, __STARTTIME_ISSET_ID);
  }

  public void setStartTimeIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __STARTTIME_ISSET_ID, value);
  }

  public long getEndTime() {
    return this.endTime;
  }

  public QueryRequest setEndTime(long endTime) {
    this.endTime = endTime;
    setEndTimeIsSet(true);
    return this;
  }

  public void unsetEndTime() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __ENDTIME_ISSET_ID);
  }

  /** Returns true if field endTime is set (has been assigned a value) and false otherwise */
  public boolean isSetEndTime() {
    return EncodingUtils.testBit(__isset_bitfield, __ENDTIME_ISSET_ID);
  }

  public void setEndTimeIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __ENDTIME_ISSET_ID, value);
  }

  /**
   * 
   * @see Aggregator
   */
  public Aggregator getAggregator() {
    return this.aggregator;
  }

  /**
   * 
   * @see Aggregator
   */
  public QueryRequest setAggregator(Aggregator aggregator) {
    this.aggregator = aggregator;
    return this;
  }

  public void unsetAggregator() {
    this.aggregator = null;
  }

  /** Returns true if field aggregator is set (has been assigned a value) and false otherwise */
  public boolean isSetAggregator() {
    return this.aggregator != null;
  }

  public void setAggregatorIsSet(boolean value) {
    if (!value) {
      this.aggregator = null;
    }
  }

  public DownSample getDownSample() {
    return this.downSample;
  }

  public QueryRequest setDownSample(DownSample downSample) {
    this.downSample = downSample;
    return this;
  }

  public void unsetDownSample() {
    this.downSample = null;
  }

  /** Returns true if field downSample is set (has been assigned a value) and false otherwise */
  public boolean isSetDownSample() {
    return this.downSample != null;
  }

  public void setDownSampleIsSet(boolean value) {
    if (!value) {
      this.downSample = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case METRIC_KEY:
      if (value == null) {
        unsetMetricKey();
      } else {
        setMetricKey((MetricKey)value);
      }
      break;

    case START_TIME:
      if (value == null) {
        unsetStartTime();
      } else {
        setStartTime((Long)value);
      }
      break;

    case END_TIME:
      if (value == null) {
        unsetEndTime();
      } else {
        setEndTime((Long)value);
      }
      break;

    case AGGREGATOR:
      if (value == null) {
        unsetAggregator();
      } else {
        setAggregator((Aggregator)value);
      }
      break;

    case DOWN_SAMPLE:
      if (value == null) {
        unsetDownSample();
      } else {
        setDownSample((DownSample)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case METRIC_KEY:
      return getMetricKey();

    case START_TIME:
      return Long.valueOf(getStartTime());

    case END_TIME:
      return Long.valueOf(getEndTime());

    case AGGREGATOR:
      return getAggregator();

    case DOWN_SAMPLE:
      return getDownSample();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case METRIC_KEY:
      return isSetMetricKey();
    case START_TIME:
      return isSetStartTime();
    case END_TIME:
      return isSetEndTime();
    case AGGREGATOR:
      return isSetAggregator();
    case DOWN_SAMPLE:
      return isSetDownSample();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof QueryRequest)
      return this.equals((QueryRequest)that);
    return false;
  }

  public boolean equals(QueryRequest that) {
    if (that == null)
      return false;

    boolean this_present_metricKey = true && this.isSetMetricKey();
    boolean that_present_metricKey = true && that.isSetMetricKey();
    if (this_present_metricKey || that_present_metricKey) {
      if (!(this_present_metricKey && that_present_metricKey))
        return false;
      if (!this.metricKey.equals(that.metricKey))
        return false;
    }

    boolean this_present_startTime = true && this.isSetStartTime();
    boolean that_present_startTime = true && that.isSetStartTime();
    if (this_present_startTime || that_present_startTime) {
      if (!(this_present_startTime && that_present_startTime))
        return false;
      if (this.startTime != that.startTime)
        return false;
    }

    boolean this_present_endTime = true && this.isSetEndTime();
    boolean that_present_endTime = true && that.isSetEndTime();
    if (this_present_endTime || that_present_endTime) {
      if (!(this_present_endTime && that_present_endTime))
        return false;
      if (this.endTime != that.endTime)
        return false;
    }

    boolean this_present_aggregator = true && this.isSetAggregator();
    boolean that_present_aggregator = true && that.isSetAggregator();
    if (this_present_aggregator || that_present_aggregator) {
      if (!(this_present_aggregator && that_present_aggregator))
        return false;
      if (!this.aggregator.equals(that.aggregator))
        return false;
    }

    boolean this_present_downSample = true && this.isSetDownSample();
    boolean that_present_downSample = true && that.isSetDownSample();
    if (this_present_downSample || that_present_downSample) {
      if (!(this_present_downSample && that_present_downSample))
        return false;
      if (!this.downSample.equals(that.downSample))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_metricKey = true && (isSetMetricKey());
    list.add(present_metricKey);
    if (present_metricKey)
      list.add(metricKey);

    boolean present_startTime = true && (isSetStartTime());
    list.add(present_startTime);
    if (present_startTime)
      list.add(startTime);

    boolean present_endTime = true && (isSetEndTime());
    list.add(present_endTime);
    if (present_endTime)
      list.add(endTime);

    boolean present_aggregator = true && (isSetAggregator());
    list.add(present_aggregator);
    if (present_aggregator)
      list.add(aggregator.getValue());

    boolean present_downSample = true && (isSetDownSample());
    list.add(present_downSample);
    if (present_downSample)
      list.add(downSample);

    return list.hashCode();
  }

  @Override
  public int compareTo(QueryRequest other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetMetricKey()).compareTo(other.isSetMetricKey());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetMetricKey()) {
      lastComparison = libthrift091.TBaseHelper.compareTo(this.metricKey, other.metricKey);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetStartTime()).compareTo(other.isSetStartTime());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetStartTime()) {
      lastComparison = libthrift091.TBaseHelper.compareTo(this.startTime, other.startTime);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetEndTime()).compareTo(other.isSetEndTime());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetEndTime()) {
      lastComparison = libthrift091.TBaseHelper.compareTo(this.endTime, other.endTime);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetAggregator()).compareTo(other.isSetAggregator());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetAggregator()) {
      lastComparison = libthrift091.TBaseHelper.compareTo(this.aggregator, other.aggregator);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetDownSample()).compareTo(other.isSetDownSample());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetDownSample()) {
      lastComparison = libthrift091.TBaseHelper.compareTo(this.downSample, other.downSample);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }

  public void read(libthrift091.protocol.TProtocol iprot) throws libthrift091.TException {
    schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
  }

  public void write(libthrift091.protocol.TProtocol oprot) throws libthrift091.TException {
    schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder("QueryRequest(");
    boolean first = true;

    if (isSetMetricKey()) {
      sb.append("metricKey:");
      if (this.metricKey == null) {
        sb.append("null");
      } else {
        sb.append(this.metricKey);
      }
      first = false;
    }
    if (isSetStartTime()) {
      if (!first) sb.append(", ");
      sb.append("startTime:");
      sb.append(this.startTime);
      first = false;
    }
    if (isSetEndTime()) {
      if (!first) sb.append(", ");
      sb.append("endTime:");
      sb.append(this.endTime);
      first = false;
    }
    if (isSetAggregator()) {
      if (!first) sb.append(", ");
      sb.append("aggregator:");
      if (this.aggregator == null) {
        sb.append("null");
      } else {
        sb.append(this.aggregator);
      }
      first = false;
    }
    if (isSetDownSample()) {
      if (!first) sb.append(", ");
      sb.append("downSample:");
      if (this.downSample == null) {
        sb.append("null");
      } else {
        sb.append(this.downSample);
      }
      first = false;
    }
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws libthrift091.TException {
    // check for required fields
    // check for sub-struct validity
    if (metricKey != null) {
      metricKey.validate();
    }
    if (downSample != null) {
      downSample.validate();
    }
  }

  private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
    try {
      write(new libthrift091.protocol.TCompactProtocol(new libthrift091.transport.TIOStreamTransport(out)));
    } catch (libthrift091.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, ClassNotFoundException {
    try {
      // it doesn't seem like you should have to do this, but java serialization is wacky, and doesn't call the default constructor.
      __isset_bitfield = 0;
      read(new libthrift091.protocol.TCompactProtocol(new libthrift091.transport.TIOStreamTransport(in)));
    } catch (libthrift091.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class QueryRequestStandardSchemeFactory implements SchemeFactory {
    public QueryRequestStandardScheme getScheme() {
      return new QueryRequestStandardScheme();
    }
  }

  private static class QueryRequestStandardScheme extends StandardScheme<QueryRequest> {

    public void read(libthrift091.protocol.TProtocol iprot, QueryRequest struct) throws libthrift091.TException {
      libthrift091.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == libthrift091.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // METRIC_KEY
            if (schemeField.type == libthrift091.protocol.TType.STRUCT) {
              struct.metricKey = new MetricKey();
              struct.metricKey.read(iprot);
              struct.setMetricKeyIsSet(true);
            } else { 
              libthrift091.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // START_TIME
            if (schemeField.type == libthrift091.protocol.TType.I64) {
              struct.startTime = iprot.readI64();
              struct.setStartTimeIsSet(true);
            } else { 
              libthrift091.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // END_TIME
            if (schemeField.type == libthrift091.protocol.TType.I64) {
              struct.endTime = iprot.readI64();
              struct.setEndTimeIsSet(true);
            } else { 
              libthrift091.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // AGGREGATOR
            if (schemeField.type == libthrift091.protocol.TType.I32) {
              struct.aggregator = com.xiaomi.infra.galaxy.metrics.thrift.Aggregator.findByValue(iprot.readI32());
              struct.setAggregatorIsSet(true);
            } else { 
              libthrift091.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 5: // DOWN_SAMPLE
            if (schemeField.type == libthrift091.protocol.TType.STRUCT) {
              struct.downSample = new DownSample();
              struct.downSample.read(iprot);
              struct.setDownSampleIsSet(true);
            } else { 
              libthrift091.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          default:
            libthrift091.protocol.TProtocolUtil.skip(iprot, schemeField.type);
        }
        iprot.readFieldEnd();
      }
      iprot.readStructEnd();

      // check for required fields of primitive type, which can't be checked in the validate method
      struct.validate();
    }

    public void write(libthrift091.protocol.TProtocol oprot, QueryRequest struct) throws libthrift091.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.metricKey != null) {
        if (struct.isSetMetricKey()) {
          oprot.writeFieldBegin(METRIC_KEY_FIELD_DESC);
          struct.metricKey.write(oprot);
          oprot.writeFieldEnd();
        }
      }
      if (struct.isSetStartTime()) {
        oprot.writeFieldBegin(START_TIME_FIELD_DESC);
        oprot.writeI64(struct.startTime);
        oprot.writeFieldEnd();
      }
      if (struct.isSetEndTime()) {
        oprot.writeFieldBegin(END_TIME_FIELD_DESC);
        oprot.writeI64(struct.endTime);
        oprot.writeFieldEnd();
      }
      if (struct.aggregator != null) {
        if (struct.isSetAggregator()) {
          oprot.writeFieldBegin(AGGREGATOR_FIELD_DESC);
          oprot.writeI32(struct.aggregator.getValue());
          oprot.writeFieldEnd();
        }
      }
      if (struct.downSample != null) {
        if (struct.isSetDownSample()) {
          oprot.writeFieldBegin(DOWN_SAMPLE_FIELD_DESC);
          struct.downSample.write(oprot);
          oprot.writeFieldEnd();
        }
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class QueryRequestTupleSchemeFactory implements SchemeFactory {
    public QueryRequestTupleScheme getScheme() {
      return new QueryRequestTupleScheme();
    }
  }

  private static class QueryRequestTupleScheme extends TupleScheme<QueryRequest> {

    @Override
    public void write(libthrift091.protocol.TProtocol prot, QueryRequest struct) throws libthrift091.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetMetricKey()) {
        optionals.set(0);
      }
      if (struct.isSetStartTime()) {
        optionals.set(1);
      }
      if (struct.isSetEndTime()) {
        optionals.set(2);
      }
      if (struct.isSetAggregator()) {
        optionals.set(3);
      }
      if (struct.isSetDownSample()) {
        optionals.set(4);
      }
      oprot.writeBitSet(optionals, 5);
      if (struct.isSetMetricKey()) {
        struct.metricKey.write(oprot);
      }
      if (struct.isSetStartTime()) {
        oprot.writeI64(struct.startTime);
      }
      if (struct.isSetEndTime()) {
        oprot.writeI64(struct.endTime);
      }
      if (struct.isSetAggregator()) {
        oprot.writeI32(struct.aggregator.getValue());
      }
      if (struct.isSetDownSample()) {
        struct.downSample.write(oprot);
      }
    }

    @Override
    public void read(libthrift091.protocol.TProtocol prot, QueryRequest struct) throws libthrift091.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(5);
      if (incoming.get(0)) {
        struct.metricKey = new MetricKey();
        struct.metricKey.read(iprot);
        struct.setMetricKeyIsSet(true);
      }
      if (incoming.get(1)) {
        struct.startTime = iprot.readI64();
        struct.setStartTimeIsSet(true);
      }
      if (incoming.get(2)) {
        struct.endTime = iprot.readI64();
        struct.setEndTimeIsSet(true);
      }
      if (incoming.get(3)) {
        struct.aggregator = com.xiaomi.infra.galaxy.metrics.thrift.Aggregator.findByValue(iprot.readI32());
        struct.setAggregatorIsSet(true);
      }
      if (incoming.get(4)) {
        struct.downSample = new DownSample();
        struct.downSample.read(iprot);
        struct.setDownSampleIsSet(true);
      }
    }
  }

}

