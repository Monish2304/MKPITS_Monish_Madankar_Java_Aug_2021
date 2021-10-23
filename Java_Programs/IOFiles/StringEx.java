class StringEx {

	public static void main(String []args) {

		String course=new String("JAVA ");

		for(int i=0;i<course.length();i++) {

			char ch=course.charAt(i);

			System.out.print("-" +ch);
		}
	}
}