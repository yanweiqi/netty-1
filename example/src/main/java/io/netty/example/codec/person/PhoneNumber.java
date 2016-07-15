package io.netty.example.codec.person;

import com.google.protobuf.AbstractParser;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.Descriptors;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessage;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Message;
import com.google.protobuf.Parser;
import com.google.protobuf.UnknownFieldSet;

/**
 * Protobuf type {@code Person.PhoneNumber}
 */
public final class PhoneNumber extends GeneratedMessage implements PhoneNumberOrBuilder {				

	private PhoneNumber(GeneratedMessage.Builder<?> builder) {
		super(builder);
		this.unknownFields = builder.getUnknownFields();
	}

	private PhoneNumber(boolean noInit) {
		this.unknownFields = UnknownFieldSet.getDefaultInstance();
	}

	private static final PhoneNumber defaultInstance;

	public static PhoneNumber getDefaultInstance() {
		return defaultInstance;
	}

	public PhoneNumber getDefaultInstanceForType() {
		return defaultInstance;
	}

	private final UnknownFieldSet unknownFields;

	@java.lang.Override
	public final UnknownFieldSet getUnknownFields() {
		return this.unknownFields;
	}

	private PhoneNumber(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
		initFields();
		int mutable_bitField0_ = 0;
		UnknownFieldSet.Builder unknownFields = UnknownFieldSet.newBuilder();
		try {
			boolean done = false;
			while (!done) {
				int tag = input.readTag();
				switch (tag) {
				case 0:
					done = true;
					break;
				default: {
					if (!parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
						done = true;
					}
					break;
				}
				case 10: {
					ByteString bs = input.readBytes();
					bitField0_ |= 0x00000001;
					number_ = bs;
					break;
				}
				case 16: {
					int rawValue = input.readEnum();
					PhoneType value = PhoneType.valueOf(rawValue);
					if (value == null) {
						unknownFields.mergeVarintField(2, rawValue);
					} else {
						bitField0_ |= 0x00000002;
						type_ = value;
					}
					break;
				}
				}
			}
		} catch (InvalidProtocolBufferException e) {
			throw e.setUnfinishedMessage(this);
		} catch (java.io.IOException e) {
			throw new InvalidProtocolBufferException(e.getMessage()).setUnfinishedMessage(this);
		} finally {
			this.unknownFields = unknownFields.build();
			makeExtensionsImmutable();
		}
	}

	public static final Descriptors.Descriptor getDescriptor() {
		return PersonProbuf.internal_static_Person_PhoneNumber_descriptor;
	}

