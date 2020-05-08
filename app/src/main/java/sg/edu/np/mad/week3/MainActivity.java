package sg.edu.np.mad.week3;

import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.widget.VideoView;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);

    VideoView view = findViewById(R.id.video);

    view.setVideoPath(
      "android.resource://" + getPackageName() + "/" + R.raw.rabbid
    );

    view.start();

    MediaPlayer player = MediaPlayer.create(this, R.raw.baby_laughing);

    player.start();

  }
}
