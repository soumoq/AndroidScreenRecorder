package com.example.androidscreenrecoedwithsound;

import androidx.appcompat.app.AppCompatActivity;

import android.hardware.display.VirtualDisplay;
import android.media.MediaRecorder;
import android.media.projection.MediaProjection;
import android.media.projection.MediaProjectionManager;
import android.os.Bundle;
import android.util.SparseIntArray;
import android.view.Surface;
import android.widget.RelativeLayout;
import android.widget.ToggleButton;
import android.widget.VideoView;

public class MainActivity extends AppCompatActivity {

    private static final int REQUEST_CODE=1000;
    private static final int REQUEST_PERMISSION=1001;
    private static final SparseIntArray ORIENTATION=new SparseIntArray();

    private MediaProjectionManager mediaProjectionManager;
    private MediaProjection mediaProjection;
    private VirtualDisplay virtualDisplay;
    private MediaProjectionManagerCallback mediaProjectionManagerCallback;
    private MediaRecorder mediaRecorder;

    private int screenDensity;
    private static final int DISPLAY_WIDTH=720;
    private static final int DISPLAY_HIGHT=1280;

    static {
        ORIENTATION.append(Surface.ROTATION_0, 90);
        ORIENTATION.append(Surface.ROTATION_90, 0);
        ORIENTATION.append(Surface.ROTATION_180, 270);
        ORIENTATION.append(Surface.ROTATION_270, 180);

    }

    private RelativeLayout  relativeLayout;
    private ToggleButton toggleButton;
    private VideoView videoView;
    private String videoURL="";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);





    }

    private class MediaProjectionManagerCallback {
    }
}