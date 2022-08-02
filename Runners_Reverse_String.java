import java.util.*;
class Runners_Reverse_String  
{
	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the String");
		String s=sc.nextLine();
		System.out.println("After the String");
		String str=reverseStringSentence(s);
		System.out.println(str);

	}

	public static String reverseStringSentence(String st) {
		char ch[]=st.toCharArray();
		st=" ";
		for(int i=ch.length-1; i>=0; i-- ) {
			int k=i;
			while(i>=0 && ch[i]!=' ') {
				i--;
			}
			int j=i+1;
			while(j<=k) {
				st=st+ch[j];
					j++;
			}
				if(i>0) 
					st=st+ch[i];
				
		}
		return st;
	}
	}

