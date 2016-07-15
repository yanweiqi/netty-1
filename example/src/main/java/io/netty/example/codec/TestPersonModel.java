package io.netty.example.codec;

import org.junit.Assert;
import org.junit.Test;

public class TestPersonModel {


    @Test
    public void testProto() {
        PersonModel.Person person = PersonModel.Person.newBuilder()
               .setId(100)
               .setName("zhuliangliang")
               .setEmail("zhuliangliang.me@gmail.com").build();
        System.out.println(person);
        Assert.assertEquals(100, person.getId());
    }
}
