package dao;

import org.apache.commons.lang3.RandomStringUtils;

public class Test3 {

	public static void main(String[] args) {
		String str1 =RandomStringUtils.random(10,"012345ABCDEFGHIJKMLOPQRSTUWXYZ");

		System.out.println(str1);

		System.out.println(RandomStringUtils.random(10,"012345ABCDEFGHIJKMLOPQRSTUWXYZ"));

	}

}
