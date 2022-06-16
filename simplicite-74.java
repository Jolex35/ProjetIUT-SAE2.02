package eraser;

public class Eraser {
    public static String erase(String str) {
        if(str.equals("")) {
        	throw new UnsupportedOperationException("Unimplemented"); 
        }else {
        	System.out.println(str);
        }
        if(str != null) {
        	int len=str.length();
        	if(len>0) {
        		char [] dest=new char[len];
        		int destPos=0;
        		for(int i=0;i<len;i++) {
        			char c=str.charAt(i);
        			if(!Character.isWhitespace(c)) {
        				dest[destPos++]=c;
        			}
        		}
        		return new String(dest,0,destPos);
        	}
        }
        return str;
                                          }
                  }
