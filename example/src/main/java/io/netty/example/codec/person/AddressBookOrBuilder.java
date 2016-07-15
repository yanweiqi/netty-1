package io.netty.example.codec.person;

import com.google.protobuf.MessageOrBuilder;

public interface AddressBookOrBuilder extends
		// @@protoc_insertion_point(interface_extends:AddressBook)
		MessageOrBuilder {

	/**
	 * <code>repeated .Person person = 1;</code>
	 */
	java.util.List<Person> getPersonList();

	/**
	 * <code>repeated .Person person = 1;</code>
	 */
	Person getPerson(int index);

	/**
	 * <code>repeated .Person person = 1;</code>
	 */
	int getPersonCount();

	/**
	 * <code>repeated .Person person = 1;</code>
	 */
	java.util.List<? extends PersonOrBuilder> getPersonOrBuilderList();

	/**
	 * <code>repeated .Person person = 1;</code>
	 */
	PersonOrBuilder getPersonOrBuilder(int index);
}