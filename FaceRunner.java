class FaceRunner{
	public static void main(String[] args){
		String expression="Happy";
		String shape="Round";
		String gender="Boy";
		Face face1=new Face(expression,shape,gender);
		System.out.println("Face expression:"+face1.expression);
		System.out.println("Face shape:"+face1.shape);
		System.out.println("Face gender:"+face1.gender);
		
		expression="Angry";
		shape="Oval";
		gender="Girl";
		Face face2=new Face(expression,shape,gender);
		System.out.println("Face expression:"+face2.expression);
		System.out.println("Face shape:"+face2.shape);
		System.out.println("Face gender:"+face2.gender);
		
		expression="Surprised";
		shape="Square";
		gender="Boy";
		Face face3=new Face(expression,shape,gender);
		System.out.println("Face expression:"+face3.expression);
		System.out.println("Face shape:"+face3.shape);
		System.out.println("Face gender:"+face3.gender);
		
		expression="Sad";
		shape="Oval";
		gender="Girl";
		Face face4=new Face(expression,shape,gender);
		System.out.println("Face expression:"+face4.expression);
		System.out.println("Face shape:"+face4.shape);
		System.out.println("Face gender:"+face4.gender);
		
		expression="Confused";
		shape="Round";
		gender="Boy";
		Face face5=new Face(expression,shape,gender);
		System.out.println("Face expression:"+face5.expression);
		System.out.println("Face shape:"+face5.shape);
		System.out.println("Face gender:"+face5.gender);
	}
}