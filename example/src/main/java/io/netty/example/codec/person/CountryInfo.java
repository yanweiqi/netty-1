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
 * Protobuf type {@code Person.CountryInfo}
 */
public final class CountryInfo extends GeneratedMessage implements CountryInfoOrBuilder {

	private CountryInfo(GeneratedMessage.Builder<?> builder) {
		super(builder);
		this.unknownFields = builder.getUnknownFields();
	}

	private CountryInfo(boolean noInit) {
		this.unknownFields = UnknownFieldSet.getDefaultInstance();
	}

	private static final CountryInfo defaultInstance;

	public static CountryInfo getDefaultInstance() {
		return defaultInstance;
	}

	public CountryInfo getDefaultInstanceForType() {
		return defaultInstance;
	}

	private final UnknownFieldSet unknownFields;

	@java.lang.Override
	public final UnknownFieldSet getUnknownFields() {
		return this.unknownFields;
	}

	private CountryInfo(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
					name_ = bs;
					break;
				}
				case 18: {
					ByteString bs = input.readBytes();
					bitField0_ |= 0x00000002;
					code_ = bs;
					break;
				}
				case 24: {
					bitField0_ |= 0x00000004;
					number_ = input.readInt32();
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
		return PersonProbuf.internal_static_Person_CountryInfo_descriptor;
	}

