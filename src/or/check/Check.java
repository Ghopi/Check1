package or.check;

import java.util.Scanner;

public class Check {
	public static void main(String[] args) {
		int sid,m1,m2,m3,m4,to,av;
		String snam;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Student Name");
		snam=scanner.next();
		System.out.println("Enter Mark 1");
		m1=scanner.nextInt();
		System.out.println("Enter Mark 2");
		m2=scanner.nextInt();
		System.out.println("Enter Mark 3");
		m3=scanner.nextInt();
		System.out.println("Enter Mark 4");
		m4=scanner.nextInt();
		System.out.println("Student details");
		System.out.println("--------------------");
		System.out.println(snam);
		System.out.println(m1);
		System.out.println(m2);
		System.out.println(m3);
		System.out.println(m4);
		to=m1+m2+m3+m4;
		av=to/4;
		System.out.println("Total=="+to);
		System.out.println("Average=="+av);
		
	}
	}
