package mypackage;

public enum myEnum {
	ONE("a","b","c") {
		@Override
		public String doSth(String option1, String option2)
		{
			return super.doSth(option1, null);
		}
	},
	TWO("aa","bb","cc") {
		@Override
		public String doSth(String option1, String option2)
		{
			return super.doSth(option1, option2);
		}
	};
	
	final String str1;
	final String str2;
	final String str3;
	final String str4; 

    private myEnum(String s1) {
        this(s1, null, null, false);
    }

    private myEnum(String s1, String s2) {
        this(s1, s2, null, false);
    }

    private myEnum(String s1, String s2, String s3) {
        this(s1, s2, s3, false);
    }
    
    private myEnum(String s1, String s2, String s3, boolean p4) {
    	this.str1 = s1;
    	this.str2 = s2;
    	this.str3 = s3;
    	this.str4 = p4 ? "T" : "F";
    }
    
    public String doSth(String option1, String option2)
    {
    	return this.str1+this.str2+this.str3+this.str4+option1+option2;
    }
    }
	

