public class tipovar {
    public static void main(String[] args){
	byte mybyte;
	short myshort = 128;
	mybyte = (byte) myshort;
	System.out.println(mybyte);
	byte mysecondbyte = 127;
	mysecondbyte++;
	System.out.println(mysecondbyte);
    }
}