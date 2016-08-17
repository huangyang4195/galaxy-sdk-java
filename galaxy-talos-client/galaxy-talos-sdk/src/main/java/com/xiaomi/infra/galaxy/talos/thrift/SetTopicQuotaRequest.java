/**
 * Autogenerated by Thrift Compiler (0.9.2)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.xiaomi.infra.galaxy.talos.thrift;

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
@Generated(value = "Autogenerated by Thrift Compiler (0.9.2)", date = "2016-7-18")
public class SetTopicQuotaRequest implements libthrift091.TBase<SetTopicQuotaRequest, SetTopicQuotaRequest._Fields>, java.io.Serializable, Cloneable, Comparable<SetTopicQuotaRequest> {
  private static final libthrift091.protocol.TStruct STRUCT_DESC = new libthrift091.protocol.TStruct("SetTopicQuotaRequest");

  private static final libthrift091.protocol.TField TOPIC_RESOURCE_NAME_FIELD_DESC = new libthrift091.protocol.TField("topicResourceName", libthrift091.protocol.TType.STRUCT, (short)1);
  private static final libthrift091.protocol.TField TOPIC_QUOTA_FIELD_DESC = new libthrift091.protocol.TField("topicQuota", libthrift091.protocol.TType.STRUCT, (short)2);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new SetTopicQuotaRequestStandardSchemeFactory());
    schemes.put(TupleScheme.class, new SetTopicQuotaRequestTupleSchemeFactory());
  }

  /**
   * The topic resource name
   * 
   */
  public TopicTalosResourceName topicResourceName; // required
  /**
   * The topic quota
   * 
   */
  public com.xiaomi.infra.galaxy.talos.thrift.BaseQuota topicQuota; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements libthrift091.TFieldIdEnum {
    /**
     * The topic resource name
     * 
     */
    TOPIC_RESOURCE_NAME((short)1, "topicResourceName"),
    /**
     * The topic quota
     * 
     */
    TOPIC_QUOTA((short)2, "topicQuota");

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
        case 1: // TOPIC_RESOURCE_NAME
          return TOPIC_RESOURCE_NAME;
        case 2: // TOPIC_QUOTA
          return TOPIC_QUOTA;
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
    tmpMap.put(_Fields.TOPIC_RESOURCE_NAME, new libthrift091.meta_data.FieldMetaData("topicResourceName", libthrift091.TFieldRequirementType.REQUIRED, 
        new libthrift091.meta_data.StructMetaData(libthrift091.protocol.TType.STRUCT, TopicTalosResourceName.class)));
    tmpMap.put(_Fields.TOPIC_QUOTA, new libthrift091.meta_data.FieldMetaData("topicQuota", libthrift091.TFieldRequirementType.REQUIRED, 
        new libthrift091.meta_data.StructMetaData(libthrift091.protocol.TType.STRUCT, com.xiaomi.infra.galaxy.talos.thrift.BaseQuota.class)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    libthrift091.meta_data.FieldMetaData.addStructMetaDataMap(SetTopicQuotaRequest.class, metaDataMap);
  }

  public SetTopicQuotaRequest() {
  }

  public SetTopicQuotaRequest(
    TopicTalosResourceName topicResourceName,
    com.xiaomi.infra.galaxy.talos.thrift.BaseQuota topicQuota)
  {
    this();
    this.topicResourceName = topicResourceName;
    this.topicQuota = topicQuota;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public SetTopicQuotaRequest(SetTopicQuotaRequest other) {
    if (other.isSetTopicResourceName()) {
      this.topicResourceName = new TopicTalosResourceName(other.topicResourceName);
    }
    if (other.isSetTopicQuota()) {
      this.topicQuota = new com.xiaomi.infra.galaxy.talos.thrift.BaseQuota(other.topicQuota);
    }
  }

  public SetTopicQuotaRequest deepCopy() {
    return new SetTopicQuotaRequest(this);
  }

  @Override
  public void clear() {
    this.topicResourceName = null;
    this.topicQuota = null;
  }

  /**
   * The topic resource name
   * 
   */
  public TopicTalosResourceName getTopicResourceName() {
    return this.topicResourceName;
  }

  /**
   * The topic resource name
   * 
   */
  public SetTopicQuotaRequest setTopicResourceName(TopicTalosResourceName topicResourceName) {
    this.topicResourceName = topicResourceName;
    return this;
  }

  public void unsetTopicResourceName() {
    this.topicResourceName = null;
  }

  /** Returns true if field topicResourceName is set (has been assigned a value) and false otherwise */
  public boolean isSetTopicResourceName() {
    return this.topicResourceName != null;
  }

  public void setTopicResourceNameIsSet(boolean value) {
    if (!value) {
      this.topicResourceName = null;
    }
  }

  /**
   * The topic quota
   * 
   */
  public com.xiaomi.infra.galaxy.talos.thrift.BaseQuota getTopicQuota() {
    return this.topicQuota;
  }

  /**
   * The topic quota
   * 
   */
  public SetTopicQuotaRequest setTopicQuota(com.xiaomi.infra.galaxy.talos.thrift.BaseQuota topicQuota) {
    this.topicQuota = topicQuota;
    return this;
  }

  public void unsetTopicQuota() {
    this.topicQuota = null;
  }

  /** Returns true if field topicQuota is set (has been assigned a value) and false otherwise */
  public boolean isSetTopicQuota() {
    return this.topicQuota != null;
  }

  public void setTopicQuotaIsSet(boolean value) {
    if (!value) {
      this.topicQuota = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case TOPIC_RESOURCE_NAME:
      if (value == null) {
        unsetTopicResourceName();
      } else {
        setTopicResourceName((TopicTalosResourceName)value);
      }
      break;

    case TOPIC_QUOTA:
      if (value == null) {
        unsetTopicQuota();
      } else {
        setTopicQuota((com.xiaomi.infra.galaxy.talos.thrift.BaseQuota)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case TOPIC_RESOURCE_NAME:
      return getTopicResourceName();

    case TOPIC_QUOTA:
      return getTopicQuota();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case TOPIC_RESOURCE_NAME:
      return isSetTopicResourceName();
    case TOPIC_QUOTA:
      return isSetTopicQuota();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof SetTopicQuotaRequest)
      return this.equals((SetTopicQuotaRequest)that);
    return false;
  }

  public boolean equals(SetTopicQuotaRequest that) {
    if (that == null)
      return false;

    boolean this_present_topicResourceName = true && this.isSetTopicResourceName();
    boolean that_present_topicResourceName = true && that.isSetTopicResourceName();
    if (this_present_topicResourceName || that_present_topicResourceName) {
      if (!(this_present_topicResourceName && that_present_topicResourceName))
        return false;
      if (!this.topicResourceName.equals(that.topicResourceName))
        return false;
    }

    boolean this_present_topicQuota = true && this.isSetTopicQuota();
    boolean that_present_topicQuota = true && that.isSetTopicQuota();
    if (this_present_topicQuota || that_present_topicQuota) {
      if (!(this_present_topicQuota && that_present_topicQuota))
        return false;
      if (!this.topicQuota.equals(that.topicQuota))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_topicResourceName = true && (isSetTopicResourceName());
    list.add(present_topicResourceName);
    if (present_topicResourceName)
      list.add(topicResourceName);

    boolean present_topicQuota = true && (isSetTopicQuota());
    list.add(present_topicQuota);
    if (present_topicQuota)
      list.add(topicQuota);

    return list.hashCode();
  }

  @Override
  public int compareTo(SetTopicQuotaRequest other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetTopicResourceName()).compareTo(other.isSetTopicResourceName());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetTopicResourceName()) {
      lastComparison = libthrift091.TBaseHelper.compareTo(this.topicResourceName, other.topicResourceName);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetTopicQuota()).compareTo(other.isSetTopicQuota());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetTopicQuota()) {
      lastComparison = libthrift091.TBaseHelper.compareTo(this.topicQuota, other.topicQuota);
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
    StringBuilder sb = new StringBuilder("SetTopicQuotaRequest(");
    boolean first = true;

    sb.append("topicResourceName:");
    if (this.topicResourceName == null) {
      sb.append("null");
    } else {
      sb.append(this.topicResourceName);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("topicQuota:");
    if (this.topicQuota == null) {
      sb.append("null");
    } else {
      sb.append(this.topicQuota);
    }
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws libthrift091.TException {
    // check for required fields
    if (topicResourceName == null) {
      throw new libthrift091.protocol.TProtocolException("Required field 'topicResourceName' was not present! Struct: " + toString());
    }
    if (topicQuota == null) {
      throw new libthrift091.protocol.TProtocolException("Required field 'topicQuota' was not present! Struct: " + toString());
    }
    // check for sub-struct validity
    if (topicResourceName != null) {
      topicResourceName.validate();
    }
    if (topicQuota != null) {
      topicQuota.validate();
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
      read(new libthrift091.protocol.TCompactProtocol(new libthrift091.transport.TIOStreamTransport(in)));
    } catch (libthrift091.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class SetTopicQuotaRequestStandardSchemeFactory implements SchemeFactory {
    public SetTopicQuotaRequestStandardScheme getScheme() {
      return new SetTopicQuotaRequestStandardScheme();
    }
  }

  private static class SetTopicQuotaRequestStandardScheme extends StandardScheme<SetTopicQuotaRequest> {

    public void read(libthrift091.protocol.TProtocol iprot, SetTopicQuotaRequest struct) throws libthrift091.TException {
      libthrift091.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == libthrift091.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // TOPIC_RESOURCE_NAME
            if (schemeField.type == libthrift091.protocol.TType.STRUCT) {
              struct.topicResourceName = new TopicTalosResourceName();
              struct.topicResourceName.read(iprot);
              struct.setTopicResourceNameIsSet(true);
            } else { 
              libthrift091.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // TOPIC_QUOTA
            if (schemeField.type == libthrift091.protocol.TType.STRUCT) {
              struct.topicQuota = new com.xiaomi.infra.galaxy.talos.thrift.BaseQuota();
              struct.topicQuota.read(iprot);
              struct.setTopicQuotaIsSet(true);
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

    public void write(libthrift091.protocol.TProtocol oprot, SetTopicQuotaRequest struct) throws libthrift091.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.topicResourceName != null) {
        oprot.writeFieldBegin(TOPIC_RESOURCE_NAME_FIELD_DESC);
        struct.topicResourceName.write(oprot);
        oprot.writeFieldEnd();
      }
      if (struct.topicQuota != null) {
        oprot.writeFieldBegin(TOPIC_QUOTA_FIELD_DESC);
        struct.topicQuota.write(oprot);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class SetTopicQuotaRequestTupleSchemeFactory implements SchemeFactory {
    public SetTopicQuotaRequestTupleScheme getScheme() {
      return new SetTopicQuotaRequestTupleScheme();
    }
  }

  private static class SetTopicQuotaRequestTupleScheme extends TupleScheme<SetTopicQuotaRequest> {

    @Override
    public void write(libthrift091.protocol.TProtocol prot, SetTopicQuotaRequest struct) throws libthrift091.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      struct.topicResourceName.write(oprot);
      struct.topicQuota.write(oprot);
    }

    @Override
    public void read(libthrift091.protocol.TProtocol prot, SetTopicQuotaRequest struct) throws libthrift091.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      struct.topicResourceName = new TopicTalosResourceName();
      struct.topicResourceName.read(iprot);
      struct.setTopicResourceNameIsSet(true);
      struct.topicQuota = new com.xiaomi.infra.galaxy.talos.thrift.BaseQuota();
      struct.topicQuota.read(iprot);
      struct.setTopicQuotaIsSet(true);
    }
  }

}

