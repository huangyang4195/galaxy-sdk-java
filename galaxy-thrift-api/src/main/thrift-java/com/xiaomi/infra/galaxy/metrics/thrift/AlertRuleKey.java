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
public class AlertRuleKey implements libthrift091.TBase<AlertRuleKey, AlertRuleKey._Fields>, java.io.Serializable, Cloneable, Comparable<AlertRuleKey> {
  private static final libthrift091.protocol.TStruct STRUCT_DESC = new libthrift091.protocol.TStruct("AlertRuleKey");

  private static final libthrift091.protocol.TField METRIC_KEY_FIELD_DESC = new libthrift091.protocol.TField("metricKey", libthrift091.protocol.TType.STRUCT, (short)1);
  private static final libthrift091.protocol.TField OPERATOR_FIELD_DESC = new libthrift091.protocol.TField("operator", libthrift091.protocol.TType.I32, (short)2);
  private static final libthrift091.protocol.TField THRESHOLD_FIELD_DESC = new libthrift091.protocol.TField("threshold", libthrift091.protocol.TType.DOUBLE, (short)3);
  private static final libthrift091.protocol.TField TRIGGER_TIMES_FIELD_DESC = new libthrift091.protocol.TField("triggerTimes", libthrift091.protocol.TType.I32, (short)4);
  private static final libthrift091.protocol.TField MAX_ALERT_TIMES_FIELD_DESC = new libthrift091.protocol.TField("maxAlertTimes", libthrift091.protocol.TType.I32, (short)5);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new AlertRuleKeyStandardSchemeFactory());
    schemes.put(TupleScheme.class, new AlertRuleKeyTupleSchemeFactory());
  }

  public com.xiaomi.infra.galaxy.metrics.thrift.MetricKey metricKey; // optional
  /**
   * 
   * @see OPERATOR
   */
  public OPERATOR operator; // optional
  public double threshold; // optional
  public int triggerTimes; // optional
  public int maxAlertTimes; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements libthrift091.TFieldIdEnum {
    METRIC_KEY((short)1, "metricKey"),
    /**
     * 
     * @see OPERATOR
     */
    OPERATOR((short)2, "operator"),
    THRESHOLD((short)3, "threshold"),
    TRIGGER_TIMES((short)4, "triggerTimes"),
    MAX_ALERT_TIMES((short)5, "maxAlertTimes");

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
        case 2: // OPERATOR
          return OPERATOR;
        case 3: // THRESHOLD
          return THRESHOLD;
        case 4: // TRIGGER_TIMES
          return TRIGGER_TIMES;
        case 5: // MAX_ALERT_TIMES
          return MAX_ALERT_TIMES;
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
  private static final int __THRESHOLD_ISSET_ID = 0;
  private static final int __TRIGGERTIMES_ISSET_ID = 1;
  private static final int __MAXALERTTIMES_ISSET_ID = 2;
  private byte __isset_bitfield = 0;
  private static final _Fields optionals[] = {_Fields.METRIC_KEY,_Fields.OPERATOR,_Fields.THRESHOLD,_Fields.TRIGGER_TIMES,_Fields.MAX_ALERT_TIMES};
  public static final Map<_Fields, libthrift091.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, libthrift091.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, libthrift091.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.METRIC_KEY, new libthrift091.meta_data.FieldMetaData("metricKey", libthrift091.TFieldRequirementType.OPTIONAL, 
        new libthrift091.meta_data.StructMetaData(libthrift091.protocol.TType.STRUCT, com.xiaomi.infra.galaxy.metrics.thrift.MetricKey.class)));
    tmpMap.put(_Fields.OPERATOR, new libthrift091.meta_data.FieldMetaData("operator", libthrift091.TFieldRequirementType.OPTIONAL, 
        new libthrift091.meta_data.EnumMetaData(libthrift091.protocol.TType.ENUM, OPERATOR.class)));
    tmpMap.put(_Fields.THRESHOLD, new libthrift091.meta_data.FieldMetaData("threshold", libthrift091.TFieldRequirementType.OPTIONAL, 
        new libthrift091.meta_data.FieldValueMetaData(libthrift091.protocol.TType.DOUBLE)));
    tmpMap.put(_Fields.TRIGGER_TIMES, new libthrift091.meta_data.FieldMetaData("triggerTimes", libthrift091.TFieldRequirementType.OPTIONAL, 
        new libthrift091.meta_data.FieldValueMetaData(libthrift091.protocol.TType.I32)));
    tmpMap.put(_Fields.MAX_ALERT_TIMES, new libthrift091.meta_data.FieldMetaData("maxAlertTimes", libthrift091.TFieldRequirementType.OPTIONAL, 
        new libthrift091.meta_data.FieldValueMetaData(libthrift091.protocol.TType.I32)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    libthrift091.meta_data.FieldMetaData.addStructMetaDataMap(AlertRuleKey.class, metaDataMap);
  }

  public AlertRuleKey() {
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public AlertRuleKey(AlertRuleKey other) {
    __isset_bitfield = other.__isset_bitfield;
    if (other.isSetMetricKey()) {
      this.metricKey = new com.xiaomi.infra.galaxy.metrics.thrift.MetricKey(other.metricKey);
    }
    if (other.isSetOperator()) {
      this.operator = other.operator;
    }
    this.threshold = other.threshold;
    this.triggerTimes = other.triggerTimes;
    this.maxAlertTimes = other.maxAlertTimes;
  }

  public AlertRuleKey deepCopy() {
    return new AlertRuleKey(this);
  }

  @Override
  public void clear() {
    this.metricKey = null;
    this.operator = null;
    setThresholdIsSet(false);
    this.threshold = 0.0;
    setTriggerTimesIsSet(false);
    this.triggerTimes = 0;
    setMaxAlertTimesIsSet(false);
    this.maxAlertTimes = 0;
  }

  public com.xiaomi.infra.galaxy.metrics.thrift.MetricKey getMetricKey() {
    return this.metricKey;
  }

  public AlertRuleKey setMetricKey(com.xiaomi.infra.galaxy.metrics.thrift.MetricKey metricKey) {
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

  /**
   * 
   * @see OPERATOR
   */
  public OPERATOR getOperator() {
    return this.operator;
  }

  /**
   * 
   * @see OPERATOR
   */
  public AlertRuleKey setOperator(OPERATOR operator) {
    this.operator = operator;
    return this;
  }

  public void unsetOperator() {
    this.operator = null;
  }

  /** Returns true if field operator is set (has been assigned a value) and false otherwise */
  public boolean isSetOperator() {
    return this.operator != null;
  }

  public void setOperatorIsSet(boolean value) {
    if (!value) {
      this.operator = null;
    }
  }

  public double getThreshold() {
    return this.threshold;
  }

  public AlertRuleKey setThreshold(double threshold) {
    this.threshold = threshold;
    setThresholdIsSet(true);
    return this;
  }

  public void unsetThreshold() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __THRESHOLD_ISSET_ID);
  }

  /** Returns true if field threshold is set (has been assigned a value) and false otherwise */
  public boolean isSetThreshold() {
    return EncodingUtils.testBit(__isset_bitfield, __THRESHOLD_ISSET_ID);
  }

  public void setThresholdIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __THRESHOLD_ISSET_ID, value);
  }

  public int getTriggerTimes() {
    return this.triggerTimes;
  }

  public AlertRuleKey setTriggerTimes(int triggerTimes) {
    this.triggerTimes = triggerTimes;
    setTriggerTimesIsSet(true);
    return this;
  }

  public void unsetTriggerTimes() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __TRIGGERTIMES_ISSET_ID);
  }

  /** Returns true if field triggerTimes is set (has been assigned a value) and false otherwise */
  public boolean isSetTriggerTimes() {
    return EncodingUtils.testBit(__isset_bitfield, __TRIGGERTIMES_ISSET_ID);
  }

  public void setTriggerTimesIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __TRIGGERTIMES_ISSET_ID, value);
  }

  public int getMaxAlertTimes() {
    return this.maxAlertTimes;
  }

  public AlertRuleKey setMaxAlertTimes(int maxAlertTimes) {
    this.maxAlertTimes = maxAlertTimes;
    setMaxAlertTimesIsSet(true);
    return this;
  }

  public void unsetMaxAlertTimes() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __MAXALERTTIMES_ISSET_ID);
  }

  /** Returns true if field maxAlertTimes is set (has been assigned a value) and false otherwise */
  public boolean isSetMaxAlertTimes() {
    return EncodingUtils.testBit(__isset_bitfield, __MAXALERTTIMES_ISSET_ID);
  }

  public void setMaxAlertTimesIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __MAXALERTTIMES_ISSET_ID, value);
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case METRIC_KEY:
      if (value == null) {
        unsetMetricKey();
      } else {
        setMetricKey((com.xiaomi.infra.galaxy.metrics.thrift.MetricKey)value);
      }
      break;

    case OPERATOR:
      if (value == null) {
        unsetOperator();
      } else {
        setOperator((OPERATOR)value);
      }
      break;

    case THRESHOLD:
      if (value == null) {
        unsetThreshold();
      } else {
        setThreshold((Double)value);
      }
      break;

    case TRIGGER_TIMES:
      if (value == null) {
        unsetTriggerTimes();
      } else {
        setTriggerTimes((Integer)value);
      }
      break;

    case MAX_ALERT_TIMES:
      if (value == null) {
        unsetMaxAlertTimes();
      } else {
        setMaxAlertTimes((Integer)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case METRIC_KEY:
      return getMetricKey();

    case OPERATOR:
      return getOperator();

    case THRESHOLD:
      return Double.valueOf(getThreshold());

    case TRIGGER_TIMES:
      return Integer.valueOf(getTriggerTimes());

    case MAX_ALERT_TIMES:
      return Integer.valueOf(getMaxAlertTimes());

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
    case OPERATOR:
      return isSetOperator();
    case THRESHOLD:
      return isSetThreshold();
    case TRIGGER_TIMES:
      return isSetTriggerTimes();
    case MAX_ALERT_TIMES:
      return isSetMaxAlertTimes();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof AlertRuleKey)
      return this.equals((AlertRuleKey)that);
    return false;
  }

  public boolean equals(AlertRuleKey that) {
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

    boolean this_present_operator = true && this.isSetOperator();
    boolean that_present_operator = true && that.isSetOperator();
    if (this_present_operator || that_present_operator) {
      if (!(this_present_operator && that_present_operator))
        return false;
      if (!this.operator.equals(that.operator))
        return false;
    }

    boolean this_present_threshold = true && this.isSetThreshold();
    boolean that_present_threshold = true && that.isSetThreshold();
    if (this_present_threshold || that_present_threshold) {
      if (!(this_present_threshold && that_present_threshold))
        return false;
      if (this.threshold != that.threshold)
        return false;
    }

    boolean this_present_triggerTimes = true && this.isSetTriggerTimes();
    boolean that_present_triggerTimes = true && that.isSetTriggerTimes();
    if (this_present_triggerTimes || that_present_triggerTimes) {
      if (!(this_present_triggerTimes && that_present_triggerTimes))
        return false;
      if (this.triggerTimes != that.triggerTimes)
        return false;
    }

    boolean this_present_maxAlertTimes = true && this.isSetMaxAlertTimes();
    boolean that_present_maxAlertTimes = true && that.isSetMaxAlertTimes();
    if (this_present_maxAlertTimes || that_present_maxAlertTimes) {
      if (!(this_present_maxAlertTimes && that_present_maxAlertTimes))
        return false;
      if (this.maxAlertTimes != that.maxAlertTimes)
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

    boolean present_operator = true && (isSetOperator());
    list.add(present_operator);
    if (present_operator)
      list.add(operator.getValue());

    boolean present_threshold = true && (isSetThreshold());
    list.add(present_threshold);
    if (present_threshold)
      list.add(threshold);

    boolean present_triggerTimes = true && (isSetTriggerTimes());
    list.add(present_triggerTimes);
    if (present_triggerTimes)
      list.add(triggerTimes);

    boolean present_maxAlertTimes = true && (isSetMaxAlertTimes());
    list.add(present_maxAlertTimes);
    if (present_maxAlertTimes)
      list.add(maxAlertTimes);

    return list.hashCode();
  }

  @Override
  public int compareTo(AlertRuleKey other) {
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
    lastComparison = Boolean.valueOf(isSetOperator()).compareTo(other.isSetOperator());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetOperator()) {
      lastComparison = libthrift091.TBaseHelper.compareTo(this.operator, other.operator);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetThreshold()).compareTo(other.isSetThreshold());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetThreshold()) {
      lastComparison = libthrift091.TBaseHelper.compareTo(this.threshold, other.threshold);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetTriggerTimes()).compareTo(other.isSetTriggerTimes());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetTriggerTimes()) {
      lastComparison = libthrift091.TBaseHelper.compareTo(this.triggerTimes, other.triggerTimes);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetMaxAlertTimes()).compareTo(other.isSetMaxAlertTimes());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetMaxAlertTimes()) {
      lastComparison = libthrift091.TBaseHelper.compareTo(this.maxAlertTimes, other.maxAlertTimes);
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
    StringBuilder sb = new StringBuilder("AlertRuleKey(");
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
    if (isSetOperator()) {
      if (!first) sb.append(", ");
      sb.append("operator:");
      if (this.operator == null) {
        sb.append("null");
      } else {
        sb.append(this.operator);
      }
      first = false;
    }
    if (isSetThreshold()) {
      if (!first) sb.append(", ");
      sb.append("threshold:");
      sb.append(this.threshold);
      first = false;
    }
    if (isSetTriggerTimes()) {
      if (!first) sb.append(", ");
      sb.append("triggerTimes:");
      sb.append(this.triggerTimes);
      first = false;
    }
    if (isSetMaxAlertTimes()) {
      if (!first) sb.append(", ");
      sb.append("maxAlertTimes:");
      sb.append(this.maxAlertTimes);
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

  private static class AlertRuleKeyStandardSchemeFactory implements SchemeFactory {
    public AlertRuleKeyStandardScheme getScheme() {
      return new AlertRuleKeyStandardScheme();
    }
  }

  private static class AlertRuleKeyStandardScheme extends StandardScheme<AlertRuleKey> {

    public void read(libthrift091.protocol.TProtocol iprot, AlertRuleKey struct) throws libthrift091.TException {
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
              struct.metricKey = new com.xiaomi.infra.galaxy.metrics.thrift.MetricKey();
              struct.metricKey.read(iprot);
              struct.setMetricKeyIsSet(true);
            } else { 
              libthrift091.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // OPERATOR
            if (schemeField.type == libthrift091.protocol.TType.I32) {
              struct.operator = com.xiaomi.infra.galaxy.metrics.thrift.OPERATOR.findByValue(iprot.readI32());
              struct.setOperatorIsSet(true);
            } else { 
              libthrift091.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // THRESHOLD
            if (schemeField.type == libthrift091.protocol.TType.DOUBLE) {
              struct.threshold = iprot.readDouble();
              struct.setThresholdIsSet(true);
            } else { 
              libthrift091.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // TRIGGER_TIMES
            if (schemeField.type == libthrift091.protocol.TType.I32) {
              struct.triggerTimes = iprot.readI32();
              struct.setTriggerTimesIsSet(true);
            } else { 
              libthrift091.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 5: // MAX_ALERT_TIMES
            if (schemeField.type == libthrift091.protocol.TType.I32) {
              struct.maxAlertTimes = iprot.readI32();
              struct.setMaxAlertTimesIsSet(true);
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

    public void write(libthrift091.protocol.TProtocol oprot, AlertRuleKey struct) throws libthrift091.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.metricKey != null) {
        if (struct.isSetMetricKey()) {
          oprot.writeFieldBegin(METRIC_KEY_FIELD_DESC);
          struct.metricKey.write(oprot);
          oprot.writeFieldEnd();
        }
      }
      if (struct.operator != null) {
        if (struct.isSetOperator()) {
          oprot.writeFieldBegin(OPERATOR_FIELD_DESC);
          oprot.writeI32(struct.operator.getValue());
          oprot.writeFieldEnd();
        }
      }
      if (struct.isSetThreshold()) {
        oprot.writeFieldBegin(THRESHOLD_FIELD_DESC);
        oprot.writeDouble(struct.threshold);
        oprot.writeFieldEnd();
      }
      if (struct.isSetTriggerTimes()) {
        oprot.writeFieldBegin(TRIGGER_TIMES_FIELD_DESC);
        oprot.writeI32(struct.triggerTimes);
        oprot.writeFieldEnd();
      }
      if (struct.isSetMaxAlertTimes()) {
        oprot.writeFieldBegin(MAX_ALERT_TIMES_FIELD_DESC);
        oprot.writeI32(struct.maxAlertTimes);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class AlertRuleKeyTupleSchemeFactory implements SchemeFactory {
    public AlertRuleKeyTupleScheme getScheme() {
      return new AlertRuleKeyTupleScheme();
    }
  }

  private static class AlertRuleKeyTupleScheme extends TupleScheme<AlertRuleKey> {

    @Override
    public void write(libthrift091.protocol.TProtocol prot, AlertRuleKey struct) throws libthrift091.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetMetricKey()) {
        optionals.set(0);
      }
      if (struct.isSetOperator()) {
        optionals.set(1);
      }
      if (struct.isSetThreshold()) {
        optionals.set(2);
      }
      if (struct.isSetTriggerTimes()) {
        optionals.set(3);
      }
      if (struct.isSetMaxAlertTimes()) {
        optionals.set(4);
      }
      oprot.writeBitSet(optionals, 5);
      if (struct.isSetMetricKey()) {
        struct.metricKey.write(oprot);
      }
      if (struct.isSetOperator()) {
        oprot.writeI32(struct.operator.getValue());
      }
      if (struct.isSetThreshold()) {
        oprot.writeDouble(struct.threshold);
      }
      if (struct.isSetTriggerTimes()) {
        oprot.writeI32(struct.triggerTimes);
      }
      if (struct.isSetMaxAlertTimes()) {
        oprot.writeI32(struct.maxAlertTimes);
      }
    }

    @Override
    public void read(libthrift091.protocol.TProtocol prot, AlertRuleKey struct) throws libthrift091.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(5);
      if (incoming.get(0)) {
        struct.metricKey = new com.xiaomi.infra.galaxy.metrics.thrift.MetricKey();
        struct.metricKey.read(iprot);
        struct.setMetricKeyIsSet(true);
      }
      if (incoming.get(1)) {
        struct.operator = com.xiaomi.infra.galaxy.metrics.thrift.OPERATOR.findByValue(iprot.readI32());
        struct.setOperatorIsSet(true);
      }
      if (incoming.get(2)) {
        struct.threshold = iprot.readDouble();
        struct.setThresholdIsSet(true);
      }
      if (incoming.get(3)) {
        struct.triggerTimes = iprot.readI32();
        struct.setTriggerTimesIsSet(true);
      }
      if (incoming.get(4)) {
        struct.maxAlertTimes = iprot.readI32();
        struct.setMaxAlertTimesIsSet(true);
      }
    }
  }

}

