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
public class RecordChemical extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = -5493696792084177907L;
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"RecordChemical\",\"namespace\":\"nlmk.l3.ccm.pgp\",\"fields\":[{\"name\":\"chemCode\",\"type\":\"int\",\"doc\":\"Код характеристики\"},{\"name\":\"chemName\",\"type\":\"string\",\"doc\":\"Наименование характеристики\"},{\"name\":\"chemValue\",\"type\":[\"null\",\"string\"],\"doc\":\"Значение характеристики\",\"default\":null},{\"name\":\"chemFormat\",\"type\":[\"null\",\"string\"],\"doc\":\"Формат передачи характеристики\",\"default\":null}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }

  private static SpecificData MODEL$ = new SpecificData();

  private static final BinaryMessageEncoder<RecordChemical> ENCODER =
      new BinaryMessageEncoder<RecordChemical>(MODEL$, SCHEMA$);

  private static final BinaryMessageDecoder<RecordChemical> DECODER =
      new BinaryMessageDecoder<RecordChemical>(MODEL$, SCHEMA$);

  /**
   * Return the BinaryMessageEncoder instance used by this class.
   * @return the message encoder used by this class
   */
  public static BinaryMessageEncoder<RecordChemical> getEncoder() {
    return ENCODER;
  }

  /**
   * Return the BinaryMessageDecoder instance used by this class.
   * @return the message decoder used by this class
   */
  public static BinaryMessageDecoder<RecordChemical> getDecoder() {
    return DECODER;
  }

  /**
   * Create a new BinaryMessageDecoder instance for this class that uses the specified {@link SchemaStore}.
   * @param resolver a {@link SchemaStore} used to find schemas by fingerprint
   * @return a BinaryMessageDecoder instance for this class backed by the given SchemaStore
   */
  public static BinaryMessageDecoder<RecordChemical> createDecoder(SchemaStore resolver) {
    return new BinaryMessageDecoder<RecordChemical>(MODEL$, SCHEMA$, resolver);
  }

  /**
   * Serializes this RecordChemical to a ByteBuffer.
   * @return a buffer holding the serialized data for this instance
   * @throws java.io.IOException if this instance could not be serialized
   */
  public java.nio.ByteBuffer toByteBuffer() throws java.io.IOException {
    return ENCODER.encode(this);
  }

  /**
   * Deserializes a RecordChemical from a ByteBuffer.
   * @param b a byte buffer holding serialized data for an instance of this class
   * @return a RecordChemical instance decoded from the given buffer
   * @throws java.io.IOException if the given bytes could not be deserialized into an instance of this class
   */
  public static RecordChemical fromByteBuffer(
      java.nio.ByteBuffer b) throws java.io.IOException {
    return DECODER.decode(b);
  }

  /** Код характеристики */
   private int chemCode;
  /** Наименование характеристики */
   private java.lang.CharSequence chemName;
  /** Значение характеристики */
   private java.lang.CharSequence chemValue;
  /** Формат передачи характеристики */
   private java.lang.CharSequence chemFormat;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public RecordChemical() {}

  /**
   * All-args constructor.
   * @param chemCode Код характеристики
   * @param chemName Наименование характеристики
   * @param chemValue Значение характеристики
   * @param chemFormat Формат передачи характеристики
   */
  public RecordChemical(java.lang.Integer chemCode, java.lang.CharSequence chemName, java.lang.CharSequence chemValue, java.lang.CharSequence chemFormat) {
    this.chemCode = chemCode;
    this.chemName = chemName;
    this.chemValue = chemValue;
    this.chemFormat = chemFormat;
  }

  public org.apache.avro.specific.SpecificData getSpecificData() { return MODEL$; }
  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call.
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return chemCode;
    case 1: return chemName;
    case 2: return chemValue;
    case 3: return chemFormat;
    default: throw new IndexOutOfBoundsException("Invalid index: " + field$);
    }
  }

  // Used by DatumReader.  Applications should not call.
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: chemCode = (java.lang.Integer)value$; break;
    case 1: chemName = (java.lang.CharSequence)value$; break;
    case 2: chemValue = (java.lang.CharSequence)value$; break;
    case 3: chemFormat = (java.lang.CharSequence)value$; break;
    default: throw new IndexOutOfBoundsException("Invalid index: " + field$);
    }
  }

  /**
   * Gets the value of the 'chemCode' field.
   * @return Код характеристики
   */
  public int getChemCode() {
    return chemCode;
  }


  /**
   * Sets the value of the 'chemCode' field.
   * Код характеристики
   * @param value the value to set.
   */
  public void setChemCode(int value) {
    this.chemCode = value;
  }

  /**
   * Gets the value of the 'chemName' field.
   * @return Наименование характеристики
   */
  public java.lang.CharSequence getChemName() {
    return chemName;
  }


  /**
   * Sets the value of the 'chemName' field.
   * Наименование характеристики
   * @param value the value to set.
   */
  public void setChemName(java.lang.CharSequence value) {
    this.chemName = value;
  }

  /**
   * Gets the value of the 'chemValue' field.
   * @return Значение характеристики
   */
  public java.lang.CharSequence getChemValue() {
    return chemValue;
  }


  /**
   * Sets the value of the 'chemValue' field.
   * Значение характеристики
   * @param value the value to set.
   */
  public void setChemValue(java.lang.CharSequence value) {
    this.chemValue = value;
  }

  /**
   * Gets the value of the 'chemFormat' field.
   * @return Формат передачи характеристики
   */
  public java.lang.CharSequence getChemFormat() {
    return chemFormat;
  }


  /**
   * Sets the value of the 'chemFormat' field.
   * Формат передачи характеристики
   * @param value the value to set.
   */
  public void setChemFormat(java.lang.CharSequence value) {
    this.chemFormat = value;
  }

  /**
   * Creates a new RecordChemical RecordBuilder.
   * @return A new RecordChemical RecordBuilder
   */
  public static nlmk.l3.ccm.pgp.RecordChemical.Builder newBuilder() {
    return new nlmk.l3.ccm.pgp.RecordChemical.Builder();
  }

  /**
   * Creates a new RecordChemical RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new RecordChemical RecordBuilder
   */
  public static nlmk.l3.ccm.pgp.RecordChemical.Builder newBuilder(nlmk.l3.ccm.pgp.RecordChemical.Builder other) {
    if (other == null) {
      return new nlmk.l3.ccm.pgp.RecordChemical.Builder();
    } else {
      return new nlmk.l3.ccm.pgp.RecordChemical.Builder(other);
    }
  }

  /**
   * Creates a new RecordChemical RecordBuilder by copying an existing RecordChemical instance.
   * @param other The existing instance to copy.
   * @return A new RecordChemical RecordBuilder
   */
  public static nlmk.l3.ccm.pgp.RecordChemical.Builder newBuilder(nlmk.l3.ccm.pgp.RecordChemical other) {
    if (other == null) {
      return new nlmk.l3.ccm.pgp.RecordChemical.Builder();
    } else {
      return new nlmk.l3.ccm.pgp.RecordChemical.Builder(other);
    }
  }

  /**
   * RecordBuilder for RecordChemical instances.
   */
  @org.apache.avro.specific.AvroGenerated
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<RecordChemical>
    implements org.apache.avro.data.RecordBuilder<RecordChemical> {

    /** Код характеристики */
    private int chemCode;
    /** Наименование характеристики */
    private java.lang.CharSequence chemName;
    /** Значение характеристики */
    private java.lang.CharSequence chemValue;
    /** Формат передачи характеристики */
    private java.lang.CharSequence chemFormat;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(nlmk.l3.ccm.pgp.RecordChemical.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.chemCode)) {
        this.chemCode = data().deepCopy(fields()[0].schema(), other.chemCode);
        fieldSetFlags()[0] = other.fieldSetFlags()[0];
      }
      if (isValidValue(fields()[1], other.chemName)) {
        this.chemName = data().deepCopy(fields()[1].schema(), other.chemName);
        fieldSetFlags()[1] = other.fieldSetFlags()[1];
      }
      if (isValidValue(fields()[2], other.chemValue)) {
        this.chemValue = data().deepCopy(fields()[2].schema(), other.chemValue);
        fieldSetFlags()[2] = other.fieldSetFlags()[2];
      }
      if (isValidValue(fields()[3], other.chemFormat)) {
        this.chemFormat = data().deepCopy(fields()[3].schema(), other.chemFormat);
        fieldSetFlags()[3] = other.fieldSetFlags()[3];
      }
    }

    /**
     * Creates a Builder by copying an existing RecordChemical instance
     * @param other The existing instance to copy.
     */
    private Builder(nlmk.l3.ccm.pgp.RecordChemical other) {
      super(SCHEMA$);
      if (isValidValue(fields()[0], other.chemCode)) {
        this.chemCode = data().deepCopy(fields()[0].schema(), other.chemCode);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.chemName)) {
        this.chemName = data().deepCopy(fields()[1].schema(), other.chemName);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.chemValue)) {
        this.chemValue = data().deepCopy(fields()[2].schema(), other.chemValue);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.chemFormat)) {
        this.chemFormat = data().deepCopy(fields()[3].schema(), other.chemFormat);
        fieldSetFlags()[3] = true;
      }
    }

    /**
      * Gets the value of the 'chemCode' field.
      * Код характеристики
      * @return The value.
      */
    public int getChemCode() {
      return chemCode;
    }


    /**
      * Sets the value of the 'chemCode' field.
      * Код характеристики
      * @param value The value of 'chemCode'.
      * @return This builder.
      */
    public nlmk.l3.ccm.pgp.RecordChemical.Builder setChemCode(int value) {
      validate(fields()[0], value);
      this.chemCode = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /**
      * Checks whether the 'chemCode' field has been set.
      * Код характеристики
      * @return True if the 'chemCode' field has been set, false otherwise.
      */
    public boolean hasChemCode() {
      return fieldSetFlags()[0];
    }


    /**
      * Clears the value of the 'chemCode' field.
      * Код характеристики
      * @return This builder.
      */
    public nlmk.l3.ccm.pgp.RecordChemical.Builder clearChemCode() {
      fieldSetFlags()[0] = false;
      return this;
    }

    /**
      * Gets the value of the 'chemName' field.
      * Наименование характеристики
      * @return The value.
      */
    public java.lang.CharSequence getChemName() {
      return chemName;
    }


    /**
      * Sets the value of the 'chemName' field.
      * Наименование характеристики
      * @param value The value of 'chemName'.
      * @return This builder.
      */
    public nlmk.l3.ccm.pgp.RecordChemical.Builder setChemName(java.lang.CharSequence value) {
      validate(fields()[1], value);
      this.chemName = value;
      fieldSetFlags()[1] = true;
      return this;
    }

    /**
      * Checks whether the 'chemName' field has been set.
      * Наименование характеристики
      * @return True if the 'chemName' field has been set, false otherwise.
      */
    public boolean hasChemName() {
      return fieldSetFlags()[1];
    }


    /**
      * Clears the value of the 'chemName' field.
      * Наименование характеристики
      * @return This builder.
      */
    public nlmk.l3.ccm.pgp.RecordChemical.Builder clearChemName() {
      chemName = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    /**
      * Gets the value of the 'chemValue' field.
      * Значение характеристики
      * @return The value.
      */
    public java.lang.CharSequence getChemValue() {
      return chemValue;
    }


    /**
      * Sets the value of the 'chemValue' field.
      * Значение характеристики
      * @param value The value of 'chemValue'.
      * @return This builder.
      */
    public nlmk.l3.ccm.pgp.RecordChemical.Builder setChemValue(java.lang.CharSequence value) {
      validate(fields()[2], value);
      this.chemValue = value;
      fieldSetFlags()[2] = true;
      return this;
    }

    /**
      * Checks whether the 'chemValue' field has been set.
      * Значение характеристики
      * @return True if the 'chemValue' field has been set, false otherwise.
      */
    public boolean hasChemValue() {
      return fieldSetFlags()[2];
    }


    /**
      * Clears the value of the 'chemValue' field.
      * Значение характеристики
      * @return This builder.
      */
    public nlmk.l3.ccm.pgp.RecordChemical.Builder clearChemValue() {
      chemValue = null;
      fieldSetFlags()[2] = false;
      return this;
    }

    /**
      * Gets the value of the 'chemFormat' field.
      * Формат передачи характеристики
      * @return The value.
      */
    public java.lang.CharSequence getChemFormat() {
      return chemFormat;
    }


    /**
      * Sets the value of the 'chemFormat' field.
      * Формат передачи характеристики
      * @param value The value of 'chemFormat'.
      * @return This builder.
      */
    public nlmk.l3.ccm.pgp.RecordChemical.Builder setChemFormat(java.lang.CharSequence value) {
      validate(fields()[3], value);
      this.chemFormat = value;
      fieldSetFlags()[3] = true;
      return this;
    }

    /**
      * Checks whether the 'chemFormat' field has been set.
      * Формат передачи характеристики
      * @return True if the 'chemFormat' field has been set, false otherwise.
      */
    public boolean hasChemFormat() {
      return fieldSetFlags()[3];
    }


    /**
      * Clears the value of the 'chemFormat' field.
      * Формат передачи характеристики
      * @return This builder.
      */
    public nlmk.l3.ccm.pgp.RecordChemical.Builder clearChemFormat() {
      chemFormat = null;
      fieldSetFlags()[3] = false;
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    public RecordChemical build() {
      try {
        RecordChemical record = new RecordChemical();
        record.chemCode = fieldSetFlags()[0] ? this.chemCode : (java.lang.Integer) defaultValue(fields()[0]);
        record.chemName = fieldSetFlags()[1] ? this.chemName : (java.lang.CharSequence) defaultValue(fields()[1]);
        record.chemValue = fieldSetFlags()[2] ? this.chemValue : (java.lang.CharSequence) defaultValue(fields()[2]);
        record.chemFormat = fieldSetFlags()[3] ? this.chemFormat : (java.lang.CharSequence) defaultValue(fields()[3]);
        return record;
      } catch (org.apache.avro.AvroMissingFieldException e) {
        throw e;
      } catch (java.lang.Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumWriter<RecordChemical>
    WRITER$ = (org.apache.avro.io.DatumWriter<RecordChemical>)MODEL$.createDatumWriter(SCHEMA$);

  @Override public void writeExternal(java.io.ObjectOutput out)
    throws java.io.IOException {
    WRITER$.write(this, SpecificData.getEncoder(out));
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumReader<RecordChemical>
    READER$ = (org.apache.avro.io.DatumReader<RecordChemical>)MODEL$.createDatumReader(SCHEMA$);

  @Override public void readExternal(java.io.ObjectInput in)
    throws java.io.IOException {
    READER$.read(this, SpecificData.getDecoder(in));
  }

  @Override protected boolean hasCustomCoders() { return true; }

  @Override public void customEncode(org.apache.avro.io.Encoder out)
    throws java.io.IOException
  {
    out.writeInt(this.chemCode);

    out.writeString(this.chemName);

    if (this.chemValue == null) {
      out.writeIndex(0);
      out.writeNull();
    } else {
      out.writeIndex(1);
      out.writeString(this.chemValue);
    }

    if (this.chemFormat == null) {
      out.writeIndex(0);
      out.writeNull();
    } else {
      out.writeIndex(1);
      out.writeString(this.chemFormat);
    }

  }

  @Override public void customDecode(org.apache.avro.io.ResolvingDecoder in)
    throws java.io.IOException
  {
    org.apache.avro.Schema.Field[] fieldOrder = in.readFieldOrderIfDiff();
    if (fieldOrder == null) {
      this.chemCode = in.readInt();

      this.chemName = in.readString(this.chemName instanceof Utf8 ? (Utf8)this.chemName : null);

      if (in.readIndex() != 1) {
        in.readNull();
        this.chemValue = null;
      } else {
        this.chemValue = in.readString(this.chemValue instanceof Utf8 ? (Utf8)this.chemValue : null);
      }

      if (in.readIndex() != 1) {
        in.readNull();
        this.chemFormat = null;
      } else {
        this.chemFormat = in.readString(this.chemFormat instanceof Utf8 ? (Utf8)this.chemFormat : null);
      }

    } else {
      for (int i = 0; i < 4; i++) {
        switch (fieldOrder[i].pos()) {
        case 0:
          this.chemCode = in.readInt();
          break;

        case 1:
          this.chemName = in.readString(this.chemName instanceof Utf8 ? (Utf8)this.chemName : null);
          break;

        case 2:
          if (in.readIndex() != 1) {
            in.readNull();
            this.chemValue = null;
          } else {
            this.chemValue = in.readString(this.chemValue instanceof Utf8 ? (Utf8)this.chemValue : null);
          }
          break;

        case 3:
          if (in.readIndex() != 1) {
            in.readNull();
            this.chemFormat = null;
          } else {
            this.chemFormat = in.readString(this.chemFormat instanceof Utf8 ? (Utf8)this.chemFormat : null);
          }
          break;

        default:
          throw new java.io.IOException("Corrupt ResolvingDecoder.");
        }
      }
    }
  }
}









