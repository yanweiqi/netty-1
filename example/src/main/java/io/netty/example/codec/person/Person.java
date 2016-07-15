package io.netty.example.codec.person;

import com.google.protobuf.AbstractMessageLite;
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
import com.google.protobuf.RepeatedFieldBuilder;
import com.google.protobuf.UnknownFieldSet;



/**
 * Protobuf type {@code Person}
 */
public final class Person extends GeneratedMessage implements PersonOrBuilder {
	private Person(GeneratedMessage.Builder<?> builder) {
		super(builder);
		this.unknownFields = builder.getUnknownFields();
	}

	private Person(boolean noInit) {
		this.unknownFields = UnknownFieldSet.getDefaultInstance();
	}

	private static final Person defaultInstance;

	public static Person getDefaultInstance() {
		return defaultInstance;
	}

	public Person getDefaultInstanceForType() {
		return defaultInstance;
	}

	private final UnknownFieldSet unknownFields;

	@java.lang.Override
	public final UnknownFieldSet getUnknownFields() {
		return this.unknownFields;
	}

	private Person(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
				case 16: {
					bitField0_ |= 0x00000002;
					id_ = input.readInt32();
					break;
				}
				case 26: {
					ByteString bs = input.readBytes();
					bitField0_ |= 0x00000004;
					email_ = bs;
					break;
				}
				case 34: {
					if (!((mutable_bitField0_ & 0x00000008) == 0x00000008)) {
						phone_ = new java.util.ArrayList<PhoneNumber>();
						mutable_bitField0_ |= 0x00000008;
					}
					phone_.add(input.readMessage(PhoneNumber.PARSER, extensionRegistry));
					break;
				}
				}
			}
		} catch (InvalidProtocolBufferException e) {
			throw e.setUnfinishedMessage(this);
		} catch (java.io.IOException e) {
			throw new InvalidProtocolBufferException(e.getMessage()).setUnfinishedMessage(this);
		} finally {
			if (((mutable_bitField0_ & 0x00000008) == 0x00000008)) {
				phone_ = java.util.Collections.unmodifiableList(phone_);
			}
			this.unknownFields = unknownFields.build();
			makeExtensionsImmutable();
		}
	}

	public static final Descriptors.Descriptor getDescriptor() {
		return PersonProbuf.internal_static_Person_descriptor;
	}

	protected GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
		return PersonProbuf.internal_static_Person_fieldAccessorTable.ensureFieldAccessorsInitialized(Person.class, Person.Builder.class);
	}

	public static Parser<Person> PARSER = new AbstractParser<Person>() {
		public Person parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
			return new Person(input, extensionRegistry);
		}
	};

	@java.lang.Override
	public Parser<Person> getParserForType() {
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

	public static final int ID_FIELD_NUMBER = 2;
	private int id_;

	/**
	 * <code>required int32 id = 2;</code>
	 */
	public boolean hasId() {
		return ((bitField0_ & 0x00000002) == 0x00000002);
	}

	/**
	 * <code>required int32 id = 2;</code>
	 */
	public int getId() {
		return id_;
	}

	public static final int EMAIL_FIELD_NUMBER = 3;
	private java.lang.Object email_;

	/**
	 * <code>optional string email = 3;</code>
	 */
	public boolean hasEmail() {
		return ((bitField0_ & 0x00000004) == 0x00000004);
	}

	/**
	 * <code>optional string email = 3;</code>
	 */
	public java.lang.String getEmail() {
		java.lang.Object ref = email_;
		if (ref instanceof java.lang.String) {
			return (java.lang.String) ref;
		} else {
			ByteString bs = (ByteString) ref;
			java.lang.String s = bs.toStringUtf8();
			if (bs.isValidUtf8()) {
				email_ = s;
			}
			return s;
		}
	}

	/**
	 * <code>optional string email = 3;</code>
	 */
	public ByteString getEmailBytes() {
		java.lang.Object ref = email_;
		if (ref instanceof java.lang.String) {
			ByteString b = ByteString.copyFromUtf8((java.lang.String) ref);
			email_ = b;
			return b;
		} else {
			return (ByteString) ref;
		}
	}

	public static final int PHONE_FIELD_NUMBER = 4;
	private java.util.List<PhoneNumber> phone_;

	/**
	 * <code>repeated .Person.PhoneNumber phone = 4;</code>
	 */
	public java.util.List<PhoneNumber> getPhoneList() {
		return phone_;
	}

	/**
	 * <code>repeated .Person.PhoneNumber phone = 4;</code>
	 */
	public java.util.List<? extends PhoneNumberOrBuilder> getPhoneOrBuilderList() {
		return phone_;
	}

	/**
	 * <code>repeated .Person.PhoneNumber phone = 4;</code>
	 */
	public int getPhoneCount() {
		return phone_.size();
	}

	/**
	 * <code>repeated .Person.PhoneNumber phone = 4;</code>
	 */
	public PhoneNumber getPhone(int index) {
		return phone_.get(index);
	}

	/**
	 * <code>repeated .Person.PhoneNumber phone = 4;</code>
	 */
	public PhoneNumberOrBuilder getPhoneOrBuilder(int index) {
		return phone_.get(index);
	}

	private void initFields() {
		name_ = "";
		id_ = 0;
		email_ = "";
		phone_ = java.util.Collections.emptyList();
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
		if (!hasId()) {
			memoizedIsInitialized = 0;
			return false;
		}
		for (int i = 0; i < getPhoneCount(); i++) {
			if (!getPhone(i).isInitialized()) {
				memoizedIsInitialized = 0;
				return false;
			}
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
			output.writeInt32(2, id_);
		}
		if (((bitField0_ & 0x00000004) == 0x00000004)) {
			output.writeBytes(3, getEmailBytes());
		}
		for (int i = 0; i < phone_.size(); i++) {
			output.writeMessage(4, phone_.get(i));
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
			size += CodedOutputStream.computeInt32Size(2, id_);
		}
		if (((bitField0_ & 0x00000004) == 0x00000004)) {
			size += CodedOutputStream.computeBytesSize(3, getEmailBytes());
		}
		for (int i = 0; i < phone_.size(); i++) {
			size += CodedOutputStream.computeMessageSize(4, phone_.get(i));
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

	public static Person parseFrom(ByteString data) throws InvalidProtocolBufferException {
		return PARSER.parseFrom(data);
	}

	public static Person parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
		return PARSER.parseFrom(data, extensionRegistry);
	}

	public static Person parseFrom(byte[] data) throws InvalidProtocolBufferException {
		return PARSER.parseFrom(data);
	}

	public static Person parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
		return PARSER.parseFrom(data, extensionRegistry);
	}

	public static Person parseFrom(java.io.InputStream input) throws java.io.IOException {
		return PARSER.parseFrom(input);
	}

	public static Person parseFrom(java.io.InputStream input, ExtensionRegistryLite extensionRegistry) throws java.io.IOException {
		return PARSER.parseFrom(input, extensionRegistry);
	}

	public static Person parseDelimitedFrom(java.io.InputStream input) throws java.io.IOException {
		return PARSER.parseDelimitedFrom(input);
	}

	public static Person parseDelimitedFrom(java.io.InputStream input, ExtensionRegistryLite extensionRegistry) throws java.io.IOException {
		return PARSER.parseDelimitedFrom(input, extensionRegistry);
	}

	public static Person parseFrom(CodedInputStream input) throws java.io.IOException {
		return PARSER.parseFrom(input);
	}

	public static Person parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws java.io.IOException {
		return PARSER.parseFrom(input, extensionRegistry);
	}

	public static Person.Builder newBuilder() {
		return Builder.create();
	}

	public Person.Builder newBuilderForType() {
		return newBuilder();
	}

	public static Person.Builder newBuilder(Person prototype) {
		return newBuilder().mergeFrom(prototype);
	}

	public Person.Builder toBuilder() {
		return newBuilder(this);
	}

	@java.lang.Override
	protected Person.Builder newBuilderForType(GeneratedMessage.BuilderParent parent) {
		Person.Builder builder = new Builder(parent);
		return builder;
	}

	/**
	 * Protobuf type {@code Person}
	 */
	public static final class Builder extends GeneratedMessage.Builder<Person.Builder> implements PersonOrBuilder {
			
		public static final Descriptors.Descriptor getDescriptor() {
			return PersonProbuf.internal_static_Person_descriptor;
		}

		protected GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
			return PersonProbuf.internal_static_Person_fieldAccessorTable.ensureFieldAccessorsInitialized(Person.class, Person.Builder.class);
		}

		// Construct using
		// io.netty.example.codec.PersonProbuf.Person.newBuilder()
		private Builder() {
			maybeForceBuilderInitialization();
		}

		private Builder(GeneratedMessage.BuilderParent parent) {
			super(parent);
			maybeForceBuilderInitialization();
		}

		private void maybeForceBuilderInitialization() {
			if (GeneratedMessage.alwaysUseFieldBuilders) {
				getPhoneFieldBuilder();
			}
		}

		private static Person.Builder create() {
			return new Builder();
		}

		public Person.Builder clear() {
			super.clear();
			name_ = "";
			bitField0_ = (bitField0_ & ~0x00000001);
			id_ = 0;
			bitField0_ = (bitField0_ & ~0x00000002);
			email_ = "";
			bitField0_ = (bitField0_ & ~0x00000004);
			if (phoneBuilder_ == null) {
				phone_ = java.util.Collections.emptyList();
				bitField0_ = (bitField0_ & ~0x00000008);
			} else {
				phoneBuilder_.clear();
			}
			return this;
		}

		public Person.Builder clone() {
			return create().mergeFrom(buildPartial());
		}

		public Descriptors.Descriptor getDescriptorForType() {
			return PersonProbuf.internal_static_Person_descriptor;
		}

		public Person getDefaultInstanceForType() {
			return Person.getDefaultInstance();
		}

		public Person build() {
			Person result = buildPartial();
			if (!result.isInitialized()) {
				throw newUninitializedMessageException(result);
			}
			return result;
		}

		public Person buildPartial() {
			Person result = new Person(this);
			int from_bitField0_ = bitField0_;
			int to_bitField0_ = 0;
			if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
				to_bitField0_ |= 0x00000001;
			}
			result.name_ = name_;
			if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
				to_bitField0_ |= 0x00000002;
			}
			result.id_ = id_;
			if (((from_bitField0_ & 0x00000004) == 0x00000004)) {
				to_bitField0_ |= 0x00000004;
			}
			result.email_ = email_;
			if (phoneBuilder_ == null) {
				if (((bitField0_ & 0x00000008) == 0x00000008)) {
					phone_ = java.util.Collections.unmodifiableList(phone_);
					bitField0_ = (bitField0_ & ~0x00000008);
				}
				result.phone_ = phone_;
			} else {
				result.phone_ = phoneBuilder_.build();
			}
			result.bitField0_ = to_bitField0_;
			onBuilt();
			return result;
		}

		public Person.Builder mergeFrom(Message other) {
			if (other instanceof Person) {
				return mergeFrom((Person) other);
			} else {
				super.mergeFrom(other);
				return this;
			}
		}

		public Person.Builder mergeFrom(Person other) {
			if (other == Person.getDefaultInstance())
				return this;
			if (other.hasName()) {
				bitField0_ |= 0x00000001;
				name_ = other.name_;
				onChanged();
			}
			if (other.hasId()) {
				setId(other.getId());
			}
			if (other.hasEmail()) {
				bitField0_ |= 0x00000004;
				email_ = other.email_;
				onChanged();
			}
			if (phoneBuilder_ == null) {
				if (!other.phone_.isEmpty()) {
					if (phone_.isEmpty()) {
						phone_ = other.phone_;
						bitField0_ = (bitField0_ & ~0x00000008);
					} else {
						ensurePhoneIsMutable();
						phone_.addAll(other.phone_);
					}
					onChanged();
				}
			} else {
				if (!other.phone_.isEmpty()) {
					if (phoneBuilder_.isEmpty()) {
						phoneBuilder_.dispose();
						phoneBuilder_ = null;
						phone_ = other.phone_;
						bitField0_ = (bitField0_ & ~0x00000008);
						phoneBuilder_ = GeneratedMessage.alwaysUseFieldBuilders ? getPhoneFieldBuilder() : null;
					} else {
						phoneBuilder_.addAllMessages(other.phone_);
					}
				}
			}
			this.mergeUnknownFields(other.getUnknownFields());
			return this;
		}

		public final boolean isInitialized() {
			if (!hasName()) {

				return false;
			}
			if (!hasId()) {

				return false;
			}
			for (int i = 0; i < getPhoneCount(); i++) {
				if (!getPhone(i).isInitialized()) {

					return false;
				}
			}
			return true;
		}

		public Person.Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws java.io.IOException {
			Person parsedMessage = null;
			try {
				parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
			} catch (InvalidProtocolBufferException e) {
				parsedMessage = (Person) e.getUnfinishedMessage();
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
		public Person.Builder setName(java.lang.String value) {
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
		public Person.Builder clearName() {
			bitField0_ = (bitField0_ & ~0x00000001);
			name_ = getDefaultInstance().getName();
			onChanged();
			return this;
		}

		/**
		 * <code>required string name = 1;</code>
		 */
		public Person.Builder setNameBytes(ByteString value) {
			if (value == null) {
				throw new NullPointerException();
			}
			bitField0_ |= 0x00000001;
			name_ = value;
			onChanged();
			return this;
		}

		private int id_;

		/**
		 * <code>required int32 id = 2;</code>
		 */
		public boolean hasId() {
			return ((bitField0_ & 0x00000002) == 0x00000002);
		}

		/**
		 * <code>required int32 id = 2;</code>
		 */
		public int getId() {
			return id_;
		}

		/**
		 * <code>required int32 id = 2;</code>
		 */
		public Person.Builder setId(int value) {
			bitField0_ |= 0x00000002;
			id_ = value;
			onChanged();
			return this;
		}

		/**
		 * <code>required int32 id = 2;</code>
		 */
		public Person.Builder clearId() {
			bitField0_ = (bitField0_ & ~0x00000002);
			id_ = 0;
			onChanged();
			return this;
		}

		private java.lang.Object email_ = "";

		/**
		 * <code>optional string email = 3;</code>
		 */
		public boolean hasEmail() {
			return ((bitField0_ & 0x00000004) == 0x00000004);
		}

		/**
		 * <code>optional string email = 3;</code>
		 */
		public java.lang.String getEmail() {
			java.lang.Object ref = email_;
			if (!(ref instanceof java.lang.String)) {
				ByteString bs = (ByteString) ref;
				java.lang.String s = bs.toStringUtf8();
				if (bs.isValidUtf8()) {
					email_ = s;
				}
				return s;
			} else {
				return (java.lang.String) ref;
			}
		}

		/**
		 * <code>optional string email = 3;</code>
		 */
		public ByteString getEmailBytes() {
			java.lang.Object ref = email_;
			if (ref instanceof String) {
				ByteString b = ByteString.copyFromUtf8((java.lang.String) ref);
				email_ = b;
				return b;
			} else {
				return (ByteString) ref;
			}
		}

		/**
		 * <code>optional string email = 3;</code>
		 */
		public Person.Builder setEmail(java.lang.String value) {
			if (value == null) {
				throw new NullPointerException();
			}
			bitField0_ |= 0x00000004;
			email_ = value;
			onChanged();
			return this;
		}

		/**
		 * <code>optional string email = 3;</code>
		 */
		public Person.Builder clearEmail() {
			bitField0_ = (bitField0_ & ~0x00000004);
			email_ = getDefaultInstance().getEmail();
			onChanged();
			return this;
		}

		/**
		 * <code>optional string email = 3;</code>
		 */
		public Person.Builder setEmailBytes(ByteString value) {
			if (value == null) {
				throw new NullPointerException();
			}
			bitField0_ |= 0x00000004;
			email_ = value;
			onChanged();
			return this;
		}

		private java.util.List<PhoneNumber> phone_ = java.util.Collections.emptyList();

		private void ensurePhoneIsMutable() {
			if (!((bitField0_ & 0x00000008) == 0x00000008)) {
				phone_ = new java.util.ArrayList<PhoneNumber>(phone_);
				bitField0_ |= 0x00000008;
			}
		}

		private RepeatedFieldBuilder<PhoneNumber, PhoneNumber.Builder, PhoneNumberOrBuilder> phoneBuilder_;

		/**
		 * <code>repeated .Person.PhoneNumber phone = 4;</code>
		 */
		public java.util.List<PhoneNumber> getPhoneList() {
			if (phoneBuilder_ == null) {
				return java.util.Collections.unmodifiableList(phone_);
			} else {
				return phoneBuilder_.getMessageList();
			}
		}

		/**
		 * <code>repeated .Person.PhoneNumber phone = 4;</code>
		 */
		public int getPhoneCount() {
			if (phoneBuilder_ == null) {
				return phone_.size();
			} else {
				return phoneBuilder_.getCount();
			}
		}

		/**
		 * <code>repeated .Person.PhoneNumber phone = 4;</code>
		 */
		public PhoneNumber getPhone(int index) {
			if (phoneBuilder_ == null) {
				return phone_.get(index);
			} else {
				return phoneBuilder_.getMessage(index);
			}
		}

		/**
		 * <code>repeated .Person.PhoneNumber phone = 4;</code>
		 */
		public Person.Builder setPhone(int index, PhoneNumber value) {
			if (phoneBuilder_ == null) {
				if (value == null) {
					throw new NullPointerException();
				}
				ensurePhoneIsMutable();
				phone_.set(index, value);
				onChanged();
			} else {
				phoneBuilder_.setMessage(index, value);
			}
			return this;
		}

		/**
		 * <code>repeated .Person.PhoneNumber phone = 4;</code>
		 */
		public Person.Builder setPhone(int index, PhoneNumber.Builder builderForValue) {
			if (phoneBuilder_ == null) {
				ensurePhoneIsMutable();
				phone_.set(index, builderForValue.build());
				onChanged();
			} else {
				phoneBuilder_.setMessage(index, builderForValue.build());
			}
			return this;
		}

		/**
		 * <code>repeated .Person.PhoneNumber phone = 4;</code>
		 */
		public Person.Builder addPhone(PhoneNumber value) {
			if (phoneBuilder_ == null) {
				if (value == null) {
					throw new NullPointerException();
				}
				ensurePhoneIsMutable();
				phone_.add(value);
				onChanged();
			} else {
				phoneBuilder_.addMessage(value);
			}
			return this;
		}

		/**
		 * <code>repeated .Person.PhoneNumber phone = 4;</code>
		 */
		public Person.Builder addPhone(int index, PhoneNumber value) {
			if (phoneBuilder_ == null) {
				if (value == null) {
					throw new NullPointerException();
				}
				ensurePhoneIsMutable();
				phone_.add(index, value);
				onChanged();
			} else {
				phoneBuilder_.addMessage(index, value);
			}
			return this;
		}

		/**
		 * <code>repeated .Person.PhoneNumber phone = 4;</code>
		 */
		public Person.Builder addPhone(PhoneNumber.Builder builderForValue) {
			if (phoneBuilder_ == null) {
				ensurePhoneIsMutable();
				phone_.add(builderForValue.build());
				onChanged();
			} else {
				phoneBuilder_.addMessage(builderForValue.build());
			}
			return this;
		}

		/**
		 * <code>repeated .Person.PhoneNumber phone = 4;</code>
		 */
		public Person.Builder addPhone(int index, PhoneNumber.Builder builderForValue) {
			if (phoneBuilder_ == null) {
				ensurePhoneIsMutable();
				phone_.add(index, builderForValue.build());
				onChanged();
			} else {
				phoneBuilder_.addMessage(index, builderForValue.build());
			}
			return this;
		}

		/**
		 * <code>repeated .Person.PhoneNumber phone = 4;</code>
		 */
		public Person.Builder addAllPhone(java.lang.Iterable<? extends PhoneNumber> values) {
			if (phoneBuilder_ == null) {
				ensurePhoneIsMutable();
				AbstractMessageLite.Builder.addAll(values, phone_);
				onChanged();
			} else {
				phoneBuilder_.addAllMessages(values);
			}
			return this;
		}

		/**
		 * <code>repeated .Person.PhoneNumber phone = 4;</code>
		 */
		public Person.Builder clearPhone() {
			if (phoneBuilder_ == null) {
				phone_ = java.util.Collections.emptyList();
				bitField0_ = (bitField0_ & ~0x00000008);
				onChanged();
			} else {
				phoneBuilder_.clear();
			}
			return this;
		}

		/**
		 * <code>repeated .Person.PhoneNumber phone = 4;</code>
		 */
		public Person.Builder removePhone(int index) {
			if (phoneBuilder_ == null) {
				ensurePhoneIsMutable();
				phone_.remove(index);
				onChanged();
			} else {
				phoneBuilder_.remove(index);
			}
			return this;
		}

		/**
		 * <code>repeated .Person.PhoneNumber phone = 4;</code>
		 */
		public PhoneNumber.Builder getPhoneBuilder(int index) {
			return getPhoneFieldBuilder().getBuilder(index);
		}

		/**
		 * <code>repeated .Person.PhoneNumber phone = 4;</code>
		 */
		public PhoneNumberOrBuilder getPhoneOrBuilder(int index) {
			if (phoneBuilder_ == null) {
				return phone_.get(index);
			} else {
				return phoneBuilder_.getMessageOrBuilder(index);
			}
		}

		/**
		 * <code>repeated .Person.PhoneNumber phone = 4;</code>
		 */
		public java.util.List<? extends PhoneNumberOrBuilder> getPhoneOrBuilderList() {
			if (phoneBuilder_ != null) {
				return phoneBuilder_.getMessageOrBuilderList();
			} else {
				return java.util.Collections.unmodifiableList(phone_);
			}
		}

		/**
		 * <code>repeated .Person.PhoneNumber phone = 4;</code>
		 */
		public PhoneNumber.Builder addPhoneBuilder() {
			return getPhoneFieldBuilder().addBuilder(PhoneNumber.getDefaultInstance());
		}

		/**
		 * <code>repeated .Person.PhoneNumber phone = 4;</code>
		 */
		public PhoneNumber.Builder addPhoneBuilder(int index) {
			return getPhoneFieldBuilder().addBuilder(index, PhoneNumber.getDefaultInstance());
		}

		/**
		 * <code>repeated .Person.PhoneNumber phone = 4;</code>
		 */
		public java.util.List<PhoneNumber.Builder> getPhoneBuilderList() {
			return getPhoneFieldBuilder().getBuilderList();
		}

		private RepeatedFieldBuilder<PhoneNumber, PhoneNumber.Builder, PhoneNumberOrBuilder> getPhoneFieldBuilder() {
			if (phoneBuilder_ == null) {
				phoneBuilder_ = new RepeatedFieldBuilder<PhoneNumber, PhoneNumber.Builder, PhoneNumberOrBuilder>(phone_,
						((bitField0_ & 0x00000008) == 0x00000008), getParentForChildren(), isClean());
				phone_ = null;
			}
			return phoneBuilder_;
		}

	}

	static {
		defaultInstance = new Person(true);
		defaultInstance.initFields();
	}

}