	protected GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
		return PersonProbuf.internal_static_Person_PhoneNumber_fieldAccessorTable.ensureFieldAccessorsInitialized(PhoneNumber.class, PhoneNumber.Builder.class);
	}

	public static Parser<PhoneNumber> PARSER = new AbstractParser<PhoneNumber>() {
		public PhoneNumber parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
			return new PhoneNumber(input, extensionRegistry);
		}
	};

	@java.lang.Override
	public Parser<PhoneNumber> getParserForType() {
		return PARSER;
	}

	private int bitField0_;
	public static final int NUMBER_FIELD_NUMBER = 1;
	private java.lang.Object number_;

	/**
	 * <code>required string number = 1;</code>
	 */
	public boolean hasNumber() {
		return ((bitField0_ & 0x00000001) == 0x00000001);
	}

	/**
	 * <code>required string number = 1;</code>
	 */
	public java.lang.String getNumber() {
		java.lang.Object ref = number_;
		if (ref instanceof java.lang.String) {
			return (java.lang.String) ref;
		} else {
			ByteString bs = (ByteString) ref;
			java.lang.String s = bs.toStringUtf8();
			if (bs.isValidUtf8()) {
				number_ = s;
			}
			return s;
		}
	}

	/**
	 * <code>required string number = 1;</code>
	 */
	public ByteString getNumberBytes() {
		java.lang.Object ref = number_;
		if (ref instanceof java.lang.String) {
			ByteString b = ByteString.copyFromUtf8((java.lang.String) ref);
			number_ = b;
			return b;
		} else {
			return (ByteString) ref;
		}
	}

	public static final int TYPE_FIELD_NUMBER = 2;
	private PhoneType type_;

	/**
	 * <code>optional .Person.PhoneType type = 2 [default = HOME];</code>
	 */
	public boolean hasType() {
		return ((bitField0_ & 0x00000002) == 0x00000002);
	}

	/**
	 * <code>optional .Person.PhoneType type = 2 [default = HOME];</code>
	 */
	public PhoneType getType() {
		return type_;
	}

	private void initFields() {
		number_ = "";
		type_ = PhoneType.HOME;
	}

	private byte memoizedIsInitialized = -1;

	public final boolean isInitialized() {
		byte isInitialized = memoizedIsInitialized;
		if (isInitialized == 1)
			return true;
		if (isInitialized == 0)
			return false;

		if (!hasNumber()) {
			memoizedIsInitialized = 0;
			return false;
		}
		memoizedIsInitialized = 1;
		return true;
	}

	public void writeTo(CodedOutputStream output) throws java.io.IOException {
		getSerializedSize();
		if (((bitField0_ & 0x00000001) == 0x00000001)) {
			output.writeBytes(1, getNumberBytes());
		}
		if (((bitField0_ & 0x00000002) == 0x00000002)) {
			output.writeEnum(2, type_.getNumber());
		}
		getUnknownFields().writeTo(output);
	}

	private int memoizedSerializedSize = -1;

	public int getSerializedSize() {
		int size = memoizedSerializedSize;
		if (size != -1)
			return size;

		size = 0;
		if (((bitField0_ & 0x00000001) == 0x00000001)) {
			size += CodedOutputStream.computeBytesSize(1, getNumberBytes());
		}
		if (((bitField0_ & 0x00000002) == 0x00000002)) {
			size += CodedOutputStream.computeEnumSize(2, type_.getNumber());
		}
		size += getUnknownFields().getSerializedSize();
		memoizedSerializedSize = size;
		return size;
	}

	private static final long serialVersionUID = 0L;

	@java.lang.Override
	protected java.lang.Object writeReplace() throws java.io.ObjectStreamException {
		return super.writeReplace();
	}

	public static PhoneNumber parseFrom(ByteString data) throws InvalidProtocolBufferException {
		return PARSER.parseFrom(data);
	}

	public static PhoneNumber parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
		return PARSER.parseFrom(data, extensionRegistry);
	}

	public static PhoneNumber parseFrom(byte[] data) throws InvalidProtocolBufferException {
		return PARSER.parseFrom(data);
	}

	public static PhoneNumber parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
		return PARSER.parseFrom(data, extensionRegistry);
	}

	public static PhoneNumber parseFrom(java.io.InputStream input) throws java.io.IOException {
		return PARSER.parseFrom(input);
	}

	public static PhoneNumber parseFrom(java.io.InputStream input, ExtensionRegistryLite extensionRegistry) throws java.io.IOException {
		return PARSER.parseFrom(input, extensionRegistry);
	}

	public static PhoneNumber parseDelimitedFrom(java.io.InputStream input) throws java.io.IOException {
		return PARSER.parseDelimitedFrom(input);
	}

	public static PhoneNumber parseDelimitedFrom(java.io.InputStream input, ExtensionRegistryLite extensionRegistry) throws java.io.IOException {
		return PARSER.parseDelimitedFrom(input, extensionRegistry);
	}

	public static PhoneNumber parseFrom(CodedInputStream input) throws java.io.IOException {
		return PARSER.parseFrom(input);
	}

	public static PhoneNumber parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws java.io.IOException {
		return PARSER.parseFrom(input, extensionRegistry);
	}

	public static PhoneNumber.Builder newBuilder() {
		return Builder.create();
	}

	public PhoneNumber.Builder newBuilderForType() {
		return newBuilder();
	}

	public static PhoneNumber.Builder newBuilder(PhoneNumber prototype) {
		return newBuilder().mergeFrom(prototype);
	}

	public PhoneNumber.Builder toBuilder() {
		return newBuilder(this);
	}

	@java.lang.Override
	protected PhoneNumber.Builder newBuilderForType(GeneratedMessage.BuilderParent parent) {
		PhoneNumber.Builder builder = new Builder(parent);
		return builder;
	}

	/**
	 * Protobuf type {@code Person.PhoneNumber}
	 */
	public static final class Builder extends GeneratedMessage.Builder<PhoneNumber.Builder> implements
			// @@protoc_insertion_point(builder_implements:Person.PhoneNumber)
			PhoneNumberOrBuilder {
		public static final Descriptors.Descriptor getDescriptor() {
			return PersonProbuf.internal_static_Person_PhoneNumber_descriptor;
		}

		protected GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
			return PersonProbuf.internal_static_Person_PhoneNumber_fieldAccessorTable.ensureFieldAccessorsInitialized(PhoneNumber.class, PhoneNumber.Builder.class);
		}

		// Construct using
		// io.netty.example.codec.PersonProbuf.Person.PhoneNumber.newBuilder()
		private Builder() {
			maybeForceBuilderInitialization();
		}

		private Builder(GeneratedMessage.BuilderParent parent) {
			super(parent);
			maybeForceBuilderInitialization();
		}

		private void maybeForceBuilderInitialization() {
			if (GeneratedMessage.alwaysUseFieldBuilders) {
			}
		}

		private static PhoneNumber.Builder create() {
			return new Builder();
		}

		public PhoneNumber.Builder clear() {
			super.clear();
			number_ = "";
			bitField0_ = (bitField0_ & ~0x00000001);
			type_ = PhoneType.HOME;
			bitField0_ = (bitField0_ & ~0x00000002);
			return this;
		}

		public PhoneNumber.Builder clone() {
			return create().mergeFrom(buildPartial());
		}

		public Descriptors.Descriptor getDescriptorForType() {
			return PersonProbuf.internal_static_Person_PhoneNumber_descriptor;
		}

		public PhoneNumber getDefaultInstanceForType() {
			return PhoneNumber.getDefaultInstance();
		}

		public PhoneNumber build() {
			PhoneNumber result = buildPartial();
			if (!result.isInitialized()) {
				throw newUninitializedMessageException(result);
			}
			return result;
		}

		public PhoneNumber buildPartial() {
			PhoneNumber result = new PhoneNumber(this);
			int from_bitField0_ = bitField0_;
			int to_bitField0_ = 0;
			if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
				to_bitField0_ |= 0x00000001;
			}
			result.number_ = number_;
			if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
				to_bitField0_ |= 0x00000002;
			}
			result.type_ = type_;
			result.bitField0_ = to_bitField0_;
			onBuilt();
			return result;
		}

		public PhoneNumber.Builder mergeFrom(Message other) {
			if (other instanceof PhoneNumber) {
				return mergeFrom((PhoneNumber) other);
			} else {
				super.mergeFrom(other);
				return this;
			}
		}

		public PhoneNumber.Builder mergeFrom(PhoneNumber other) {
			if (other == PhoneNumber.getDefaultInstance())
				return this;
			if (other.hasNumber()) {
				bitField0_ |= 0x00000001;
				number_ = other.number_;
				onChanged();
			}
			if (other.hasType()) {
				setType(other.getType());
			}
			this.mergeUnknownFields(other.getUnknownFields());
			return this;
		}

		public final boolean isInitialized() {
			if (!hasNumber()) {

				return false;
			}
			return true;
		}

		public PhoneNumber.Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws java.io.IOException {
			PhoneNumber parsedMessage = null;
			try {
				parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
			} catch (InvalidProtocolBufferException e) {
				parsedMessage = (PhoneNumber) e.getUnfinishedMessage();
				throw e;
			} finally {
				if (parsedMessage != null) {
					mergeFrom(parsedMessage);
				}
			}
			return this;
		}

		private int bitField0_;

		private java.lang.Object number_ = "";

		/**
		 * <code>required string number = 1;</code>
		 */
		public boolean hasNumber() {
			return ((bitField0_ & 0x00000001) == 0x00000001);
		}

		/**
		 * <code>required string number = 1;</code>
		 */
		public java.lang.String getNumber() {
			java.lang.Object ref = number_;
			if (!(ref instanceof java.lang.String)) {
				ByteString bs = (ByteString) ref;
				java.lang.String s = bs.toStringUtf8();
				if (bs.isValidUtf8()) {
					number_ = s;
				}
				return s;
			} else {
				return (java.lang.String) ref;
			}
		}

		/**
		 * <code>required string number = 1;</code>
		 */
		public ByteString getNumberBytes() {
			java.lang.Object ref = number_;
			if (ref instanceof String) {
				ByteString b = ByteString.copyFromUtf8((java.lang.String) ref);
				number_ = b;
				return b;
			} else {
				return (ByteString) ref;
			}
		}

		/**
		 * <code>required string number = 1;</code>
		 */
		public PhoneNumber.Builder setNumber(java.lang.String value) {
			if (value == null) {
				throw new NullPointerException();
			}
			bitField0_ |= 0x00000001;
			number_ = value;
			onChanged();
			return this;
		}

		/**
		 * <code>required string number = 1;</code>
		 */
		public PhoneNumber.Builder clearNumber() {
			bitField0_ = (bitField0_ & ~0x00000001);
			number_ = getDefaultInstance().getNumber();
			onChanged();
			return this;
		}

		/**
		 * <code>required string number = 1;</code>
		 */
		public PhoneNumber.Builder setNumberBytes(ByteString value) {
			if (value == null) {
				throw new NullPointerException();
			}
			bitField0_ |= 0x00000001;
			number_ = value;
			onChanged();
			return this;
		}

		private PhoneType type_ = PhoneType.HOME;

		/**
		 * <code>optional .Person.PhoneType type = 2 [default = HOME];</code>
		 */
		public boolean hasType() {
			return ((bitField0_ & 0x00000002) == 0x00000002);
		}

		/**
		 * <code>optional .Person.PhoneType type = 2 [default = HOME];</code>
		 */
		public PhoneType getType() {
			return type_;
		}

		/**
		 * <code>optional .Person.PhoneType type = 2 [default = HOME];</code>
		 */
		public PhoneNumber.Builder setType(PhoneType value) {
			if (value == null) {
				throw new NullPointerException();
			}
			bitField0_ |= 0x00000002;
			type_ = value;
			onChanged();
			return this;
		}

		/**
		 * <code>optional .Person.PhoneType type = 2 [default = HOME];</code>
		 */
		public PhoneNumber.Builder clearType() {
			bitField0_ = (bitField0_ & ~0x00000002);
			type_ = PhoneType.HOME;
			onChanged();
			return this;
		}

		// @@protoc_insertion_point(builder_scope:Person.PhoneNumber)
	}

	static {
		defaultInstance = new PhoneNumber(true);
		defaultInstance.initFields();
	}

	// @@protoc_insertion_point(class_scope:Person.PhoneNumber)
}