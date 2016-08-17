/**
 * Autogenerated by Thrift Compiler (0.9.2)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.xiaomi.infra.galaxy.emr.thrift;

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
@Generated(value = "Autogenerated by Thrift Compiler (0.9.2)", date = "2016-8-2")
public class TimeSeriesData implements libthrift091.TBase<TimeSeriesData, TimeSeriesData._Fields>, java.io.Serializable, Cloneable, Comparable<TimeSeriesData> {
  private static final libthrift091.protocol.TStruct STRUCT_DESC = new libthrift091.protocol.TStruct("TimeSeriesData");

  private static final libthrift091.protocol.TField METRIC_FIELD_DESC = new libthrift091.protocol.TField("metric", libthrift091.protocol.TType.I32, (short)1);
  private static final libthrift091.protocol.TField MESUREMENT_FIELD_DESC = new libthrift091.protocol.TField("mesurement", libthrift091.protocol.TType.I32, (short)2);
  private static final libthrift091.protocol.TField HOST_FIELD_DESC = new libthrift091.protocol.TField("host", libthrift091.protocol.TType.STRING, (short)3);
  private static final libthrift091.protocol.TField DATA_FIELD_DESC = new libthrift091.protocol.TField("data", libthrift091.protocol.TType.MAP, (short)4);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new TimeSeriesDataStandardSchemeFactory());
    schemes.put(TupleScheme.class, new TimeSeriesDataTupleSchemeFactory());
  }

  /**
   * 
   * @see Metric
   */
  public Metric metric; // required
  /**
   * 
   * @see Mesurement
   */
  public Mesurement mesurement; // required
  public String host; // required
  public Map<Long,Double> data; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements libthrift091.TFieldIdEnum {
    /**
     * 
     * @see Metric
     */
    METRIC((short)1, "metric"),
    /**
     * 
     * @see Mesurement
     */
    MESUREMENT((short)2, "mesurement"),
    HOST((short)3, "host"),
    DATA((short)4, "data");

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
        case 1: // METRIC
          return METRIC;
        case 2: // MESUREMENT
          return MESUREMENT;
        case 3: // HOST
          return HOST;
        case 4: // DATA
          return DATA;
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
  public static final Map<_Fields, libthrift091.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, libthrift091.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, libthrift091.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.METRIC, new libthrift091.meta_data.FieldMetaData("metric", libthrift091.TFieldRequirementType.REQUIRED, 
        new libthrift091.meta_data.EnumMetaData(libthrift091.protocol.TType.ENUM, Metric.class)));
    tmpMap.put(_Fields.MESUREMENT, new libthrift091.meta_data.FieldMetaData("mesurement", libthrift091.TFieldRequirementType.DEFAULT, 
        new libthrift091.meta_data.EnumMetaData(libthrift091.protocol.TType.ENUM, Mesurement.class)));
    tmpMap.put(_Fields.HOST, new libthrift091.meta_data.FieldMetaData("host", libthrift091.TFieldRequirementType.DEFAULT, 
        new libthrift091.meta_data.FieldValueMetaData(libthrift091.protocol.TType.STRING)));
    tmpMap.put(_Fields.DATA, new libthrift091.meta_data.FieldMetaData("data", libthrift091.TFieldRequirementType.DEFAULT, 
        new libthrift091.meta_data.MapMetaData(libthrift091.protocol.TType.MAP, 
            new libthrift091.meta_data.FieldValueMetaData(libthrift091.protocol.TType.I64), 
            new libthrift091.meta_data.FieldValueMetaData(libthrift091.protocol.TType.DOUBLE))));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    libthrift091.meta_data.FieldMetaData.addStructMetaDataMap(TimeSeriesData.class, metaDataMap);
  }

  public TimeSeriesData() {
  }

  public TimeSeriesData(
    Metric metric,
    Mesurement mesurement,
    String host,
    Map<Long,Double> data)
  {
    this();
    this.metric = metric;
    this.mesurement = mesurement;
    this.host = host;
    this.data = data;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public TimeSeriesData(TimeSeriesData other) {
    if (other.isSetMetric()) {
      this.metric = other.metric;
    }
    if (other.isSetMesurement()) {
      this.mesurement = other.mesurement;
    }
    if (other.isSetHost()) {
      this.host = other.host;
    }
    if (other.isSetData()) {
      Map<Long,Double> __this__data = new HashMap<Long,Double>(other.data);
      this.data = __this__data;
    }
  }

  public TimeSeriesData deepCopy() {
    return new TimeSeriesData(this);
  }

  @Override
  public void clear() {
    this.metric = null;
    this.mesurement = null;
    this.host = null;
    this.data = null;
  }

  /**
   * 
   * @see Metric
   */
  public Metric getMetric() {
    return this.metric;
  }

  /**
   * 
   * @see Metric
   */
  public TimeSeriesData setMetric(Metric metric) {
    this.metric = metric;
    return this;
  }

  public void unsetMetric() {
    this.metric = null;
  }

  /** Returns true if field metric is set (has been assigned a value) and false otherwise */
  public boolean isSetMetric() {
    return this.metric != null;
  }

  public void setMetricIsSet(boolean value) {
    if (!value) {
      this.metric = null;
    }
  }

  /**
   * 
   * @see Mesurement
   */
  public Mesurement getMesurement() {
    return this.mesurement;
  }

  /**
   * 
   * @see Mesurement
   */
  public TimeSeriesData setMesurement(Mesurement mesurement) {
    this.mesurement = mesurement;
    return this;
  }

  public void unsetMesurement() {
    this.mesurement = null;
  }

  /** Returns true if field mesurement is set (has been assigned a value) and false otherwise */
  public boolean isSetMesurement() {
    return this.mesurement != null;
  }

  public void setMesurementIsSet(boolean value) {
    if (!value) {
      this.mesurement = null;
    }
  }

  public String getHost() {
    return this.host;
  }

  public TimeSeriesData setHost(String host) {
    this.host = host;
    return this;
  }

  public void unsetHost() {
    this.host = null;
  }

  /** Returns true if field host is set (has been assigned a value) and false otherwise */
  public boolean isSetHost() {
    return this.host != null;
  }

  public void setHostIsSet(boolean value) {
    if (!value) {
      this.host = null;
    }
  }

  public int getDataSize() {
    return (this.data == null) ? 0 : this.data.size();
  }

  public void putToData(long key, double val) {
    if (this.data == null) {
      this.data = new HashMap<Long,Double>();
    }
    this.data.put(key, val);
  }

  public Map<Long,Double> getData() {
    return this.data;
  }

  public TimeSeriesData setData(Map<Long,Double> data) {
    this.data = data;
    return this;
  }

  public void unsetData() {
    this.data = null;
  }

  /** Returns true if field data is set (has been assigned a value) and false otherwise */
  public boolean isSetData() {
    return this.data != null;
  }

  public void setDataIsSet(boolean value) {
    if (!value) {
      this.data = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case METRIC:
      if (value == null) {
        unsetMetric();
      } else {
        setMetric((Metric)value);
      }
      break;

    case MESUREMENT:
      if (value == null) {
        unsetMesurement();
      } else {
        setMesurement((Mesurement)value);
      }
      break;

    case HOST:
      if (value == null) {
        unsetHost();
      } else {
        setHost((String)value);
      }
      break;

    case DATA:
      if (value == null) {
        unsetData();
      } else {
        setData((Map<Long,Double>)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case METRIC:
      return getMetric();

    case MESUREMENT:
      return getMesurement();

    case HOST:
      return getHost();

    case DATA:
      return getData();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case METRIC:
      return isSetMetric();
    case MESUREMENT:
      return isSetMesurement();
    case HOST:
      return isSetHost();
    case DATA:
      return isSetData();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof TimeSeriesData)
      return this.equals((TimeSeriesData)that);
    return false;
  }

  public boolean equals(TimeSeriesData that) {
    if (that == null)
      return false;

    boolean this_present_metric = true && this.isSetMetric();
    boolean that_present_metric = true && that.isSetMetric();
    if (this_present_metric || that_present_metric) {
      if (!(this_present_metric && that_present_metric))
        return false;
      if (!this.metric.equals(that.metric))
        return false;
    }

    boolean this_present_mesurement = true && this.isSetMesurement();
    boolean that_present_mesurement = true && that.isSetMesurement();
    if (this_present_mesurement || that_present_mesurement) {
      if (!(this_present_mesurement && that_present_mesurement))
        return false;
      if (!this.mesurement.equals(that.mesurement))
        return false;
    }

    boolean this_present_host = true && this.isSetHost();
    boolean that_present_host = true && that.isSetHost();
    if (this_present_host || that_present_host) {
      if (!(this_present_host && that_present_host))
        return false;
      if (!this.host.equals(that.host))
        return false;
    }

    boolean this_present_data = true && this.isSetData();
    boolean that_present_data = true && that.isSetData();
    if (this_present_data || that_present_data) {
      if (!(this_present_data && that_present_data))
        return false;
      if (!this.data.equals(that.data))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_metric = true && (isSetMetric());
    list.add(present_metric);
    if (present_metric)
      list.add(metric.getValue());

    boolean present_mesurement = true && (isSetMesurement());
    list.add(present_mesurement);
    if (present_mesurement)
      list.add(mesurement.getValue());

    boolean present_host = true && (isSetHost());
    list.add(present_host);
    if (present_host)
      list.add(host);

    boolean present_data = true && (isSetData());
    list.add(present_data);
    if (present_data)
      list.add(data);

    return list.hashCode();
  }

  @Override
  public int compareTo(TimeSeriesData other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetMetric()).compareTo(other.isSetMetric());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetMetric()) {
      lastComparison = libthrift091.TBaseHelper.compareTo(this.metric, other.metric);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetMesurement()).compareTo(other.isSetMesurement());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetMesurement()) {
      lastComparison = libthrift091.TBaseHelper.compareTo(this.mesurement, other.mesurement);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetHost()).compareTo(other.isSetHost());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetHost()) {
      lastComparison = libthrift091.TBaseHelper.compareTo(this.host, other.host);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetData()).compareTo(other.isSetData());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetData()) {
      lastComparison = libthrift091.TBaseHelper.compareTo(this.data, other.data);
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
    StringBuilder sb = new StringBuilder("TimeSeriesData(");
    boolean first = true;

    sb.append("metric:");
    if (this.metric == null) {
      sb.append("null");
    } else {
      sb.append(this.metric);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("mesurement:");
    if (this.mesurement == null) {
      sb.append("null");
    } else {
      sb.append(this.mesurement);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("host:");
    if (this.host == null) {
      sb.append("null");
    } else {
      sb.append(this.host);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("data:");
    if (this.data == null) {
      sb.append("null");
    } else {
      sb.append(this.data);
    }
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws libthrift091.TException {
    // check for required fields
    if (metric == null) {
      throw new libthrift091.protocol.TProtocolException("Required field 'metric' was not present! Struct: " + toString());
    }
    // check for sub-struct validity
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
      read(new libthrift091.protocol.TCompactProtocol(new libthrift091.transport.TIOStreamTransport(in)));
    } catch (libthrift091.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class TimeSeriesDataStandardSchemeFactory implements SchemeFactory {
    public TimeSeriesDataStandardScheme getScheme() {
      return new TimeSeriesDataStandardScheme();
    }
  }

  private static class TimeSeriesDataStandardScheme extends StandardScheme<TimeSeriesData> {

    public void read(libthrift091.protocol.TProtocol iprot, TimeSeriesData struct) throws libthrift091.TException {
      libthrift091.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == libthrift091.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // METRIC
            if (schemeField.type == libthrift091.protocol.TType.I32) {
              struct.metric = com.xiaomi.infra.galaxy.emr.thrift.Metric.findByValue(iprot.readI32());
              struct.setMetricIsSet(true);
            } else { 
              libthrift091.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // MESUREMENT
            if (schemeField.type == libthrift091.protocol.TType.I32) {
              struct.mesurement = com.xiaomi.infra.galaxy.emr.thrift.Mesurement.findByValue(iprot.readI32());
              struct.setMesurementIsSet(true);
            } else { 
              libthrift091.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // HOST
            if (schemeField.type == libthrift091.protocol.TType.STRING) {
              struct.host = iprot.readString();
              struct.setHostIsSet(true);
            } else { 
              libthrift091.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // DATA
            if (schemeField.type == libthrift091.protocol.TType.MAP) {
              {
                libthrift091.protocol.TMap _map0 = iprot.readMapBegin();
                struct.data = new HashMap<Long,Double>(2*_map0.size);
                long _key1;
                double _val2;
                for (int _i3 = 0; _i3 < _map0.size; ++_i3)
                {
                  _key1 = iprot.readI64();
                  _val2 = iprot.readDouble();
                  struct.data.put(_key1, _val2);
                }
                iprot.readMapEnd();
              }
              struct.setDataIsSet(true);
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

    public void write(libthrift091.protocol.TProtocol oprot, TimeSeriesData struct) throws libthrift091.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.metric != null) {
        oprot.writeFieldBegin(METRIC_FIELD_DESC);
        oprot.writeI32(struct.metric.getValue());
        oprot.writeFieldEnd();
      }
      if (struct.mesurement != null) {
        oprot.writeFieldBegin(MESUREMENT_FIELD_DESC);
        oprot.writeI32(struct.mesurement.getValue());
        oprot.writeFieldEnd();
      }
      if (struct.host != null) {
        oprot.writeFieldBegin(HOST_FIELD_DESC);
        oprot.writeString(struct.host);
        oprot.writeFieldEnd();
      }
      if (struct.data != null) {
        oprot.writeFieldBegin(DATA_FIELD_DESC);
        {
          oprot.writeMapBegin(new libthrift091.protocol.TMap(libthrift091.protocol.TType.I64, libthrift091.protocol.TType.DOUBLE, struct.data.size()));
          for (Map.Entry<Long, Double> _iter4 : struct.data.entrySet())
          {
            oprot.writeI64(_iter4.getKey());
            oprot.writeDouble(_iter4.getValue());
          }
          oprot.writeMapEnd();
        }
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class TimeSeriesDataTupleSchemeFactory implements SchemeFactory {
    public TimeSeriesDataTupleScheme getScheme() {
      return new TimeSeriesDataTupleScheme();
    }
  }

  private static class TimeSeriesDataTupleScheme extends TupleScheme<TimeSeriesData> {

    @Override
    public void write(libthrift091.protocol.TProtocol prot, TimeSeriesData struct) throws libthrift091.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      oprot.writeI32(struct.metric.getValue());
      BitSet optionals = new BitSet();
      if (struct.isSetMesurement()) {
        optionals.set(0);
      }
      if (struct.isSetHost()) {
        optionals.set(1);
      }
      if (struct.isSetData()) {
        optionals.set(2);
      }
      oprot.writeBitSet(optionals, 3);
      if (struct.isSetMesurement()) {
        oprot.writeI32(struct.mesurement.getValue());
      }
      if (struct.isSetHost()) {
        oprot.writeString(struct.host);
      }
      if (struct.isSetData()) {
        {
          oprot.writeI32(struct.data.size());
          for (Map.Entry<Long, Double> _iter5 : struct.data.entrySet())
          {
            oprot.writeI64(_iter5.getKey());
            oprot.writeDouble(_iter5.getValue());
          }
        }
      }
    }

    @Override
    public void read(libthrift091.protocol.TProtocol prot, TimeSeriesData struct) throws libthrift091.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      struct.metric = com.xiaomi.infra.galaxy.emr.thrift.Metric.findByValue(iprot.readI32());
      struct.setMetricIsSet(true);
      BitSet incoming = iprot.readBitSet(3);
      if (incoming.get(0)) {
        struct.mesurement = com.xiaomi.infra.galaxy.emr.thrift.Mesurement.findByValue(iprot.readI32());
        struct.setMesurementIsSet(true);
      }
      if (incoming.get(1)) {
        struct.host = iprot.readString();
        struct.setHostIsSet(true);
      }
      if (incoming.get(2)) {
        {
          libthrift091.protocol.TMap _map6 = new libthrift091.protocol.TMap(libthrift091.protocol.TType.I64, libthrift091.protocol.TType.DOUBLE, iprot.readI32());
          struct.data = new HashMap<Long,Double>(2*_map6.size);
          long _key7;
          double _val8;
          for (int _i9 = 0; _i9 < _map6.size; ++_i9)
          {
            _key7 = iprot.readI64();
            _val8 = iprot.readDouble();
            struct.data.put(_key7, _val8);
          }
        }
        struct.setDataIsSet(true);
      }
    }
  }

}

