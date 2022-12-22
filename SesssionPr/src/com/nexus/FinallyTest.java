package com.nexus;

public class FinallyTest {
		int m1() {
			try {
				return 10;
			}catch(Exception e) {
			return 20;
			}finally {
				return 30;
			}
			}
}
