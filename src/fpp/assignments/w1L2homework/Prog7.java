package fpp.assignments.w1L2homework;

//length of each string and count of string start with A

public class Prog7 {
	public static void main(String[] args) {
		int count = 0;
		for(String str:args) {
			System.out.println(str+": "+ str.length());
			if(str.startsWith("a")) {
				count++;
			}
		}
		System.out.println("string count starting with 'A' :"+count);
	}
}

//inputs::java andriod .net c# angularjs
/*############Output###################
java: 4
andriod: 7
.net: 4
c#: 2
angularjs: 9
string count starting with 'A' :2*/