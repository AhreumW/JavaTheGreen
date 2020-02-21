package byHong;
/*
tv 
음소거tv
자막tv

String name = ""; 
*/
public class TvTest {

	public static void main(String[] args) {

		Tv tv = new Tv(true, 11, 10);
		CaptionTv cTv = new CaptionTv(true, 15, 10, true);
		MuteTv mTv = new MuteTv(true, 5, 5, false);
		
//		tv.tvInfo();
//		cTv.captionTvInfo();
//		mTv.muteTvInfo();
		
		
//		tv.tvInfo();
//		tv.soundDown();
//		tv.tvInfo();
//		tv.soundUp();
//		tv.tvInfo();
//		tv.channelUp();
//		tv.tvInfo();
//		tv.channelDown();
//		tv.tvInfo();
		
		
//		cTv.captionTvInfo();
//		System.out.println();
//		cTv.displayCaption("자막이 달렸습니다.");
//		cTv.captionTvInfo();
//		System.out.println();
//		cTv.caption = false;
//		cTv.displayCaption("자막이 달렸습니다.");
//		cTv.captionTvInfo();
		
		
		mTv.muteTvInfo();
		System.out.println();
		mTv.muteTv();
		mTv.muteTvInfo();
		System.out.println();
		mTv.muteTv();
		mTv.muteTvInfo();
		System.out.println();
		mTv.muteTv();
		mTv.muteTvInfo();
		
	} // main
}