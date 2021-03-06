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
@Generated(value = "Autogenerated by Thrift Compiler (0.9.2)", date = "2016-8-18")
public class GetHardwareConfigResponse implements libthrift091.TBase<GetHardwareConfigResponse, GetHardwareConfigResponse._Fields>, java.io.Serializable, Cloneable, Comparable<GetHardwareConfigResponse> {
  private static final libthrift091.protocol.TStruct STRUCT_DESC = new libthrift091.protocol.TStruct("GetHardwareConfigResponse");

  private static final libthrift091.protocol.TField HARDWARE_FIELD_DESC = new libthrift091.protocol.TField("hardware", libthrift091.protocol.TType.LIST, (short)1);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new GetHardwareConfigResponseStandardSchemeFactory());
    schemes.put(TupleScheme.class, new GetHardwareConfigResponseTupleSchemeFactory());
  }

  public List<InstanceTypeInfo> hardware; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements libthrift091.TFieldIdEnum {
    HARDWARE((short)1, "hardware");

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
        case 1: // HARDWARE
          return HARDWARE;
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
    tmpMap.put(_Fields.HARDWARE, new libthrift091.meta_data.FieldMetaData("hardware", libthrift091.TFieldRequirementType.DEFAULT, 
        new libthrift091.meta_data.ListMetaData(libthrift091.protocol.TType.LIST, 
            new libthrift091.meta_data.StructMetaData(libthrift091.protocol.TType.STRUCT, InstanceTypeInfo.class))));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    libthrift091.meta_data.FieldMetaData.addStructMetaDataMap(GetHardwareConfigResponse.class, metaDataMap);
  }

  public GetHardwareConfigResponse() {
  }

  public GetHardwareConfigResponse(
    List<InstanceTypeInfo> hardware)
  {
    this();
    this.hardware = hardware;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public GetHardwareConfigResponse(GetHardwareConfigResponse other) {
    if (other.isSetHardware()) {
      List<InstanceTypeInfo> __this__hardware = new ArrayList<InstanceTypeInfo>(other.hardware.size());
      for (InstanceTypeInfo other_element : other.hardware) {
        __this__hardware.add(new InstanceTypeInfo(other_element));
      }
      this.hardware = __this__hardware;
    }
  }

  public GetHardwareConfigResponse deepCopy() {
    return new GetHardwareConfigResponse(this);
  }

  @Override
  public void clear() {
    this.hardware = null;
  }

  public int getHardwareSize() {
    return (this.hardware == null) ? 0 : this.hardware.size();
  }

  public java.util.Iterator<InstanceTypeInfo> getHardwareIterator() {
    return (this.hardware == null) ? null : this.hardware.iterator();
  }

  public void addToHardware(InstanceTypeInfo elem) {
    if (this.hardware == null) {
      this.hardware = new ArrayList<InstanceTypeInfo>();
    }
    this.hardware.add(elem);
  }

  public List<InstanceTypeInfo> getHardware() {
    return this.hardware;
  }

  public GetHardwareConfigResponse setHardware(List<InstanceTypeInfo> hardware) {
    this.hardware = hardware;
    return this;
  }

  public void unsetHardware() {
    this.hardware = null;
  }

  /** Returns true if field hardware is set (has been assigned a value) and false otherwise */
  public boolean isSetHardware() {
    return this.hardware != null;
  }

  public void setHardwareIsSet(boolean value) {
    if (!value) {
      this.hardware = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case HARDWARE:
      if (value == null) {
        unsetHardware();
      } else {
        setHardware((List<InstanceTypeInfo>)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case HARDWARE:
      return getHardware();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case HARDWARE:
      return isSetHardware();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof GetHardwareConfigResponse)
      return this.equals((GetHardwareConfigResponse)that);
    return false;
  }

  public boolean equals(GetHardwareConfigResponse that) {
    if (that == null)
      return false;

    boolean this_present_hardware = true && this.isSetHardware();
    boolean that_present_hardware = true && that.isSetHardware();
    if (this_present_hardware || that_present_hardware) {
      if (!(this_present_hardware && that_present_hardware))
        return false;
      if (!this.hardware.equals(that.hardware))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_hardware = true && (isSetHardware());
    list.add(present_hardware);
    if (present_hardware)
      list.add(hardware);

    return list.hashCode();
  }

  @Override
  public int compareTo(GetHardwareConfigResponse other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetHardware()).compareTo(other.isSetHardware());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetHardware()) {
      lastComparison = libthrift091.TBaseHelper.compareTo(this.hardware, other.hardware);
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
    StringBuilder sb = new StringBuilder("GetHardwareConfigResponse(");
    boolean first = true;

    sb.append("hardware:");
    if (this.hardware == null) {
      sb.append("null");
    } else {
      sb.append(this.hardware);
    }
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws libthrift091.TException {
    // check for required fields
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

  private static class GetHardwareConfigResponseStandardSchemeFactory implements SchemeFactory {
    public GetHardwareConfigResponseStandardScheme getScheme() {
      return new GetHardwareConfigResponseStandardScheme();
    }
  }

  private static class GetHardwareConfigResponseStandardScheme extends StandardScheme<GetHardwareConfigResponse> {

    public void read(libthrift091.protocol.TProtocol iprot, GetHardwareConfigResponse struct) throws libthrift091.TException {
      libthrift091.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == libthrift091.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // HARDWARE
            if (schemeField.type == libthrift091.protocol.TType.LIST) {
              {
                libthrift091.protocol.TList _list142 = iprot.readListBegin();
                struct.hardware = new ArrayList<InstanceTypeInfo>(_list142.size);
                InstanceTypeInfo _elem143;
                for (int _i144 = 0; _i144 < _list142.size; ++_i144)
                {
                  _elem143 = new InstanceTypeInfo();
                  _elem143.read(iprot);
                  struct.hardware.add(_elem143);
                }
                iprot.readListEnd();
              }
              struct.setHardwareIsSet(true);
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

    public void write(libthrift091.protocol.TProtocol oprot, GetHardwareConfigResponse struct) throws libthrift091.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.hardware != null) {
        oprot.writeFieldBegin(HARDWARE_FIELD_DESC);
        {
          oprot.writeListBegin(new libthrift091.protocol.TList(libthrift091.protocol.TType.STRUCT, struct.hardware.size()));
          for (InstanceTypeInfo _iter145 : struct.hardware)
          {
            _iter145.write(oprot);
          }
          oprot.writeListEnd();
        }
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class GetHardwareConfigResponseTupleSchemeFactory implements SchemeFactory {
    public GetHardwareConfigResponseTupleScheme getScheme() {
      return new GetHardwareConfigResponseTupleScheme();
    }
  }

  private static class GetHardwareConfigResponseTupleScheme extends TupleScheme<GetHardwareConfigResponse> {

    @Override
    public void write(libthrift091.protocol.TProtocol prot, GetHardwareConfigResponse struct) throws libthrift091.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetHardware()) {
        optionals.set(0);
      }
      oprot.writeBitSet(optionals, 1);
      if (struct.isSetHardware()) {
        {
          oprot.writeI32(struct.hardware.size());
          for (InstanceTypeInfo _iter146 : struct.hardware)
          {
            _iter146.write(oprot);
          }
        }
      }
    }

    @Override
    public void read(libthrift091.protocol.TProtocol prot, GetHardwareConfigResponse struct) throws libthrift091.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(1);
      if (incoming.get(0)) {
        {
          libthrift091.protocol.TList _list147 = new libthrift091.protocol.TList(libthrift091.protocol.TType.STRUCT, iprot.readI32());
          struct.hardware = new ArrayList<InstanceTypeInfo>(_list147.size);
          InstanceTypeInfo _elem148;
          for (int _i149 = 0; _i149 < _list147.size; ++_i149)
          {
            _elem148 = new InstanceTypeInfo();
            _elem148.read(iprot);
            struct.hardware.add(_elem148);
          }
        }
        struct.setHardwareIsSet(true);
      }
    }
  }

}

