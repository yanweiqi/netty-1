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
 * Protobuf type {@code AddressBook}
 */
public final class AddressBook extends GeneratedMessage implements AddressBookOrBuilder {

	private AddressBook(GeneratedMessage.Builder<?> builder) {
		super(builder);
		this.unknownFields = builder.getUnknownFields();
	}

	private AddressBook(boolean noInit) {
		this.unknownFields = UnknownFieldSet.getDefaultInstance();
	}

	private static final AddressBook defaultInstance;

	public static AddressBook getDefaultInstance() {
		return defaultInstance;
	}

	public AddressBook getDefaultInstanceForType() {
		return defaultInstance;
	}

	private final UnknownFieldSet unknownFields;

	@java.lang.Override
	public final UnknownFieldSet getUnknownFields() {
		return this.unknownFields;
	}

	private AddressBook(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
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
					if (!((mutable_bitField0_ & 0x00000001) == 0x00000001)) {
						person_ = new java.util.ArrayList<Person>();
						mutable_bitField0_ |= 0x00000001;
					}
					person_.add(input.readMessage(Person.PARSER, extensionRegistry));
					break;
				}
				}
			}
		} catch (InvalidProtocolBufferException e) {
			throw e.setUnfinishedMessage(this);
		} catch (java.io.IOException e) {
			throw new InvalidProtocolBufferException(e.getMessage()).setUnfinishedMessage(this);
		} finally {
			if (((mutable_bitField0_ & 0x00000001) == 0x00000001)) {
				person_ = java.util.Collections.unmodifiableList(person_);
			}
			this.unknownFields = unknownFields.build();
			makeExtensionsImmutable();
		}
	}

	public static final Descriptors.Descriptor getDescriptor() {
		return PersonProbuf.internal_static_AddressBook_descriptor;
	}

	protected GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
		return PersonProbuf.internal_static_AddressBook_fieldAccessorTable.ensureFieldAccessorsInitialized(AddressBook.class, AddressBook.Builder.class);
	}

	public static Parser<AddressBook> PARSER = new AbstractParser<AddressBook>() {
		public AddressBook parsePartialFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
			return new AddressBook(input, extensionRegistry);
		}
	};

	@java.lang.Override
	public Parser<AddressBook> getParserForType() {
		return PARSER;
	}

	public static final int PERSON_FIELD_NUMBER = 1;
	private java.util.List<Person> person_;

	/**
	 * <code>repeated .Person person = 1;</code>
	 */
	public java.util.List<Person> getPersonList() {
		return person_;
	}

	/**
	 * <code>repeated .Person person = 1;</code>
	 */
	public java.util.List<? extends PersonOrBuilder> getPersonOrBuilderList() {
		return person_;
	}

	/**
	 * <code>repeated .Person person = 1;</code>
	 */
	public int getPersonCount() {
		return person_.size();
	}

	/**
	 * <code>repeated .Person person = 1;</code>
	 */
	public Person getPerson(int index) {
		return person_.get(index);
	}

	/**
	 * <code>repeated .Person person = 1;</code>
	 */
	public PersonOrBuilder getPersonOrBuilder(int index) {
		return person_.get(index);
	}

	private void initFields() {
		person_ = java.util.Collections.emptyList();
	}

	private byte memoizedIsInitialized = -1;

	public final boolean isInitialized() {
		byte isInitialized = memoizedIsInitialized;
		if (isInitialized == 1)
			return true;
		if (isInitialized == 0)
			return false;

		for (int i = 0; i < getPersonCount(); i++) {
			if (!getPerson(i).isInitialized()) {
				memoizedIsInitialized = 0;
				return false;
			}
		}
		memoizedIsInitialized = 1;
		return true;
	}

	public void writeTo(CodedOutputStream output) throws java.io.IOException {
		getSerializedSize();
		for (int i = 0; i < person_.size(); i++) {
			output.writeMessage(1, person_.get(i));
		}
		getUnknownFields().writeTo(output);
	}

	private int memoizedSerializedSize = -1;

	public int getSerializedSize() {
		int size = memoizedSerializedSize;
		if (size != -1)
			return size;

		size = 0;
		for (int i = 0; i < person_.size(); i++) {
			size += CodedOutputStream.computeMessageSize(1, person_.get(i));
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

	public static AddressBook parseFrom(ByteString data) throws InvalidProtocolBufferException {
		return PARSER.parseFrom(data);
	}

	public static AddressBook parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
		return PARSER.parseFrom(data, extensionRegistry);
	}

	public static AddressBook parseFrom(byte[] data) throws InvalidProtocolBufferException {
		return PARSER.parseFrom(data);
	}

	public static AddressBook parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
		return PARSER.parseFrom(data, extensionRegistry);
	}

	public static AddressBook parseFrom(java.io.InputStream input) throws java.io.IOException {
		return PARSER.parseFrom(input);
	}

	public static AddressBook parseFrom(java.io.InputStream input, ExtensionRegistryLite extensionRegistry) throws java.io.IOException {
		return PARSER.parseFrom(input, extensionRegistry);
	}

	public static AddressBook parseDelimitedFrom(java.io.InputStream input) throws java.io.IOException {
		return PARSER.parseDelimitedFrom(input);
	}

	public static AddressBook parseDelimitedFrom(java.io.InputStream input, ExtensionRegistryLite extensionRegistry) throws java.io.IOException {
		return PARSER.parseDelimitedFrom(input, extensionRegistry);
	}

	public static AddressBook parseFrom(CodedInputStream input) throws java.io.IOException {
		return PARSER.parseFrom(input);
	}

	public static AddressBook parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws java.io.IOException {
		return PARSER.parseFrom(input, extensionRegistry);
	}

	public static AddressBook.Builder newBuilder() {
		return Builder.create();
	}

	public AddressBook.Builder newBuilderForType() {
		return newBuilder();
	}

	public static AddressBook.Builder newBuilder(AddressBook prototype) {
		return newBuilder().mergeFrom(prototype);
	}

	public AddressBook.Builder toBuilder() {
		return newBuilder(this);
	}

	@java.lang.Override
	protected AddressBook.Builder newBuilderForType(GeneratedMessage.BuilderParent parent) {
		AddressBook.Builder builder = new Builder(parent);
		return builder;
	}

	/**
	 * Protobuf type {@code AddressBook}
	 */
	public static final class Builder extends GeneratedMessage.Builder<AddressBook.Builder> implements
			// @@protoc_insertion_point(builder_implements:AddressBook)
			AddressBookOrBuilder {
		public static final Descriptors.Descriptor getDescriptor() {
			return PersonProbuf.internal_static_AddressBook_descriptor;
		}

		protected GeneratedMessage.FieldAccessorTable internalGetFieldAccessorTable() {
			return PersonProbuf.internal_static_AddressBook_fieldAccessorTable.ensureFieldAccessorsInitialized(AddressBook.class, AddressBook.Builder.class);
		}

		// Construct using
		// io.netty.example.codec.PersonProbuf.AddressBook.newBuilder()
		private Builder() {
			maybeForceBuilderInitialization();
		}

		private Builder(GeneratedMessage.BuilderParent parent) {
			super(parent);
			maybeForceBuilderInitialization();
		}

		private void maybeForceBuilderInitialization() {
			if (GeneratedMessage.alwaysUseFieldBuilders) {
				getPersonFieldBuilder();
			}
		}

		private static AddressBook.Builder create() {
			return new Builder();
		}

		public AddressBook.Builder clear() {
			super.clear();
			if (personBuilder_ == null) {
				person_ = java.util.Collections.emptyList();
				bitField0_ = (bitField0_ & ~0x00000001);
			} else {
				personBuilder_.clear();
			}
			return this;
		}

		public AddressBook.Builder clone() {
			return create().mergeFrom(buildPartial());
		}

		public Descriptors.Descriptor getDescriptorForType() {
			return PersonProbuf.internal_static_AddressBook_descriptor;
		}

		public AddressBook getDefaultInstanceForType() {
			return AddressBook.getDefaultInstance();
		}

		public AddressBook build() {
			AddressBook result = buildPartial();
			if (!result.isInitialized()) {
				throw newUninitializedMessageException(result);
			}
			return result;
		}

		public AddressBook buildPartial() {
			AddressBook result = new AddressBook(this);
			int from_bitField0_ = bitField0_;
			if (personBuilder_ == null) {
				if (((bitField0_ & 0x00000001) == 0x00000001)) {
					person_ = java.util.Collections.unmodifiableList(person_);
					bitField0_ = (bitField0_ & ~0x00000001);
				}
				result.person_ = person_;
			} else {
				result.person_ = personBuilder_.build();
			}
			onBuilt();
			return result;
		}

		public AddressBook.Builder mergeFrom(Message other) {
			if (other instanceof AddressBook) {
				return mergeFrom((AddressBook) other);
			} else {
				super.mergeFrom(other);
				return this;
			}
		}

		public AddressBook.Builder mergeFrom(AddressBook other) {
			if (other == AddressBook.getDefaultInstance())
				return this;
			if (personBuilder_ == null) {
				if (!other.person_.isEmpty()) {
					if (person_.isEmpty()) {
						person_ = other.person_;
						bitField0_ = (bitField0_ & ~0x00000001);
					} else {
						ensurePersonIsMutable();
						person_.addAll(other.person_);
					}
					onChanged();
				}
			} else {
				if (!other.person_.isEmpty()) {
					if (personBuilder_.isEmpty()) {
						personBuilder_.dispose();
						personBuilder_ = null;
						person_ = other.person_;
						bitField0_ = (bitField0_ & ~0x00000001);
						personBuilder_ = GeneratedMessage.alwaysUseFieldBuilders ? getPersonFieldBuilder() : null;
					} else {
						personBuilder_.addAllMessages(other.person_);
					}
				}
			}
			this.mergeUnknownFields(other.getUnknownFields());
			return this;
		}

		public final boolean isInitialized() {
			for (int i = 0; i < getPersonCount(); i++) {
				if (!getPerson(i).isInitialized()) {

					return false;
				}
			}
			return true;
		}

		public AddressBook.Builder mergeFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws java.io.IOException {
			AddressBook parsedMessage = null;
			try {
				parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
			} catch (InvalidProtocolBufferException e) {
				parsedMessage = (AddressBook) e.getUnfinishedMessage();
				throw e;
			} finally {
				if (parsedMessage != null) {
					mergeFrom(parsedMessage);
				}
			}
			return this;
		}

		private int bitField0_;

		private java.util.List<Person> person_ = java.util.Collections.emptyList();

		private void ensurePersonIsMutable() {
			if (!((bitField0_ & 0x00000001) == 0x00000001)) {
				person_ = new java.util.ArrayList<Person>(person_);
				bitField0_ |= 0x00000001;
			}
		}

		private RepeatedFieldBuilder<Person, Person.Builder, PersonOrBuilder> personBuilder_;

		/**
		 * <code>repeated .Person person = 1;</code>
		 */
		public java.util.List<Person> getPersonList() {
			if (personBuilder_ == null) {
				return java.util.Collections.unmodifiableList(person_);
			} else {
				return personBuilder_.getMessageList();
			}
		}

		/**
		 * <code>repeated .Person person = 1;</code>
		 */
		public int getPersonCount() {
			if (personBuilder_ == null) {
				return person_.size();
			} else {
				return personBuilder_.getCount();
			}
		}

		/**
		 * <code>repeated .Person person = 1;</code>
		 */
		public Person getPerson(int index) {
			if (personBuilder_ == null) {
				return person_.get(index);
			} else {
				return personBuilder_.getMessage(index);
			}
		}

		/**
		 * <code>repeated .Person person = 1;</code>
		 */
		public AddressBook.Builder setPerson(int index, Person value) {
			if (personBuilder_ == null) {
				if (value == null) {
					throw new NullPointerException();
				}
				ensurePersonIsMutable();
				person_.set(index, value);
				onChanged();
			} else {
				personBuilder_.setMessage(index, value);
			}
			return this;
		}

		/**
		 * <code>repeated .Person person = 1;</code>
		 */
		public AddressBook.Builder setPerson(int index, Person.Builder builderForValue) {
			if (personBuilder_ == null) {
				ensurePersonIsMutable();
				person_.set(index, builderForValue.build());
				onChanged();
			} else {
				personBuilder_.setMessage(index, builderForValue.build());
			}
			return this;
		}

		/**
		 * <code>repeated .Person person = 1;</code>
		 */
		public AddressBook.Builder addPerson(Person value) {
			if (personBuilder_ == null) {
				if (value == null) {
					throw new NullPointerException();
				}
				ensurePersonIsMutable();
				person_.add(value);
				onChanged();
			} else {
				personBuilder_.addMessage(value);
			}
			return this;
		}

		/**
		 * <code>repeated .Person person = 1;</code>
		 */
		public AddressBook.Builder addPerson(int index, Person value) {
			if (personBuilder_ == null) {
				if (value == null) {
					throw new NullPointerException();
				}
				ensurePersonIsMutable();
				person_.add(index, value);
				onChanged();
			} else {
				personBuilder_.addMessage(index, value);
			}
			return this;
		}

		/**
		 * <code>repeated .Person person = 1;</code>
		 */
		public AddressBook.Builder addPerson(Person.Builder builderForValue) {
			if (personBuilder_ == null) {
				ensurePersonIsMutable();
				person_.add(builderForValue.build());
				onChanged();
			} else {
				personBuilder_.addMessage(builderForValue.build());
			}
			return this;
		}

		/**
		 * <code>repeated .Person person = 1;</code>
		 */
		public AddressBook.Builder addPerson(int index, Person.Builder builderForValue) {
			if (personBuilder_ == null) {
				ensurePersonIsMutable();
				person_.add(index, builderForValue.build());
				onChanged();
			} else {
				personBuilder_.addMessage(index, builderForValue.build());
			}
			return this;
		}

		/**
		 * <code>repeated .Person person = 1;</code>
		 */
		public AddressBook.Builder addAllPerson(java.lang.Iterable<? extends Person> values) {
			if (personBuilder_ == null) {
				ensurePersonIsMutable();
				AbstractMessageLite.Builder.addAll(values, person_);
				onChanged();
			} else {
				personBuilder_.addAllMessages(values);
			}
			return this;
		}

		/**
		 * <code>repeated .Person person = 1;</code>
		 */
		public AddressBook.Builder clearPerson() {
			if (personBuilder_ == null) {
				person_ = java.util.Collections.emptyList();
				bitField0_ = (bitField0_ & ~0x00000001);
				onChanged();
			} else {
				personBuilder_.clear();
			}
			return this;
		}

		/**
		 * <code>repeated .Person person = 1;</code>
		 */
		public AddressBook.Builder removePerson(int index) {
			if (personBuilder_ == null) {
				ensurePersonIsMutable();
				person_.remove(index);
				onChanged();
			} else {
				personBuilder_.remove(index);
			}
			return this;
		}

		/**
		 * <code>repeated .Person person = 1;</code>
		 */
		public Person.Builder getPersonBuilder(int index) {
			return getPersonFieldBuilder().getBuilder(index);
		}

		/**
		 * <code>repeated .Person person = 1;</code>
		 */
		public PersonOrBuilder getPersonOrBuilder(int index) {
			if (personBuilder_ == null) {
				return person_.get(index);
			} else {
				return personBuilder_.getMessageOrBuilder(index);
			}
		}

		/**
		 * <code>repeated .Person person = 1;</code>
		 */
		public java.util.List<? extends PersonOrBuilder> getPersonOrBuilderList() {
			if (personBuilder_ != null) {
				return personBuilder_.getMessageOrBuilderList();
			} else {
				return java.util.Collections.unmodifiableList(person_);
			}
		}

		/**
		 * <code>repeated .Person person = 1;</code>
		 */
		public Person.Builder addPersonBuilder() {
			return getPersonFieldBuilder().addBuilder(Person.getDefaultInstance());
		}

		/**
		 * <code>repeated .Person person = 1;</code>
		 */
		public Person.Builder addPersonBuilder(int index) {
			return getPersonFieldBuilder().addBuilder(index, Person.getDefaultInstance());
		}

		/**
		 * <code>repeated .Person person = 1;</code>
		 */
		public java.util.List<Person.Builder> getPersonBuilderList() {
			return getPersonFieldBuilder().getBuilderList();
		}

		private RepeatedFieldBuilder<Person, Person.Builder, PersonOrBuilder> getPersonFieldBuilder() {
			if (personBuilder_ == null) {
				personBuilder_ = new RepeatedFieldBuilder<Person, Person.Builder, PersonOrBuilder>(person_, ((bitField0_ & 0x00000001) == 0x00000001),
						getParentForChildren(), isClean());
				person_ = null;
			}
			return personBuilder_;
		}

		// @@protoc_insertion_point(builder_scope:AddressBook)
	}

	static {
		defaultInstance = new AddressBook(true);
		defaultInstance.initFields();
	}

	// @@protoc_insertion_point(class_scope:AddressBook)
}