
public class Encoder {
	public Encoder(){}
	
	public String encode(String s){
		String o= "";
		for(int i=0;i<s.length()-1;i+=2)
		{
			String a= s.substring(i,i+1);
			String b= s.substring(i+1,i+2);
			o+=b;
			o+=a;
		}
		if(s.length()%2==1)
			o+=s.substring(s.length()-1,s.length());
		return o;
	}
	
	public String decode(String s){
		return encode(s);
	}
	
	public String toHash(String s){
		char[] x = s.toCharArray();
		int sum = 0;
		for(int i = 0 ; i < x.length ; i++){
			{
				sum+= (int)x[i];
			}
		}
	}
}
