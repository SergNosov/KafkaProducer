/**
 * Autogenerated by Avro
 *
 * DO NOT EDIT DIRECTLY
 */
package nlmk.l3.ccm.pgp;

import org.apache.avro.generic.GenericArray;
import org.apache.avro.specific.SpecificData;
import org.apache.avro.util.Utf8;
import org.apache.avro.message.BinaryMessageEncoder;
import org.apache.avro.message.BinaryMessageDecoder;
import org.apache.avro.message.SchemaStore;

@org.apache.avro.specific.AvroGenerated
public class RecordMetgrapData extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = 549972407107924572L;
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"RecordMetgrapData\",\"namespace\":\"nlmk.l3.ccm.pgp\",\"fields\":[{\"name\":\"metgrapCode\",\"type\":\"int\",\"doc\":\"Код характеристики\"},{\"name\":\"metgrapName\",\"type\":\"string\",\"doc\":\"Наименование характеристики\"},{\"name\":\"metgrapFormat\",\"type\":[\"null\",\"string\"],\"doc\":\"Формат передачи характеристики\",\"default\":null},{\"name\":\"metgrapValue\",\"type\":[\"null\",\"string\"],\"doc\":\"Значение характеристики\",\"default\":null},{\"name\":\"metgrapTypeCode\",\"type\":\"int\",\"doc\":\"Тип данных (1 - строка, 2 - число, 3 - дата)\"},{\"name\":\"metgrapMeasure\",\"type\":[\"null\",\"string\"],\"doc\":\"Единица измерения характеристики\",\"default\":null}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }

  private static SpecificData MODEL$ = new SpecificData();

  private static final BinaryMessageEncoder<RecordMetgrapData> ENCODER =
      new BinaryMessageEncoder<RecordMetgrapData>(MODEL$, SCHEMA$);

  private static final BinaryMessageDecoder<RecordMetgrapData> DECODER =
      new BinaryMessageDecoder<RecordMetgrapData>(MODEL$, SCHEMA$);

  /**
   * Return the BinaryMessageEncoder instance used by this class.
   * @return the message encoder used by this class
   */
  public static BinaryMessageEncoder<RecordMetgrapData> getEncoder() {
    return ENCODER;
  }

  /**
   * Return the BinaryMessageDecoder instance used by this class.
   * @return the message decoder used by this class
   */
  public static BinaryMessageDecoder<RecordMetgrapData> getDecoder() {
    return DECODER;
  }

  /**
   * Create a new BinaryMessageDecoder instance for this class that uses the specified {@link SchemaStore}.
   * @param resolver a {@link SchemaStore} used to find schemas by fingerprint
   * @return a BinaryMessageDecoder instance for this class backed by the given SchemaStore
   */
  public static BinaryMessageDecoder<RecordMetgrapData> createDecoder(SchemaStore resolver) {
    return new BinaryMessageDecoder<RecordMetgrapData>(MODEL$, SCHEMA$, resolver);
  }

  /**
   * Serializes this RecordMetgrapData to a ByteBuffer.
   * @return a buffer holding the serialized data for this instance
   * @throws java.io.IOException if this instance could not be serialized
   */
  public java.nio.ByteBuffer toByteBuffer() throws java.io.IOException {
    return ENCODER.encode(this);
  }

  /**
   * Deserializes a RecordMetgrapData from a ByteBuffer.
   * @param b a byte buffer holding serialized data for an instance of this class
   * @return a RecordMetgrapData instance decoded from the given buffer
   * @throws java.io.IOException if the given bytes could not be deserialized into an instance of this class
   */
  public static RecordMetgrapData fromByteBuffer(
      java.nio.ByteBuffer b) throws java.io.IOException {
    return DECODER.decode(b);
  }

  /** Код характеристики */
   private int metgrapCode;
  /** Наименование характеристики */
   private java.lang.CharSequence metgrapName;
  /** Формат передачи характеристики */
   private java.lang.CharSequence metgrapFormat;
  /** Значение характеристики */
   private java.lang.CharSequence metgrapValue;
  /** Тип данных (1 - строка, 2 - число, 3 - дата) */
   private int metgrapTypeCode;
  /** Единица измерения характеристики */
   private java.lang.CharSequence metgrapMeasure;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public RecordMetgrapData() {}

  /**
   * All-args constructor.
   * @param metgrapCode Код характеристики
   * @param metgrapName Наименование характеристики
   * @param metgrapFormat Формат передачи характеристики
   * @param metgrapValue Значение характеристики
   * @param metgrapTypeCode Тип данных (1 - строка, 2 - число, 3 - дата)
   * @param metgrapMeasure Единица измерения характеристики
   */
  public RecordMetgrapData(java.lang.Integer metgrapCode, java.lang.CharSequence metgrapName, java.lang.CharSequence metgrapFormat, java.lang.CharSequence metgrapValue, java.lang.Integer metgrapTypeCode, java.lang.CharSequence metgrapMeasure) {
    this.metgrapCode = metgrapCode;
    this.metgrapName = metgrapName;
    this.metgrapFormat = metgrapFormat;
    this.metgrapValue = metgrapValue;
    this.metgrapTypeCode = metgrapTypeCode;
    this.metgrapMeasure = metgrapMeasure;
  }

  public org.apache.avro.specific.SpecificData getSpecificData() { return MODEL$; }
  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call.
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return metgrapCode;
    case 1: return metgrapName;
    case 2: return metgrapFormat;
    case 3: return metgrapValue;
    case 4: return metgrapTypeCode;
    case 5: return metgrapMeasure;
    default: throw new IndexOutOfBoundsException("Invalid index: " + field$);
    }
  }

  // Used by DatumReader.  Applications should not call.
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: metgrapCode = (java.lang.Integer)value$; break;
    case 1: metgrapName = (java.lang.CharSequence)value$; break;
    case 2: metgrapFormat = (java.lang.CharSequence)value$; break;
    case 3: metgrapValue = (java.lang.CharSequence)value$; break;
    case 4: metgrapTypeCode = (java.lang.Integer)value$; break;
    case 5: metgrapMeasure = (java.lang.CharSequence)value$; break;
    default: throw new IndexOutOfBoundsException("Invalid index: " + field$);
    }
  }

  /**
   * Gets the value of the 'metgrapCode' field.
   * @return Код характеристики
   */
  public int getMetgrapCode() {
    return metgrapCode;
  }


  /**
   * Sets the value of the 'metgrapCode' field.
   * Код характеристики
   * @param value the value to set.
   */
  public void setMetgrapCode(int value) {
    this.metgrapCode = value;
  }

  /**
   * Gets the value of the 'metgrapName' field.
   * @return Наименование характеристики
   */
  public java.lang.CharSequence getMetgrapName() {
    return metgrapName;
  }


  /**
   * Sets the value of the 'metgrapName' field.
   * Наименование характеристики
   * @param value the value to set.
   */
  public void setMetgrapName(java.lang.CharSequence value) {
    this.metgrapName = value;
  }

  /**
   * Gets the value of the 'metgrapFormat' field.
   * @return Формат передачи характеристики
   */
  public java.lang.CharSequence getMetgrapFormat() {
    return metgrapFormat;
  }


  /**
   * Sets the value of the 'metgrapFormat' field.
   * Формат передачи характеристики
   * @param value the value to set.
   */
  public void setMetgrapFormat(java.lang.CharSequence value) {
    this.metgrapFormat = value;
  }

  /**
   * Gets the value of the 'metgrapValue' field.
   * @return Значение характеристики
   */
  public java.lang.CharSequence getMetgrapValue() {
    return metgrapValue;
  }


  /**
   * Sets the value of the 'metgrapValue' field.
   * Значение характеристики
   * @param value the value to set.
   */
  public void setMetgrapValue(java.lang.CharSequence value) {
    this.metgrapValue = value;
  }

  /**
   * Gets the value of the 'metgrapTypeCode' field.
   * @return Тип данных (1 - строка, 2 - число, 3 - дата)
   */
  public int getMetgrapTypeCode() {
    return metgrapTypeCode;
  }


  /**
   * Sets the value of the 'metgrapTypeCode' field.
   * Тип данных (1 - строка, 2 - число, 3 - дата)
   * @param value the value to set.
   */
  public void setMetgrapTypeCode(int value) {
    this.metgrapTypeCode = value;
  }

  /**
   * Gets the value of the 'metgrapMeasure' field.
   * @return Единица измерения характеристики
   */
  public java.lang.CharSequence getMetgrapMeasure() {
    return metgrapMeasure;
  }


  /**
   * Sets the value of the 'metgrapMeasure' field.
   * Единица измерения характеристики
   * @param value the value to set.
   */
  public void setMetgrapMeasure(java.lang.CharSequence value) {
    this.metgrapMeasure = value;
  }

  /**
   * Creates a new RecordMetgrapData RecordBuilder.
   * @return A new RecordMetgrapData RecordBuilder
   */
  public static nlmk.l3.ccm.pgp.RecordMetgrapData.Builder newBuilder() {
    return new nlmk.l3.ccm.pgp.RecordMetgrapData.Builder();
  }

  /**
   * Creates a new RecordMetgrapData RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new RecordMetgrapData RecordBuilder
   */
  public static nlmk.l3.ccm.pgp.RecordMetgrapData.Builder newBuilder(nlmk.l3.ccm.pgp.RecordMetgrapData.Builder other) {
    if (other == null) {
      return new nlmk.l3.ccm.pgp.RecordMetgrapData.Builder();
    } else {
      return new nlmk.l3.ccm.pgp.RecordMetgrapData.Builder(other);
    }
  }

  /**
   * Creates a new RecordMetgrapData RecordBuilder by copying an existing RecordMetgrapData instance.
   * @param other The existing instance to copy.
   * @return A new RecordMetgrapData RecordBuilder
   */
  public static nlmk.l3.ccm.pgp.RecordMetgrapData.Builder newBuilder(nlmk.l3.ccm.pgp.RecordMetgrapData other) {
    if (other == null) {
      return new nlmk.l3.ccm.pgp.RecordMetgrapData.Builder();
    } else {
      return new nlmk.l3.ccm.pgp.RecordMetgrapData.Builder(other);
    }
  }

  /**
   * RecordBuilder for RecordMetgrapData instances.
   */
  @org.apache.avro.specific.AvroGenerated
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<RecordMetgrapData>
    implements org.apache.avro.data.RecordBuilder<RecordMetgrapData> {

    /** Код характеристики */
    private int metgrapCode;
    /** Наименование характеристики */
    private java.lang.CharSequence metgrapName;
    /** Формат передачи характеристики */
    private java.lang.CharSequence metgrapFormat;
    /** Значение характеристики */
    private java.lang.CharSequence metgrapValue;
    /** Тип данных (1 - строка, 2 - число, 3 - дата) */
    private int metgrapTypeCode;
    /** Единица измерения характеристики */
    private java.lang.CharSequence metgrapMeasure;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(nlmk.l3.ccm.pgp.RecordMetgrapData.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.metgrapCode)) {
        this.metgrapCode = data().deepCopy(fields()[0].schema(), other.metgrapCode);
        fieldSetFlags()[0] = other.fieldSetFlags()[0];
      }
      if (isValidValue(fields()[1], other.metgrapName)) {
        this.metgrapName = data().deepCopy(fields()[1].schema(), other.metgrapName);
        fieldSetFlags()[1] = other.fieldSetFlags()[1];
      }
      if (isValidValue(fields()[2], other.metgrapFormat)) {
        this.metgrapFormat = data().deepCopy(fields()[2].schema(), other.metgrapFormat);
        fieldSetFlags()[2] = other.fieldSetFlags()[2];
      }
      if (isValidValue(fields()[3], other.metgrapValue)) {
        this.metgrapValue = data().deepCopy(fields()[3].schema(), other.metgrapValue);
        fieldSetFlags()[3] = other.fieldSetFlags()[3];
      }
      if (isValidValue(fields()[4], other.metgrapTypeCode)) {
        this.metgrapTypeCode = data().deepCopy(fields()[4].schema(), other.metgrapTypeCode);
        fieldSetFlags()[4] = other.fieldSetFlags()[4];
      }
      if (isValidValue(fields()[5], other.metgrapMeasure)) {
        this.metgrapMeasure = data().deepCopy(fields()[5].schema(), other.metgrapMeasure);
        fieldSetFlags()[5] = other.fieldSetFlags()[5];
      }
    }

    /**
     * Creates a Builder by copying an existing RecordMetgrapData instance
     * @param other The existing instance to copy.
     */
    private Builder(nlmk.l3.ccm.pgp.RecordMetgrapData other) {
      super(SCHEMA$);
      if (isValidValue(fields()[0], other.metgrapCode)) {
        this.metgrapCode = data().deepCopy(fields()[0].schema(), other.metgrapCode);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.metgrapName)) {
        this.metgrapName = data().deepCopy(fields()[1].schema(), other.metgrapName);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.metgrapFormat)) {
        this.metgrapFormat = data().deepCopy(fields()[2].schema(), other.metgrapFormat);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.metgrapValue)) {
        this.metgrapValue = data().deepCopy(fields()[3].schema(), other.metgrapValue);
        fieldSetFlags()[3] = true;
      }
      if (isValidValue(fields()[4], other.metgrapTypeCode)) {
        this.metgrapTypeCode = data().deepCopy(fields()[4].schema(), other.metgrapTypeCode);
        fieldSetFlags()[4] = true;
      }
      if (isValidValue(fields()[5], other.metgrapMeasure)) {
        this.metgrapMeasure = data().deepCopy(fields()[5].schema(), other.metgrapMeasure);
        fieldSetFlags()[5] = true;
      }
    }

    /**
      * Gets the value of the 'metgrapCode' field.
      * Код характеристики
      * @return The value.
      */
    public int getMetgrapCode() {
      return metgrapCode;
    }


    /**
      * Sets the value of the 'metgrapCode' field.
      * Код характеристики
      * @param value The value of 'metgrapCode'.
      * @return This builder.
      */
    public nlmk.l3.ccm.pgp.RecordMetgrapData.Builder setMetgrapCode(int value) {
      validate(fields()[0], value);
      this.metgrapCode = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /**
      * Checks whether the 'metgrapCode' field has been set.
      * Код характеристики
      * @return True if the 'metgrapCode' field has been set, false otherwise.
      */
    public boolean hasMetgrapCode() {
      return fieldSetFlags()[0];
    }


    /**
      * Clears the value of the 'metgrapCode' field.
      * Код характеристики
      * @return This builder.
      */
    public nlmk.l3.ccm.pgp.RecordMetgrapData.Builder clearMetgrapCode() {
      fieldSetFlags()[0] = false;
      return this;
    }

    /**
      * Gets the value of the 'metgrapName' field.
      * Наименование характеристики
      * @return The value.
      */
    public java.lang.CharSequence getMetgrapName() {
      return metgrapName;
    }


    /**
      * Sets the value of the 'metgrapName' field.
      * Наименование характеристики
      * @param value The value of 'metgrapName'.
      * @return This builder.
      */
    public nlmk.l3.ccm.pgp.RecordMetgrapData.Builder setMetgrapName(java.lang.CharSequence value) {
      validate(fields()[1], value);
      this.metgrapName = value;
      fieldSetFlags()[1] = true;
      return this;
    }

    /**
      * Checks whether the 'metgrapName' field has been set.
      * Наименование характеристики
      * @return True if the 'metgrapName' field has been set, false otherwise.
      */
    public boolean hasMetgrapName() {
      return fieldSetFlags()[1];
    }


    /**
      * Clears the value of the 'metgrapName' field.
      * Наименование характеристики
      * @return This builder.
      */
    public nlmk.l3.ccm.pgp.RecordMetgrapData.Builder clearMetgrapName() {
      metgrapName = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    /**
      * Gets the value of the 'metgrapFormat' field.
      * Формат передачи характеристики
      * @return The value.
      */
    public java.lang.CharSequence getMetgrapFormat() {
      return metgrapFormat;
    }


    /**
      * Sets the value of the 'metgrapFormat' field.
      * Формат передачи характеристики
      * @param value The value of 'metgrapFormat'.
      * @return This builder.
      */
    public nlmk.l3.ccm.pgp.RecordMetgrapData.Builder setMetgrapFormat(java.lang.CharSequence value) {
      validate(fields()[2], value);
      this.metgrapFormat = value;
      fieldSetFlags()[2] = true;
      return this;
    }

    /**
      * Checks whether the 'metgrapFormat' field has been set.
      * Формат передачи характеристики
      * @return True if the 'metgrapFormat' field has been set, false otherwise.
      */
    public boolean hasMetgrapFormat() {
      return fieldSetFlags()[2];
    }


    /**
      * Clears the value of the 'metgrapFormat' field.
      * Формат передачи характеристики
      * @return This builder.
      */
    public nlmk.l3.ccm.pgp.RecordMetgrapData.Builder clearMetgrapFormat() {
      metgrapFormat = null;
      fieldSetFlags()[2] = false;
      return this;
    }

    /**
      * Gets the value of the 'metgrapValue' field.
      * Значение характеристики
      * @return The value.
      */
    public java.lang.CharSequence getMetgrapValue() {
      return metgrapValue;
    }


    /**
      * Sets the value of the 'metgrapValue' field.
      * Значение характеристики
      * @param value The value of 'metgrapValue'.
      * @return This builder.
      */
    public nlmk.l3.ccm.pgp.RecordMetgrapData.Builder setMetgrapValue(java.lang.CharSequence value) {
      validate(fields()[3], value);
      this.metgrapValue = value;
      fieldSetFlags()[3] = true;
      return this;
    }

    /**
      * Checks whether the 'metgrapValue' field has been set.
      * Значение характеристики
      * @return True if the 'metgrapValue' field has been set, false otherwise.
      */
    public boolean hasMetgrapValue() {
      return fieldSetFlags()[3];
    }


    /**
      * Clears the value of the 'metgrapValue' field.
      * Значение характеристики
      * @return This builder.
      */
    public nlmk.l3.ccm.pgp.RecordMetgrapData.Builder clearMetgrapValue() {
      metgrapValue = null;
      fieldSetFlags()[3] = false;
      return this;
    }

    /**
      * Gets the value of the 'metgrapTypeCode' field.
      * Тип данных (1 - строка, 2 - число, 3 - дата)
      * @return The value.
      */
    public int getMetgrapTypeCode() {
      return metgrapTypeCode;
    }


    /**
      * Sets the value of the 'metgrapTypeCode' field.
      * Тип данных (1 - строка, 2 - число, 3 - дата)
      * @param value The value of 'metgrapTypeCode'.
      * @return This builder.
      */
    public nlmk.l3.ccm.pgp.RecordMetgrapData.Builder setMetgrapTypeCode(int value) {
      validate(fields()[4], value);
      this.metgrapTypeCode = value;
      fieldSetFlags()[4] = true;
      return this;
    }

    /**
      * Checks whether the 'metgrapTypeCode' field has been set.
      * Тип данных (1 - строка, 2 - число, 3 - дата)
      * @return True if the 'metgrapTypeCode' field has been set, false otherwise.
      */
    public boolean hasMetgrapTypeCode() {
      return fieldSetFlags()[4];
    }


    /**
      * Clears the value of the 'metgrapTypeCode' field.
      * Тип данных (1 - строка, 2 - число, 3 - дата)
      * @return This builder.
      */
    public nlmk.l3.ccm.pgp.RecordMetgrapData.Builder clearMetgrapTypeCode() {
      fieldSetFlags()[4] = false;
      return this;
    }

    /**
      * Gets the value of the 'metgrapMeasure' field.
      * Единица измерения характеристики
      * @return The value.
      */
    public java.lang.CharSequence getMetgrapMeasure() {
      return metgrapMeasure;
    }


    /**
      * Sets the value of the 'metgrapMeasure' field.
      * Единица измерения характеристики
      * @param value The value of 'metgrapMeasure'.
      * @return This builder.
      */
    public nlmk.l3.ccm.pgp.RecordMetgrapData.Builder setMetgrapMeasure(java.lang.CharSequence value) {
      validate(fields()[5], value);
      this.metgrapMeasure = value;
      fieldSetFlags()[5] = true;
      return this;
    }

    /**
      * Checks whether the 'metgrapMeasure' field has been set.
      * Единица измерения характеристики
      * @return True if the 'metgrapMeasure' field has been set, false otherwise.
      */
    public boolean hasMetgrapMeasure() {
      return fieldSetFlags()[5];
    }


    /**
      * Clears the value of the 'metgrapMeasure' field.
      * Единица измерения характеристики
      * @return This builder.
      */
    public nlmk.l3.ccm.pgp.RecordMetgrapData.Builder clearMetgrapMeasure() {
      metgrapMeasure = null;
      fieldSetFlags()[5] = false;
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    public RecordMetgrapData build() {
      try {
        RecordMetgrapData record = new RecordMetgrapData();
        record.metgrapCode = fieldSetFlags()[0] ? this.metgrapCode : (java.lang.Integer) defaultValue(fields()[0]);
        record.metgrapName = fieldSetFlags()[1] ? this.metgrapName : (java.lang.CharSequence) defaultValue(fields()[1]);
        record.metgrapFormat = fieldSetFlags()[2] ? this.metgrapFormat : (java.lang.CharSequence) defaultValue(fields()[2]);
        record.metgrapValue = fieldSetFlags()[3] ? this.metgrapValue : (java.lang.CharSequence) defaultValue(fields()[3]);
        record.metgrapTypeCode = fieldSetFlags()[4] ? this.metgrapTypeCode : (java.lang.Integer) defaultValue(fields()[4]);
        record.metgrapMeasure = fieldSetFlags()[5] ? this.metgrapMeasure : (java.lang.CharSequence) defaultValue(fields()[5]);
        return record;
      } catch (org.apache.avro.AvroMissingFieldException e) {
        throw e;
      } catch (java.lang.Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumWriter<RecordMetgrapData>
    WRITER$ = (org.apache.avro.io.DatumWriter<RecordMetgrapData>)MODEL$.createDatumWriter(SCHEMA$);

  @Override public void writeExternal(java.io.ObjectOutput out)
    throws java.io.IOException {
    WRITER$.write(this, SpecificData.getEncoder(out));
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumReader<RecordMetgrapData>
    READER$ = (org.apache.avro.io.DatumReader<RecordMetgrapData>)MODEL$.createDatumReader(SCHEMA$);

  @Override public void readExternal(java.io.ObjectInput in)
    throws java.io.IOException {
    READER$.read(this, SpecificData.getDecoder(in));
  }

  @Override protected boolean hasCustomCoders() { return true; }

  @Override public void customEncode(org.apache.avro.io.Encoder out)
    throws java.io.IOException
  {
    out.writeInt(this.metgrapCode);

    out.writeString(this.metgrapName);

    if (this.metgrapFormat == null) {
      out.writeIndex(0);
      out.writeNull();
    } else {
      out.writeIndex(1);
      out.writeString(this.metgrapFormat);
    }

    if (this.metgrapValue == null) {
      out.writeIndex(0);
      out.writeNull();
    } else {
      out.writeIndex(1);
      out.writeString(this.metgrapValue);
    }

    out.writeInt(this.metgrapTypeCode);

    if (this.metgrapMeasure == null) {
      out.writeIndex(0);
      out.writeNull();
    } else {
      out.writeIndex(1);
      out.writeString(this.metgrapMeasure);
    }

  }

  @Override public void customDecode(org.apache.avro.io.ResolvingDecoder in)
    throws java.io.IOException
  {
    org.apache.avro.Schema.Field[] fieldOrder = in.readFieldOrderIfDiff();
    if (fieldOrder == null) {
      this.metgrapCode = in.readInt();

      this.metgrapName = in.readString(this.metgrapName instanceof Utf8 ? (Utf8)this.metgrapName : null);

      if (in.readIndex() != 1) {
        in.readNull();
        this.metgrapFormat = null;
      } else {
        this.metgrapFormat = in.readString(this.metgrapFormat instanceof Utf8 ? (Utf8)this.metgrapFormat : null);
      }

      if (in.readIndex() != 1) {
        in.readNull();
        this.metgrapValue = null;
      } else {
        this.metgrapValue = in.readString(this.metgrapValue instanceof Utf8 ? (Utf8)this.metgrapValue : null);
      }

      this.metgrapTypeCode = in.readInt();

      if (in.readIndex() != 1) {
        in.readNull();
        this.metgrapMeasure = null;
      } else {
        this.metgrapMeasure = in.readString(this.metgrapMeasure instanceof Utf8 ? (Utf8)this.metgrapMeasure : null);
      }

    } else {
      for (int i = 0; i < 6; i++) {
        switch (fieldOrder[i].pos()) {
        case 0:
          this.metgrapCode = in.readInt();
          break;

        case 1:
          this.metgrapName = in.readString(this.metgrapName instanceof Utf8 ? (Utf8)this.metgrapName : null);
          break;

        case 2:
          if (in.readIndex() != 1) {
            in.readNull();
            this.metgrapFormat = null;
          } else {
            this.metgrapFormat = in.readString(this.metgrapFormat instanceof Utf8 ? (Utf8)this.metgrapFormat : null);
          }
          break;

        case 3:
          if (in.readIndex() != 1) {
            in.readNull();
            this.metgrapValue = null;
          } else {
            this.metgrapValue = in.readString(this.metgrapValue instanceof Utf8 ? (Utf8)this.metgrapValue : null);
          }
          break;

        case 4:
          this.metgrapTypeCode = in.readInt();
          break;

        case 5:
          if (in.readIndex() != 1) {
            in.readNull();
            this.metgrapMeasure = null;
          } else {
            this.metgrapMeasure = in.readString(this.metgrapMeasure instanceof Utf8 ? (Utf8)this.metgrapMeasure : null);
          }
          break;

        default:
          throw new java.io.IOException("Corrupt ResolvingDecoder.");
        }
      }
    }
  }
}









