package main.system;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;

//import android.view.Menu;//テーマがブランクの場合必要なし

public class MainActivity extends Activity{
  //メンバ
  MySurfaceView mySurfaceView;

  //MyView myView;

  @Override
  protected void onCreate(Bundle savedInstanceState){
    super.onCreate(savedInstanceState);

    mySurfaceView = new MySurfaceView(this/*MainActivity:Activity Context*/);
    setContentView(mySurfaceView);

    //myView = new MyView(this);
    //setContentView(myView);

    /*
    LinearLayout layout = new LinearLayout(this);
    layout.setOrientation(LinearLayout.VERTICAL);
    setContentView(layout);
    layout.addView(new Screen(this));
    */
  }

  //メニューボタンの処理、引数がView、runさせるのはSrufaceViewだが表示できる
  //オーバーライドだけどコレどこで呼ばれてるんだ…イベント？
  @Override
  public boolean onCreateOptionsMenu(Menu menu){
    getMenuInflater().inflate(R.menu.main, menu);

    return true;
  }

}
