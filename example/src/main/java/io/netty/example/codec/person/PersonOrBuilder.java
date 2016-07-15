package io.netty.example.codec.person;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageOrBuilder;

public interface PersonOrBuilder extends MessageOrBuilder {

	/**
	 * <code>required string name = 1;</code>
	 */
	boolean hasName();

	/**
	 * <code>required string name = 1;</code>
	 */
	java.lang.String getName();

	/**
	 * <code>required string name = 1;</code>
	 */
	ByteString getNameBytes();

	/**
	 * <code>required int32 id = 2;</code>
	 */
	boolean hasId();

	/**
	 * <code>required int32 id = 2;</code>
	 */
	int getId();

	/**
	 * <code>optional string email = 3;</code>
	 */
	boolean hasEmail();

	/**
	 * <code>optional string email = 3;</code>
	 */
	java.lang.String getEmail();

	/**
	 * <code>optional string email = 3;</code>
	 */
	ByteString getEmailBytes();

	/**
	 * <code>repeated .Person.PhoneNumber phone = 4;</code>
	 */
	java.util.List<PhoneNumber> getPhoneList();

	/**
	 * <code>repeated .Person.PhoneNumber phone = 4;</code>
	 */
	PhoneNumber getPhone(int index);

	/**
	 * <code>repeated .Person.PhoneNumber phone = 4;</code>
	 */
	int getPhoneCount();

	/**
	 * <code>repeated .Person.PhoneNumber phone = 4;</code>
	 */
	java.util.List<? extends PhoneNumberOrBuilder> getPhoneOrBuilderList();

	/**
	 * <code>repeated .Person.PhoneNumber phone = 4;</code>
	 */
	PhoneNumberOrBuilder getPhoneOrBuilder(int index);
}