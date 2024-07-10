package javaBasicMathCoding;

import java.util.Random;

import org.apache.commons.lang3.RandomStringUtils;

public class RandomNumber {

	public static void main(String[] args) {
		//1. using Random Class
		Random rand=new Random();
		int rand_int=rand.nextInt(1000);// it will genrate 0 too 999 in between
		System.out.println(rand_int);
		double rand_double=rand.nextDouble();// generate 0.0 to 1.0
		System.out.println(rand_double);
		//2. using Math
		System.out.println(Math.random());//generate 0.0 to 1.0
		//3. using Apache Commons Lang
		String randNum=RandomStringUtils.randomNumeric(10);//5digit number
		System.out.println(randNum);
	}

}
