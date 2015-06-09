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
@Generated(value = "Autogenerated by Thrift Compiler (0.9.2)", date = "2015-6-9")
public class BatchResultItem implements libthrift091.TBase<BatchResultItem, BatchResultItem._Fields>, java.io.Serializable, Cloneable, Comparable<BatchResultItem> {
  private static final libthrift091.protocol.TStruct STRUCT_DESC = new libthrift091.protocol.TStruct("BatchResultItem");

  private static final libthrift091.protocol.TField ACTION_FIELD_DESC = new libthrift091.protocol.TField("action", libthrift091.protocol.TType.I32, (short)1);
  private static final libthrift091.protocol.TField SUCCESS_FIELD_DESC = new libthrift091.protocol.TField("success", libthrift091.protocol.TType.BOOL, (short)2);
  private static final libthrift091.protocol.TField RESULT_FIELD_DESC = new libthrift091.protocol.TField("result", libthrift091.protocol.TType.STRUCT, (short)3);
  private static final libthrift091.protocol.TField SERVICE_EXCEPTION_FIELD_DESC = new libthrift091.protocol.TField("serviceException", libthrift091.protocol.TType.STRUCT, (short)4);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new BatchResultItemStandardSchemeFactory());
    schemes.put(TupleScheme.class, new BatchResultItemTupleSchemeFactory());
  }

  /**
   * 操作类型
   * 
   * @see BatchOp
   */
  public BatchOp action; // optional
  /**
   * 是否成功执行，即无异常
   */
  public boolean success; // optional
  /**
   * 操作结果，操作成功时被设置
   */
  public Result result; // optional
  /**
   * 操作时发生的异常，操作失败时被设置
   */
  public com.xiaomi.infra.galaxy.sds.thrift.ServiceException serviceException; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements libthrift091.TFieldIdEnum {
    /**
     * 操作类型
     * 
     * @see BatchOp
     */
    ACTION((short)1, "action"),
    /**
     * 是否成功执行，即无异常
     */
    SUCCESS((short)2, "success"),
    /**
     * 操作结果，操作成功时被设置
     */
    RESULT((short)3, "result"),
    /**
     * 操作时发生的异常，操作失败时被设置
     */
    SERVICE_EXCEPTION((short)4, "serviceException");

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
        case 1: // ACTION
          return ACTION;
        case 2: // SUCCESS
          return SUCCESS;
        case 3: // RESULT
          return RESULT;
        case 4: // SERVICE_EXCEPTION
          return SERVICE_EXCEPTION;
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
  private static final int __SUCCESS_ISSET_ID = 0;
  private byte __isset_bitfield = 0;
  private static final _Fields optionals[] = {_Fields.ACTION,_Fields.SUCCESS,_Fields.RESULT,_Fields.SERVICE_EXCEPTION};
  public static final Map<_Fields, libthrift091.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, libthrift091.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, libthrift091.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.ACTION, new libthrift091.meta_data.FieldMetaData("action", libthrift091.TFieldRequirementType.OPTIONAL, 
        new libthrift091.meta_data.EnumMetaData(libthrift091.protocol.TType.ENUM, BatchOp.class)));
    tmpMap.put(_Fields.SUCCESS, new libthrift091.meta_data.FieldMetaData("success", libthrift091.TFieldRequirementType.OPTIONAL, 
        new libthrift091.meta_data.FieldValueMetaData(libthrift091.protocol.TType.BOOL)));
    tmpMap.put(_Fields.RESULT, new libthrift091.meta_data.FieldMetaData("result", libthrift091.TFieldRequirementType.OPTIONAL, 
        new libthrift091.meta_data.StructMetaData(libthrift091.protocol.TType.STRUCT, Result.class)));
    tmpMap.put(_Fields.SERVICE_EXCEPTION, new libthrift091.meta_data.FieldMetaData("serviceException", libthrift091.TFieldRequirementType.OPTIONAL, 
        new libthrift091.meta_data.FieldValueMetaData(libthrift091.protocol.TType.STRUCT)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    libthrift091.meta_data.FieldMetaData.addStructMetaDataMap(BatchResultItem.class, metaDataMap);
  }

  public BatchResultItem() {
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public BatchResultItem(BatchResultItem other) {
    __isset_bitfield = other.__isset_bitfield;
    if (other.isSetAction()) {
      this.action = other.action;
    }
    this.success = other.success;
    if (other.isSetResult()) {
      this.result = new Result(other.result);
    }
    if (other.isSetServiceException()) {
      this.serviceException = new com.xiaomi.infra.galaxy.sds.thrift.ServiceException(other.serviceException);
    }
  }

  public BatchResultItem deepCopy() {
    return new BatchResultItem(this);
  }

  @Override
  public void clear() {
    this.action = null;
    setSuccessIsSet(false);
    this.success = false;
    this.result = null;
    this.serviceException = null;
  }

  /**
   * 操作类型
   * 
   * @see BatchOp
   */
  public BatchOp getAction() {
    return this.action;
  }

  /**
   * 操作类型
   * 
   * @see BatchOp
   */
  public BatchResultItem setAction(BatchOp action) {
    this.action = action;
    return this;
  }

  public void unsetAction() {
    this.action = null;
  }

  /** Returns true if field action is set (has been assigned a value) and false otherwise */
  public boolean isSetAction() {
    return this.action != null;
  }

  public void setActionIsSet(boolean value) {
    if (!value) {
      this.action = null;
    }
  }

  /**
   * 是否成功执行，即无异常
   */
  public boolean isSuccess() {
    return this.success;
  }

  /**
   * 是否成功执行，即无异常
   */
  public BatchResultItem setSuccess(boolean success) {
    this.success = success;
    setSuccessIsSet(true);
    return this;
  }

  public void unsetSuccess() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __SUCCESS_ISSET_ID);
  }

  /** Returns true if field success is set (has been assigned a value) and false otherwise */
  public boolean isSetSuccess() {
    return EncodingUtils.testBit(__isset_bitfield, __SUCCESS_ISSET_ID);
  }

  public void setSuccessIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __SUCCESS_ISSET_ID, value);
  }

  /**
   * 操作结果，操作成功时被设置
   */
  public Result getResult() {
    return this.result;
  }

  /**
   * 操作结果，操作成功时被设置
   */
  public BatchResultItem setResult(Result result) {
    this.result = result;
    return this;
  }

  public void unsetResult() {
    this.result = null;
  }

  /** Returns true if field result is set (has been assigned a value) and false otherwise */
  public boolean isSetResult() {
    return this.result != null;
  }

  public void setResultIsSet(boolean value) {
    if (!value) {
      this.result = null;
    }
  }

  /**
   * 操作时发生的异常，操作失败时被设置
   */
  public com.xiaomi.infra.galaxy.sds.thrift.ServiceException getServiceException() {
    return this.serviceException;
  }

  /**
   * 操作时发生的异常，操作失败时被设置
   */
  public BatchResultItem setServiceException(com.xiaomi.infra.galaxy.sds.thrift.ServiceException serviceException) {
    this.serviceException = serviceException;
    return this;
  }

  public void unsetServiceException() {
    this.serviceException = null;
  }

  /** Returns true if field serviceException is set (has been assigned a value) and false otherwise */
  public boolean isSetServiceException() {
    return this.serviceException != null;
  }

  public void setServiceExceptionIsSet(boolean value) {
    if (!value) {
      this.serviceException = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case ACTION:
      if (value == null) {
        unsetAction();
      } else {
        setAction((BatchOp)value);
      }
      break;

    case SUCCESS:
      if (value == null) {
        unsetSuccess();
      } else {
        setSuccess((Boolean)value);
      }
      break;

    case RESULT:
      if (value == null) {
        unsetResult();
      } else {
        setResult((Result)value);
      }
      break;

    case SERVICE_EXCEPTION:
      if (value == null) {
        unsetServiceException();
      } else {
        setServiceException((com.xiaomi.infra.galaxy.sds.thrift.ServiceException)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case ACTION:
      return getAction();

    case SUCCESS:
      return Boolean.valueOf(isSuccess());

    case RESULT:
      return getResult();

    case SERVICE_EXCEPTION:
      return getServiceException();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case ACTION:
      return isSetAction();
    case SUCCESS:
      return isSetSuccess();
    case RESULT:
      return isSetResult();
    case SERVICE_EXCEPTION:
      return isSetServiceException();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof BatchResultItem)
      return this.equals((BatchResultItem)that);
    return false;
  }

  public boolean equals(BatchResultItem that) {
    if (that == null)
      return false;

    boolean this_present_action = true && this.isSetAction();
    boolean that_present_action = true && that.isSetAction();
    if (this_present_action || that_present_action) {
      if (!(this_present_action && that_present_action))
        return false;
      if (!this.action.equals(that.action))
        return false;
    }

    boolean this_present_success = true && this.isSetSuccess();
    boolean that_present_success = true && that.isSetSuccess();
    if (this_present_success || that_present_success) {
      if (!(this_present_success && that_present_success))
        return false;
      if (this.success != that.success)
        return false;
    }

    boolean this_present_result = true && this.isSetResult();
    boolean that_present_result = true && that.isSetResult();
    if (this_present_result || that_present_result) {
      if (!(this_present_result && that_present_result))
        return false;
      if (!this.result.equals(that.result))
        return false;
    }

    boolean this_present_serviceException = true && this.isSetServiceException();
    boolean that_present_serviceException = true && that.isSetServiceException();
    if (this_present_serviceException || that_present_serviceException) {
      if (!(this_present_serviceException && that_present_serviceException))
        return false;
      if (!this.serviceException.equals(that.serviceException))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_action = true && (isSetAction());
    list.add(present_action);
    if (present_action)
      list.add(action.getValue());

    boolean present_success = true && (isSetSuccess());
    list.add(present_success);
    if (present_success)
      list.add(success);

    boolean present_result = true && (isSetResult());
    list.add(present_result);
    if (present_result)
      list.add(result);

    boolean present_serviceException = true && (isSetServiceException());
    list.add(present_serviceException);
    if (present_serviceException)
      list.add(serviceException);

    return list.hashCode();
  }

  @Override
  public int compareTo(BatchResultItem other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetAction()).compareTo(other.isSetAction());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetAction()) {
      lastComparison = libthrift091.TBaseHelper.compareTo(this.action, other.action);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetSuccess()).compareTo(other.isSetSuccess());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetSuccess()) {
      lastComparison = libthrift091.TBaseHelper.compareTo(this.success, other.success);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetResult()).compareTo(other.isSetResult());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetResult()) {
      lastComparison = libthrift091.TBaseHelper.compareTo(this.result, other.result);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetServiceException()).compareTo(other.isSetServiceException());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetServiceException()) {
      lastComparison = libthrift091.TBaseHelper.compareTo(this.serviceException, other.serviceException);
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
    StringBuilder sb = new StringBuilder("BatchResultItem(");
    boolean first = true;

    if (isSetAction()) {
      sb.append("action:");
      if (this.action == null) {
        sb.append("null");
      } else {
        sb.append(this.action);
      }
      first = false;
    }
    if (isSetSuccess()) {
      if (!first) sb.append(", ");
      sb.append("success:");
      sb.append(this.success);
      first = false;
    }
    if (isSetResult()) {
      if (!first) sb.append(", ");
      sb.append("result:");
      if (this.result == null) {
        sb.append("null");
      } else {
        sb.append(this.result);
      }
      first = false;
    }
    if (isSetServiceException()) {
      if (!first) sb.append(", ");
      sb.append("serviceException:");
      if (this.serviceException == null) {
        sb.append("null");
      } else {
        sb.append(this.serviceException);
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
      // it doesn't seem like you should have to do this, but java serialization is wacky, and doesn't call the default constructor.
      __isset_bitfield = 0;
      read(new libthrift091.protocol.TCompactProtocol(new libthrift091.transport.TIOStreamTransport(in)));
    } catch (libthrift091.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class BatchResultItemStandardSchemeFactory implements SchemeFactory {
    public BatchResultItemStandardScheme getScheme() {
      return new BatchResultItemStandardScheme();
    }
  }

  private static class BatchResultItemStandardScheme extends StandardScheme<BatchResultItem> {

    public void read(libthrift091.protocol.TProtocol iprot, BatchResultItem struct) throws libthrift091.TException {
      libthrift091.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == libthrift091.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // ACTION
            if (schemeField.type == libthrift091.protocol.TType.I32) {
              struct.action = com.xiaomi.infra.galaxy.sds.thrift.BatchOp.findByValue(iprot.readI32());
              struct.setActionIsSet(true);
            } else { 
              libthrift091.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // SUCCESS
            if (schemeField.type == libthrift091.protocol.TType.BOOL) {
              struct.success = iprot.readBool();
              struct.setSuccessIsSet(true);
            } else { 
              libthrift091.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // RESULT
            if (schemeField.type == libthrift091.protocol.TType.STRUCT) {
              struct.result = new Result();
              struct.result.read(iprot);
              struct.setResultIsSet(true);
            } else { 
              libthrift091.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // SERVICE_EXCEPTION
            if (schemeField.type == libthrift091.protocol.TType.STRUCT) {
              struct.serviceException = new com.xiaomi.infra.galaxy.sds.thrift.ServiceException();
              struct.serviceException.read(iprot);
              struct.setServiceExceptionIsSet(true);
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

    public void write(libthrift091.protocol.TProtocol oprot, BatchResultItem struct) throws libthrift091.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.action != null) {
        if (struct.isSetAction()) {
          oprot.writeFieldBegin(ACTION_FIELD_DESC);
          oprot.writeI32(struct.action.getValue());
          oprot.writeFieldEnd();
        }
      }
      if (struct.isSetSuccess()) {
        oprot.writeFieldBegin(SUCCESS_FIELD_DESC);
        oprot.writeBool(struct.success);
        oprot.writeFieldEnd();
      }
      if (struct.result != null) {
        if (struct.isSetResult()) {
          oprot.writeFieldBegin(RESULT_FIELD_DESC);
          struct.result.write(oprot);
          oprot.writeFieldEnd();
        }
      }
      if (struct.serviceException != null) {
        if (struct.isSetServiceException()) {
          oprot.writeFieldBegin(SERVICE_EXCEPTION_FIELD_DESC);
          struct.serviceException.write(oprot);
          oprot.writeFieldEnd();
        }
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class BatchResultItemTupleSchemeFactory implements SchemeFactory {
    public BatchResultItemTupleScheme getScheme() {
      return new BatchResultItemTupleScheme();
    }
  }

  private static class BatchResultItemTupleScheme extends TupleScheme<BatchResultItem> {

    @Override
    public void write(libthrift091.protocol.TProtocol prot, BatchResultItem struct) throws libthrift091.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetAction()) {
        optionals.set(0);
      }
      if (struct.isSetSuccess()) {
        optionals.set(1);
      }
      if (struct.isSetResult()) {
        optionals.set(2);
      }
      if (struct.isSetServiceException()) {
        optionals.set(3);
      }
      oprot.writeBitSet(optionals, 4);
      if (struct.isSetAction()) {
        oprot.writeI32(struct.action.getValue());
      }
      if (struct.isSetSuccess()) {
        oprot.writeBool(struct.success);
      }
      if (struct.isSetResult()) {
        struct.result.write(oprot);
      }
      if (struct.isSetServiceException()) {
        struct.serviceException.write(oprot);
      }
    }

    @Override
    public void read(libthrift091.protocol.TProtocol prot, BatchResultItem struct) throws libthrift091.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(4);
      if (incoming.get(0)) {
        struct.action = com.xiaomi.infra.galaxy.sds.thrift.BatchOp.findByValue(iprot.readI32());
        struct.setActionIsSet(true);
      }
      if (incoming.get(1)) {
        struct.success = iprot.readBool();
        struct.setSuccessIsSet(true);
      }
      if (incoming.get(2)) {
        struct.result = new Result();
        struct.result.read(iprot);
        struct.setResultIsSet(true);
      }
      if (incoming.get(3)) {
        struct.serviceException = new com.xiaomi.infra.galaxy.sds.thrift.ServiceException();
        struct.serviceException.read(iprot);
        struct.setServiceExceptionIsSet(true);
      }
    }
  }

}

