/**
 * Autogenerated by Avro
 * <p>
 * DO NOT EDIT DIRECTLY
 */
package nlmk.l3.pdm;

import org.apache.avro.message.BinaryMessageDecoder;
import org.apache.avro.message.BinaryMessageEncoder;
import org.apache.avro.message.SchemaStore;
import org.apache.avro.specific.SpecificData;
import org.apache.avro.util.Utf8;

@org.apache.avro.specific.AvroGenerated
public class SpTolLength extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
    private static final long serialVersionUID = 6805534947029591098L;
    public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"SpTolLength\",\"namespace\":\"nlmk.l3.pdm\",\"fields\":[{\"name\":\"ts\",\"type\":\"string\"},{\"name\":\"op\",\"type\":{\"type\":\"enum\",\"name\":\"opEnum\",\"symbols\":[\"I\",\"U\",\"D\"]}},{\"name\":\"pk\",\"type\":{\"type\":\"record\",\"name\":\"Pk\",\"fields\":[{\"name\":\"systemCode\",\"type\":\"string\"},{\"name\":\"directoryId\",\"type\":\"string\"},{\"name\":\"Id\",\"type\":\"string\"}]}},{\"name\":\"data\",\"type\":{\"type\":\"record\",\"name\":\"Data\",\"fields\":[{\"name\":\"specifications\",\"type\":{\"type\":\"array\",\"items\":{\"type\":\"record\",\"name\":\"Spec\",\"fields\":[{\"name\":\"specCode\",\"type\":\"int\"},{\"name\":\"specName\",\"type\":\"string\"},{\"name\":\"specTypeCode\",\"type\":\"int\"},{\"name\":\"specValue\",\"type\":\"string\"},{\"name\":\"specMeasure\",\"type\":\"string\"}]}}}]}}]}");

    public static org.apache.avro.Schema getClassSchema() {
        return SCHEMA$;
    }

    private static SpecificData MODEL$ = new SpecificData();

    private static final BinaryMessageEncoder<SpTolLength> ENCODER =
            new BinaryMessageEncoder<SpTolLength>(MODEL$, SCHEMA$);

    private static final BinaryMessageDecoder<SpTolLength> DECODER =
            new BinaryMessageDecoder<SpTolLength>(MODEL$, SCHEMA$);

    /**
     * Return the BinaryMessageEncoder instance used by this class.
     * @return the message encoder used by this class
     */
    public static BinaryMessageEncoder<SpTolLength> getEncoder() {
        return ENCODER;
    }

    /**
     * Return the BinaryMessageDecoder instance used by this class.
     * @return the message decoder used by this class
     */
    public static BinaryMessageDecoder<SpTolLength> getDecoder() {
        return DECODER;
    }

    /**
     * Create a new BinaryMessageDecoder instance for this class that uses the specified {@link SchemaStore}.
     * @param resolver a {@link SchemaStore} used to find schemas by fingerprint
     * @return a BinaryMessageDecoder instance for this class backed by the given SchemaStore
     */
    public static BinaryMessageDecoder<SpTolLength> createDecoder(SchemaStore resolver) {
        return new BinaryMessageDecoder<SpTolLength>(MODEL$, SCHEMA$, resolver);
    }

    /**
     * Serializes this SpTolLength to a ByteBuffer.
     * @return a buffer holding the serialized data for this instance
     * @throws java.io.IOException if this instance could not be serialized
     */
    public java.nio.ByteBuffer toByteBuffer() throws java.io.IOException {
        return ENCODER.encode(this);
    }

    /**
     * Deserializes a SpTolLength from a ByteBuffer.
     * @param b a byte buffer holding serialized data for an instance of this class
     * @return a SpTolLength instance decoded from the given buffer
     * @throws java.io.IOException if the given bytes could not be deserialized into an instance of this class
     */
    public static SpTolLength fromByteBuffer(
            java.nio.ByteBuffer b) throws java.io.IOException {
        return DECODER.decode(b);
    }

    private CharSequence ts;
    private opEnum op;
    private Pk pk;
    private Data data;

    /**
     * Default constructor.  Note that this does not initialize fields
     * to their default values from the schema.  If that is desired then
     * one should use <code>newBuilder()</code>.
     */
    public SpTolLength() {
    }

    /**
     * All-args constructor.
     * @param ts The new value for ts
     * @param op The new value for op
     * @param pk The new value for pk
     * @param data The new value for data
     */
    public SpTolLength(CharSequence ts, opEnum op, Pk pk, Data data) {
        this.ts = ts;
        this.op = op;
        this.pk = pk;
        this.data = data;
    }

    public SpecificData getSpecificData() {
        return MODEL$;
    }

    public org.apache.avro.Schema getSchema() {
        return SCHEMA$;
    }

    // Used by DatumWriter.  Applications should not call.
    public Object get(int field$) {
        switch (field$) {
            case 0:
                return ts;
            case 1:
                return op;
            case 2:
                return pk;
            case 3:
                return data;
            default:
                throw new IndexOutOfBoundsException("Invalid index: " + field$);
        }
    }

    // Used by DatumReader.  Applications should not call.
    @SuppressWarnings(value = "unchecked")
    public void put(int field$, Object value$) {
        switch (field$) {
            case 0:
                ts = (CharSequence) value$;
                break;
            case 1:
                op = (opEnum) value$;
                break;
            case 2:
                pk = (Pk) value$;
                break;
            case 3:
                data = (Data) value$;
                break;
            default:
                throw new IndexOutOfBoundsException("Invalid index: " + field$);
        }
    }

    /**
     * Gets the value of the 'ts' field.
     * @return The value of the 'ts' field.
     */
    public CharSequence getTs() {
        return ts;
    }


    /**
     * Sets the value of the 'ts' field.
     * @param value the value to set.
     */
    public void setTs(CharSequence value) {
        this.ts = value;
    }

    /**
     * Gets the value of the 'op' field.
     * @return The value of the 'op' field.
     */
    public opEnum getOp() {
        return op;
    }


    /**
     * Sets the value of the 'op' field.
     * @param value the value to set.
     */
    public void setOp(opEnum value) {
        this.op = value;
    }

    /**
     * Gets the value of the 'pk' field.
     * @return The value of the 'pk' field.
     */
    public Pk getPk() {
        return pk;
    }


    /**
     * Sets the value of the 'pk' field.
     * @param value the value to set.
     */
    public void setPk(Pk value) {
        this.pk = value;
    }

    /**
     * Gets the value of the 'data' field.
     * @return The value of the 'data' field.
     */
    public Data getData() {
        return data;
    }


    /**
     * Sets the value of the 'data' field.
     * @param value the value to set.
     */
    public void setData(Data value) {
        this.data = value;
    }

    /**
     * Creates a new SpTolLength RecordBuilder.
     * @return A new SpTolLength RecordBuilder
     */
    public static Builder newBuilder() {
        return new Builder();
    }

    /**
     * Creates a new SpTolLength RecordBuilder by copying an existing Builder.
     * @param other The existing builder to copy.
     * @return A new SpTolLength RecordBuilder
     */
    public static Builder newBuilder(Builder other) {
        if (other == null) {
            return new Builder();
        } else {
            return new Builder(other);
        }
    }

    /**
     * Creates a new SpTolLength RecordBuilder by copying an existing SpTolLength instance.
     * @param other The existing instance to copy.
     * @return A new SpTolLength RecordBuilder
     */
    public static Builder newBuilder(SpTolLength other) {
        if (other == null) {
            return new Builder();
        } else {
            return new Builder(other);
        }
    }

    /**
     * RecordBuilder for SpTolLength instances.
     */
    @org.apache.avro.specific.AvroGenerated
    public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<SpTolLength>
            implements org.apache.avro.data.RecordBuilder<SpTolLength> {

        private CharSequence ts;
        private opEnum op;
        private Pk pk;
        private Pk.Builder pkBuilder;
        private Data data;
        private Data.Builder dataBuilder;

        /** Creates a new Builder */
        private Builder() {
            super(SCHEMA$);
        }

        /**
         * Creates a Builder by copying an existing Builder.
         * @param other The existing Builder to copy.
         */
        private Builder(Builder other) {
            super(other);
            if (isValidValue(fields()[0], other.ts)) {
                this.ts = data().deepCopy(fields()[0].schema(), other.ts);
                fieldSetFlags()[0] = other.fieldSetFlags()[0];
            }
            if (isValidValue(fields()[1], other.op)) {
                this.op = data().deepCopy(fields()[1].schema(), other.op);
                fieldSetFlags()[1] = other.fieldSetFlags()[1];
            }
            if (isValidValue(fields()[2], other.pk)) {
                this.pk = data().deepCopy(fields()[2].schema(), other.pk);
                fieldSetFlags()[2] = other.fieldSetFlags()[2];
            }
            if (other.hasPkBuilder()) {
                this.pkBuilder = Pk.newBuilder(other.getPkBuilder());
            }
            if (isValidValue(fields()[3], other.data)) {
                this.data = data().deepCopy(fields()[3].schema(), other.data);
                fieldSetFlags()[3] = other.fieldSetFlags()[3];
            }
            if (other.hasDataBuilder()) {
                this.dataBuilder = Data.newBuilder(other.getDataBuilder());
            }
        }

        /**
         * Creates a Builder by copying an existing SpTolLength instance
         * @param other The existing instance to copy.
         */
        private Builder(SpTolLength other) {
            super(SCHEMA$);
            if (isValidValue(fields()[0], other.ts)) {
                this.ts = data().deepCopy(fields()[0].schema(), other.ts);
                fieldSetFlags()[0] = true;
            }
            if (isValidValue(fields()[1], other.op)) {
                this.op = data().deepCopy(fields()[1].schema(), other.op);
                fieldSetFlags()[1] = true;
            }
            if (isValidValue(fields()[2], other.pk)) {
                this.pk = data().deepCopy(fields()[2].schema(), other.pk);
                fieldSetFlags()[2] = true;
            }
            this.pkBuilder = null;
            if (isValidValue(fields()[3], other.data)) {
                this.data = data().deepCopy(fields()[3].schema(), other.data);
                fieldSetFlags()[3] = true;
            }
            this.dataBuilder = null;
        }

        /**
         * Gets the value of the 'ts' field.
         * @return The value.
         */
        public CharSequence getTs() {
            return ts;
        }


        /**
         * Sets the value of the 'ts' field.
         * @param value The value of 'ts'.
         * @return This builder.
         */
        public Builder setTs(CharSequence value) {
            validate(fields()[0], value);
            this.ts = value;
            fieldSetFlags()[0] = true;
            return this;
        }

        /**
         * Checks whether the 'ts' field has been set.
         * @return True if the 'ts' field has been set, false otherwise.
         */
        public boolean hasTs() {
            return fieldSetFlags()[0];
        }


        /**
         * Clears the value of the 'ts' field.
         * @return This builder.
         */
        public Builder clearTs() {
            ts = null;
            fieldSetFlags()[0] = false;
            return this;
        }

        /**
         * Gets the value of the 'op' field.
         * @return The value.
         */
        public opEnum getOp() {
            return op;
        }


        /**
         * Sets the value of the 'op' field.
         * @param value The value of 'op'.
         * @return This builder.
         */
        public Builder setOp(opEnum value) {
            validate(fields()[1], value);
            this.op = value;
            fieldSetFlags()[1] = true;
            return this;
        }

        /**
         * Checks whether the 'op' field has been set.
         * @return True if the 'op' field has been set, false otherwise.
         */
        public boolean hasOp() {
            return fieldSetFlags()[1];
        }


        /**
         * Clears the value of the 'op' field.
         * @return This builder.
         */
        public Builder clearOp() {
            op = null;
            fieldSetFlags()[1] = false;
            return this;
        }

        /**
         * Gets the value of the 'pk' field.
         * @return The value.
         */
        public Pk getPk() {
            return pk;
        }


        /**
         * Sets the value of the 'pk' field.
         * @param value The value of 'pk'.
         * @return This builder.
         */
        public Builder setPk(Pk value) {
            validate(fields()[2], value);
            this.pkBuilder = null;
            this.pk = value;
            fieldSetFlags()[2] = true;
            return this;
        }

        /**
         * Checks whether the 'pk' field has been set.
         * @return True if the 'pk' field has been set, false otherwise.
         */
        public boolean hasPk() {
            return fieldSetFlags()[2];
        }

        /**
         * Gets the Builder instance for the 'pk' field and creates one if it doesn't exist yet.
         * @return This builder.
         */
        public Pk.Builder getPkBuilder() {
            if (pkBuilder == null) {
                if (hasPk()) {
                    setPkBuilder(Pk.newBuilder(pk));
                } else {
                    setPkBuilder(Pk.newBuilder());
                }
            }
            return pkBuilder;
        }

        /**
         * Sets the Builder instance for the 'pk' field
         * @param value The builder instance that must be set.
         * @return This builder.
         */

        public Builder setPkBuilder(Pk.Builder value) {
            clearPk();
            pkBuilder = value;
            return this;
        }

        /**
         * Checks whether the 'pk' field has an active Builder instance
         * @return True if the 'pk' field has an active Builder instance
         */
        public boolean hasPkBuilder() {
            return pkBuilder != null;
        }

        /**
         * Clears the value of the 'pk' field.
         * @return This builder.
         */
        public Builder clearPk() {
            pk = null;
            pkBuilder = null;
            fieldSetFlags()[2] = false;
            return this;
        }

        /**
         * Gets the value of the 'data' field.
         * @return The value.
         */
        public Data getData() {
            return data;
        }


        /**
         * Sets the value of the 'data' field.
         * @param value The value of 'data'.
         * @return This builder.
         */
        public Builder setData(Data value) {
            validate(fields()[3], value);
            this.dataBuilder = null;
            this.data = value;
            fieldSetFlags()[3] = true;
            return this;
        }

        /**
         * Checks whether the 'data' field has been set.
         * @return True if the 'data' field has been set, false otherwise.
         */
        public boolean hasData() {
            return fieldSetFlags()[3];
        }

        /**
         * Gets the Builder instance for the 'data' field and creates one if it doesn't exist yet.
         * @return This builder.
         */
        public Data.Builder getDataBuilder() {
            if (dataBuilder == null) {
                if (hasData()) {
                    setDataBuilder(Data.newBuilder(data));
                } else {
                    setDataBuilder(Data.newBuilder());
                }
            }
            return dataBuilder;
        }

        /**
         * Sets the Builder instance for the 'data' field
         * @param value The builder instance that must be set.
         * @return This builder.
         */

        public Builder setDataBuilder(Data.Builder value) {
            clearData();
            dataBuilder = value;
            return this;
        }

        /**
         * Checks whether the 'data' field has an active Builder instance
         * @return True if the 'data' field has an active Builder instance
         */
        public boolean hasDataBuilder() {
            return dataBuilder != null;
        }

        /**
         * Clears the value of the 'data' field.
         * @return This builder.
         */
        public Builder clearData() {
            data = null;
            dataBuilder = null;
            fieldSetFlags()[3] = false;
            return this;
        }

        @Override
        @SuppressWarnings("unchecked")
        public SpTolLength build() {
            try {
                SpTolLength record = new SpTolLength();
                record.ts = fieldSetFlags()[0] ? this.ts : (CharSequence) defaultValue(fields()[0]);
                record.op = fieldSetFlags()[1] ? this.op : (opEnum) defaultValue(fields()[1]);
                if (pkBuilder != null) {
                    try {
                        record.pk = this.pkBuilder.build();
                    } catch (org.apache.avro.AvroMissingFieldException e) {
                        e.addParentField(record.getSchema().getField("pk"));
                        throw e;
                    }
                } else {
                    record.pk = fieldSetFlags()[2] ? this.pk : (Pk) defaultValue(fields()[2]);
                }
                if (dataBuilder != null) {
                    try {
                        record.data = this.dataBuilder.build();
                    } catch (org.apache.avro.AvroMissingFieldException e) {
                        e.addParentField(record.getSchema().getField("data"));
                        throw e;
                    }
                } else {
                    record.data = fieldSetFlags()[3] ? this.data : (Data) defaultValue(fields()[3]);
                }
                return record;
            } catch (org.apache.avro.AvroMissingFieldException e) {
                throw e;
            } catch (Exception e) {
                throw new org.apache.avro.AvroRuntimeException(e);
            }
        }
    }

    @SuppressWarnings("unchecked")
    private static final org.apache.avro.io.DatumWriter<SpTolLength>
            WRITER$ = (org.apache.avro.io.DatumWriter<SpTolLength>) MODEL$.createDatumWriter(SCHEMA$);

    @Override
    public void writeExternal(java.io.ObjectOutput out)
            throws java.io.IOException {
        WRITER$.write(this, SpecificData.getEncoder(out));
    }

    @SuppressWarnings("unchecked")
    private static final org.apache.avro.io.DatumReader<SpTolLength>
            READER$ = (org.apache.avro.io.DatumReader<SpTolLength>) MODEL$.createDatumReader(SCHEMA$);

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
        out.writeString(this.ts);

        out.writeEnum(this.op.ordinal());

        this.pk.customEncode(out);

        this.data.customEncode(out);

    }

    @Override
    public void customDecode(org.apache.avro.io.ResolvingDecoder in)
            throws java.io.IOException {
        org.apache.avro.Schema.Field[] fieldOrder = in.readFieldOrderIfDiff();
        if (fieldOrder == null) {
            this.ts = in.readString(this.ts instanceof Utf8 ? (Utf8) this.ts : null);

            this.op = opEnum.values()[in.readEnum()];

            if (this.pk == null) {
                this.pk = new Pk();
            }
            this.pk.customDecode(in);

            if (this.data == null) {
                this.data = new Data();
            }
            this.data.customDecode(in);

        } else {
            for (int i = 0; i < 4; i++) {
                switch (fieldOrder[i].pos()) {
                    case 0:
                        this.ts = in.readString(this.ts instanceof Utf8 ? (Utf8) this.ts : null);
                        break;

                    case 1:
                        this.op = opEnum.values()[in.readEnum()];
                        break;

                    case 2:
                        if (this.pk == null) {
                            this.pk = new Pk();
                        }
                        this.pk.customDecode(in);
                        break;

                    case 3:
                        if (this.data == null) {
                            this.data = new Data();
                        }
                        this.data.customDecode(in);
                        break;

                    default:
                        throw new java.io.IOException("Corrupt ResolvingDecoder.");
                }
            }
        }
    }
}









