
public class CaptionTvMain {

	public static void main(String[] args) {

		CaptionTv captionTv = new CaptionTv();
		
		captionTv.channel = 10;
		captionTv.channelUp();
		
		System.out.println(captionTv.channel);
		
		captionTv.displayCaption("Hello, Java");	//출력X
		captionTv.caption = true;
		
		captionTv.displayCaption("Hello, Java");	//출력O
		
	}

}
