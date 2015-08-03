/**
 * Autogenerated by Thrift Compiler (0.9.2)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.xiaomi.infra.galaxy.emq.thrift;

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
@Generated(value = "Autogenerated by Thrift Compiler (0.9.2)", date = "2015-7-29")
public class QueryPermissionForIdResponse implements libthrift091.TBase<QueryPermissionForIdResponse, QueryPermissionForIdResponse._Fields>, java.io.Serializable, Cloneable, Comparable<QueryPermissionForIdResponse> {
  private static final libthrift091.protocol.TStruct STRUCT_DESC = new libthrift091.protocol.TStruct("QueryPermissionForIdResponse");

  private static final libthrift091.protocol.TField PERMISSION_FIELD_DESC = new libthrift091.protocol.TField("permission", libthrift091.protocol.TType.I32, (short)1);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new QueryPermissionForIdResponseStandardSchemeFactory());
    schemes.put(TupleScheme.class, new QueryPermissionForIdResponseTupleSchemeFactory());
  }

  /**
   * 
   * @see Permission
   */
  public Permission permission; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements libthrift091.TFieldIdEnum {
    /**
     * 
     * @see Permission
     */
    PERMISSION((short)1, "permission");

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
        case 1: // PERMISSION
          return PERMISSION;
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
    tmpMap.put(_Fields.PERMISSION, new libthrift091.meta_data.FieldMetaData("permission", libthrift091.TFieldRequirementType.REQUIRED, 
        new libthrift091.meta_data.EnumMetaData(libthrift091.protocol.TType.ENUM, Permission.class)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    libthrift091.meta_data.FieldMetaData.addStructMetaDataMap(QueryPermissionForIdResponse.class, metaDataMap);
  }

  public QueryPermissionForIdResponse() {
  }

  public QueryPermissionForIdResponse(
    Permission permission)
  {
    this();
    this.permission = permission;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public QueryPermissionForIdResponse(QueryPermissionForIdResponse other) {
    if (other.isSetPermission()) {
      this.permission = other.permission;
    }
  }

  public QueryPermissionForIdResponse deepCopy() {
    return new QueryPermissionForIdResponse(this);
  }

  @Override
  public void clear() {
    this.permission = null;
  }

  /**
   * 
   * @see Permission
   */
  public Permission getPermission() {
    return this.permission;
  }

  /**
   * 
   * @see Permission
   */
  public QueryPermissionForIdResponse setPermission(Permission permission) {
    this.permission = permission;
    return this;
  }

  public void unsetPermission() {
    this.permission = null;
  }

  /** Returns true if field permission is set (has been assigned a value) and false otherwise */
  public boolean isSetPermission() {
    return this.permission != null;
  }

  public void setPermissionIsSet(boolean value) {
    if (!value) {
      this.permission = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case PERMISSION:
      if (value == null) {
        unsetPermission();
      } else {
        setPermission((Permission)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case PERMISSION:
      return getPermission();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case PERMISSION:
      return isSetPermission();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof QueryPermissionForIdResponse)
      return this.equals((QueryPermissionForIdResponse)that);
    return false;
  }

  public boolean equals(QueryPermissionForIdResponse that) {
    if (that == null)
      return false;

    boolean this_present_permission = true && this.isSetPermission();
    boolean that_present_permission = true && that.isSetPermission();
    if (this_present_permission || that_present_permission) {
      if (!(this_present_permission && that_present_permission))
        return false;
      if (!this.permission.equals(that.permission))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_permission = true && (isSetPermission());
    list.add(present_permission);
    if (present_permission)
      list.add(permission.getValue());

    return list.hashCode();
  }

  @Override
  public int compareTo(QueryPermissionForIdResponse other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetPermission()).compareTo(other.isSetPermission());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetPermission()) {
      lastComparison = libthrift091.TBaseHelper.compareTo(this.permission, other.permission);
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
    StringBuilder sb = new StringBuilder("QueryPermissionForIdResponse(");
    boolean first = true;

    sb.append("permission:");
    if (this.permission == null) {
      sb.append("null");
    } else {
      sb.append(this.permission);
    }
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws libthrift091.TException {
    // check for required fields
    if (permission == null) {
      throw new libthrift091.protocol.TProtocolException("Required field 'permission' was not present! Struct: " + toString());
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

  private static class QueryPermissionForIdResponseStandardSchemeFactory implements SchemeFactory {
    public QueryPermissionForIdResponseStandardScheme getScheme() {
      return new QueryPermissionForIdResponseStandardScheme();
    }
  }

  private static class QueryPermissionForIdResponseStandardScheme extends StandardScheme<QueryPermissionForIdResponse> {

    public void read(libthrift091.protocol.TProtocol iprot, QueryPermissionForIdResponse struct) throws libthrift091.TException {
      libthrift091.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == libthrift091.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // PERMISSION
            if (schemeField.type == libthrift091.protocol.TType.I32) {
              struct.permission = com.xiaomi.infra.galaxy.emq.thrift.Permission.findByValue(iprot.readI32());
              struct.setPermissionIsSet(true);
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

    public void write(libthrift091.protocol.TProtocol oprot, QueryPermissionForIdResponse struct) throws libthrift091.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.permission != null) {
        oprot.writeFieldBegin(PERMISSION_FIELD_DESC);
        oprot.writeI32(struct.permission.getValue());
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class QueryPermissionForIdResponseTupleSchemeFactory implements SchemeFactory {
    public QueryPermissionForIdResponseTupleScheme getScheme() {
      return new QueryPermissionForIdResponseTupleScheme();
    }
  }

  private static class QueryPermissionForIdResponseTupleScheme extends TupleScheme<QueryPermissionForIdResponse> {

    @Override
    public void write(libthrift091.protocol.TProtocol prot, QueryPermissionForIdResponse struct) throws libthrift091.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      oprot.writeI32(struct.permission.getValue());
    }

    @Override
    public void read(libthrift091.protocol.TProtocol prot, QueryPermissionForIdResponse struct) throws libthrift091.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      struct.permission = com.xiaomi.infra.galaxy.emq.thrift.Permission.findByValue(iprot.readI32());
      struct.setPermissionIsSet(true);
    }
  }

}

