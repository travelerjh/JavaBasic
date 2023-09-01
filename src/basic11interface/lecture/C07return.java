package basic11interface.lecture;

public class C07return {
    public static void main(String[] args) {
for(int i=0 ;i<10;i++){
        CharSequence charSequence = getCharSeqeunce();
        System.out.println(getCharSeqeunce());
    }
    }
    public static CharSequence getCharSeqeunce() {
        //      return new StringBuffer("java");
        //    return new String Builder("java")
        //
        double d = Math.random();
        if (d < 0.33) {
            return new String("java");
        } else if (d < 0.66) {
            return new StringBuffer("rect");
        } else {
            return new StringBuffer("spring");
        }

    }}
