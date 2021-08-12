/**
 * Autogenerated by Avro
 * <p>
 * DO NOT EDIT DIRECTLY
 */
package unrecoverableparameterstrends.nlmk.l3.sup;

import org.apache.avro.generic.GenericArray;
import org.apache.avro.specific.SpecificData;
import org.apache.avro.util.Utf8;
import org.apache.avro.message.BinaryMessageEncoder;
import org.apache.avro.message.BinaryMessageDecoder;
import org.apache.avro.message.SchemaStore;

@org.apache.avro.specific.AvroGenerated
public class RecordData extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
    private static final long serialVersionUID = -8563357007306058819L;
    public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"RecordData\",\"namespace\":\"unrecoverableparameterstrends.nlmk.l3.nlmk.l3.sup\",\"fields\":[{\"name\":\"primeID\",\"type\":\"string\",\"doc\":\"Identifikator (ID) edenici EM v pervoistochnike CCM\"},{\"name\":\"kceh\",\"type\":\"int\",\"doc\":\"nomer ceha\"},{\"name\":\"kcehName\",\"type\":\"string\",\"doc\":\"nazvanie ceha\"},{\"name\":\"unitCode\",\"type\":\"int\",\"doc\":\"kod agregata\"},{\"name\":\"unitName\",\"type\":\"string\",\"doc\":\"nazvanie agregata\"},{\"name\":\"werksCode\",\"type\":\"int\",\"doc\":\"kod zavoda\"},{\"name\":\"werksName\",\"type\":\"string\",\"doc\":\"naimenovanie zavoda\"},{\"name\":\"specifications\",\"type\":{\"type\":\"array\",\"items\":{\"type\":\"record\",\"name\":\"RecordSpecifications\",\"fields\":[{\"name\":\"specCode\",\"type\":\"int\",\"doc\":\"kod haracteristiki\"},{\"name\":\"specName\",\"type\":\"string\",\"doc\":\"naimenovanie haracteristiki\"},{\"name\":\"specTypeCode\",\"type\":\"int\",\"doc\":\"tip dannyh (1-string, 2-number, 3-date)\"},{\"name\":\"specTypeName\",\"type\":\"string\",\"doc\":\"naimenovanie tipa dannyh\"},{\"name\":\"specValue\",\"type\":[\"null\",\"float\"],\"doc\":\"znachenie haracteristiki\",\"default\":null},{\"name\":\"specFormat\",\"type\":[\"null\",\"string\"],\"doc\":\"format peredachi haracteristiki\",\"default\":null},{\"name\":\"specMeasure\",\"type\":[\"null\",\"string\"],\"doc\":\"edenica izmereniya\",\"default\":null}]}}}]}");

    public static org.apache.avro.Schema getClassSchema() {
        return SCHEMA$;
    }

    private static SpecificData MODEL$ = new SpecificData();

    private static final BinaryMessageEncoder<RecordData> ENCODER =
            new BinaryMessageEncoder<RecordData>(MODEL$, SCHEMA$);

    private static final BinaryMessageDecoder<RecordData> DECODER =
            new BinaryMessageDecoder<RecordData>(MODEL$, SCHEMA$);

    /**
     * Return the BinaryMessageEncoder instance used by this class.
     * @return the message encoder used by this class
     */
    public static BinaryMessageEncoder<RecordData> getEncoder() {
        return ENCODER;
    }

    /**
     * Return the BinaryMessageDecoder instance used by this class.
     * @return the message decoder used by this class
     */
    public static BinaryMessageDecoder<RecordData> getDecoder() {
        return DECODER;
    }

    /**
     * Create a new BinaryMessageDecoder instance for this class that uses the specified {@link SchemaStore}.
     * @param resolver a {@link SchemaStore} used to find schemas by fingerprint
     * @return a BinaryMessageDecoder instance for this class backed by the given SchemaStore
     */
    public static BinaryMessageDecoder<RecordData> createDecoder(SchemaStore resolver) {
        return new BinaryMessageDecoder<RecordData>(MODEL$, SCHEMA$, resolver);
    }

    /**
     * Serializes this RecordData to a ByteBuffer.
     * @return a buffer holding the serialized data for this instance
     * @throws java.io.IOException if this instance could not be serialized
     */
    public java.nio.ByteBuffer toByteBuffer() throws java.io.IOException {
        return ENCODER.encode(this);
    }

    /**
     * Deserializes a RecordData from a ByteBuffer.
     * @param b a byte buffer holding serialized data for an instance of this class
     * @return a RecordData instance decoded from the given buffer
     * @throws java.io.IOException if the given bytes could not be deserialized into an instance of this class
     */
    public static RecordData fromByteBuffer(
            java.nio.ByteBuffer b) throws java.io.IOException {
        return DECODER.decode(b);
    }

    /** Identifikator (ID) edenici EM v pervoistochnike CCM */
    private java.lang.CharSequence primeID;
    /** nomer ceha */
    private int kceh;
    /** nazvanie ceha */
    private java.lang.CharSequence kcehName;
    /** kod agregata */
    private int unitCode;
    /** nazvanie agregata */
    private java.lang.CharSequence unitName;
    /** kod zavoda */
    private int werksCode;
    /** naimenovanie zavoda */
    private java.lang.CharSequence werksName;
    private java.util.List<unrecoverableparameterstrends.nlmk.l3.sup.RecordSpecifications> specifications;

    /**
     * Default constructor.  Note that this does not initialize fields
     * to their default values from the schema.  If that is desired then
     * one should use <code>newBuilder()</code>.
     */
    public RecordData() {
    }

    /**
     * All-args constructor.
     * @param primeID Identifikator (ID) edenici EM v pervoistochnike CCM
     * @param kceh nomer ceha
     * @param kcehName nazvanie ceha
     * @param unitCode kod agregata
     * @param unitName nazvanie agregata
     * @param werksCode kod zavoda
     * @param werksName naimenovanie zavoda
     * @param specifications The new value for specifications
     */
    public RecordData(java.lang.CharSequence primeID, java.lang.Integer kceh, java.lang.CharSequence kcehName, java.lang.Integer unitCode, java.lang.CharSequence unitName, java.lang.Integer werksCode, java.lang.CharSequence werksName, java.util.List<unrecoverableparameterstrends.nlmk.l3.sup.RecordSpecifications> specifications) {
        this.primeID = primeID;
        this.kceh = kceh;
        this.kcehName = kcehName;
        this.unitCode = unitCode;
        this.unitName = unitName;
        this.werksCode = werksCode;
        this.werksName = werksName;
        this.specifications = specifications;
    }

    public org.apache.avro.specific.SpecificData getSpecificData() {
        return MODEL$;
    }

    public org.apache.avro.Schema getSchema() {
        return SCHEMA$;
    }

    // Used by DatumWriter.  Applications should not call.
    public java.lang.Object get(int field$) {
        switch (field$) {
            case 0:
                return primeID;
            case 1:
                return kceh;
            case 2:
                return kcehName;
            case 3:
                return unitCode;
            case 4:
                return unitName;
            case 5:
                return werksCode;
            case 6:
                return werksName;
            case 7:
                return specifications;
            default:
                throw new IndexOutOfBoundsException("Invalid index: " + field$);
        }
    }

    // Used by DatumReader.  Applications should not call.
    @SuppressWarnings(value = "unchecked")
    public void put(int field$, java.lang.Object value$) {
        switch (field$) {
            case 0:
                primeID = (java.lang.CharSequence) value$;
                break;
            case 1:
                kceh = (java.lang.Integer) value$;
                break;
            case 2:
                kcehName = (java.lang.CharSequence) value$;
                break;
            case 3:
                unitCode = (java.lang.Integer) value$;
                break;
            case 4:
                unitName = (java.lang.CharSequence) value$;
                break;
            case 5:
                werksCode = (java.lang.Integer) value$;
                break;
            case 6:
                werksName = (java.lang.CharSequence) value$;
                break;
            case 7:
                specifications = (java.util.List<unrecoverableparameterstrends.nlmk.l3.sup.RecordSpecifications>) value$;
                break;
            default:
                throw new IndexOutOfBoundsException("Invalid index: " + field$);
        }
    }

    /**
     * Gets the value of the 'primeID' field.
     * @return Identifikator (ID) edenici EM v pervoistochnike CCM
     */
    public java.lang.CharSequence getPrimeID() {
        return primeID;
    }


    /**
     * Sets the value of the 'primeID' field.
     * Identifikator (ID) edenici EM v pervoistochnike CCM
     * @param value the value to set.
     */
    public void setPrimeID(java.lang.CharSequence value) {
        this.primeID = value;
    }

    /**
     * Gets the value of the 'kceh' field.
     * @return nomer ceha
     */
    public int getKceh() {
        return kceh;
    }


    /**
     * Sets the value of the 'kceh' field.
     * nomer ceha
     * @param value the value to set.
     */
    public void setKceh(int value) {
        this.kceh = value;
    }

    /**
     * Gets the value of the 'kcehName' field.
     * @return nazvanie ceha
     */
    public java.lang.CharSequence getKcehName() {
        return kcehName;
    }


    /**
     * Sets the value of the 'kcehName' field.
     * nazvanie ceha
     * @param value the value to set.
     */
    public void setKcehName(java.lang.CharSequence value) {
        this.kcehName = value;
    }

    /**
     * Gets the value of the 'unitCode' field.
     * @return kod agregata
     */
    public int getUnitCode() {
        return unitCode;
    }


    /**
     * Sets the value of the 'unitCode' field.
     * kod agregata
     * @param value the value to set.
     */
    public void setUnitCode(int value) {
        this.unitCode = value;
    }

    /**
     * Gets the value of the 'unitName' field.
     * @return nazvanie agregata
     */
    public java.lang.CharSequence getUnitName() {
        return unitName;
    }


    /**
     * Sets the value of the 'unitName' field.
     * nazvanie agregata
     * @param value the value to set.
     */
    public void setUnitName(java.lang.CharSequence value) {
        this.unitName = value;
    }

    /**
     * Gets the value of the 'werksCode' field.
     * @return kod zavoda
     */
    public int getWerksCode() {
        return werksCode;
    }


    /**
     * Sets the value of the 'werksCode' field.
     * kod zavoda
     * @param value the value to set.
     */
    public void setWerksCode(int value) {
        this.werksCode = value;
    }

    /**
     * Gets the value of the 'werksName' field.
     * @return naimenovanie zavoda
     */
    public java.lang.CharSequence getWerksName() {
        return werksName;
    }


    /**
     * Sets the value of the 'werksName' field.
     * naimenovanie zavoda
     * @param value the value to set.
     */
    public void setWerksName(java.lang.CharSequence value) {
        this.werksName = value;
    }

    /**
     * Gets the value of the 'specifications' field.
     * @return The value of the 'specifications' field.
     */
    public java.util.List<unrecoverableparameterstrends.nlmk.l3.sup.RecordSpecifications> getSpecifications() {
        return specifications;
    }


    /**
     * Sets the value of the 'specifications' field.
     * @param value the value to set.
     */
    public void setSpecifications(java.util.List<unrecoverableparameterstrends.nlmk.l3.sup.RecordSpecifications> value) {
        this.specifications = value;
    }

    /**
     * Creates a new RecordData RecordBuilder.
     * @return A new RecordData RecordBuilder
     */
    public static unrecoverableparameterstrends.nlmk.l3.sup.RecordData.Builder newBuilder() {
        return new unrecoverableparameterstrends.nlmk.l3.sup.RecordData.Builder();
    }

    /**
     * Creates a new RecordData RecordBuilder by copying an existing Builder.
     * @param other The existing builder to copy.
     * @return A new RecordData RecordBuilder
     */
    public static unrecoverableparameterstrends.nlmk.l3.sup.RecordData.Builder newBuilder(unrecoverableparameterstrends.nlmk.l3.sup.RecordData.Builder other) {
        if (other == null) {
            return new unrecoverableparameterstrends.nlmk.l3.sup.RecordData.Builder();
        } else {
            return new unrecoverableparameterstrends.nlmk.l3.sup.RecordData.Builder(other);
        }
    }

    /**
     * Creates a new RecordData RecordBuilder by copying an existing RecordData instance.
     * @param other The existing instance to copy.
     * @return A new RecordData RecordBuilder
     */
    public static unrecoverableparameterstrends.nlmk.l3.sup.RecordData.Builder newBuilder(unrecoverableparameterstrends.nlmk.l3.sup.RecordData other) {
        if (other == null) {
            return new unrecoverableparameterstrends.nlmk.l3.sup.RecordData.Builder();
        } else {
            return new unrecoverableparameterstrends.nlmk.l3.sup.RecordData.Builder(other);
        }
    }

    /**
     * RecordBuilder for RecordData instances.
     */
    @org.apache.avro.specific.AvroGenerated
    public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<RecordData>
            implements org.apache.avro.data.RecordBuilder<RecordData> {

        /** Identifikator (ID) edenici EM v pervoistochnike CCM */
        private java.lang.CharSequence primeID;
        /** nomer ceha */
        private int kceh;
        /** nazvanie ceha */
        private java.lang.CharSequence kcehName;
        /** kod agregata */
        private int unitCode;
        /** nazvanie agregata */
        private java.lang.CharSequence unitName;
        /** kod zavoda */
        private int werksCode;
        /** naimenovanie zavoda */
        private java.lang.CharSequence werksName;
        private java.util.List<unrecoverableparameterstrends.nlmk.l3.sup.RecordSpecifications> specifications;

        /** Creates a new Builder */
        private Builder() {
            super(SCHEMA$);
        }

        /**
         * Creates a Builder by copying an existing Builder.
         * @param other The existing Builder to copy.
         */
        private Builder(unrecoverableparameterstrends.nlmk.l3.sup.RecordData.Builder other) {
            super(other);
            if (isValidValue(fields()[0], other.primeID)) {
                this.primeID = data().deepCopy(fields()[0].schema(), other.primeID);
                fieldSetFlags()[0] = other.fieldSetFlags()[0];
            }
            if (isValidValue(fields()[1], other.kceh)) {
                this.kceh = data().deepCopy(fields()[1].schema(), other.kceh);
                fieldSetFlags()[1] = other.fieldSetFlags()[1];
            }
            if (isValidValue(fields()[2], other.kcehName)) {
                this.kcehName = data().deepCopy(fields()[2].schema(), other.kcehName);
                fieldSetFlags()[2] = other.fieldSetFlags()[2];
            }
            if (isValidValue(fields()[3], other.unitCode)) {
                this.unitCode = data().deepCopy(fields()[3].schema(), other.unitCode);
                fieldSetFlags()[3] = other.fieldSetFlags()[3];
            }
            if (isValidValue(fields()[4], other.unitName)) {
                this.unitName = data().deepCopy(fields()[4].schema(), other.unitName);
                fieldSetFlags()[4] = other.fieldSetFlags()[4];
            }
            if (isValidValue(fields()[5], other.werksCode)) {
                this.werksCode = data().deepCopy(fields()[5].schema(), other.werksCode);
                fieldSetFlags()[5] = other.fieldSetFlags()[5];
            }
            if (isValidValue(fields()[6], other.werksName)) {
                this.werksName = data().deepCopy(fields()[6].schema(), other.werksName);
                fieldSetFlags()[6] = other.fieldSetFlags()[6];
            }
            if (isValidValue(fields()[7], other.specifications)) {
                this.specifications = data().deepCopy(fields()[7].schema(), other.specifications);
                fieldSetFlags()[7] = other.fieldSetFlags()[7];
            }
        }

        /**
         * Creates a Builder by copying an existing RecordData instance
         * @param other The existing instance to copy.
         */
        private Builder(unrecoverableparameterstrends.nlmk.l3.sup.RecordData other) {
            super(SCHEMA$);
            if (isValidValue(fields()[0], other.primeID)) {
                this.primeID = data().deepCopy(fields()[0].schema(), other.primeID);
                fieldSetFlags()[0] = true;
            }
            if (isValidValue(fields()[1], other.kceh)) {
                this.kceh = data().deepCopy(fields()[1].schema(), other.kceh);
                fieldSetFlags()[1] = true;
            }
            if (isValidValue(fields()[2], other.kcehName)) {
                this.kcehName = data().deepCopy(fields()[2].schema(), other.kcehName);
                fieldSetFlags()[2] = true;
            }
            if (isValidValue(fields()[3], other.unitCode)) {
                this.unitCode = data().deepCopy(fields()[3].schema(), other.unitCode);
                fieldSetFlags()[3] = true;
            }
            if (isValidValue(fields()[4], other.unitName)) {
                this.unitName = data().deepCopy(fields()[4].schema(), other.unitName);
                fieldSetFlags()[4] = true;
            }
            if (isValidValue(fields()[5], other.werksCode)) {
                this.werksCode = data().deepCopy(fields()[5].schema(), other.werksCode);
                fieldSetFlags()[5] = true;
            }
            if (isValidValue(fields()[6], other.werksName)) {
                this.werksName = data().deepCopy(fields()[6].schema(), other.werksName);
                fieldSetFlags()[6] = true;
            }
            if (isValidValue(fields()[7], other.specifications)) {
                this.specifications = data().deepCopy(fields()[7].schema(), other.specifications);
                fieldSetFlags()[7] = true;
            }
        }

        /**
         * Gets the value of the 'primeID' field.
         * Identifikator (ID) edenici EM v pervoistochnike CCM
         * @return The value.
         */
        public java.lang.CharSequence getPrimeID() {
            return primeID;
        }


        /**
         * Sets the value of the 'primeID' field.
         * Identifikator (ID) edenici EM v pervoistochnike CCM
         * @param value The value of 'primeID'.
         * @return This builder.
         */
        public unrecoverableparameterstrends.nlmk.l3.sup.RecordData.Builder setPrimeID(java.lang.CharSequence value) {
            validate(fields()[0], value);
            this.primeID = value;
            fieldSetFlags()[0] = true;
            return this;
        }

        /**
         * Checks whether the 'primeID' field has been set.
         * Identifikator (ID) edenici EM v pervoistochnike CCM
         * @return True if the 'primeID' field has been set, false otherwise.
         */
        public boolean hasPrimeID() {
            return fieldSetFlags()[0];
        }


        /**
         * Clears the value of the 'primeID' field.
         * Identifikator (ID) edenici EM v pervoistochnike CCM
         * @return This builder.
         */
        public unrecoverableparameterstrends.nlmk.l3.sup.RecordData.Builder clearPrimeID() {
            primeID = null;
            fieldSetFlags()[0] = false;
            return this;
        }

        /**
         * Gets the value of the 'kceh' field.
         * nomer ceha
         * @return The value.
         */
        public int getKceh() {
            return kceh;
        }


        /**
         * Sets the value of the 'kceh' field.
         * nomer ceha
         * @param value The value of 'kceh'.
         * @return This builder.
         */
        public unrecoverableparameterstrends.nlmk.l3.sup.RecordData.Builder setKceh(int value) {
            validate(fields()[1], value);
            this.kceh = value;
            fieldSetFlags()[1] = true;
            return this;
        }

        /**
         * Checks whether the 'kceh' field has been set.
         * nomer ceha
         * @return True if the 'kceh' field has been set, false otherwise.
         */
        public boolean hasKceh() {
            return fieldSetFlags()[1];
        }


        /**
         * Clears the value of the 'kceh' field.
         * nomer ceha
         * @return This builder.
         */
        public unrecoverableparameterstrends.nlmk.l3.sup.RecordData.Builder clearKceh() {
            fieldSetFlags()[1] = false;
            return this;
        }

        /**
         * Gets the value of the 'kcehName' field.
         * nazvanie ceha
         * @return The value.
         */
        public java.lang.CharSequence getKcehName() {
            return kcehName;
        }


        /**
         * Sets the value of the 'kcehName' field.
         * nazvanie ceha
         * @param value The value of 'kcehName'.
         * @return This builder.
         */
        public unrecoverableparameterstrends.nlmk.l3.sup.RecordData.Builder setKcehName(java.lang.CharSequence value) {
            validate(fields()[2], value);
            this.kcehName = value;
            fieldSetFlags()[2] = true;
            return this;
        }

        /**
         * Checks whether the 'kcehName' field has been set.
         * nazvanie ceha
         * @return True if the 'kcehName' field has been set, false otherwise.
         */
        public boolean hasKcehName() {
            return fieldSetFlags()[2];
        }


        /**
         * Clears the value of the 'kcehName' field.
         * nazvanie ceha
         * @return This builder.
         */
        public unrecoverableparameterstrends.nlmk.l3.sup.RecordData.Builder clearKcehName() {
            kcehName = null;
            fieldSetFlags()[2] = false;
            return this;
        }

        /**
         * Gets the value of the 'unitCode' field.
         * kod agregata
         * @return The value.
         */
        public int getUnitCode() {
            return unitCode;
        }


        /**
         * Sets the value of the 'unitCode' field.
         * kod agregata
         * @param value The value of 'unitCode'.
         * @return This builder.
         */
        public unrecoverableparameterstrends.nlmk.l3.sup.RecordData.Builder setUnitCode(int value) {
            validate(fields()[3], value);
            this.unitCode = value;
            fieldSetFlags()[3] = true;
            return this;
        }

        /**
         * Checks whether the 'unitCode' field has been set.
         * kod agregata
         * @return True if the 'unitCode' field has been set, false otherwise.
         */
        public boolean hasUnitCode() {
            return fieldSetFlags()[3];
        }


        /**
         * Clears the value of the 'unitCode' field.
         * kod agregata
         * @return This builder.
         */
        public unrecoverableparameterstrends.nlmk.l3.sup.RecordData.Builder clearUnitCode() {
            fieldSetFlags()[3] = false;
            return this;
        }

        /**
         * Gets the value of the 'unitName' field.
         * nazvanie agregata
         * @return The value.
         */
        public java.lang.CharSequence getUnitName() {
            return unitName;
        }


        /**
         * Sets the value of the 'unitName' field.
         * nazvanie agregata
         * @param value The value of 'unitName'.
         * @return This builder.
         */
        public unrecoverableparameterstrends.nlmk.l3.sup.RecordData.Builder setUnitName(java.lang.CharSequence value) {
            validate(fields()[4], value);
            this.unitName = value;
            fieldSetFlags()[4] = true;
            return this;
        }

        /**
         * Checks whether the 'unitName' field has been set.
         * nazvanie agregata
         * @return True if the 'unitName' field has been set, false otherwise.
         */
        public boolean hasUnitName() {
            return fieldSetFlags()[4];
        }


        /**
         * Clears the value of the 'unitName' field.
         * nazvanie agregata
         * @return This builder.
         */
        public unrecoverableparameterstrends.nlmk.l3.sup.RecordData.Builder clearUnitName() {
            unitName = null;
            fieldSetFlags()[4] = false;
            return this;
        }

        /**
         * Gets the value of the 'werksCode' field.
         * kod zavoda
         * @return The value.
         */
        public int getWerksCode() {
            return werksCode;
        }


        /**
         * Sets the value of the 'werksCode' field.
         * kod zavoda
         * @param value The value of 'werksCode'.
         * @return This builder.
         */
        public unrecoverableparameterstrends.nlmk.l3.sup.RecordData.Builder setWerksCode(int value) {
            validate(fields()[5], value);
            this.werksCode = value;
            fieldSetFlags()[5] = true;
            return this;
        }

        /**
         * Checks whether the 'werksCode' field has been set.
         * kod zavoda
         * @return True if the 'werksCode' field has been set, false otherwise.
         */
        public boolean hasWerksCode() {
            return fieldSetFlags()[5];
        }


        /**
         * Clears the value of the 'werksCode' field.
         * kod zavoda
         * @return This builder.
         */
        public unrecoverableparameterstrends.nlmk.l3.sup.RecordData.Builder clearWerksCode() {
            fieldSetFlags()[5] = false;
            return this;
        }

        /**
         * Gets the value of the 'werksName' field.
         * naimenovanie zavoda
         * @return The value.
         */
        public java.lang.CharSequence getWerksName() {
            return werksName;
        }


        /**
         * Sets the value of the 'werksName' field.
         * naimenovanie zavoda
         * @param value The value of 'werksName'.
         * @return This builder.
         */
        public unrecoverableparameterstrends.nlmk.l3.sup.RecordData.Builder setWerksName(java.lang.CharSequence value) {
            validate(fields()[6], value);
            this.werksName = value;
            fieldSetFlags()[6] = true;
            return this;
        }

        /**
         * Checks whether the 'werksName' field has been set.
         * naimenovanie zavoda
         * @return True if the 'werksName' field has been set, false otherwise.
         */
        public boolean hasWerksName() {
            return fieldSetFlags()[6];
        }


        /**
         * Clears the value of the 'werksName' field.
         * naimenovanie zavoda
         * @return This builder.
         */
        public unrecoverableparameterstrends.nlmk.l3.sup.RecordData.Builder clearWerksName() {
            werksName = null;
            fieldSetFlags()[6] = false;
            return this;
        }

        /**
         * Gets the value of the 'specifications' field.
         * @return The value.
         */
        public java.util.List<unrecoverableparameterstrends.nlmk.l3.sup.RecordSpecifications> getSpecifications() {
            return specifications;
        }


        /**
         * Sets the value of the 'specifications' field.
         * @param value The value of 'specifications'.
         * @return This builder.
         */
        public unrecoverableparameterstrends.nlmk.l3.sup.RecordData.Builder setSpecifications(java.util.List<unrecoverableparameterstrends.nlmk.l3.sup.RecordSpecifications> value) {
            validate(fields()[7], value);
            this.specifications = value;
            fieldSetFlags()[7] = true;
            return this;
        }

        /**
         * Checks whether the 'specifications' field has been set.
         * @return True if the 'specifications' field has been set, false otherwise.
         */
        public boolean hasSpecifications() {
            return fieldSetFlags()[7];
        }


        /**
         * Clears the value of the 'specifications' field.
         * @return This builder.
         */
        public unrecoverableparameterstrends.nlmk.l3.sup.RecordData.Builder clearSpecifications() {
            specifications = null;
            fieldSetFlags()[7] = false;
            return this;
        }

        @Override
        @SuppressWarnings("unchecked")
        public RecordData build() {
            try {
                RecordData record = new RecordData();
                record.primeID = fieldSetFlags()[0] ? this.primeID : (java.lang.CharSequence) defaultValue(fields()[0]);
                record.kceh = fieldSetFlags()[1] ? this.kceh : (java.lang.Integer) defaultValue(fields()[1]);
                record.kcehName = fieldSetFlags()[2] ? this.kcehName : (java.lang.CharSequence) defaultValue(fields()[2]);
                record.unitCode = fieldSetFlags()[3] ? this.unitCode : (java.lang.Integer) defaultValue(fields()[3]);
                record.unitName = fieldSetFlags()[4] ? this.unitName : (java.lang.CharSequence) defaultValue(fields()[4]);
                record.werksCode = fieldSetFlags()[5] ? this.werksCode : (java.lang.Integer) defaultValue(fields()[5]);
                record.werksName = fieldSetFlags()[6] ? this.werksName : (java.lang.CharSequence) defaultValue(fields()[6]);
                record.specifications = fieldSetFlags()[7] ? this.specifications : (java.util.List<unrecoverableparameterstrends.nlmk.l3.sup.RecordSpecifications>) defaultValue(fields()[7]);
                return record;
            } catch (org.apache.avro.AvroMissingFieldException e) {
                throw e;
            } catch (java.lang.Exception e) {
                throw new org.apache.avro.AvroRuntimeException(e);
            }
        }
    }

    @SuppressWarnings("unchecked")
    private static final org.apache.avro.io.DatumWriter<RecordData>
            WRITER$ = (org.apache.avro.io.DatumWriter<RecordData>) MODEL$.createDatumWriter(SCHEMA$);

    @Override
    public void writeExternal(java.io.ObjectOutput out)
            throws java.io.IOException {
        WRITER$.write(this, SpecificData.getEncoder(out));
    }

    @SuppressWarnings("unchecked")
    private static final org.apache.avro.io.DatumReader<RecordData>
            READER$ = (org.apache.avro.io.DatumReader<RecordData>) MODEL$.createDatumReader(SCHEMA$);

    @Override
    public void readExternal(java.io.ObjectInput in)
            throws java.io.IOException {
        READER$.read(this, SpecificData.getDecoder(in));
    }

    @Override
    protected boolean hasCustomCoders() {
        return true;
    }

    @Override
    public void customEncode(org.apache.avro.io.Encoder out)
            throws java.io.IOException {
        out.writeString(this.primeID);

        out.writeInt(this.kceh);

        out.writeString(this.kcehName);

        out.writeInt(this.unitCode);

        out.writeString(this.unitName);

        out.writeInt(this.werksCode);

        out.writeString(this.werksName);

        long size0 = this.specifications.size();
        out.writeArrayStart();
        out.setItemCount(size0);
        long actualSize0 = 0;
        for (unrecoverableparameterstrends.nlmk.l3.sup.RecordSpecifications e0 : this.specifications) {
            actualSize0++;
            out.startItem();
            e0.customEncode(out);
        }
        out.writeArrayEnd();
        if (actualSize0 != size0)
            throw new java.util.ConcurrentModificationException("Array-size written was " + size0 + ", but element count was " + actualSize0 + ".");

    }

    @Override
    public void customDecode(org.apache.avro.io.ResolvingDecoder in)
            throws java.io.IOException {
        org.apache.avro.Schema.Field[] fieldOrder = in.readFieldOrderIfDiff();
        if (fieldOrder == null) {
            this.primeID = in.readString(this.primeID instanceof Utf8 ? (Utf8) this.primeID : null);

            this.kceh = in.readInt();

            this.kcehName = in.readString(this.kcehName instanceof Utf8 ? (Utf8) this.kcehName : null);

            this.unitCode = in.readInt();

            this.unitName = in.readString(this.unitName instanceof Utf8 ? (Utf8) this.unitName : null);

            this.werksCode = in.readInt();

            this.werksName = in.readString(this.werksName instanceof Utf8 ? (Utf8) this.werksName : null);

            long size0 = in.readArrayStart();
            java.util.List<unrecoverableparameterstrends.nlmk.l3.sup.RecordSpecifications> a0 = this.specifications;
            if (a0 == null) {
                a0 = new SpecificData.Array<unrecoverableparameterstrends.nlmk.l3.sup.RecordSpecifications>((int) size0, SCHEMA$.getField("specifications").schema());
                this.specifications = a0;
            } else a0.clear();
            SpecificData.Array<unrecoverableparameterstrends.nlmk.l3.sup.RecordSpecifications> ga0 = (a0 instanceof SpecificData.Array ? (SpecificData.Array<unrecoverableparameterstrends.nlmk.l3.sup.RecordSpecifications>) a0 : null);
            for (; 0 < size0; size0 = in.arrayNext()) {
                for (; size0 != 0; size0--) {
                    unrecoverableparameterstrends.nlmk.l3.sup.RecordSpecifications e0 = (ga0 != null ? ga0.peek() : null);
                    if (e0 == null) {
                        e0 = new unrecoverableparameterstrends.nlmk.l3.sup.RecordSpecifications();
                    }
                    e0.customDecode(in);
                    a0.add(e0);
                }
            }

        } else {
            for (int i = 0; i < 8; i++) {
                switch (fieldOrder[i].pos()) {
                    case 0:
                        this.primeID = in.readString(this.primeID instanceof Utf8 ? (Utf8) this.primeID : null);
                        break;

                    case 1:
                        this.kceh = in.readInt();
                        break;

                    case 2:
                        this.kcehName = in.readString(this.kcehName instanceof Utf8 ? (Utf8) this.kcehName : null);
                        break;

                    case 3:
                        this.unitCode = in.readInt();
                        break;

                    case 4:
                        this.unitName = in.readString(this.unitName instanceof Utf8 ? (Utf8) this.unitName : null);
                        break;

                    case 5:
                        this.werksCode = in.readInt();
                        break;

                    case 6:
                        this.werksName = in.readString(this.werksName instanceof Utf8 ? (Utf8) this.werksName : null);
                        break;

                    case 7:
                        long size0 = in.readArrayStart();
                        java.util.List<unrecoverableparameterstrends.nlmk.l3.sup.RecordSpecifications> a0 = this.specifications;
                        if (a0 == null) {
                            a0 = new SpecificData.Array<unrecoverableparameterstrends.nlmk.l3.sup.RecordSpecifications>((int) size0, SCHEMA$.getField("specifications").schema());
                            this.specifications = a0;
                        } else a0.clear();
                        SpecificData.Array<unrecoverableparameterstrends.nlmk.l3.sup.RecordSpecifications> ga0 = (a0 instanceof SpecificData.Array ? (SpecificData.Array<unrecoverableparameterstrends.nlmk.l3.sup.RecordSpecifications>) a0 : null);
                        for (; 0 < size0; size0 = in.arrayNext()) {
                            for (; size0 != 0; size0--) {
                                unrecoverableparameterstrends.nlmk.l3.sup.RecordSpecifications e0 = (ga0 != null ? ga0.peek() : null);
                                if (e0 == null) {
                                    e0 = new unrecoverableparameterstrends.nlmk.l3.sup.RecordSpecifications();
                                }
                                e0.customDecode(in);
                                a0.add(e0);
                            }
                        }
                        break;

                    default:
                        throw new java.io.IOException("Corrupt ResolvingDecoder.");
                }
            }
        }
    }
}










