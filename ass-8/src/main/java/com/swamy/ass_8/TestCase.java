package com.swamy.ass_8;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.swamy.ass_8.RemoveString;



class TestCase {
		RemoveString obj;
		@BeforeEach
		void setup() {
			obj = new RemoveString();
		}
		
		@Test
		void test1() {
			assertEquals("BCD",obj.removeString("ABCD"));
		}
		
		@Test
		void test2() {
			assertEquals("CD",obj.removeString("AACD"));
		}
		
		@Test
		void test3() {
			assertEquals("BCD",obj.removeString("BACD"));
		}
		
		@Test
		void test4() {
			assertEquals("BBAA",obj.removeString("BBAA"));
		}
		
		@Test
		void test5() {
			assertEquals("BAA",obj.removeString("AABAA"));
		}
		

}