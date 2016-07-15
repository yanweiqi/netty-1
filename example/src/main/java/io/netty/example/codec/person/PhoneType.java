package io.netty.example.codec.person;

import com.google.protobuf.Descriptors;
import com.google.protobuf.Internal;
import com.google.protobuf.ProtocolMessageEnum;

/**
 * Protobuf enum {@code Person.PhoneType}
 */
public enum PhoneType implements ProtocolMessageEnum {
	/**
	 * <code>MOBILE = 0;</code>
	 */
	MOBILE(0, 0),
	/**
	 * <code>HOME = 1;</code>
	 */
	HOME(1, 1),
	/**
	 * <code>WORK = 2;</code>
	 */
	WORK(2, 2),;

	/**
	 * <code>MOBILE = 0;</code>
	 */
	public static final int MOBILE_VALUE = 0;
	/**
	 * <code>HOME = 1;</code>
	 */
	public static final int HOME_VALUE = 1;
	/**
	 * <code>WORK = 2;</code>
	 */
	public static final int WORK_VALUE = 2;

	public final int getNumber() {
		return value;
	}

	public static PhoneType valueOf(int value) {
		switch (value) {
		case 0:
			return MOBILE;
		case 1:
			return HOME;
		case 2:
			return WORK;
		default:
			return null;
		}
	}

	public static Internal.EnumLiteMap<PhoneType> internalGetValueMap() {
		return internalValueMap;
	}

	private static Internal.EnumLiteMap<PhoneType> internalValueMap = new Internal.EnumLiteMap<PhoneType>() {
		public PhoneType findValueByNumber(int number) {
			return PhoneType.valueOf(number);
		}
	};

	public final Descriptors.EnumValueDescriptor getValueDescriptor() {
		return getDescriptor().getValues().get(index);
	}

	public final Descriptors.EnumDescriptor getDescriptorForType() {
		return getDescriptor();
	}

	public static final Descriptors.EnumDescriptor getDescriptor() {
		return Person.getDescriptor().getEnumTypes().get(0);
	}

	private static final PhoneType[] VALUES = values();

	public static PhoneType valueOf(Descriptors.EnumValueDescriptor desc) {
		if (desc.getType() != getDescriptor()) {
			throw new java.lang.IllegalArgumentException("EnumValueDescriptor is not for this type.");
		}
		return VALUES[desc.getIndex()];
	}

	private final int index;
	private final int value;

	private PhoneType(int index, int value) {
		this.index = index;
		this.value = value;
	}

	// @@protoc_insertion_point(enum_scope:Person.PhoneType)
}