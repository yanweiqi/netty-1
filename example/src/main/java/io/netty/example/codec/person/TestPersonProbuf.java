package io.netty.example.codec.person;

import java.util.List;

import org.junit.Test;

import com.google.protobuf.InvalidProtocolBufferException;

public class TestPersonProbuf {

	@Test
	public void test() {
		Person.Builder builder = Person.newBuilder();
		builder.setEmail("kkk@email.com");
		builder.setId(1);
		builder.setName("TestName");
		builder.addPhone(PhoneNumber.newBuilder().setNumber("131111111").setType(PhoneType.MOBILE));
		builder.addPhone(PhoneNumber.newBuilder().setNumber("011111").setType(PhoneType.HOME));
		Person person = builder.build();
		byte[] buf = person.toByteArray();
		try {
			Person person2 = Person.parseFrom(buf);
			System.out.println(person2.getName() + ", " + person2.getEmail());
			List<PhoneNumber> lstPhones = person2.getPhoneList();
			for (PhoneNumber phoneNumber : lstPhones) {
				System.out.println(phoneNumber.getNumber());
			}
		} catch (InvalidProtocolBufferException e) {
			e.printStackTrace();
		}
		System.out.println(buf);
	}

}
