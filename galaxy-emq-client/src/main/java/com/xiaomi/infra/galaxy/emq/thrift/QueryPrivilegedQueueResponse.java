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
@Generated(value = "Autogenerated by Thrift Compiler (0.9.2)", date = "2016-7-28")
public class QueryPrivilegedQueueResponse implements libthrift091.TBase<QueryPrivilegedQueueResponse, QueryPrivilegedQueueResponse._Fields>, java.io.Serializable, Cloneable, Comparable<QueryPrivilegedQueueResponse> {
  private static final libthrift091.protocol.TStruct STRUCT_DESC = new libthrift091.protocol.TStruct("QueryPrivilegedQueueResponse");

  private static final libthrift091.protocol.TField QUEUE_LIST_FIELD_DESC = new libthrift091.protocol.TField("queueList", libthrift091.protocol.TType.LIST, (short)1);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new QueryPrivilegedQueueResponseStandardSchemeFactory());
    schemes.put(TupleScheme.class, new QueryPrivilegedQueueResponseTupleSchemeFactory());
  }

  public List<QueryPrivilegedQueueResponseEntry> queueList; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements libthrift091.TFieldIdEnum {
    QUEUE_LIST((short)1, "queueList");

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
        case 1: // QUEUE_LIST
          return QUEUE_LIST;
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
    tmpMap.put(_Fields.QUEUE_LIST, new libthrift091.meta_data.FieldMetaData("queueList", libthrift091.TFieldRequirementType.REQUIRED, 
        new libthrift091.meta_data.ListMetaData(libthrift091.protocol.TType.LIST, 
            new libthrift091.meta_data.StructMetaData(libthrift091.protocol.TType.STRUCT, QueryPrivilegedQueueResponseEntry.class))));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    libthrift091.meta_data.FieldMetaData.addStructMetaDataMap(QueryPrivilegedQueueResponse.class, metaDataMap);
  }

  public QueryPrivilegedQueueResponse() {
  }

  public QueryPrivilegedQueueResponse(
    List<QueryPrivilegedQueueResponseEntry> queueList)
  {
    this();
    this.queueList = queueList;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public QueryPrivilegedQueueResponse(QueryPrivilegedQueueResponse other) {
    if (other.isSetQueueList()) {
      List<QueryPrivilegedQueueResponseEntry> __this__queueList = new ArrayList<QueryPrivilegedQueueResponseEntry>(other.queueList.size());
      for (QueryPrivilegedQueueResponseEntry other_element : other.queueList) {
        __this__queueList.add(new QueryPrivilegedQueueResponseEntry(other_element));
      }
      this.queueList = __this__queueList;
    }
  }

  public QueryPrivilegedQueueResponse deepCopy() {
    return new QueryPrivilegedQueueResponse(this);
  }

  @Override
  public void clear() {
    this.queueList = null;
  }

  public int getQueueListSize() {
    return (this.queueList == null) ? 0 : this.queueList.size();
  }

  public java.util.Iterator<QueryPrivilegedQueueResponseEntry> getQueueListIterator() {
    return (this.queueList == null) ? null : this.queueList.iterator();
  }

  public void addToQueueList(QueryPrivilegedQueueResponseEntry elem) {
    if (this.queueList == null) {
      this.queueList = new ArrayList<QueryPrivilegedQueueResponseEntry>();
    }
    this.queueList.add(elem);
  }

  public List<QueryPrivilegedQueueResponseEntry> getQueueList() {
    return this.queueList;
  }

  public QueryPrivilegedQueueResponse setQueueList(List<QueryPrivilegedQueueResponseEntry> queueList) {
    this.queueList = queueList;
    return this;
  }

  public void unsetQueueList() {
    this.queueList = null;
  }

  /** Returns true if field queueList is set (has been assigned a value) and false otherwise */
  public boolean isSetQueueList() {
    return this.queueList != null;
  }

  public void setQueueListIsSet(boolean value) {
    if (!value) {
      this.queueList = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case QUEUE_LIST:
      if (value == null) {
        unsetQueueList();
      } else {
        setQueueList((List<QueryPrivilegedQueueResponseEntry>)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case QUEUE_LIST:
      return getQueueList();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case QUEUE_LIST:
      return isSetQueueList();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof QueryPrivilegedQueueResponse)
      return this.equals((QueryPrivilegedQueueResponse)that);
    return false;
  }

  public boolean equals(QueryPrivilegedQueueResponse that) {
    if (that == null)
      return false;

    boolean this_present_queueList = true && this.isSetQueueList();
    boolean that_present_queueList = true && that.isSetQueueList();
    if (this_present_queueList || that_present_queueList) {
      if (!(this_present_queueList && that_present_queueList))
        return false;
      if (!this.queueList.equals(that.queueList))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_queueList = true && (isSetQueueList());
    list.add(present_queueList);
    if (present_queueList)
      list.add(queueList);

    return list.hashCode();
  }

  @Override
  public int compareTo(QueryPrivilegedQueueResponse other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetQueueList()).compareTo(other.isSetQueueList());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetQueueList()) {
      lastComparison = libthrift091.TBaseHelper.compareTo(this.queueList, other.queueList);
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
    StringBuilder sb = new StringBuilder("QueryPrivilegedQueueResponse(");
    boolean first = true;

    sb.append("queueList:");
    if (this.queueList == null) {
      sb.append("null");
    } else {
      sb.append(this.queueList);
    }
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws libthrift091.TException {
    // check for required fields
    if (queueList == null) {
      throw new libthrift091.protocol.TProtocolException("Required field 'queueList' was not present! Struct: " + toString());
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

  private static class QueryPrivilegedQueueResponseStandardSchemeFactory implements SchemeFactory {
    public QueryPrivilegedQueueResponseStandardScheme getScheme() {
      return new QueryPrivilegedQueueResponseStandardScheme();
    }
  }

  private static class QueryPrivilegedQueueResponseStandardScheme extends StandardScheme<QueryPrivilegedQueueResponse> {

    public void read(libthrift091.protocol.TProtocol iprot, QueryPrivilegedQueueResponse struct) throws libthrift091.TException {
      libthrift091.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == libthrift091.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // QUEUE_LIST
            if (schemeField.type == libthrift091.protocol.TType.LIST) {
              {
                libthrift091.protocol.TList _list26 = iprot.readListBegin();
                struct.queueList = new ArrayList<QueryPrivilegedQueueResponseEntry>(_list26.size);
                QueryPrivilegedQueueResponseEntry _elem27;
                for (int _i28 = 0; _i28 < _list26.size; ++_i28)
                {
                  _elem27 = new QueryPrivilegedQueueResponseEntry();
                  _elem27.read(iprot);
                  struct.queueList.add(_elem27);
                }
                iprot.readListEnd();
              }
              struct.setQueueListIsSet(true);
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

    public void write(libthrift091.protocol.TProtocol oprot, QueryPrivilegedQueueResponse struct) throws libthrift091.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.queueList != null) {
        oprot.writeFieldBegin(QUEUE_LIST_FIELD_DESC);
        {
          oprot.writeListBegin(new libthrift091.protocol.TList(libthrift091.protocol.TType.STRUCT, struct.queueList.size()));
          for (QueryPrivilegedQueueResponseEntry _iter29 : struct.queueList)
          {
            _iter29.write(oprot);
          }
          oprot.writeListEnd();
        }
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class QueryPrivilegedQueueResponseTupleSchemeFactory implements SchemeFactory {
    public QueryPrivilegedQueueResponseTupleScheme getScheme() {
      return new QueryPrivilegedQueueResponseTupleScheme();
    }
  }

  private static class QueryPrivilegedQueueResponseTupleScheme extends TupleScheme<QueryPrivilegedQueueResponse> {

    @Override
    public void write(libthrift091.protocol.TProtocol prot, QueryPrivilegedQueueResponse struct) throws libthrift091.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      {
        oprot.writeI32(struct.queueList.size());
        for (QueryPrivilegedQueueResponseEntry _iter30 : struct.queueList)
        {
          _iter30.write(oprot);
        }
      }
    }

    @Override
    public void read(libthrift091.protocol.TProtocol prot, QueryPrivilegedQueueResponse struct) throws libthrift091.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      {
        libthrift091.protocol.TList _list31 = new libthrift091.protocol.TList(libthrift091.protocol.TType.STRUCT, iprot.readI32());
        struct.queueList = new ArrayList<QueryPrivilegedQueueResponseEntry>(_list31.size);
        QueryPrivilegedQueueResponseEntry _elem32;
        for (int _i33 = 0; _i33 < _list31.size; ++_i33)
        {
          _elem32 = new QueryPrivilegedQueueResponseEntry();
          _elem32.read(iprot);
          struct.queueList.add(_elem32);
        }
      }
      struct.setQueueListIsSet(true);
    }
  }

}

