/**
 * Autogenerated by Thrift Compiler (0.9.2)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.xiaomi.infra.galaxy.sds.thrift;

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
/**
 * internal mutation log entries, use in TraceRegionServer coprocessor
 * 
 */
@Generated(value = "Autogenerated by Thrift Compiler (0.9.2)", date = "2017-7-21")
public class InternalMutationLogGroup implements libthrift091.TBase<InternalMutationLogGroup, InternalMutationLogGroup._Fields>, java.io.Serializable, Cloneable, Comparable<InternalMutationLogGroup> {
  private static final libthrift091.protocol.TStruct STRUCT_DESC = new libthrift091.protocol.TStruct("InternalMutationLogGroup");

  private static final libthrift091.protocol.TField DEVELOPER_ID_FIELD_DESC = new libthrift091.protocol.TField("developerId", libthrift091.protocol.TType.STRING, (short)1);
  private static final libthrift091.protocol.TField ORIGINAL_TABLE_NAME_FIELD_DESC = new libthrift091.protocol.TField("originalTableName", libthrift091.protocol.TType.STRING, (short)2);
  private static final libthrift091.protocol.TField ENTRIES_FIELD_DESC = new libthrift091.protocol.TField("entries", libthrift091.protocol.TType.LIST, (short)3);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new InternalMutationLogGroupStandardSchemeFactory());
    schemes.put(TupleScheme.class, new InternalMutationLogGroupTupleSchemeFactory());
  }

  /**
   * developerId
   */
  public String developerId; // optional
  /**
   * sds tableName
   */
  public String originalTableName; // optional
  /**
   * mutation long entries
   */
  public List<InternalMutationLogEntry> entries; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements libthrift091.TFieldIdEnum {
    /**
     * developerId
     */
    DEVELOPER_ID((short)1, "developerId"),
    /**
     * sds tableName
     */
    ORIGINAL_TABLE_NAME((short)2, "originalTableName"),
    /**
     * mutation long entries
     */
    ENTRIES((short)3, "entries");

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
        case 1: // DEVELOPER_ID
          return DEVELOPER_ID;
        case 2: // ORIGINAL_TABLE_NAME
          return ORIGINAL_TABLE_NAME;
        case 3: // ENTRIES
          return ENTRIES;
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
  private static final _Fields optionals[] = {_Fields.DEVELOPER_ID,_Fields.ORIGINAL_TABLE_NAME,_Fields.ENTRIES};
  public static final Map<_Fields, libthrift091.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, libthrift091.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, libthrift091.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.DEVELOPER_ID, new libthrift091.meta_data.FieldMetaData("developerId", libthrift091.TFieldRequirementType.OPTIONAL, 
        new libthrift091.meta_data.FieldValueMetaData(libthrift091.protocol.TType.STRING)));
    tmpMap.put(_Fields.ORIGINAL_TABLE_NAME, new libthrift091.meta_data.FieldMetaData("originalTableName", libthrift091.TFieldRequirementType.OPTIONAL, 
        new libthrift091.meta_data.FieldValueMetaData(libthrift091.protocol.TType.STRING)));
    tmpMap.put(_Fields.ENTRIES, new libthrift091.meta_data.FieldMetaData("entries", libthrift091.TFieldRequirementType.OPTIONAL, 
        new libthrift091.meta_data.ListMetaData(libthrift091.protocol.TType.LIST, 
            new libthrift091.meta_data.StructMetaData(libthrift091.protocol.TType.STRUCT, InternalMutationLogEntry.class))));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    libthrift091.meta_data.FieldMetaData.addStructMetaDataMap(InternalMutationLogGroup.class, metaDataMap);
  }

  public InternalMutationLogGroup() {
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public InternalMutationLogGroup(InternalMutationLogGroup other) {
    if (other.isSetDeveloperId()) {
      this.developerId = other.developerId;
    }
    if (other.isSetOriginalTableName()) {
      this.originalTableName = other.originalTableName;
    }
    if (other.isSetEntries()) {
      List<InternalMutationLogEntry> __this__entries = new ArrayList<InternalMutationLogEntry>(other.entries.size());
      for (InternalMutationLogEntry other_element : other.entries) {
        __this__entries.add(new InternalMutationLogEntry(other_element));
      }
      this.entries = __this__entries;
    }
  }

  public InternalMutationLogGroup deepCopy() {
    return new InternalMutationLogGroup(this);
  }

  @Override
  public void clear() {
    this.developerId = null;
    this.originalTableName = null;
    this.entries = null;
  }

  /**
   * developerId
   */
  public String getDeveloperId() {
    return this.developerId;
  }

  /**
   * developerId
   */
  public InternalMutationLogGroup setDeveloperId(String developerId) {
    this.developerId = developerId;
    return this;
  }

  public void unsetDeveloperId() {
    this.developerId = null;
  }

  /** Returns true if field developerId is set (has been assigned a value) and false otherwise */
  public boolean isSetDeveloperId() {
    return this.developerId != null;
  }

  public void setDeveloperIdIsSet(boolean value) {
    if (!value) {
      this.developerId = null;
    }
  }

  /**
   * sds tableName
   */
  public String getOriginalTableName() {
    return this.originalTableName;
  }

  /**
   * sds tableName
   */
  public InternalMutationLogGroup setOriginalTableName(String originalTableName) {
    this.originalTableName = originalTableName;
    return this;
  }

  public void unsetOriginalTableName() {
    this.originalTableName = null;
  }

  /** Returns true if field originalTableName is set (has been assigned a value) and false otherwise */
  public boolean isSetOriginalTableName() {
    return this.originalTableName != null;
  }

  public void setOriginalTableNameIsSet(boolean value) {
    if (!value) {
      this.originalTableName = null;
    }
  }

  public int getEntriesSize() {
    return (this.entries == null) ? 0 : this.entries.size();
  }

  public java.util.Iterator<InternalMutationLogEntry> getEntriesIterator() {
    return (this.entries == null) ? null : this.entries.iterator();
  }

  public void addToEntries(InternalMutationLogEntry elem) {
    if (this.entries == null) {
      this.entries = new ArrayList<InternalMutationLogEntry>();
    }
    this.entries.add(elem);
  }

  /**
   * mutation long entries
   */
  public List<InternalMutationLogEntry> getEntries() {
    return this.entries;
  }

  /**
   * mutation long entries
   */
  public InternalMutationLogGroup setEntries(List<InternalMutationLogEntry> entries) {
    this.entries = entries;
    return this;
  }

  public void unsetEntries() {
    this.entries = null;
  }

  /** Returns true if field entries is set (has been assigned a value) and false otherwise */
  public boolean isSetEntries() {
    return this.entries != null;
  }

  public void setEntriesIsSet(boolean value) {
    if (!value) {
      this.entries = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case DEVELOPER_ID:
      if (value == null) {
        unsetDeveloperId();
      } else {
        setDeveloperId((String)value);
      }
      break;

    case ORIGINAL_TABLE_NAME:
      if (value == null) {
        unsetOriginalTableName();
      } else {
        setOriginalTableName((String)value);
      }
      break;

    case ENTRIES:
      if (value == null) {
        unsetEntries();
      } else {
        setEntries((List<InternalMutationLogEntry>)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case DEVELOPER_ID:
      return getDeveloperId();

    case ORIGINAL_TABLE_NAME:
      return getOriginalTableName();

    case ENTRIES:
      return getEntries();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case DEVELOPER_ID:
      return isSetDeveloperId();
    case ORIGINAL_TABLE_NAME:
      return isSetOriginalTableName();
    case ENTRIES:
      return isSetEntries();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof InternalMutationLogGroup)
      return this.equals((InternalMutationLogGroup)that);
    return false;
  }

  public boolean equals(InternalMutationLogGroup that) {
    if (that == null)
      return false;

    boolean this_present_developerId = true && this.isSetDeveloperId();
    boolean that_present_developerId = true && that.isSetDeveloperId();
    if (this_present_developerId || that_present_developerId) {
      if (!(this_present_developerId && that_present_developerId))
        return false;
      if (!this.developerId.equals(that.developerId))
        return false;
    }

    boolean this_present_originalTableName = true && this.isSetOriginalTableName();
    boolean that_present_originalTableName = true && that.isSetOriginalTableName();
    if (this_present_originalTableName || that_present_originalTableName) {
      if (!(this_present_originalTableName && that_present_originalTableName))
        return false;
      if (!this.originalTableName.equals(that.originalTableName))
        return false;
    }

    boolean this_present_entries = true && this.isSetEntries();
    boolean that_present_entries = true && that.isSetEntries();
    if (this_present_entries || that_present_entries) {
      if (!(this_present_entries && that_present_entries))
        return false;
      if (!this.entries.equals(that.entries))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_developerId = true && (isSetDeveloperId());
    list.add(present_developerId);
    if (present_developerId)
      list.add(developerId);

    boolean present_originalTableName = true && (isSetOriginalTableName());
    list.add(present_originalTableName);
    if (present_originalTableName)
      list.add(originalTableName);

    boolean present_entries = true && (isSetEntries());
    list.add(present_entries);
    if (present_entries)
      list.add(entries);

    return list.hashCode();
  }

  @Override
  public int compareTo(InternalMutationLogGroup other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetDeveloperId()).compareTo(other.isSetDeveloperId());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetDeveloperId()) {
      lastComparison = libthrift091.TBaseHelper.compareTo(this.developerId, other.developerId);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetOriginalTableName()).compareTo(other.isSetOriginalTableName());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetOriginalTableName()) {
      lastComparison = libthrift091.TBaseHelper.compareTo(this.originalTableName, other.originalTableName);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetEntries()).compareTo(other.isSetEntries());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetEntries()) {
      lastComparison = libthrift091.TBaseHelper.compareTo(this.entries, other.entries);
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
    StringBuilder sb = new StringBuilder("InternalMutationLogGroup(");
    boolean first = true;

    if (isSetDeveloperId()) {
      sb.append("developerId:");
      if (this.developerId == null) {
        sb.append("null");
      } else {
        sb.append(this.developerId);
      }
      first = false;
    }
    if (isSetOriginalTableName()) {
      if (!first) sb.append(", ");
      sb.append("originalTableName:");
      if (this.originalTableName == null) {
        sb.append("null");
      } else {
        sb.append(this.originalTableName);
      }
      first = false;
    }
    if (isSetEntries()) {
      if (!first) sb.append(", ");
      sb.append("entries:");
      if (this.entries == null) {
        sb.append("null");
      } else {
        sb.append(this.entries);
      }
      first = false;
    }
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

  private static class InternalMutationLogGroupStandardSchemeFactory implements SchemeFactory {
    public InternalMutationLogGroupStandardScheme getScheme() {
      return new InternalMutationLogGroupStandardScheme();
    }
  }

  private static class InternalMutationLogGroupStandardScheme extends StandardScheme<InternalMutationLogGroup> {

    public void read(libthrift091.protocol.TProtocol iprot, InternalMutationLogGroup struct) throws libthrift091.TException {
      libthrift091.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == libthrift091.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // DEVELOPER_ID
            if (schemeField.type == libthrift091.protocol.TType.STRING) {
              struct.developerId = iprot.readString();
              struct.setDeveloperIdIsSet(true);
            } else { 
              libthrift091.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // ORIGINAL_TABLE_NAME
            if (schemeField.type == libthrift091.protocol.TType.STRING) {
              struct.originalTableName = iprot.readString();
              struct.setOriginalTableNameIsSet(true);
            } else { 
              libthrift091.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // ENTRIES
            if (schemeField.type == libthrift091.protocol.TType.LIST) {
              {
                libthrift091.protocol.TList _list394 = iprot.readListBegin();
                struct.entries = new ArrayList<InternalMutationLogEntry>(_list394.size);
                InternalMutationLogEntry _elem395;
                for (int _i396 = 0; _i396 < _list394.size; ++_i396)
                {
                  _elem395 = new InternalMutationLogEntry();
                  _elem395.read(iprot);
                  struct.entries.add(_elem395);
                }
                iprot.readListEnd();
              }
              struct.setEntriesIsSet(true);
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

    public void write(libthrift091.protocol.TProtocol oprot, InternalMutationLogGroup struct) throws libthrift091.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.developerId != null) {
        if (struct.isSetDeveloperId()) {
          oprot.writeFieldBegin(DEVELOPER_ID_FIELD_DESC);
          oprot.writeString(struct.developerId);
          oprot.writeFieldEnd();
        }
      }
      if (struct.originalTableName != null) {
        if (struct.isSetOriginalTableName()) {
          oprot.writeFieldBegin(ORIGINAL_TABLE_NAME_FIELD_DESC);
          oprot.writeString(struct.originalTableName);
          oprot.writeFieldEnd();
        }
      }
      if (struct.entries != null) {
        if (struct.isSetEntries()) {
          oprot.writeFieldBegin(ENTRIES_FIELD_DESC);
          {
            oprot.writeListBegin(new libthrift091.protocol.TList(libthrift091.protocol.TType.STRUCT, struct.entries.size()));
            for (InternalMutationLogEntry _iter397 : struct.entries)
            {
              _iter397.write(oprot);
            }
            oprot.writeListEnd();
          }
          oprot.writeFieldEnd();
        }
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class InternalMutationLogGroupTupleSchemeFactory implements SchemeFactory {
    public InternalMutationLogGroupTupleScheme getScheme() {
      return new InternalMutationLogGroupTupleScheme();
    }
  }

  private static class InternalMutationLogGroupTupleScheme extends TupleScheme<InternalMutationLogGroup> {

    @Override
    public void write(libthrift091.protocol.TProtocol prot, InternalMutationLogGroup struct) throws libthrift091.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetDeveloperId()) {
        optionals.set(0);
      }
      if (struct.isSetOriginalTableName()) {
        optionals.set(1);
      }
      if (struct.isSetEntries()) {
        optionals.set(2);
      }
      oprot.writeBitSet(optionals, 3);
      if (struct.isSetDeveloperId()) {
        oprot.writeString(struct.developerId);
      }
      if (struct.isSetOriginalTableName()) {
        oprot.writeString(struct.originalTableName);
      }
      if (struct.isSetEntries()) {
        {
          oprot.writeI32(struct.entries.size());
          for (InternalMutationLogEntry _iter398 : struct.entries)
          {
            _iter398.write(oprot);
          }
        }
      }
    }

    @Override
    public void read(libthrift091.protocol.TProtocol prot, InternalMutationLogGroup struct) throws libthrift091.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(3);
      if (incoming.get(0)) {
        struct.developerId = iprot.readString();
        struct.setDeveloperIdIsSet(true);
      }
      if (incoming.get(1)) {
        struct.originalTableName = iprot.readString();
        struct.setOriginalTableNameIsSet(true);
      }
      if (incoming.get(2)) {
        {
          libthrift091.protocol.TList _list399 = new libthrift091.protocol.TList(libthrift091.protocol.TType.STRUCT, iprot.readI32());
          struct.entries = new ArrayList<InternalMutationLogEntry>(_list399.size);
          InternalMutationLogEntry _elem400;
          for (int _i401 = 0; _i401 < _list399.size; ++_i401)
          {
            _elem400 = new InternalMutationLogEntry();
            _elem400.read(iprot);
            struct.entries.add(_elem400);
          }
        }
        struct.setEntriesIsSet(true);
      }
    }
  }

}