	protected GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
		return PersonProbuf.internal_static_Person_CountryInfo_fieldAccessorTable.ensureFieldAccessorsInitialized(CountryInfo.class, Builder.class);
	}

	public static Parser<CountryInfo> PARSER = new AbstractParser<CountryInfo>() {
		public CountryInfo parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
			return new CountryInfo(input, extensionRegistry);
		}
	};

	@Override
	public Parser<CountryInfo> getParserForType() {
		return PARSER;
	}

	private int bitField0_;
	public static final int NAME_FIELD_NUMBER = 1;
	private java.lang.Object name_;

	/**
	 * <code>required string name = 1;</code>
	 */
	public boolean hasName() {
		return ((bitField0_ & 0x00000001) == 0x00000001);
	}

	/**
	 * <code>required string name = 1;</code>
	 */
	public java.lang.String getName() {
		java.lang.Object ref = name_;
		if (ref instanceof java.lang.String) {
			return (java.lang.String) ref;
		} else {
			ByteString bs = (ByteString) ref;
			java.lang.String s = bs.toStringUtf8();
			if (bs.isValidUtf8()) {
				name_ = s;
			}
			return s;
		}
	}

	/**
	 * <code>required string name = 1;</code>
	 */
	public ByteString getNameBytes() {
		java.lang.Object ref = name_;
		if (ref instanceof java.lang.String) {
			ByteString b = ByteString.copyFromUtf8((java.lang.String) ref);
			name_ = b;
			return b;
		} else {
			return (ByteString) ref;
		}
	}

	public static final int CODE_FIELD_NUMBER = 2;
	private java.lang.Object code_;

	/**
	 * <code>required string code = 2;</code>
	 */
	public boolean hasCode() {
		return ((bitField0_ & 0x00000002) == 0x00000002);
	}

	/**
	 * <code>required string code = 2;</code>
	 */
	public java.lang.String getCode() {
		java.lang.Object ref = code_;
		if (ref instanceof java.lang.String) {
			return (java.lang.String) ref;
		} else {
			ByteString bs = (ByteString) ref;
			java.lang.String s = bs.toStringUtf8();
			if (bs.isValidUtf8()) {
				code_ = s;
			}
			return s;
		}
	}

	/**
	 * <code>required string code = 2;</code>
	 */
	public ByteString getCodeBytes() {
		java.lang.Object ref = code_;
		if (ref instanceof java.lang.String) {
			ByteString b = ByteString.copyFromUtf8((java.lang.String) ref);
			code_ = b;
			return b;
		} else {
			return (ByteString) ref;
		}
	}

	public static final int NUMBER_FIELD_NUMBER = 3;
	private int number_;

	/**
	 * <code>optional int32 number = 3;</code>
	 */
	public boolean hasNumber() {
		return ((bitField0_ & 0x00000004) == 0x00000004);
	}

	/**
	 * <code>optional int32 number = 3;</code>
	 */
	public int getNumber() {
		return number_;
	}

	private void initFields() {
		name_ = "";
		code_ = "";
		number_ = 0;
	}

	private byte memoizedIsInitialized = -1;

	public final boolean isInitialized() {
		byte isInitialized = memoizedIsInitialized;
		if (isInitialized == 1)
			return true;
		if (isInitialized == 0)
			return false;

		if (!hasName()) {
			memoizedIsInitialized = 0;
			return false;
		}
		if (!hasCode()) {
			memoizedIsInitialized = 0;
			return false;
		}
		memoizedIsInitialized = 1;
		return true;
	}

	public void writeTo(CodedOutputStream output) throws java.io.IOException {
		getSerializedSize();
		if (((bitField0_ & 0x00000001) == 0x00000001)) {
			output.writeBytes(1, getNameBytes());
		}
		if (((bitField0_ & 0x00000002) == 0x00000002)) {
			output.writeBytes(2, getCodeBytes());
		}
		if (((bitField0_ & 0x00000004) == 0x00000004)) {
			output.writeInt32(3, number_);
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
			size += CodedOutputStream.computeBytesSize(1, getNameBytes());
		}
		if (((bitField0_ & 0x00000002) == 0x00000002)) {
			size += CodedOutputStream.computeBytesSize(2, getCodeBytes());
		}
		if (((bitField0_ & 0x00000004) == 0x00000004)) {
			size += CodedOutputStream.computeInt32Size(3, number_);
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

	public static CountryInfo parseFrom(ByteString data) throws InvalidProtocolBufferException {
		return PARSER.parseFrom(data);
	}

	public static CountryInfo parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
		return PARSER.parseFrom(data, extensionRegistry);
	}

	public static CountryInfo parseFrom(byte[] data) throws InvalidProtocolBufferException {
		return PARSER.parseFrom(data);
	}

	public static CountryInfo parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
		return PARSER.parseFrom(data, extensionRegistry);
	}

	public static CountryInfo parseFrom(java.io.InputStream input) throws java.io.IOException {
		return PARSER.parseFrom(input);
	}

	public static CountryInfo parseFrom(java.io.InputStream input, ExtensionRegistryLite extensionRegistry) throws java.io.IOException {
		return PARSER.parseFrom(input, extensionRegistry);
	}

	public static CountryInfo parseDelimitedFrom(java.io.InputStream input) throws java.io.IOException {
		return PARSER.parseDelimitedFrom(input);
	}

	public static CountryInfo parseDelimitedFrom(java.io.InputStream input, ExtensionRegistryLite extensionRegistry) throws java.io.IOException {
		return PARSER.parseDelimitedFrom(input, extensionRegistry);
	}

	public static CountryInfo parseFrom(CodedInputStream input) throws java.io.IOException {
		return PARSER.parseFrom(input);
	}

	public static CountryInfo parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws java.io.IOException {
		return PARSER.parseFrom(input, extensionRegistry);
	}

	public static Builder newBuilder() {
		return Builder.create();
	}

	public Builder newBuilderForType() {
		return newBuilder();
	}

	public static Builder newBuilder(CountryInfo prototype) {
		return newBuilder().mergeFrom(prototype);
	}

	public Builder toBuilder() {
		return newBuilder(this);
	}

	@java.lang.Override
	protected Builder newBuilderForType(GeneratedMessage.BuilderParent parent) {
		Builder builder = new Builder(parent);
		return builder;
	}

	/**
	 * Protobuf type {@code Person.CountryInfo}
	 */
	public static final class Builder extends GeneratedMessage.Builder<Builder> implements CountryInfoOrBuilder {
		
		public static final Descriptors.Descriptor getDescriptor() {
			return PersonProbuf.internal_static_Person_CountryInfo_descriptor;
		}

		protected GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
			return PersonProbuf.internal_static_Person_CountryInfo_fieldAccessorTable.ensureFieldAccessorsInitialized(CountryInfo.class, Builder.class);
		}

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

		private static Builder create() {
			return new Builder();
		}

		public Builder clear() {
			super.clear();
			name_ = "";
			bitField0_ = (bitField0_ & ~0x00000001);
			code_ = "";
			bitField0_ = (bitField0_ & ~0x00000002);
			number_ = 0;
			bitField0_ = (bitField0_ & ~0x00000004);
			return this;
		}

		public Builder clone() {
			return create().mergeFrom(buildPartial());
		}

		public Descriptors.Descriptor getDescriptorForType() {
			return PersonProbuf.internal_static_Person_CountryInfo_descriptor;
		}

		public CountryInfo getDefaultInstanceForType() {
			return getDefaultInstance();
		}

		public CountryInfo build() {
			CountryInfo result = buildPartial();
			if (!result.isInitialized()) {
				throw newUninitializedMessageException(result);
			}
			return result;
		}

		public CountryInfo buildPartial() {
			CountryInfo result = new CountryInfo(this);
			int from_bitField0_ = bitField0_;
			int to_bitField0_ = 0;
			if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
				to_bitField0_ |= 0x00000001;
			}
			result.name_ = name_;
			if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
				to_bitField0_ |= 0x00000002;
			}
			result.code_ = code_;
			if (((from_bitField0_ & 0x00000004) == 0x00000004)) {
				to_bitField0_ |= 0x00000004;
			}
			result.number_ = number_;
			result.bitField0_ = to_bitField0_;
			onBuilt();
			return result;
		}

		public Builder mergeFrom(Message other) {
			if (other instanceof CountryInfo) {
				return mergeFrom((CountryInfo) other);
			} else {
				super.mergeFrom(other);
				return this;
			}
		}

		public Builder mergeFrom(CountryInfo other) {
			if (other == getDefaultInstance())
				return this;
			if (other.hasName()) {
				bitField0_ |= 0x00000001;
				name_ = other.name_;
				onChanged();
			}
			if (other.hasCode()) {
				bitField0_ |= 0x00000002;
				code_ = other.code_;
				onChanged();
			}
			if (other.hasNumber()) {
				setNumber(other.getNumber());
			}
			this.mergeUnknownFields(other.getUnknownFields());
			return this;
		}

		public final boolean isInitialized() {
			if (!hasName()) {

				return false;
			}
			if (!hasCode()) {

				return false;
			}
			return true;
		}

		public Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws java.io.IOException {
			CountryInfo parsedMessage = null;
			try {
				parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
			} catch (InvalidProtocolBufferException e) {
				parsedMessage = (CountryInfo) e.getUnfinishedMessage();
				throw e;
			} finally {
				if (parsedMessage != null) {
					mergeFrom(parsedMessage);
				}
			}
			return this;
		}

		private int bitField0_;

		private java.lang.Object name_ = "";

		/**
		 * <code>required string name = 1;</code>
		 */
		public boolean hasName() {
			return ((bitField0_ & 0x00000001) == 0x00000001);
		}

		/**
		 * <code>required string name = 1;</code>
		 */
		public java.lang.String getName() {
			java.lang.Object ref = name_;
			if (!(ref instanceof java.lang.String)) {
				ByteString bs = (ByteString) ref;
				java.lang.String s = bs.toStringUtf8();
				if (bs.isValidUtf8()) {
					name_ = s;
				}
				return s;
			} else {
				return (java.lang.String) ref;
			}
		}

		/**
		 * <code>required string name = 1;</code>
		 */
		public ByteString getNameBytes() {
			java.lang.Object ref = name_;
			if (ref instanceof String) {
				ByteString b = ByteString.copyFromUtf8((java.lang.String) ref);
				name_ = b;
				return b;
			} else {
				return (ByteString) ref;
			}
		}

		/**
		 * <code>required string name = 1;</code>
		 */
		public Builder setName(java.lang.String value) {
			if (value == null) {
				throw new NullPointerException();
			}
			bitField0_ |= 0x00000001;
			name_ = value;
			onChanged();
			return this;
		}

		/**
		 * <code>required string name = 1;</code>
		 */
		public Builder clearName() {
			bitField0_ = (bitField0_ & ~0x00000001);
			name_ = getDefaultInstance().getName();
			onChanged();
			return this;
		}

		/**
		 * <code>required string name = 1;</code>
		 */
		public Builder setNameBytes(ByteString value) {
			if (value == null) {
				throw new NullPointerException();
			}
			bitField0_ |= 0x00000001;
			name_ = value;
			onChanged();
			return this;
		}

		private java.lang.Object code_ = "";

		/**
		 * <code>required string code = 2;</code>
		 */
		public boolean hasCode() {
			return ((bitField0_ & 0x00000002) == 0x00000002);
		}

		/**
		 * <code>required string code = 2;</code>
		 */
		public java.lang.String getCode() {
			java.lang.Object ref = code_;
			if (!(ref instanceof java.lang.String)) {
				ByteString bs = (ByteString) ref;
				java.lang.String s = bs.toStringUtf8();
				if (bs.isValidUtf8()) {
					code_ = s;
				}
				return s;
			} else {
				return (java.lang.String) ref;
			}
		}

		/**
		 * <code>required string code = 2;</code>
		 */
		public ByteString getCodeBytes() {
			java.lang.Object ref = code_;
			if (ref instanceof String) {
				ByteString b = ByteString.copyFromUtf8((java.lang.String) ref);
				code_ = b;
				return b;
			} else {
				return (ByteString) ref;
			}
		}

		/**
		 * <code>required string code = 2;</code>
		 */
		public Builder setCode(java.lang.String value) {
			if (value == null) {
				throw new NullPointerException();
			}
			bitField0_ |= 0x00000002;
			code_ = value;
			onChanged();
			return this;
		}

		/**
		 * <code>required string code = 2;</code>
		 */
		public Builder clearCode() {
			bitField0_ = (bitField0_ & ~0x00000002);
			code_ = getDefaultInstance().getCode();
			onChanged();
			return this;
		}

		/**
		 * <code>required string code = 2;</code>
		 */
		public Builder setCodeBytes(ByteString value) {
			if (value == null) {
				throw new NullPointerException();
			}
			bitField0_ |= 0x00000002;
			code_ = value;
			onChanged();
			return this;
		}

		private int number_;

		/**
		 * <code>optional int32 number = 3;</code>
		 */
		public boolean hasNumber() {
			return ((bitField0_ & 0x00000004) == 0x00000004);
		}

		/**
		 * <code>optional int32 number = 3;</code>
		 */
		public int getNumber() {
			return number_;
		}

		/**
		 * <code>optional int32 number = 3;</code>
		 */
		public Builder setNumber(int value) {
			bitField0_ |= 0x00000004;
			number_ = value;
			onChanged();
			return this;
		}

		/**
		 * <code>optional int32 number = 3;</code>
		 */
		public Builder clearNumber() {
			bitField0_ = (bitField0_ & ~0x00000004);
			number_ = 0;
			onChanged();
			return this;
		}
	}

	static {
		defaultInstance = new CountryInfo(true);
		defaultInstance.initFields();
	}
}