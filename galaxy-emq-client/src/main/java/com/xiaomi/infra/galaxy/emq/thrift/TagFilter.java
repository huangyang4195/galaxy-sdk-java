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
@Generated(value = "Autogenerated by Thrift Compiler (0.9.2)", date = "2017-7-3")
public class TagFilter implements libthrift091.TBase<TagFilter, TagFilter._Fields>, java.io.Serializable, Cloneable, Comparable<TagFilter> {
  private static final libthrift091.protocol.TStruct STRUCT_DESC = new libthrift091.protocol.TStruct("TagFilter");

  private static final libthrift091.protocol.TField ATTRIBUTES_FIELD_DESC = new libthrift091.protocol.TField("attributes", libthrift091.protocol.TType.MAP, (short)1);
  private static final libthrift091.protocol.TField OP_FIELD_DESC = new libthrift091.protocol.TField("op", libthrift091.protocol.TType.I32, (short)2);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new TagFilterStandardSchemeFactory());
    schemes.put(TupleScheme.class, new TagFilterTupleSchemeFactory());
  }

  public Map<String,com.xiaomi.infra.galaxy.emq.thrift.MessageAttribute> attributes; // required
  /**
   * 
   * @see LogicalOperator
   */
  public LogicalOperator op; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements libthrift091.TFieldIdEnum {
    ATTRIBUTES((short)1, "attributes"),
    /**
     * 
     * @see LogicalOperator
     */
    OP((short)2, "op");

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
        case 1: // ATTRIBUTES
          return ATTRIBUTES;
        case 2: // OP
          return OP;
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
    tmpMap.put(_Fields.ATTRIBUTES, new libthrift091.meta_data.FieldMetaData("attributes", libthrift091.TFieldRequirementType.REQUIRED, 
        new libthrift091.meta_data.MapMetaData(libthrift091.protocol.TType.MAP, 
            new libthrift091.meta_data.FieldValueMetaData(libthrift091.protocol.TType.STRING), 
            new libthrift091.meta_data.StructMetaData(libthrift091.protocol.TType.STRUCT, com.xiaomi.infra.galaxy.emq.thrift.MessageAttribute.class))));
    tmpMap.put(_Fields.OP, new libthrift091.meta_data.FieldMetaData("op", libthrift091.TFieldRequirementType.REQUIRED, 
        new libthrift091.meta_data.EnumMetaData(libthrift091.protocol.TType.ENUM, LogicalOperator.class)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    libthrift091.meta_data.FieldMetaData.addStructMetaDataMap(TagFilter.class, metaDataMap);
  }

  public TagFilter() {
  }

  public TagFilter(
    Map<String,com.xiaomi.infra.galaxy.emq.thrift.MessageAttribute> attributes,
    LogicalOperator op)
  {
    this();
    this.attributes = attributes;
    this.op = op;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public TagFilter(TagFilter other) {
    if (other.isSetAttributes()) {
      Map<String,com.xiaomi.infra.galaxy.emq.thrift.MessageAttribute> __this__attributes = new HashMap<String,com.xiaomi.infra.galaxy.emq.thrift.MessageAttribute>(other.attributes.size());
      for (Map.Entry<String, com.xiaomi.infra.galaxy.emq.thrift.MessageAttribute> other_element : other.attributes.entrySet()) {

        String other_element_key = other_element.getKey();
        com.xiaomi.infra.galaxy.emq.thrift.MessageAttribute other_element_value = other_element.getValue();

        String __this__attributes_copy_key = other_element_key;

        com.xiaomi.infra.galaxy.emq.thrift.MessageAttribute __this__attributes_copy_value = new com.xiaomi.infra.galaxy.emq.thrift.MessageAttribute(other_element_value);

        __this__attributes.put(__this__attributes_copy_key, __this__attributes_copy_value);
      }
      this.attributes = __this__attributes;
    }
    if (other.isSetOp()) {
      this.op = other.op;
    }
  }

  public TagFilter deepCopy() {
    return new TagFilter(this);
  }

  @Override
  public void clear() {
    this.attributes = null;
    this.op = null;
  }

  public int getAttributesSize() {
    return (this.attributes == null) ? 0 : this.attributes.size();
  }

  public void putToAttributes(String key, com.xiaomi.infra.galaxy.emq.thrift.MessageAttribute val) {
    if (this.attributes == null) {
      this.attributes = new HashMap<String,com.xiaomi.infra.galaxy.emq.thrift.MessageAttribute>();
    }
    this.attributes.put(key, val);
  }

  public Map<String,com.xiaomi.infra.galaxy.emq.thrift.MessageAttribute> getAttributes() {
    return this.attributes;
  }

  public TagFilter setAttributes(Map<String,com.xiaomi.infra.galaxy.emq.thrift.MessageAttribute> attributes) {
    this.attributes = attributes;
    return this;
  }

  public void unsetAttributes() {
    this.attributes = null;
  }

  /** Returns true if field attributes is set (has been assigned a value) and false otherwise */
  public boolean isSetAttributes() {
    return this.attributes != null;
  }

  public void setAttributesIsSet(boolean value) {
    if (!value) {
      this.attributes = null;
    }
  }

  /**
   * 
   * @see LogicalOperator
   */
  public LogicalOperator getOp() {
    return this.op;
  }

  /**
   * 
   * @see LogicalOperator
   */
  public TagFilter setOp(LogicalOperator op) {
    this.op = op;
    return this;
  }

  public void unsetOp() {
    this.op = null;
  }

  /** Returns true if field op is set (has been assigned a value) and false otherwise */
  public boolean isSetOp() {
    return this.op != null;
  }

  public void setOpIsSet(boolean value) {
    if (!value) {
      this.op = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case ATTRIBUTES:
      if (value == null) {
        unsetAttributes();
      } else {
        setAttributes((Map<String,com.xiaomi.infra.galaxy.emq.thrift.MessageAttribute>)value);
      }
      break;

    case OP:
      if (value == null) {
        unsetOp();
      } else {
        setOp((LogicalOperator)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case ATTRIBUTES:
      return getAttributes();

    case OP:
      return getOp();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case ATTRIBUTES:
      return isSetAttributes();
    case OP:
      return isSetOp();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof TagFilter)
      return this.equals((TagFilter)that);
    return false;
  }

  public boolean equals(TagFilter that) {
    if (that == null)
      return false;

    boolean this_present_attributes = true && this.isSetAttributes();
    boolean that_present_attributes = true && that.isSetAttributes();
    if (this_present_attributes || that_present_attributes) {
      if (!(this_present_attributes && that_present_attributes))
        return false;
      if (!this.attributes.equals(that.attributes))
        return false;
    }

    boolean this_present_op = true && this.isSetOp();
    boolean that_present_op = true && that.isSetOp();
    if (this_present_op || that_present_op) {
      if (!(this_present_op && that_present_op))
        return false;
      if (!this.op.equals(that.op))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_attributes = true && (isSetAttributes());
    list.add(present_attributes);
    if (present_attributes)
      list.add(attributes);

    boolean present_op = true && (isSetOp());
    list.add(present_op);
    if (present_op)
      list.add(op.getValue());

    return list.hashCode();
  }

  @Override
  public int compareTo(TagFilter other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetAttributes()).compareTo(other.isSetAttributes());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetAttributes()) {
      lastComparison = libthrift091.TBaseHelper.compareTo(this.attributes, other.attributes);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetOp()).compareTo(other.isSetOp());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetOp()) {
      lastComparison = libthrift091.TBaseHelper.compareTo(this.op, other.op);
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
    StringBuilder sb = new StringBuilder("TagFilter(");
    boolean first = true;

    sb.append("attributes:");
    if (this.attributes == null) {
      sb.append("null");
    } else {
      sb.append(this.attributes);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("op:");
    if (this.op == null) {
      sb.append("null");
    } else {
      sb.append(this.op);
    }
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws libthrift091.TException {
    // check for required fields
    if (attributes == null) {
      throw new libthrift091.protocol.TProtocolException("Required field 'attributes' was not present! Struct: " + toString());
    }
    if (op == null) {
      throw new libthrift091.protocol.TProtocolException("Required field 'op' was not present! Struct: " + toString());
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

  private static class TagFilterStandardSchemeFactory implements SchemeFactory {
    public TagFilterStandardScheme getScheme() {
      return new TagFilterStandardScheme();
    }
  }

  private static class TagFilterStandardScheme extends StandardScheme<TagFilter> {

    public void read(libthrift091.protocol.TProtocol iprot, TagFilter struct) throws libthrift091.TException {
      libthrift091.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == libthrift091.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // ATTRIBUTES
            if (schemeField.type == libthrift091.protocol.TType.MAP) {
              {
                libthrift091.protocol.TMap _map44 = iprot.readMapBegin();
                struct.attributes = new HashMap<String,com.xiaomi.infra.galaxy.emq.thrift.MessageAttribute>(2*_map44.size);
                String _key45;
                com.xiaomi.infra.galaxy.emq.thrift.MessageAttribute _val46;
                for (int _i47 = 0; _i47 < _map44.size; ++_i47)
                {
                  _key45 = iprot.readString();
                  _val46 = new com.xiaomi.infra.galaxy.emq.thrift.MessageAttribute();
                  _val46.read(iprot);
                  struct.attributes.put(_key45, _val46);
                }
                iprot.readMapEnd();
              }
              struct.setAttributesIsSet(true);
            } else { 
              libthrift091.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // OP
            if (schemeField.type == libthrift091.protocol.TType.I32) {
              struct.op = com.xiaomi.infra.galaxy.emq.thrift.LogicalOperator.findByValue(iprot.readI32());
              struct.setOpIsSet(true);
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

    public void write(libthrift091.protocol.TProtocol oprot, TagFilter struct) throws libthrift091.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.attributes != null) {
        oprot.writeFieldBegin(ATTRIBUTES_FIELD_DESC);
        {
          oprot.writeMapBegin(new libthrift091.protocol.TMap(libthrift091.protocol.TType.STRING, libthrift091.protocol.TType.STRUCT, struct.attributes.size()));
          for (Map.Entry<String, com.xiaomi.infra.galaxy.emq.thrift.MessageAttribute> _iter48 : struct.attributes.entrySet())
          {
            oprot.writeString(_iter48.getKey());
            _iter48.getValue().write(oprot);
          }
          oprot.writeMapEnd();
        }
        oprot.writeFieldEnd();
      }
      if (struct.op != null) {
        oprot.writeFieldBegin(OP_FIELD_DESC);
        oprot.writeI32(struct.op.getValue());
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class TagFilterTupleSchemeFactory implements SchemeFactory {
    public TagFilterTupleScheme getScheme() {
      return new TagFilterTupleScheme();
    }
  }

  private static class TagFilterTupleScheme extends TupleScheme<TagFilter> {

    @Override
    public void write(libthrift091.protocol.TProtocol prot, TagFilter struct) throws libthrift091.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      {
        oprot.writeI32(struct.attributes.size());
        for (Map.Entry<String, com.xiaomi.infra.galaxy.emq.thrift.MessageAttribute> _iter49 : struct.attributes.entrySet())
        {
          oprot.writeString(_iter49.getKey());
          _iter49.getValue().write(oprot);
        }
      }
      oprot.writeI32(struct.op.getValue());
    }

    @Override
    public void read(libthrift091.protocol.TProtocol prot, TagFilter struct) throws libthrift091.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      {
        libthrift091.protocol.TMap _map50 = new libthrift091.protocol.TMap(libthrift091.protocol.TType.STRING, libthrift091.protocol.TType.STRUCT, iprot.readI32());
        struct.attributes = new HashMap<String,com.xiaomi.infra.galaxy.emq.thrift.MessageAttribute>(2*_map50.size);
        String _key51;
        com.xiaomi.infra.galaxy.emq.thrift.MessageAttribute _val52;
        for (int _i53 = 0; _i53 < _map50.size; ++_i53)
        {
          _key51 = iprot.readString();
          _val52 = new com.xiaomi.infra.galaxy.emq.thrift.MessageAttribute();
          _val52.read(iprot);
          struct.attributes.put(_key51, _val52);
        }
      }
      struct.setAttributesIsSet(true);
      struct.op = com.xiaomi.infra.galaxy.emq.thrift.LogicalOperator.findByValue(iprot.readI32());
      struct.setOpIsSet(true);
    }
  }

}
