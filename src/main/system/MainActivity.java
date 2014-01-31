package main.system;

import android.app.Activity;
import android.os.Bundle;

//import android.view.Menu;//テーマがブランクの場合必要なし

public class MainActivity extends Activity{

  AnimationSurfaceView surfaceView;
  //Screen screen;

  @Override
  protected void onCreate(Bundle savedInstanceState){
    super.onCreate(savedInstanceState);

    surfaceView = new AnimationSurfaceView(this/*MainActivity:Activity Context*/);
    setContentView(surfaceView);

    //screen = new Screen(this);
    //setContentView(screen);

    /*
    LinearLayout layout = new LinearLayout(this);
    layout.setOrientation(LinearLayout.VERTICAL);
    setContentView(layout);
    layout.addView(new Screen(this));
    */

    //

  }

  /*テーマによる
  @Override
  public boolean onCreateOptionsMenu(Menu menu) {
    // Inflate the menu; this adds items to the action bar if it is present.
    getMenuInflater().inflate(R.menu.main, menu);
    return true;
  }
  */

}
