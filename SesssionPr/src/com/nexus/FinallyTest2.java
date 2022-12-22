package com.nexus;

public class FinallyTest2 {

		@SuppressWarnings("finally")
		int m1() {
			try {
				return 10;
			}catch(Exception e) {
				return 20;
			}finally {
				return 30;
			}
			return 40;
		}

	}
