/**
 * Autogenerated by Thrift Compiler (0.9.2)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package logging.client;
import org.apache.thrift.scheme.IScheme;
import org.apache.thrift.scheme.SchemeFactory;
import org.apache.thrift.scheme.StandardScheme;

import org.apache.thrift.scheme.TupleScheme;
import org.apache.thrift.protocol.TTupleProtocol;
import org.apache.thrift.protocol.TProtocolException;
import org.apache.thrift.EncodingUtils;
import org.apache.thrift.TException;
import org.apache.thrift.async.AsyncMethodCallback;
import org.apache.thrift.server.AbstractNonblockingServer.*;
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
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked"})
@Generated(value = "Autogenerated by Thrift Compiler (0.9.2)", date = "2015-10-11")
public class TLogEntity implements org.apache.thrift.TBase<TLogEntity, TLogEntity._Fields>, java.io.Serializable, Cloneable, Comparable<TLogEntity> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("TLogEntity");

  private static final org.apache.thrift.protocol.TField TITLE_FIELD_DESC = new org.apache.thrift.protocol.TField("Title", org.apache.thrift.protocol.TType.STRING, (short)1);
  private static final org.apache.thrift.protocol.TField MESSAGE_FIELD_DESC = new org.apache.thrift.protocol.TField("Message", org.apache.thrift.protocol.TType.STRING, (short)2);
  private static final org.apache.thrift.protocol.TField LEVEL_FIELD_DESC = new org.apache.thrift.protocol.TField("Level", org.apache.thrift.protocol.TType.BYTE, (short)3);
  private static final org.apache.thrift.protocol.TField TIME_FIELD_DESC = new org.apache.thrift.protocol.TField("Time", org.apache.thrift.protocol.TType.I64, (short)4);
  private static final org.apache.thrift.protocol.TField SOURCE_FIELD_DESC = new org.apache.thrift.protocol.TField("Source", org.apache.thrift.protocol.TType.STRING, (short)5);
  private static final org.apache.thrift.protocol.TField THREAD_FIELD_DESC = new org.apache.thrift.protocol.TField("Thread", org.apache.thrift.protocol.TType.I32, (short)6);
  private static final org.apache.thrift.protocol.TField TAGS_FIELD_DESC = new org.apache.thrift.protocol.TField("Tags", org.apache.thrift.protocol.TType.MAP, (short)7);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new TLogEntityStandardSchemeFactory());
    schemes.put(TupleScheme.class, new TLogEntityTupleSchemeFactory());
  }

  public String Title; // required
  public String Message; // required
  public byte Level; // required
  public long Time; // required
  public String Source; // required
  public int Thread; // required
  public Map<String,String> Tags; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    TITLE((short)1, "Title"),
    MESSAGE((short)2, "Message"),
    LEVEL((short)3, "Level"),
    TIME((short)4, "Time"),
    SOURCE((short)5, "Source"),
    THREAD((short)6, "Thread"),
    TAGS((short)7, "Tags");

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
        case 1: // TITLE
          return TITLE;
        case 2: // MESSAGE
          return MESSAGE;
        case 3: // LEVEL
          return LEVEL;
        case 4: // TIME
          return TIME;
        case 5: // SOURCE
          return SOURCE;
        case 6: // THREAD
          return THREAD;
        case 7: // TAGS
          return TAGS;
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
  private static final int __LEVEL_ISSET_ID = 0;
  private static final int __TIME_ISSET_ID = 1;
  private static final int __THREAD_ISSET_ID = 2;
  private byte __isset_bitfield = 0;
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.TITLE, new org.apache.thrift.meta_data.FieldMetaData("Title", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.MESSAGE, new org.apache.thrift.meta_data.FieldMetaData("Message", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.LEVEL, new org.apache.thrift.meta_data.FieldMetaData("Level", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.BYTE)));
    tmpMap.put(_Fields.TIME, new org.apache.thrift.meta_data.FieldMetaData("Time", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64)));
    tmpMap.put(_Fields.SOURCE, new org.apache.thrift.meta_data.FieldMetaData("Source", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.THREAD, new org.apache.thrift.meta_data.FieldMetaData("Thread", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    tmpMap.put(_Fields.TAGS, new org.apache.thrift.meta_data.FieldMetaData("Tags", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.MapMetaData(org.apache.thrift.protocol.TType.MAP, 
            new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING), 
            new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING))));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(TLogEntity.class, metaDataMap);
  }

  public TLogEntity() {
  }

  public TLogEntity(
    String Title,
    String Message,
    byte Level,
    long Time,
    String Source,
    int Thread,
    Map<String,String> Tags)
  {
    this();
    this.Title = Title;
    this.Message = Message;
    this.Level = Level;
    setLevelIsSet(true);
    this.Time = Time;
    setTimeIsSet(true);
    this.Source = Source;
    this.Thread = Thread;
    setThreadIsSet(true);
    this.Tags = Tags;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public TLogEntity(TLogEntity other) {
    __isset_bitfield = other.__isset_bitfield;
    if (other.isSetTitle()) {
      this.Title = other.Title;
    }
    if (other.isSetMessage()) {
      this.Message = other.Message;
    }
    this.Level = other.Level;
    this.Time = other.Time;
    if (other.isSetSource()) {
      this.Source = other.Source;
    }
    this.Thread = other.Thread;
    if (other.isSetTags()) {
      Map<String,String> __this__Tags = new HashMap<String,String>(other.Tags);
      this.Tags = __this__Tags;
    }
  }

  public TLogEntity deepCopy() {
    return new TLogEntity(this);
  }

//  @Override
  public void clear() {
    this.Title = null;
    this.Message = null;
    setLevelIsSet(false);
    this.Level = 0;
    setTimeIsSet(false);
    this.Time = 0;
    this.Source = null;
    setThreadIsSet(false);
    this.Thread = 0;
    this.Tags = null;
  }

  public String getTitle() {
    return this.Title;
  }

  public TLogEntity setTitle(String Title) {
    this.Title = Title;
    return this;
  }

  public void unsetTitle() {
    this.Title = null;
  }

  /** Returns true if field Title is set (has been assigned a value) and false otherwise */
  public boolean isSetTitle() {
    return this.Title != null;
  }

  public void setTitleIsSet(boolean value) {
    if (!value) {
      this.Title = null;
    }
  }

  public String getMessage() {
    return this.Message;
  }

  public TLogEntity setMessage(String Message) {
    this.Message = Message;
    return this;
  }

  public void unsetMessage() {
    this.Message = null;
  }

  /** Returns true if field Message is set (has been assigned a value) and false otherwise */
  public boolean isSetMessage() {
    return this.Message != null;
  }

  public void setMessageIsSet(boolean value) {
    if (!value) {
      this.Message = null;
    }
  }

  public byte getLevel() {
    return this.Level;
  }

  public TLogEntity setLevel(byte Level) {
    this.Level = Level;
    setLevelIsSet(true);
    return this;
  }

  public void unsetLevel() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __LEVEL_ISSET_ID);
  }

  /** Returns true if field Level is set (has been assigned a value) and false otherwise */
  public boolean isSetLevel() {
    return EncodingUtils.testBit(__isset_bitfield, __LEVEL_ISSET_ID);
  }

  public void setLevelIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __LEVEL_ISSET_ID, value);
  }

  public long getTime() {
    return this.Time;
  }

  public TLogEntity setTime(long Time) {
    this.Time = Time;
    setTimeIsSet(true);
    return this;
  }

  public void unsetTime() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __TIME_ISSET_ID);
  }

  /** Returns true if field Time is set (has been assigned a value) and false otherwise */
  public boolean isSetTime() {
    return EncodingUtils.testBit(__isset_bitfield, __TIME_ISSET_ID);
  }

  public void setTimeIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __TIME_ISSET_ID, value);
  }

  public String getSource() {
    return this.Source;
  }

  public TLogEntity setSource(String Source) {
    this.Source = Source;
    return this;
  }

  public void unsetSource() {
    this.Source = null;
  }

  /** Returns true if field Source is set (has been assigned a value) and false otherwise */
  public boolean isSetSource() {
    return this.Source != null;
  }

  public void setSourceIsSet(boolean value) {
    if (!value) {
      this.Source = null;
    }
  }

  public int getThread() {
    return this.Thread;
  }

  public TLogEntity setThread(int Thread) {
    this.Thread = Thread;
    setThreadIsSet(true);
    return this;
  }

  public void unsetThread() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __THREAD_ISSET_ID);
  }

  /** Returns true if field Thread is set (has been assigned a value) and false otherwise */
  public boolean isSetThread() {
    return EncodingUtils.testBit(__isset_bitfield, __THREAD_ISSET_ID);
  }

  public void setThreadIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __THREAD_ISSET_ID, value);
  }

  public int getTagsSize() {
    return (this.Tags == null) ? 0 : this.Tags.size();
  }

  public void putToTags(String key, String val) {
    if (this.Tags == null) {
      this.Tags = new HashMap<String,String>();
    }
    this.Tags.put(key, val);
  }

  public Map<String,String> getTags() {
    return this.Tags;
  }

  public TLogEntity setTags(Map<String,String> Tags) {
    this.Tags = Tags;
    return this;
  }

  public void unsetTags() {
    this.Tags = null;
  }

  /** Returns true if field Tags is set (has been assigned a value) and false otherwise */
  public boolean isSetTags() {
    return this.Tags != null;
  }

  public void setTagsIsSet(boolean value) {
    if (!value) {
      this.Tags = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case TITLE:
      if (value == null) {
        unsetTitle();
      } else {
        setTitle((String)value);
      }
      break;

    case MESSAGE:
      if (value == null) {
        unsetMessage();
      } else {
        setMessage((String)value);
      }
      break;

    case LEVEL:
      if (value == null) {
        unsetLevel();
      } else {
        setLevel((Byte)value);
      }
      break;

    case TIME:
      if (value == null) {
        unsetTime();
      } else {
        setTime((Long)value);
      }
      break;

    case SOURCE:
      if (value == null) {
        unsetSource();
      } else {
        setSource((String)value);
      }
      break;

    case THREAD:
      if (value == null) {
        unsetThread();
      } else {
        setThread((Integer)value);
      }
      break;

    case TAGS:
      if (value == null) {
        unsetTags();
      } else {
        setTags((Map<String,String>)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case TITLE:
      return getTitle();

    case MESSAGE:
      return getMessage();

    case LEVEL:
      return Byte.valueOf(getLevel());

    case TIME:
      return Long.valueOf(getTime());

    case SOURCE:
      return getSource();

    case THREAD:
      return Integer.valueOf(getThread());

    case TAGS:
      return getTags();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case TITLE:
      return isSetTitle();
    case MESSAGE:
      return isSetMessage();
    case LEVEL:
      return isSetLevel();
    case TIME:
      return isSetTime();
    case SOURCE:
      return isSetSource();
    case THREAD:
      return isSetThread();
    case TAGS:
      return isSetTags();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof TLogEntity)
      return this.equals((TLogEntity)that);
    return false;
  }

  public boolean equals(TLogEntity that) {
    if (that == null)
      return false;

    boolean this_present_Title = true && this.isSetTitle();
    boolean that_present_Title = true && that.isSetTitle();
    if (this_present_Title || that_present_Title) {
      if (!(this_present_Title && that_present_Title))
        return false;
      if (!this.Title.equals(that.Title))
        return false;
    }

    boolean this_present_Message = true && this.isSetMessage();
    boolean that_present_Message = true && that.isSetMessage();
    if (this_present_Message || that_present_Message) {
      if (!(this_present_Message && that_present_Message))
        return false;
      if (!this.Message.equals(that.Message))
        return false;
    }

    boolean this_present_Level = true;
    boolean that_present_Level = true;
    if (this_present_Level || that_present_Level) {
      if (!(this_present_Level && that_present_Level))
        return false;
      if (this.Level != that.Level)
        return false;
    }

    boolean this_present_Time = true;
    boolean that_present_Time = true;
    if (this_present_Time || that_present_Time) {
      if (!(this_present_Time && that_present_Time))
        return false;
      if (this.Time != that.Time)
        return false;
    }

    boolean this_present_Source = true && this.isSetSource();
    boolean that_present_Source = true && that.isSetSource();
    if (this_present_Source || that_present_Source) {
      if (!(this_present_Source && that_present_Source))
        return false;
      if (!this.Source.equals(that.Source))
        return false;
    }

    boolean this_present_Thread = true;
    boolean that_present_Thread = true;
    if (this_present_Thread || that_present_Thread) {
      if (!(this_present_Thread && that_present_Thread))
        return false;
      if (this.Thread != that.Thread)
        return false;
    }

    boolean this_present_Tags = true && this.isSetTags();
    boolean that_present_Tags = true && that.isSetTags();
    if (this_present_Tags || that_present_Tags) {
      if (!(this_present_Tags && that_present_Tags))
        return false;
      if (!this.Tags.equals(that.Tags))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_Title = true && (isSetTitle());
    list.add(present_Title);
    if (present_Title)
      list.add(Title);

    boolean present_Message = true && (isSetMessage());
    list.add(present_Message);
    if (present_Message)
      list.add(Message);

    boolean present_Level = true;
    list.add(present_Level);
    if (present_Level)
      list.add(Level);

    boolean present_Time = true;
    list.add(present_Time);
    if (present_Time)
      list.add(Time);

    boolean present_Source = true && (isSetSource());
    list.add(present_Source);
    if (present_Source)
      list.add(Source);

    boolean present_Thread = true;
    list.add(present_Thread);
    if (present_Thread)
      list.add(Thread);

    boolean present_Tags = true && (isSetTags());
    list.add(present_Tags);
    if (present_Tags)
      list.add(Tags);

    return list.hashCode();
  }

//  @Override
  public int compareTo(TLogEntity other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetTitle()).compareTo(other.isSetTitle());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetTitle()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.Title, other.Title);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetMessage()).compareTo(other.isSetMessage());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetMessage()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.Message, other.Message);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetLevel()).compareTo(other.isSetLevel());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetLevel()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.Level, other.Level);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetTime()).compareTo(other.isSetTime());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetTime()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.Time, other.Time);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetSource()).compareTo(other.isSetSource());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetSource()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.Source, other.Source);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetThread()).compareTo(other.isSetThread());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetThread()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.Thread, other.Thread);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetTags()).compareTo(other.isSetTags());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetTags()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.Tags, other.Tags);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }

  public void read(org.apache.thrift.protocol.TProtocol iprot) throws org.apache.thrift.TException {
    schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
  }

  public void write(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
    schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder("TLogEntity(");
    boolean first = true;

    sb.append("Title:");
    if (this.Title == null) {
      sb.append("null");
    } else {
      sb.append(this.Title);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("Message:");
    if (this.Message == null) {
      sb.append("null");
    } else {
      sb.append(this.Message);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("Level:");
    sb.append(this.Level);
    first = false;
    if (!first) sb.append(", ");
    sb.append("Time:");
    sb.append(this.Time);
    first = false;
    if (!first) sb.append(", ");
    sb.append("Source:");
    if (this.Source == null) {
      sb.append("null");
    } else {
      sb.append(this.Source);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("Thread:");
    sb.append(this.Thread);
    first = false;
    if (!first) sb.append(", ");
    sb.append("Tags:");
    if (this.Tags == null) {
      sb.append("null");
    } else {
      sb.append(this.Tags);
    }
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    // check for sub-struct validity
  }

  private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
    try {
      write(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(out)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, ClassNotFoundException {
    try {
      // it doesn't seem like you should have to do this, but java serialization is wacky, and doesn't call the default constructor.
      __isset_bitfield = 0;
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class TLogEntityStandardSchemeFactory implements SchemeFactory {
    public TLogEntityStandardScheme getScheme() {
      return new TLogEntityStandardScheme();
    }
  }

  private static class TLogEntityStandardScheme extends StandardScheme<TLogEntity> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, TLogEntity struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // TITLE
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.Title = iprot.readString();
              struct.setTitleIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // MESSAGE
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.Message = iprot.readString();
              struct.setMessageIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // LEVEL
            if (schemeField.type == org.apache.thrift.protocol.TType.BYTE) {
              struct.Level = iprot.readByte();
              struct.setLevelIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // TIME
            if (schemeField.type == org.apache.thrift.protocol.TType.I64) {
              struct.Time = iprot.readI64();
              struct.setTimeIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 5: // SOURCE
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.Source = iprot.readString();
              struct.setSourceIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 6: // THREAD
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.Thread = iprot.readI32();
              struct.setThreadIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 7: // TAGS
            if (schemeField.type == org.apache.thrift.protocol.TType.MAP) {
              {
                org.apache.thrift.protocol.TMap _map0 = iprot.readMapBegin();
                struct.Tags = new HashMap<String,String>(2*_map0.size);
                String _key1;
                String _val2;
                for (int _i3 = 0; _i3 < _map0.size; ++_i3)
                {
                  _key1 = iprot.readString();
                  _val2 = iprot.readString();
                  struct.Tags.put(_key1, _val2);
                }
                iprot.readMapEnd();
              }
              struct.setTagsIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          default:
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
        }
        iprot.readFieldEnd();
      }
      iprot.readStructEnd();

      // check for required fields of primitive type, which can't be checked in the validate method
      struct.validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot, TLogEntity struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.Title != null) {
        oprot.writeFieldBegin(TITLE_FIELD_DESC);
        oprot.writeString(struct.Title);
        oprot.writeFieldEnd();
      }
      if (struct.Message != null) {
        oprot.writeFieldBegin(MESSAGE_FIELD_DESC);
        oprot.writeString(struct.Message);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldBegin(LEVEL_FIELD_DESC);
      oprot.writeByte(struct.Level);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(TIME_FIELD_DESC);
      oprot.writeI64(struct.Time);
      oprot.writeFieldEnd();
      if (struct.Source != null) {
        oprot.writeFieldBegin(SOURCE_FIELD_DESC);
        oprot.writeString(struct.Source);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldBegin(THREAD_FIELD_DESC);
      oprot.writeI32(struct.Thread);
      oprot.writeFieldEnd();
      if (struct.Tags != null) {
        oprot.writeFieldBegin(TAGS_FIELD_DESC);
        {
          oprot.writeMapBegin(new org.apache.thrift.protocol.TMap(org.apache.thrift.protocol.TType.STRING, org.apache.thrift.protocol.TType.STRING, struct.Tags.size()));
          for (Map.Entry<String, String> _iter4 : struct.Tags.entrySet())
          {
            oprot.writeString(_iter4.getKey());
            oprot.writeString(_iter4.getValue());
          }
          oprot.writeMapEnd();
        }
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class TLogEntityTupleSchemeFactory implements SchemeFactory {
    public TLogEntityTupleScheme getScheme() {
      return new TLogEntityTupleScheme();
    }
  }

  private static class TLogEntityTupleScheme extends TupleScheme<TLogEntity> {

//    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, TLogEntity struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetTitle()) {
        optionals.set(0);
      }
      if (struct.isSetMessage()) {
        optionals.set(1);
      }
      if (struct.isSetLevel()) {
        optionals.set(2);
      }
      if (struct.isSetTime()) {
        optionals.set(3);
      }
      if (struct.isSetSource()) {
        optionals.set(4);
      }
      if (struct.isSetThread()) {
        optionals.set(5);
      }
      if (struct.isSetTags()) {
        optionals.set(6);
      }
      oprot.writeBitSet(optionals, 7);
      if (struct.isSetTitle()) {
        oprot.writeString(struct.Title);
      }
      if (struct.isSetMessage()) {
        oprot.writeString(struct.Message);
      }
      if (struct.isSetLevel()) {
        oprot.writeByte(struct.Level);
      }
      if (struct.isSetTime()) {
        oprot.writeI64(struct.Time);
      }
      if (struct.isSetSource()) {
        oprot.writeString(struct.Source);
      }
      if (struct.isSetThread()) {
        oprot.writeI32(struct.Thread);
      }
      if (struct.isSetTags()) {
        {
          oprot.writeI32(struct.Tags.size());
          for (Map.Entry<String, String> _iter5 : struct.Tags.entrySet())
          {
            oprot.writeString(_iter5.getKey());
            oprot.writeString(_iter5.getValue());
          }
        }
      }
    }

//    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, TLogEntity struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(7);
      if (incoming.get(0)) {
        struct.Title = iprot.readString();
        struct.setTitleIsSet(true);
      }
      if (incoming.get(1)) {
        struct.Message = iprot.readString();
        struct.setMessageIsSet(true);
      }
      if (incoming.get(2)) {
        struct.Level = iprot.readByte();
        struct.setLevelIsSet(true);
      }
      if (incoming.get(3)) {
        struct.Time = iprot.readI64();
        struct.setTimeIsSet(true);
      }
      if (incoming.get(4)) {
        struct.Source = iprot.readString();
        struct.setSourceIsSet(true);
      }
      if (incoming.get(5)) {
        struct.Thread = iprot.readI32();
        struct.setThreadIsSet(true);
      }
      if (incoming.get(6)) {
        {
          org.apache.thrift.protocol.TMap _map6 = new org.apache.thrift.protocol.TMap(org.apache.thrift.protocol.TType.STRING, org.apache.thrift.protocol.TType.STRING, iprot.readI32());
          struct.Tags = new HashMap<String,String>(2*_map6.size);
          String _key7;
          String _val8;
          for (int _i9 = 0; _i9 < _map6.size; ++_i9)
          {
            _key7 = iprot.readString();
            _val8 = iprot.readString();
            struct.Tags.put(_key7, _val8);
          }
        }
        struct.setTagsIsSet(true);
      }
    }
  }

}
