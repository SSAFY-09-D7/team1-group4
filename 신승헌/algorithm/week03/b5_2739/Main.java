package Baekjoon.b5_2739;

import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		
		for (int i = 1; i < 10; i++) {
			System.out.println(N + " * " + i + " = " + N*i);
		}
	}
}
