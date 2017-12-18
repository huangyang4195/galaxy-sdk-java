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
@Generated(value = "Autogenerated by Thrift Compiler (0.9.2)", date = "2017-12-18")
public class GetPartitionOffsetResponse implements libthrift091.TBase<GetPartitionOffsetResponse, GetPartitionOffsetResponse._Fields>, java.io.Serializable, Cloneable, Comparable<GetPartitionOffsetResponse> {
  private static final libthrift091.protocol.TStruct STRUCT_DESC = new libthrift091.protocol.TStruct("GetPartitionOffsetResponse");

  private static final libthrift091.protocol.TField OFFSET_INFO_FIELD_DESC = new libthrift091.protocol.TField("offsetInfo", libthrift091.protocol.TType.STRUCT, (short)1);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new GetPartitionOffsetResponseStandardSchemeFactory());
    schemes.put(TupleScheme.class, new GetPartitionOffsetResponseTupleSchemeFactory());
  }

  /**
   * The partition message offset
   * 
   */
  public OffsetInfo offsetInfo; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements libthrift091.TFieldIdEnum {
    /**
     * The partition message offset
     * 
     */
    OFFSET_INFO((short)1, "offsetInfo");

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
        case 1: // OFFSET_INFO
          return OFFSET_INFO;
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
    tmpMap.put(_Fields.OFFSET_INFO, new libthrift091.meta_data.FieldMetaData("offsetInfo", libthrift091.TFieldRequirementType.REQUIRED, 
        new libthrift091.meta_data.StructMetaData(libthrift091.protocol.TType.STRUCT, OffsetInfo.class)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    libthrift091.meta_data.FieldMetaData.addStructMetaDataMap(GetPartitionOffsetResponse.class, metaDataMap);
  }

  public GetPartitionOffsetResponse() {
  }

  public GetPartitionOffsetResponse(
    OffsetInfo offsetInfo)
  {
    this();
    this.offsetInfo = offsetInfo;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public GetPartitionOffsetResponse(GetPartitionOffsetResponse other) {
    if (other.isSetOffsetInfo()) {
      this.offsetInfo = new OffsetInfo(other.offsetInfo);
    }
  }

  public GetPartitionOffsetResponse deepCopy() {
    return new GetPartitionOffsetResponse(this);
  }

  @Override
  public void clear() {
    this.offsetInfo = null;
  }

  /**
   * The partition message offset
   * 
   */
  public OffsetInfo getOffsetInfo() {
    return this.offsetInfo;
  }

  /**
   * The partition message offset
   * 
   */
  public GetPartitionOffsetResponse setOffsetInfo(OffsetInfo offsetInfo) {
    this.offsetInfo = offsetInfo;
    return this;
  }

  public void unsetOffsetInfo() {
    this.offsetInfo = null;
  }

  /** Returns true if field offsetInfo is set (has been assigned a value) and false otherwise */
  public boolean isSetOffsetInfo() {
    return this.offsetInfo != null;
  }

  public void setOffsetInfoIsSet(boolean value) {
    if (!value) {
      this.offsetInfo = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case OFFSET_INFO:
      if (value == null) {
        unsetOffsetInfo();
      } else {
        setOffsetInfo((OffsetInfo)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case OFFSET_INFO:
      return getOffsetInfo();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case OFFSET_INFO:
      return isSetOffsetInfo();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof GetPartitionOffsetResponse)
      return this.equals((GetPartitionOffsetResponse)that);
    return false;
  }

  public boolean equals(GetPartitionOffsetResponse that) {
    if (that == null)
      return false;

    boolean this_present_offsetInfo = true && this.isSetOffsetInfo();
    boolean that_present_offsetInfo = true && that.isSetOffsetInfo();
    if (this_present_offsetInfo || that_present_offsetInfo) {
      if (!(this_present_offsetInfo && that_present_offsetInfo))
        return false;
      if (!this.offsetInfo.equals(that.offsetInfo))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_offsetInfo = true && (isSetOffsetInfo());
    list.add(present_offsetInfo);
    if (present_offsetInfo)
      list.add(offsetInfo);

    return list.hashCode();
  }

  @Override
  public int compareTo(GetPartitionOffsetResponse other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetOffsetInfo()).compareTo(other.isSetOffsetInfo());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetOffsetInfo()) {
      lastComparison = libthrift091.TBaseHelper.compareTo(this.offsetInfo, other.offsetInfo);
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
    StringBuilder sb = new StringBuilder("GetPartitionOffsetResponse(");
    boolean first = true;

    sb.append("offsetInfo:");
    if (this.offsetInfo == null) {
      sb.append("null");
    } else {
      sb.append(this.offsetInfo);
    }
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws libthrift091.TException {
    // check for required fields
    if (offsetInfo == null) {
      throw new libthrift091.protocol.TProtocolException("Required field 'offsetInfo' was not present! Struct: " + toString());
    }
    // check for sub-struct validity
    if (offsetInfo != null) {
      offsetInfo.validate();
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

  private static class GetPartitionOffsetResponseStandardSchemeFactory implements SchemeFactory {
    public GetPartitionOffsetResponseStandardScheme getScheme() {
      return new GetPartitionOffsetResponseStandardScheme();
    }
  }

  private static class GetPartitionOffsetResponseStandardScheme extends StandardScheme<GetPartitionOffsetResponse> {

    public void read(libthrift091.protocol.TProtocol iprot, GetPartitionOffsetResponse struct) throws libthrift091.TException {
      libthrift091.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == libthrift091.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // OFFSET_INFO
            if (schemeField.type == libthrift091.protocol.TType.STRUCT) {
              struct.offsetInfo = new OffsetInfo();
              struct.offsetInfo.read(iprot);
              struct.setOffsetInfoIsSet(true);
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

    public void write(libthrift091.protocol.TProtocol oprot, GetPartitionOffsetResponse struct) throws libthrift091.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.offsetInfo != null) {
        oprot.writeFieldBegin(OFFSET_INFO_FIELD_DESC);
        struct.offsetInfo.write(oprot);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class GetPartitionOffsetResponseTupleSchemeFactory implements SchemeFactory {
    public GetPartitionOffsetResponseTupleScheme getScheme() {
      return new GetPartitionOffsetResponseTupleScheme();
    }
  }

  private static class GetPartitionOffsetResponseTupleScheme extends TupleScheme<GetPartitionOffsetResponse> {

    @Override
    public void write(libthrift091.protocol.TProtocol prot, GetPartitionOffsetResponse struct) throws libthrift091.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      struct.offsetInfo.write(oprot);
    }

    @Override
    public void read(libthrift091.protocol.TProtocol prot, GetPartitionOffsetResponse struct) throws libthrift091.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      struct.offsetInfo = new OffsetInfo();
      struct.offsetInfo.read(iprot);
      struct.setOffsetInfoIsSet(true);
    }
  }

}

