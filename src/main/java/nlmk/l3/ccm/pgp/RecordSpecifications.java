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
public class RecordSpecifications extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = -3571277595772395243L;
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"RecordSpecifications\",\"namespace\":\"nlmk.l3.ccm.pgp\",\"fields\":[{\"name\":\"specCode\",\"type\":\"int\",\"doc\":\"Код характеристики\"},{\"name\":\"specName\",\"type\":\"string\",\"doc\":\"Наименование характеристики\"},{\"name\":\"specValue\",\"type\":[\"null\",\"string\"],\"doc\":\"Значение характеристики\",\"default\":null},{\"name\":\"specTypeCode\",\"type\":\"int\",\"doc\":\"Тип данных (1 - строка, 2 - число, 3 - дата)\"},{\"name\":\"specFormat\",\"type\":[\"null\",\"string\"],\"doc\":\"Формат передачи характеристики\",\"default\":null},{\"name\":\"specMeasure\",\"type\":[\"null\",\"string\"],\"doc\":\"Единица измерения характеристики\",\"default\":null}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }

  private static SpecificData MODEL$ = new SpecificData();

  private static final BinaryMessageEncoder<RecordSpecifications> ENCODER =
      new BinaryMessageEncoder<RecordSpecifications>(MODEL$, SCHEMA$);

  private static final BinaryMessageDecoder<RecordSpecifications> DECODER =
      new BinaryMessageDecoder<RecordSpecifications>(MODEL$, SCHEMA$);

  /**
   * Return the BinaryMessageEncoder instance used by this class.
   * @return the message encoder used by this class
   */
  public static BinaryMessageEncoder<RecordSpecifications> getEncoder() {
    return ENCODER;
  }

  /**
   * Return the BinaryMessageDecoder instance used by this class.
   * @return the message decoder used by this class
   */
  public static BinaryMessageDecoder<RecordSpecifications> getDecoder() {
    return DECODER;
  }

  /**
   * Create a new BinaryMessageDecoder instance for this class that uses the specified {@link SchemaStore}.
   * @param resolver a {@link SchemaStore} used to find schemas by fingerprint
   * @return a BinaryMessageDecoder instance for this class backed by the given SchemaStore
   */
  public static BinaryMessageDecoder<RecordSpecifications> createDecoder(SchemaStore resolver) {
    return new BinaryMessageDecoder<RecordSpecifications>(MODEL$, SCHEMA$, resolver);
  }

  /**
   * Serializes this RecordSpecifications to a ByteBuffer.
   * @return a buffer holding the serialized data for this instance
   * @throws java.io.IOException if this instance could not be serialized
   */
  public java.nio.ByteBuffer toByteBuffer() throws java.io.IOException {
    return ENCODER.encode(this);
  }

  /**
   * Deserializes a RecordSpecifications from a ByteBuffer.
   * @param b a byte buffer holding serialized data for an instance of this class
   * @return a RecordSpecifications instance decoded from the given buffer
   * @throws java.io.IOException if the given bytes could not be deserialized into an instance of this class
   */
  public static RecordSpecifications fromByteBuffer(
      java.nio.ByteBuffer b) throws java.io.IOException {
    return DECODER.decode(b);
  }

  /** Код характеристики */
   private int specCode;
  /** Наименование характеристики */
   private java.lang.CharSequence specName;
  /** Значение характеристики */
   private java.lang.CharSequence specValue;
  /** Тип данных (1 - строка, 2 - число, 3 - дата) */
   private int specTypeCode;
  /** Формат передачи характеристики */
   private java.lang.CharSequence specFormat;
  /** Единица измерения характеристики */
   private java.lang.CharSequence specMeasure;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public RecordSpecifications() {}

  /**
   * All-args constructor.
   * @param specCode Код характеристики
   * @param specName Наименование характеристики
   * @param specValue Значение характеристики
   * @param specTypeCode Тип данных (1 - строка, 2 - число, 3 - дата)
   * @param specFormat Формат передачи характеристики
   * @param specMeasure Единица измерения характеристики
   */
  public RecordSpecifications(java.lang.Integer specCode, java.lang.CharSequence specName, java.lang.CharSequence specValue, java.lang.Integer specTypeCode, java.lang.CharSequence specFormat, java.lang.CharSequence specMeasure) {
    this.specCode = specCode;
    this.specName = specName;
    this.specValue = specValue;
    this.specTypeCode = specTypeCode;
    this.specFormat = specFormat;
    this.specMeasure = specMeasure;
  }

  public org.apache.avro.specific.SpecificData getSpecificData() { return MODEL$; }
  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call.
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return specCode;
    case 1: return specName;
    case 2: return specValue;
    case 3: return specTypeCode;
    case 4: return specFormat;
    case 5: return specMeasure;
    default: throw new IndexOutOfBoundsException("Invalid index: " + field$);
    }
  }

  // Used by DatumReader.  Applications should not call.
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: specCode = (java.lang.Integer)value$; break;
    case 1: specName = (java.lang.CharSequence)value$; break;
    case 2: specValue = (java.lang.CharSequence)value$; break;
    case 3: specTypeCode = (java.lang.Integer)value$; break;
    case 4: specFormat = (java.lang.CharSequence)value$; break;
    case 5: specMeasure = (java.lang.CharSequence)value$; break;
    default: throw new IndexOutOfBoundsException("Invalid index: " + field$);
    }
  }

  /**
   * Gets the value of the 'specCode' field.
   * @return Код характеристики
   */
  public int getSpecCode() {
    return specCode;
  }


  /**
   * Sets the value of the 'specCode' field.
   * Код характеристики
   * @param value the value to set.
   */
  public void setSpecCode(int value) {
    this.specCode = value;
  }

  /**
   * Gets the value of the 'specName' field.
   * @return Наименование характеристики
   */
  public java.lang.CharSequence getSpecName() {
    return specName;
  }


  /**
   * Sets the value of the 'specName' field.
   * Наименование характеристики
   * @param value the value to set.
   */
  public void setSpecName(java.lang.CharSequence value) {
    this.specName = value;
  }

  /**
   * Gets the value of the 'specValue' field.
   * @return Значение характеристики
   */
  public java.lang.CharSequence getSpecValue() {
    return specValue;
  }


  /**
   * Sets the value of the 'specValue' field.
   * Значение характеристики
   * @param value the value to set.
   */
  public void setSpecValue(java.lang.CharSequence value) {
    this.specValue = value;
  }

  /**
   * Gets the value of the 'specTypeCode' field.
   * @return Тип данных (1 - строка, 2 - число, 3 - дата)
   */
  public int getSpecTypeCode() {
    return specTypeCode;
  }


  /**
   * Sets the value of the 'specTypeCode' field.
   * Тип данных (1 - строка, 2 - число, 3 - дата)
   * @param value the value to set.
   */
  public void setSpecTypeCode(int value) {
    this.specTypeCode = value;
  }

  /**
   * Gets the value of the 'specFormat' field.
   * @return Формат передачи характеристики
   */
  public java.lang.CharSequence getSpecFormat() {
    return specFormat;
  }


  /**
   * Sets the value of the 'specFormat' field.
   * Формат передачи характеристики
   * @param value the value to set.
   */
  public void setSpecFormat(java.lang.CharSequence value) {
    this.specFormat = value;
  }

  /**
   * Gets the value of the 'specMeasure' field.
   * @return Единица измерения характеристики
   */
  public java.lang.CharSequence getSpecMeasure() {
    return specMeasure;
  }


  /**
   * Sets the value of the 'specMeasure' field.
   * Единица измерения характеристики
   * @param value the value to set.
   */
  public void setSpecMeasure(java.lang.CharSequence value) {
    this.specMeasure = value;
  }

  /**
   * Creates a new RecordSpecifications RecordBuilder.
   * @return A new RecordSpecifications RecordBuilder
   */
  public static nlmk.l3.ccm.pgp.RecordSpecifications.Builder newBuilder() {
    return new nlmk.l3.ccm.pgp.RecordSpecifications.Builder();
  }

  /**
   * Creates a new RecordSpecifications RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new RecordSpecifications RecordBuilder
   */
  public static nlmk.l3.ccm.pgp.RecordSpecifications.Builder newBuilder(nlmk.l3.ccm.pgp.RecordSpecifications.Builder other) {
    if (other == null) {
      return new nlmk.l3.ccm.pgp.RecordSpecifications.Builder();
    } else {
      return new nlmk.l3.ccm.pgp.RecordSpecifications.Builder(other);
    }
  }

  /**
   * Creates a new RecordSpecifications RecordBuilder by copying an existing RecordSpecifications instance.
   * @param other The existing instance to copy.
   * @return A new RecordSpecifications RecordBuilder
   */
  public static nlmk.l3.ccm.pgp.RecordSpecifications.Builder newBuilder(nlmk.l3.ccm.pgp.RecordSpecifications other) {
    if (other == null) {
      return new nlmk.l3.ccm.pgp.RecordSpecifications.Builder();
    } else {
      return new nlmk.l3.ccm.pgp.RecordSpecifications.Builder(other);
    }
  }

  /**
   * RecordBuilder for RecordSpecifications instances.
   */
  @org.apache.avro.specific.AvroGenerated
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<RecordSpecifications>
    implements org.apache.avro.data.RecordBuilder<RecordSpecifications> {

    /** Код характеристики */
    private int specCode;
    /** Наименование характеристики */
    private java.lang.CharSequence specName;
    /** Значение характеристики */
    private java.lang.CharSequence specValue;
    /** Тип данных (1 - строка, 2 - число, 3 - дата) */
    private int specTypeCode;
    /** Формат передачи характеристики */
    private java.lang.CharSequence specFormat;
    /** Единица измерения характеристики */
    private java.lang.CharSequence specMeasure;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(nlmk.l3.ccm.pgp.RecordSpecifications.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.specCode)) {
        this.specCode = data().deepCopy(fields()[0].schema(), other.specCode);
        fieldSetFlags()[0] = other.fieldSetFlags()[0];
      }
      if (isValidValue(fields()[1], other.specName)) {
        this.specName = data().deepCopy(fields()[1].schema(), other.specName);
        fieldSetFlags()[1] = other.fieldSetFlags()[1];
      }
      if (isValidValue(fields()[2], other.specValue)) {
        this.specValue = data().deepCopy(fields()[2].schema(), other.specValue);
        fieldSetFlags()[2] = other.fieldSetFlags()[2];
      }
      if (isValidValue(fields()[3], other.specTypeCode)) {
        this.specTypeCode = data().deepCopy(fields()[3].schema(), other.specTypeCode);
        fieldSetFlags()[3] = other.fieldSetFlags()[3];
      }
      if (isValidValue(fields()[4], other.specFormat)) {
        this.specFormat = data().deepCopy(fields()[4].schema(), other.specFormat);
        fieldSetFlags()[4] = other.fieldSetFlags()[4];
      }
      if (isValidValue(fields()[5], other.specMeasure)) {
        this.specMeasure = data().deepCopy(fields()[5].schema(), other.specMeasure);
        fieldSetFlags()[5] = other.fieldSetFlags()[5];
      }
    }

    /**
     * Creates a Builder by copying an existing RecordSpecifications instance
     * @param other The existing instance to copy.
     */
    private Builder(nlmk.l3.ccm.pgp.RecordSpecifications other) {
      super(SCHEMA$);
      if (isValidValue(fields()[0], other.specCode)) {
        this.specCode = data().deepCopy(fields()[0].schema(), other.specCode);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.specName)) {
        this.specName = data().deepCopy(fields()[1].schema(), other.specName);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.specValue)) {
        this.specValue = data().deepCopy(fields()[2].schema(), other.specValue);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.specTypeCode)) {
        this.specTypeCode = data().deepCopy(fields()[3].schema(), other.specTypeCode);
        fieldSetFlags()[3] = true;
      }
      if (isValidValue(fields()[4], other.specFormat)) {
        this.specFormat = data().deepCopy(fields()[4].schema(), other.specFormat);
        fieldSetFlags()[4] = true;
      }
      if (isValidValue(fields()[5], other.specMeasure)) {
        this.specMeasure = data().deepCopy(fields()[5].schema(), other.specMeasure);
        fieldSetFlags()[5] = true;
      }
    }

    /**
      * Gets the value of the 'specCode' field.
      * Код характеристики
      * @return The value.
      */
    public int getSpecCode() {
      return specCode;
    }


    /**
      * Sets the value of the 'specCode' field.
      * Код характеристики
      * @param value The value of 'specCode'.
      * @return This builder.
      */
    public nlmk.l3.ccm.pgp.RecordSpecifications.Builder setSpecCode(int value) {
      validate(fields()[0], value);
      this.specCode = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /**
      * Checks whether the 'specCode' field has been set.
      * Код характеристики
      * @return True if the 'specCode' field has been set, false otherwise.
      */
    public boolean hasSpecCode() {
      return fieldSetFlags()[0];
    }


    /**
      * Clears the value of the 'specCode' field.
      * Код характеристики
      * @return This builder.
      */
    public nlmk.l3.ccm.pgp.RecordSpecifications.Builder clearSpecCode() {
      fieldSetFlags()[0] = false;
      return this;
    }

    /**
      * Gets the value of the 'specName' field.
      * Наименование характеристики
      * @return The value.
      */
    public java.lang.CharSequence getSpecName() {
      return specName;
    }


    /**
      * Sets the value of the 'specName' field.
      * Наименование характеристики
      * @param value The value of 'specName'.
      * @return This builder.
      */
    public nlmk.l3.ccm.pgp.RecordSpecifications.Builder setSpecName(java.lang.CharSequence value) {
      validate(fields()[1], value);
      this.specName = value;
      fieldSetFlags()[1] = true;
      return this;
    }

    /**
      * Checks whether the 'specName' field has been set.
      * Наименование характеристики
      * @return True if the 'specName' field has been set, false otherwise.
      */
    public boolean hasSpecName() {
      return fieldSetFlags()[1];
    }


    /**
      * Clears the value of the 'specName' field.
      * Наименование характеристики
      * @return This builder.
      */
    public nlmk.l3.ccm.pgp.RecordSpecifications.Builder clearSpecName() {
      specName = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    /**
      * Gets the value of the 'specValue' field.
      * Значение характеристики
      * @return The value.
      */
    public java.lang.CharSequence getSpecValue() {
      return specValue;
    }


    /**
      * Sets the value of the 'specValue' field.
      * Значение характеристики
      * @param value The value of 'specValue'.
      * @return This builder.
      */
    public nlmk.l3.ccm.pgp.RecordSpecifications.Builder setSpecValue(java.lang.CharSequence value) {
      validate(fields()[2], value);
      this.specValue = value;
      fieldSetFlags()[2] = true;
      return this;
    }

    /**
      * Checks whether the 'specValue' field has been set.
      * Значение характеристики
      * @return True if the 'specValue' field has been set, false otherwise.
      */
    public boolean hasSpecValue() {
      return fieldSetFlags()[2];
    }


    /**
      * Clears the value of the 'specValue' field.
      * Значение характеристики
      * @return This builder.
      */
    public nlmk.l3.ccm.pgp.RecordSpecifications.Builder clearSpecValue() {
      specValue = null;
      fieldSetFlags()[2] = false;
      return this;
    }

    /**
      * Gets the value of the 'specTypeCode' field.
      * Тип данных (1 - строка, 2 - число, 3 - дата)
      * @return The value.
      */
    public int getSpecTypeCode() {
      return specTypeCode;
    }


    /**
      * Sets the value of the 'specTypeCode' field.
      * Тип данных (1 - строка, 2 - число, 3 - дата)
      * @param value The value of 'specTypeCode'.
      * @return This builder.
      */
    public nlmk.l3.ccm.pgp.RecordSpecifications.Builder setSpecTypeCode(int value) {
      validate(fields()[3], value);
      this.specTypeCode = value;
      fieldSetFlags()[3] = true;
      return this;
    }

    /**
      * Checks whether the 'specTypeCode' field has been set.
      * Тип данных (1 - строка, 2 - число, 3 - дата)
      * @return True if the 'specTypeCode' field has been set, false otherwise.
      */
    public boolean hasSpecTypeCode() {
      return fieldSetFlags()[3];
    }


    /**
      * Clears the value of the 'specTypeCode' field.
      * Тип данных (1 - строка, 2 - число, 3 - дата)
      * @return This builder.
      */
    public nlmk.l3.ccm.pgp.RecordSpecifications.Builder clearSpecTypeCode() {
      fieldSetFlags()[3] = false;
      return this;
    }

    /**
      * Gets the value of the 'specFormat' field.
      * Формат передачи характеристики
      * @return The value.
      */
    public java.lang.CharSequence getSpecFormat() {
      return specFormat;
    }


    /**
      * Sets the value of the 'specFormat' field.
      * Формат передачи характеристики
      * @param value The value of 'specFormat'.
      * @return This builder.
      */
    public nlmk.l3.ccm.pgp.RecordSpecifications.Builder setSpecFormat(java.lang.CharSequence value) {
      validate(fields()[4], value);
      this.specFormat = value;
      fieldSetFlags()[4] = true;
      return this;
    }

    /**
      * Checks whether the 'specFormat' field has been set.
      * Формат передачи характеристики
      * @return True if the 'specFormat' field has been set, false otherwise.
      */
    public boolean hasSpecFormat() {
      return fieldSetFlags()[4];
    }


    /**
      * Clears the value of the 'specFormat' field.
      * Формат передачи характеристики
      * @return This builder.
      */
    public nlmk.l3.ccm.pgp.RecordSpecifications.Builder clearSpecFormat() {
      specFormat = null;
      fieldSetFlags()[4] = false;
      return this;
    }

    /**
      * Gets the value of the 'specMeasure' field.
      * Единица измерения характеристики
      * @return The value.
      */
    public java.lang.CharSequence getSpecMeasure() {
      return specMeasure;
    }


    /**
      * Sets the value of the 'specMeasure' field.
      * Единица измерения характеристики
      * @param value The value of 'specMeasure'.
      * @return This builder.
      */
    public nlmk.l3.ccm.pgp.RecordSpecifications.Builder setSpecMeasure(java.lang.CharSequence value) {
      validate(fields()[5], value);
      this.specMeasure = value;
      fieldSetFlags()[5] = true;
      return this;
    }

    /**
      * Checks whether the 'specMeasure' field has been set.
      * Единица измерения характеристики
      * @return True if the 'specMeasure' field has been set, false otherwise.
      */
    public boolean hasSpecMeasure() {
      return fieldSetFlags()[5];
    }


    /**
      * Clears the value of the 'specMeasure' field.
      * Единица измерения характеристики
      * @return This builder.
      */
    public nlmk.l3.ccm.pgp.RecordSpecifications.Builder clearSpecMeasure() {
      specMeasure = null;
      fieldSetFlags()[5] = false;
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    public RecordSpecifications build() {
      try {
        RecordSpecifications record = new RecordSpecifications();
        record.specCode = fieldSetFlags()[0] ? this.specCode : (java.lang.Integer) defaultValue(fields()[0]);
        record.specName = fieldSetFlags()[1] ? this.specName : (java.lang.CharSequence) defaultValue(fields()[1]);
        record.specValue = fieldSetFlags()[2] ? this.specValue : (java.lang.CharSequence) defaultValue(fields()[2]);
        record.specTypeCode = fieldSetFlags()[3] ? this.specTypeCode : (java.lang.Integer) defaultValue(fields()[3]);
        record.specFormat = fieldSetFlags()[4] ? this.specFormat : (java.lang.CharSequence) defaultValue(fields()[4]);
        record.specMeasure = fieldSetFlags()[5] ? this.specMeasure : (java.lang.CharSequence) defaultValue(fields()[5]);
        return record;
      } catch (org.apache.avro.AvroMissingFieldException e) {
        throw e;
      } catch (java.lang.Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumWriter<RecordSpecifications>
    WRITER$ = (org.apache.avro.io.DatumWriter<RecordSpecifications>)MODEL$.createDatumWriter(SCHEMA$);

  @Override public void writeExternal(java.io.ObjectOutput out)
    throws java.io.IOException {
    WRITER$.write(this, SpecificData.getEncoder(out));
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumReader<RecordSpecifications>
    READER$ = (org.apache.avro.io.DatumReader<RecordSpecifications>)MODEL$.createDatumReader(SCHEMA$);

  @Override public void readExternal(java.io.ObjectInput in)
    throws java.io.IOException {
    READER$.read(this, SpecificData.getDecoder(in));
  }

  @Override protected boolean hasCustomCoders() { return true; }

  @Override public void customEncode(org.apache.avro.io.Encoder out)
    throws java.io.IOException
  {
    out.writeInt(this.specCode);

    out.writeString(this.specName);

    if (this.specValue == null) {
      out.writeIndex(0);
      out.writeNull();
    } else {
      out.writeIndex(1);
      out.writeString(this.specValue);
    }

    out.writeInt(this.specTypeCode);

    if (this.specFormat == null) {
      out.writeIndex(0);
      out.writeNull();
    } else {
      out.writeIndex(1);
      out.writeString(this.specFormat);
    }

    if (this.specMeasure == null) {
      out.writeIndex(0);
      out.writeNull();
    } else {
      out.writeIndex(1);
      out.writeString(this.specMeasure);
    }

  }

  @Override public void customDecode(org.apache.avro.io.ResolvingDecoder in)
    throws java.io.IOException
  {
    org.apache.avro.Schema.Field[] fieldOrder = in.readFieldOrderIfDiff();
    if (fieldOrder == null) {
      this.specCode = in.readInt();

      this.specName = in.readString(this.specName instanceof Utf8 ? (Utf8)this.specName : null);

      if (in.readIndex() != 1) {
        in.readNull();
        this.specValue = null;
      } else {
        this.specValue = in.readString(this.specValue instanceof Utf8 ? (Utf8)this.specValue : null);
      }

      this.specTypeCode = in.readInt();

      if (in.readIndex() != 1) {
        in.readNull();
        this.specFormat = null;
      } else {
        this.specFormat = in.readString(this.specFormat instanceof Utf8 ? (Utf8)this.specFormat : null);
      }

      if (in.readIndex() != 1) {
        in.readNull();
        this.specMeasure = null;
      } else {
        this.specMeasure = in.readString(this.specMeasure instanceof Utf8 ? (Utf8)this.specMeasure : null);
      }

    } else {
      for (int i = 0; i < 6; i++) {
        switch (fieldOrder[i].pos()) {
        case 0:
          this.specCode = in.readInt();
          break;

        case 1:
          this.specName = in.readString(this.specName instanceof Utf8 ? (Utf8)this.specName : null);
          break;

        case 2:
          if (in.readIndex() != 1) {
            in.readNull();
            this.specValue = null;
          } else {
            this.specValue = in.readString(this.specValue instanceof Utf8 ? (Utf8)this.specValue : null);
          }
          break;

        case 3:
          this.specTypeCode = in.readInt();
          break;

        case 4:
          if (in.readIndex() != 1) {
            in.readNull();
            this.specFormat = null;
          } else {
            this.specFormat = in.readString(this.specFormat instanceof Utf8 ? (Utf8)this.specFormat : null);
          }
          break;

        case 5:
          if (in.readIndex() != 1) {
            in.readNull();
            this.specMeasure = null;
          } else {
            this.specMeasure = in.readString(this.specMeasure instanceof Utf8 ? (Utf8)this.specMeasure : null);
          }
          break;

        default:
          throw new java.io.IOException("Corrupt ResolvingDecoder.");
        }
      }
    }
  }
}









